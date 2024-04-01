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

## Considerações Finais

O projeto oferece uma solução robusta e segura para autenticação de usuários, controle de acesso por perfil e gerenciamento de usuários. Utilizando tecnologias modernas e seguindo boas práticas de programação orientada a objetos, o sistema é capaz de atender às necessidades de segurança e funcionalidade dos usuários.
