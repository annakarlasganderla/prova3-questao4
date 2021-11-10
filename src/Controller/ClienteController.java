package Controller;

import Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    List<Cliente> listaDeClientes = new ArrayList<Cliente>();

    public void cadastrarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
        System.out.println(listaDeClientes);
    }






}
