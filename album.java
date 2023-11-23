import java.util.ArrayList;
import java.util.Scanner;

public class album {
    private String titulo;
    private String artista;
    private int quantM;
    ArrayList<musica> music = new ArrayList<>();

    private Scanner scan = new Scanner(System.in);

    public album(String titulo, String artista, int quantM, ArrayList<musica> music) {
        this.titulo = titulo;
        this.artista = artista;
        this.quantM = quantM;
        this.music = music;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantM() {
        return quantM;
    }

    public void setQuantM(int quantM) {
        this.quantM = quantM;
    }

    public ArrayList<musica> getMusic() {
        return music;
    }

    public void setMusic(ArrayList<musica> music) {
        this.music = music;
    }
}

