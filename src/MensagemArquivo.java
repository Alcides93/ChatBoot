class MensagemArquivo implements Mensagem {
    private String texto;
    private String arquivo;
    private String formato;

    public MensagemArquivo(String texto, String arquivo, String formato) {
        this.texto = texto;
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public String obterConteudo() {
        return "Arquivo: " + texto + ", Arquivo: " + arquivo + ", Formato: " + formato;
    }
}

