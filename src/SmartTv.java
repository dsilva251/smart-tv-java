public class SmartTv {
     /*
     Classe criada para criar uma simples SmartTv onde pode ser manipulado canal, volume e ligar e desligar.

     Nesta classe eu criei os metodos para manipulações no momento de execução dos codigos.
      */
   

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;  
    }

     public void diminuirVolume(){
        volume--;  
    }

    public void aumentarCanal(){
        canal++;
    }

     public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
