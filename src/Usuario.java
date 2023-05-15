public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("Canal atual: " + SmartTv.canal);

        SmartTv.mudarCanal(13);

        System.out.println("Canal atual : " + SmartTv.canal);


        System.out.println("TV Liagada ? " + SmartTv.ligada);
        System.out.println("Canal atual : " + SmartTv.canal);
        System.out.println("Volume atual : " + SmartTv.volume);


        SmartTv.ligar ();
        System.out.println("Novo Status -> TV Liagada ? " + SmartTv.ligada);
        
        SmartTv.desligar();
        System.out.println("Novo Status -> TV Liagada ? " + SmartTv.ligada);

    }
}
