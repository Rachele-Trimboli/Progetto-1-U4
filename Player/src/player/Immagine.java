package player;

public class Immagine extends ElementoMultimediale {

    private int luminosita;

    public Immagine(String titolo) {
        super(titolo);


    }

    @Override
    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show(){
        for (int i = 0; i < luminosita; i++ ){
            System.out.print(getTitolo());
            for (int j = 0; j< luminosita; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo=" + getTitolo() +
                ", luminosita=" + getLuminosita() +
                '}';
    }
}
