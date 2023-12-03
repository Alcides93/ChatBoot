

class Facebook implements Canal {
    private String usuario;

    public Facebook(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("Enviando mensagem via Facebook para " + usuario);
        System.out.println(mensagem);
    }
}