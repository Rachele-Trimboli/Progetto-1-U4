package player;

import java.util.Random;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int luminosita;

    public Video(String titolo) {
        super(titolo);



    }

    public int aumentaLuminosita(){

        return getLuminosita() + 1;
    }

    public int diminuisciLuminosita(){
        return getLuminosita() - 1;
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public void setLuminosita(int luminosita) {
        super.setLuminosita(luminosita);
    }

    @Override
    public void play() {
        for(int i = 0; i< durata(); i++){
            System.out.print(getTitolo());
            for (int j = 0; j< getLuminosita(); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


    @Override
    public int durata() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }

    @Override
    public String toString() {
        return "Video{" +
                "luminosita=" + getLuminosita() +
                '}';
    }
}
