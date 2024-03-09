package player;

import java.util.Random;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {


    private int volume;
    private int durata;


    public RegistrazioneAudio(String titolo) {
        super(titolo);
        this.durata = durata();




    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "titolo=" + getTitolo() +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void play() {
        for (int i = 0; i<= this.durata; i++){
            System.out.print(getTitolo());
            for (int j = 0; j< volume; j++ ){
                System.out.print("!");
            }
            System.out.println();
        }



    }

    @Override
    public int durata() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

}
