package View;

import java.io.IOException;
import java.util.Scanner;

public class MenuView {

    Scanner leitor = new Scanner(System.in);

    ClienteView clienteView = new ClienteView();
    MensagemView mensagemView = new MensagemView();

    public void menu() throws IOException {

        int op = 0;

        do {
            do {
                System.out.println("-------------------------------------------");
                System.out.println("|        0 - Sair                         |");
                System.out.println("|        1 - Cadastrar Cliente            |");
                System.out.println("|        2 - Visualizar Cliente           |");
                System.out.println("|        3 - Cadastrar Mensagem           |");
                System.out.println("|        4 - Visualizar Mensagens         |");
                System.out.println("-------------------------------------------");
                System.out.println("|         Digite aqui a sua opção:        |");
                System.out.println("-------------------------------------------");
                op = leitor.nextInt();
            } while (op == 5);

            switch (op) {
                case 0:
                    break;

                case 1:
                    clienteView.cadastrarCliente();

                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 2:
                    clienteView.listarClientes();

                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 3:
                    mensagemView.cadastrarMensagem(clienteView.acessaCliente());

                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 4:
                    mensagemView.listarMensagensByIdCliente(clienteView.acessaCliente());

                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;
            }

        } while(op != 0);

    }


}
