package Model;

public class Mensagem {

    private Long idCliente;
    private Long idMensagem;
    private String mensagem;

    public Mensagem(Long idCliente, Long idMensagem, String mensagem) {
        this.idCliente = idCliente;
        this.idMensagem = idMensagem;
        this.mensagem = mensagem;
    }

    public Mensagem() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "idCliente=" + idCliente +
                ", idMensagem=" + idMensagem +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
