public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("O novo Canal é: "+ smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Volume Atual? "+ smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.desligar(); 
        System.out.println("Novo Status: " + smartTv.ligada);

    }
}
