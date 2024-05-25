package Model;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;
    private Autenticacao autenticacao;

    public InterfaceUsuario(){
        scanner = new Scanner(System.in);
        autenticacao = new Autenticacao();
    }

    public void exibrMenu() {
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); //Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarUsuario() {
        System.out.println("Digite o nome de usuário: ");
        String nomeUsuasrio = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        autenticacao.cadastrarUsuario(nomeUsuasrio, senha);
    }

    private void login() {
        System.out.println("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        if (autenticacao.autenticarUsuario(nomeUsuario, senha)) {
            System.out.println("Login bem-sucedido. Bem vindo, " + nomeUsuario + "!");
        } else {
            System.out.println("Usuário ou senha incorreto. Tente novamente");
        }

    }

}
