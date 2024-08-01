public class Usuario {
    public static void main(String[] args) {
        SmarTv smartv = new SmarTv();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        System.out.println("Canal atual : "+smartv.canal);
        smartv.mudarCanal(13);
        System.out.println("Canal atual : "+smartv.canal);
        System.out.println(("Volume atual : "+smartv.volume));

        System.out.println("TV ligada ? "+smartv.ligada);
        System.out.println("Canal atual : "+smartv.canal);
        System.out.println(("Volume atual : "+smartv.volume));

        smartv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartv.ligada);

        smartv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartv.ligada);
    }
}
