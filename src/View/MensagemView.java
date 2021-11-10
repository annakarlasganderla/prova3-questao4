package View;

import Controller.MensagemController;
import Model.Mensagem;

import java.io.IOException;
import java.util.Scanner;

public class MensagemView {

    Scanner leitor = new Scanner(System.in).useDelimiter("\n");
    MensagemController mensagemController = new MensagemController();

    public void cadastrarMensagem(Long idCliente) throws IOException {

        Mensagem mensagem = new Mensagem();

        mensagem.setIdCliente(idCliente);

        System.out.println("Digite o id da mensagem: ");
        mensagem.setIdMensagem(leitor.nextLong());

        System.out.println("Digite sua mensagem: ");
        mensagem.setMensagem(leitor.next());

        mensagemController.cadastraMensagem(mensagem);
    }

    public void listarMensagensByIdCliente(Long idCliente) {
        System.out.println(mensagemController.getMensagemByIdCliente(idCliente));
    }

}
