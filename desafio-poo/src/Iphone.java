public class Iphone implements  ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String numero;
    private String url;
    private String musica;

    public Iphone () {
      this.musica = "Green Day - Basket Case";
      this.url = "https://www.apple.com";
      this.numero = "111222333";
    }
    
    public void tocar() {
      System.out.println("Tocando a música: "+this.musica);
    }

    public void pausar() {
      System.out.println("Pausando a música: "+this.musica);
    }

    public void selecionarMusica(String musica) {
      this.musica = musica;
      System.out.println("Música selecionada: "+this.musica);
    }

    public void ligar(String numero) {
      this.numero = numero;
      System.out.println("Discando para o número: "+this.numero);
    }

    public void atender() {
      System.out.println("Atendendo o Iphone...");
    }

    public void iniciarCorreioVoz() {
      System.out.println("Correio de voz inicializando...");
    }

    public void exibirPagina(String url) {
      this.url = url;
      System.out.println("Exibindo a página: "+this.url);
    }

    public void adicionarNovaAba() {
      System.out.println("Adicionando a nova aba...");
    }

    public void atualizarPagina() {
      System.out.println("Atualizando a página...");
    }


}
