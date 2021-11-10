package Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MensagemDao {

    public void cadastrarMensagem() throws IOException {
        FileWriter clienteFile = new FileWriter("logs.txt",true);
        PrintWriter printaCliente = new PrintWriter(clienteFile);

        printaCliente.println("Mensagem cadastrada com sucesso");

        printaCliente.flush();
        printaCliente.close();
    }
}
