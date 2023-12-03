class Telegram implements Canal {
    private String usuario;

    public Telegram(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("Enviando mensagem via Telegram para @" + usuario);
        System.out.println(mensagem);
    }
}