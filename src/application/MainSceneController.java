package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {
	Gerencia gerenciar = new Gerencia();
	private String escolha = "";
	private Perfil autenticarUsuario;
    @FXML
    private Label labelOpcao;
	
    @FXML
    private TextArea mostrarOpcoes;

    @FXML
    private TextArea mostrarResultado;
	
	@FXML
	private TextField tfTitle1;
	
    @FXML
    private TextField tfTitle2;
    
    @FXML
    private TextField tfTitle3;
    
    @FXML
    private TextField tfNewPassword;

    @FXML
    private TextField tfNewUser;

	
	// Event Listener on Button.onAction
	
	@FXML
	public void btnOkCliked(ActionEvent event ) {
		String login = tfTitle1.getText();
		String senha = tfTitle2.getText();
		verificar(login,senha);
		
		
	}
	
	@FXML
    void btnEscolhaCliked(ActionEvent event) {
		if(autenticarUsuario.getTipo() == Tipo.ADMIN) {
			escolha = tfTitle3.getText();
			System.out.println(escolha);
			if (escolha.equalsIgnoreCase("Cadastrar")) {
				mostrarResultado.setText("A escolha é igual a: "  + escolha);
			}
			else if (escolha.equalsIgnoreCase("Listar")){
				for (Perfil i : gerenciar.getArrayPerfil()) {
					mostrarResultado.setText(i);
				}
				
			}
		}
		else {
			mostrarResultado.setText("Você não é um administrador");
		}
    }
	
	@FXML
	void btnNewCadastroCliked(ActionEvent event) {
		if(autenticarUsuario.getTipo() == Tipo.ADMIN) {
			String newUser = tfNewUser.getText();
			String newPassword = tfNewPassword.getText();
			gerenciar.adicionaUsuario(newUser, newPassword, Tipo.USUARIO);
		}
		else {
			mostrarResultado.setText("Você não é um administrador");
		}
	   }
	
	void verificar(String login, String senha) {
		gerenciar.adicionaUsuario("admin", "admin123", Tipo.ADMIN);
		gerenciar.adicionaUsuario("user", "user123", Tipo.USUARIO);
		gerenciar.adicionaUsuario("visitant", "visitant123", Tipo.VISITANTE);
		autenticarUsuario = gerenciar.autenticarPerfil(login, senha);
		if (autenticarUsuario != null) {
			mostrarResultado.setText("Autenticação bem sucedida! Perfil: " + autenticarUsuario.getTipo());
			String dadosToSing = login;
			switch (autenticarUsuario.getTipo()) {
			case ADMIN:
				mostrarResultado.setText("Bem vindo, administrador.");
				admin(dadosToSing);	
				break;
			case USUARIO:
				mostrarResultado.setText("Bem vindo, usuário!");
				mostrarOpcoes.setText("Você irá receber a lista de usuários, participantes, que são usuários junto com você");
				//mostrarResultado.setText(gerenciar.getArrayPerfil());
				break;
			case VISITANTE:
				mostrarResultado.setText("Bem vindo, visitante");
				break;
					
			}
		}
		else {
			mostrarResultado.setText("Falha na autenticação. Usuario ou senha incorretos!");
		}
		
	}


	private void admin(String dadosToSing) {
		try {
			
			byte[] signature = gerenciar.entrarDados(dadosToSing, gerenciar.getKeyPair().getPrivate());
			if(gerenciar.verificarAssinatura(dadosToSing, signature, gerenciar.getKeyPair().getPublic())) {
				mostrarResultado.setText("Assinatura válida.");
				mostrarOpcoes.setText("Você deseja cadastrar ou  listar os usuários? ");
			}
			else {
				System.out.println("Assinatura inválida");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
