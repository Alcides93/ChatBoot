
import java.util.Date;


public class Principal {
    
    public static void main(String[] args) {
        
        Canal canalWhatsApp = new WhatsApp("11999456670");
        Canal canalTelegram = new Telegram("usuario_telegram");
        Canal canalFacebook = new Facebook("usuario_facebook");
        Canal canalInstagram = new Instagram("usuario_instagram");

        
        Mensagem mensagemTexto = new MensagemTexto("Olá Mundo", new Date());
        Mensagem mensagemVideo = new MensagemVideo("Vídeo legal", "video.mp4", "mp4", 30);
        Mensagem mensagemFoto = new MensagemFoto("Foto incrível", "foto.jpg", "jpg");
        Mensagem mensagemArquivo = new MensagemArquivo("Documento importante", "documento.pdf", "pdf");

        
        canalWhatsApp.enviarMensagem(mensagemTexto);
        canalTelegram.enviarMensagem(mensagemVideo);
        canalFacebook.enviarMensagem(mensagemFoto);
        canalInstagram.enviarMensagem(mensagemArquivo);
    }
    
}