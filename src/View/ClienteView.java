package View;

import Controller.ClienteController;
import Model.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteView {

    Scanner leitor = new Scanner(System.in);
    ClienteController clienteController = new ClienteController();

    public void cadastrarCliente() {

        Cliente cliente = new Cliente();

        System.out.println("Digite seu id: ");
        cliente.setIdCliente(leitor.nextLong());

        System.out.println("Digite seu nome: ");
        cliente.setNome(leitor.next());

        clienteController.cadastrarCliente(cliente);

        System.out.println("Cliente cadastrado com sucesso");
    }

    public List<Cliente> listarClientes() {

    }

}
