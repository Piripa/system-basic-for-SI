# Documentação do Projeto

## Descrição

O projeto é uma aplicação Java que utiliza bibliotecas como JAVAFX para a interface gráfica e o Scene Builder para a construção da tela. Além disso, faz uso da biblioteca Java Security para gerar chaves públicas e privadas e verificar o login por meio de assinatura digital. O código também é baseado em princípios de orientação a objetos, encapsulamento e polimorfismo.

## Funcionalidades

### Login e Autenticação

O sistema permite que os usuários façam login utilizando o algoritmo RSA da biblioteca Java Security. Isso garante a segurança da autenticação por meio de chaves públicas e privadas.

### Cadastro de Novos Usuários

Se um usuário for administrador, ele tem permissão para cadastrar novos usuários no sistema. Isso é feito através de uma interface intuitiva e segura.

### Controle de Acesso por Perfil

Cada tipo de perfil de usuário possui acesso a funções específicas do sistema. Isso é gerenciado de forma dinâmica e segura, garantindo que apenas usuários autorizados tenham acesso às funcionalidades correspondentes ao seu perfil.

## Tecnologias Utilizadas

- JavaFX: Utilizado para a criação da interface gráfica da aplicação.
- Scene Builder: Ferramenta utilizada para a construção visual das telas da aplicação.
- Java Security: Biblioteca utilizada para gerar chaves públicas e privadas e para verificar a autenticidade do login por meio de assinatura digital.

## Arquitetura

O projeto segue uma arquitetura orientada a objetos, onde os princípios de encapsulamento e polimorfismo são aplicados para garantir a modularidade, reutilização e manutenibilidade do código.

## Fluxo de Funcionamento

1. O usuário inicia a aplicação e é apresentado com a tela de login.
2. Ele insere suas credenciais de login.
3. As credenciais são criptografadas utilizando o algoritmo RSA.
4. As credenciais criptografadas são enviadas para o servidor.
5. O servidor verifica a autenticidade das credenciais utilizando a chave pública correspondente ao usuário.
6. Se as credenciais forem válidas, o usuário é autenticado e tem acesso às funcionalidades correspondentes ao seu perfil.

## Utilização do Projeto com JavaFX e Scene Builder

Para utilizar o projeto, siga as instruções abaixo:

### Pré-requisitos

1. JDK (Java Development Kit) instalado em sua máquina.
2. JavaFX SDK instalado.
3. Scene Builder instalado.

### Passos para Utilização

1. Clone ou baixe o repositório do projeto em sua máquina local.

2. Abra sua IDE preferida (por exemplo, IntelliJ IDEA, Eclipse) e importe o projeto.

3. Certifique-se de configurar o JavaFX SDK nas configurações do projeto em sua IDE. Isso geralmente é feito definindo o caminho para o diretório do JavaFX SDK nas configurações de SDK.

4. Abra o Scene Builder e importe os arquivos FXML do projeto. Você pode encontrar esses arquivos no diretório `src/main/resources` ou similar.

5. Faça as alterações necessárias nas telas utilizando o Scene Builder de acordo com os requisitos do seu projeto.

6. No código Java, utilize os controladores de evento para manipular a lógica da aplicação conforme necessário. Certifique-se de vincular os elementos da interface com os métodos correspondentes no controlador.

7. Compile e execute o projeto. Certifique-se de configurar a execução do projeto para incluir as bibliotecas do JavaFX no classpath.

8. Você pode executar o projeto através da sua IDE ou via linha de comando, dependendo das suas preferências.



## Considerações Finais

O projeto oferece uma solução robusta e segura para autenticação de usuários, controle de acesso por perfil e gerenciamento de usuários. Utilizando tecnologias modernas e seguindo boas práticas de programação orientada a objetos, o sistema é capaz de atender às necessidades de segurança e funcionalidade dos usuários.
