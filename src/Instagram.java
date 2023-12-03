class Instagram implements Canal {
    private String usuario;

    public Instagram(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("Enviando mensagem via Instagram para @" + usuario);
        System.out.println(mensagem);
    }
}
