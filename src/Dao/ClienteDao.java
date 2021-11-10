package Dao;

import Model.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteDao {

    Cliente cliente = new Cliente();

    public void cadastrarCliente() throws IOException {
        FileWriter clienteFile = new FileWriter("logs.txt");
        PrintWriter printaCliente = new PrintWriter(clienteFile);

        printaCliente.print(cliente.getIdCliente() + ";");
        printaCliente.println(cliente.getNome());

        printaCliente.flush();
        printaCliente.close();
    }

}
