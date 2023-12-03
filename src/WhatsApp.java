class WhatsApp implements Canal {
    private String numeroTelefone;

    public WhatsApp(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("Enviando mensagem via WhatsApp para " + numeroTelefone);
        System.out.println(mensagem);
    }
}

