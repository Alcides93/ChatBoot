class MensagemFoto implements Mensagem {
    private String texto;
    private String arquivo;
    private String formato;

    public MensagemFoto(String texto, String arquivo, String formato) {
        this.texto = texto;
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public String obterConteudo() {
        return "Foto: " + texto + ", Arquivo: " + arquivo + ", Formato: " + formato;
    }
}