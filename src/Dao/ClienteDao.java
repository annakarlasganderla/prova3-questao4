package Dao;

import Model.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteDao {

    Cliente cliente = new Cliente();

    public void cadastrarCliente() throws IOException {
        FileWriter clienteFile = new FileWriter("logs.txt",true);
        PrintWriter printaCliente = new PrintWriter(clienteFile);

        printaCliente.println("Cliente cadastrado com sucesso");

        printaCliente.flush();
        printaCliente.close();
    }

}
