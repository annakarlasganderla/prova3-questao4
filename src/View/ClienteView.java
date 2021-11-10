package View;

import Controller.ClienteController;
import Model.Cliente;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class ClienteView {

    Scanner leitor = new Scanner(System.in);
    ClienteController clienteController = new ClienteController();

    public void cadastrarCliente() throws IOException {

        Cliente cliente = new Cliente();

        System.out.println("Digite seu id: ");
        cliente.setIdCliente(leitor.nextLong());

        System.out.println("Digite seu nome: ");
        cliente.setNome(leitor.next());

        clienteController.cadastrarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        System.out.println(clienteController.listarClientes());
        List<Cliente> listaClientes = clienteController.listarClientes();
        return listaClientes;
    }

    public Long acessaCliente() {
        List<Cliente> listaDeCategorias = listarClientes();

        System.out.println("Em qual cliente: ");
        int clienteSelecionado = leitor.nextInt();

        return listaDeCategorias.get(clienteSelecionado - 1).getIdCliente();
    }

}
