package Controller;

import Dao.ClienteDao;
import Model.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    List<Cliente> listaDeClientes = new ArrayList<Cliente>();
    ClienteDao clienteDao = new ClienteDao();

    public void cadastrarCliente(Cliente cliente) throws IOException {
        listaDeClientes.add(cliente);
        clienteDao.cadastrarCliente();
    }

    public List<Cliente> listarClientes() {
        return listaDeClientes;
    }






}
