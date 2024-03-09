package player;

public class ElementoMultimediale {

    private int volume;
    private String titolo;

    private int luminosita;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
        this.volume = getVolume();
        this.luminosita = getLuminosita();

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int diminuisciLuminosita(){
        return 0;
    }

    public int aumentaLuminosita(){
        return 0;
    }

    public int abbassaVolume() {
        return volume - 1;
    }


    public int alzaVolume() {
        return volume + 1;
    }


    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }
}
