import player.Immagine;
import player.RegistrazioneAudio;
import player.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //egistrazioneAudio r1 = new RegistrazioneAudio("Hello");
        //System.out.println("Inserisci il titolo della canzone che vuoi ascoltare");
        //String titolo= scanner.nextLine();
        //r1.setTitolo(titolo);
        //System.out.println("Regola il volume di ascolto");
       // int volume = Integer.parseInt(scanner.nextLine());
       // r1.setVolume(volume);
       // r1.play();
       // System.out.println(r1);

       // System.out.println("------------------");


      //  Video v1 = new Video("film");
       // System.out.println("Inserisci il titolo del video che vuoi vedere");
      //  String titoloVideo= scanner.nextLine();
      //  r1.setTitolo(titoloVideo);
      //  System.out.println("Regola il volume di ascolto");
     //   int volumeVideo = Integer.parseInt(scanner.nextLine());
      //  v1.setVolume(volume);
     //   System.out.println("Regola la luminosita' del video");
     //   int luminosita = Integer.parseInt(scanner.nextLine());
     //   v1.setLuminosita(luminosita);
      //  v1.play();
     //   System.out.println(v1);

       // System.out.println("------------------");

        Immagine img1 = new Immagine("foto");
        System.out.println("Inserisci il titolo della foto che vuoi vedere");
        String titoloImg= scanner.nextLine();
        img1.setTitolo(titoloImg);
        System.out.println("Regola la luminosita' dell'immagine");
        int luminositaImg = Integer.parseInt(scanner.nextLine());
        img1.setLuminosita(luminositaImg);
        img1.show();
        System.out.println(img1);

        System.out.println("------------------");





    }
}