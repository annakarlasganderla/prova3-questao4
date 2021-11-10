package Controller;

import Dao.MensagemDao;
import Model.Mensagem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    List<Mensagem> mensagens = new ArrayList<Mensagem>();
    MensagemDao mensagemDao = new MensagemDao();

    public void cadastraMensagem(Mensagem mensagem) throws IOException {
        mensagens.add(mensagem);
        mensagemDao.cadastrarMensagem();
    }

    public List<Mensagem> listarMensagens() {
        return mensagens;
    }

    public List<Mensagem> getMensagemByIdCliente(Long idCliente) {

        List<Mensagem> listaDeMensagens = new ArrayList<>();

        for(int i = 0; i < listaDeMensagens.size();i++) {
            if(mensagens.get(i).getIdCliente() == idCliente) {
                listaDeMensagens.add(mensagens.get(i));
            }
        }
        return listaDeMensagens;
    }

}
