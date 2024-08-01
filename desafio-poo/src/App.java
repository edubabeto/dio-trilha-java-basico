public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Telefone
        iphone.ligar("333444555");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.google.com");
        iphone.atualizarPagina();

        // ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Metallica - Nothing Else Matters");
        iphone.tocar();
    }
}
