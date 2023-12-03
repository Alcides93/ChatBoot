
import java.util.Date;

class MensagemTexto implements Mensagem {
    private String texto;
    private Date dataEnvio;

    public MensagemTexto(String texto, Date dataEnvio) {
        this.texto = texto;
        this.dataEnvio = dataEnvio;
    }

    @Override
    public String obterConteudo() {
        return "Texto: " + texto + ", Data de Envio: " + dataEnvio;
    }
}

