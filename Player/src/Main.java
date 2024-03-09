import player.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RegistrazioneAudio r1 = new RegistrazioneAudio("Hello");
        System.out.println("Inserisci un titolo di una canzone che ti piace");
        String titolo = scanner.nextLine();
        r1.setTitolo(titolo);
        System.out.println("Regola il volume di ascolto");
        int volume = Integer.parseInt(scanner.nextLine());
        r1.setVolume(volume);
        r1.play();
        System.out.println(r1);

        System.out.println("------------------");

        RegistrazioneAudio r2 = new RegistrazioneAudio("Hello");
        System.out.println("Inserisci un titolo di una canzone che ti piace");
        String titolo2 = scanner.nextLine();
        r1.setTitolo(titolo2);
        System.out.println("Regola il volume di ascolto");
        int volume2 = Integer.parseInt(scanner.nextLine());
        r2.setVolume(volume2);
        r2.play();
        System.out.println(r2);

        System.out.println("------------------");


        Video v1 = new Video("film");
        System.out.println("Inserisci il titolo di un video che ti piace");
        String titoloVideo = scanner.nextLine();
        v1.setTitolo(titoloVideo);
        System.out.println("Regola il volume di ascolto");
        int volumeVideo = Integer.parseInt(scanner.nextLine());
        v1.setVolume(volumeVideo);
        System.out.println("Regola la luminosita' del video");
        int luminosita = Integer.parseInt(scanner.nextLine());
        v1.setLuminosita(luminosita);
        v1.play();
        System.out.println(v1);

        System.out.println("------------------");

        Video v2 = new Video("film");
        System.out.println("Inserisci il titolo di un video che ti piace");
        String titoloVideo2 = scanner.nextLine();
        v2.setTitolo(titoloVideo2);
        System.out.println("Regola il volume di ascolto");
        int volumeVideo2 = Integer.parseInt(scanner.nextLine());
        v2.setVolume(volumeVideo2);
        System.out.println("Regola la luminosita' del video");
        int luminosita2 = Integer.parseInt(scanner.nextLine());
        v2.setLuminosita(luminosita2);
        v2.play();
        System.out.println(v2);

        System.out.println("------------------");

        Immagine img1 = new Immagine("foto");
        System.out.println("Inserisci il titolo di una foto in galleria");
        String titoloImg = scanner.nextLine();
        img1.setTitolo(titoloImg);
        System.out.println("Regola la luminosita' dell'immagine");
        int luminositaImg = Integer.parseInt(scanner.nextLine());
        img1.setLuminosita(luminositaImg);
        img1.show();
        System.out.println(img1);

        System.out.println("------------------");

        ElementoMultimediale[] arrayElementi = {r1, r2, v1, v2, img1};

        System.out.println("Quale elemento vuoi riprodurre e/o visualizzare?");
        int indice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arrayElementi.length; i++) {
            esterno:
            if (i == indice + 1) {
                if (arrayElementi[i] instanceof Riproducibile) {
                    ((Riproducibile) arrayElementi[i]).play();
                    System.out.println("Buon'ascolto/visione");
                } else if (arrayElementi[i] instanceof Immagine) {
                    ((Immagine) arrayElementi[i]).show();
                    System.out.println("Spero che l'immagine sia bella");
                }
            } else if (i == indice && indice == 0) break;


        }

    }
}
