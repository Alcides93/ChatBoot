class MensagemVideo implements Mensagem {
    private String texto;
    private String arquivo;
    private String formato;
    private int duracao;

    public MensagemVideo(String texto, String arquivo, String formato, int duracao) {
        this.texto = texto;
        this.arquivo = arquivo;
        this.formato = formato;
        this.duracao = duracao;
    }

    @Override
    public String obterConteudo() {
        return "Vídeo: " + texto + ", Arquivo: " + arquivo + ", Formato: " + formato + ", Duração: " + duracao + " segundos";
    }
}
