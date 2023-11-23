import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<album> albuns = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public void executaOpcoes(){
        int opcao;
        do {
            System.out.println("O que deseja fazer?");
            Scanner teclado = new Scanner(System.in);
            chamarMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    checaMusica();
                    break;
                case 2:
                    verificaIndexMusica();
                    break;
                case 3:
                    imprimeAlbum();
                    break;
                case 4:
                    alteraPosicao();
                    break;
                case 5:
                    adicionaMusica();
                    break;
                case 6:
                    removeMusica();
                    break;
                case 7:
                    novoAlbum();
                    break;
                case 0:
                    break;
            }
        }while (opcao != 0);
    }
    public void checaMusica(){
        System.out.println("Album: ");
        String nomeAlbum = scan.nextLine();
        int count = 0;
        for (album a: this.albuns) {
            if (nomeAlbum.equals(a.getTitulo())){
                System.out.println("Qual música deseja checar?");
                String chMusica = scan.nextLine();
                for (int b = 0; b < a.getMusic().size(); b++){
                    if(chMusica.equals(a.getMusic().get(b).getNome())){
                        System.out.printf("Musica enconrada na faixa %d!\n" , b + 1);
                        break;
                    }
                    count++;
                }
                if(count == a.getMusic().size())
                {
                    System.out.println("Musica não encontrada!");
                }
            }
        }

    }



    public void chamarMenu(){
        System.out.println("(1)Checar música no álbum");
        System.out.println("(2)Verificar nome de música");
        System.out.println("(3)Imprimir dados do álbum");
        System.out.println("(4)Alterar posição de uma música");
        System.out.println("(5)Adicionar música");
        System.out.println("(6)Remover música");
        System.out.println("(7)Adicionar novo album");
        System.out.println("(0)Sair");
    }
    public void verificaIndexMusica(){
        System.out.println("Album: ");
        String esteAlbum = scan.nextLine();

        for (album a: this.albuns) {
            if (esteAlbum.equals(a.getTitulo())){
                System.out.println("Qual faixa voce deseja ver?");
                Scanner respFaixa = new Scanner(System.in);
                int verMusica = respFaixa.nextInt();
                int count = 0;
                for (int c = 0; c < a.getMusic().size(); c++) {
                    if (c == verMusica - 1) {
                        System.out.printf("%d. %s\n", c + 1, a.getMusic().get(c).getNome());
                        break;
                    }
                    count++;
                }
                if(count == a.getMusic().size())
                {
                    System.out.println("Musica não encontrada!");
                }
            }
        }


    }
    public void imprimeAlbum(){
        System.out.println("Qual album você deseja visualizar? ");
        String nomeAlbum = scan.nextLine();

        for (album a: this.albuns) {
            if (nomeAlbum.equals(a.getTitulo())) {
                System.out.println("Título: " + a.getTitulo());
                System.out.println("Artista: " + a.getArtista());
                System.out.println("Lista de músicas:");
                for (int d = 0; d < a.getMusic().size(); d++) {
                    System.out.printf("%d. %s\n", d + 1, a.music.get(d).getNome());
                }

            }
        }
    }
    public void alteraPosicao(){
        String respChange;
        int troca;
        musica aux = new musica(null,null);
        System.out.println("Album: ");
        String esteAlbum = scan.nextLine();
        for (album a: this.albuns) {
            if (esteAlbum.equals(a.getTitulo())){
                System.out.println("Qual música deseja mudar?");
                Scanner mudaMusica = new Scanner(System.in);
                respChange = mudaMusica.nextLine();
                System.out.println("Qual a nova posição que deseja colocar a música?");
                troca = mudaMusica.nextInt();
                for (int e = 0; e < a.getMusic().size(); e++){
                    if(respChange.equals(a.music.get(e).getNome())){
                        aux = a.music.get(troca - 1);
                        a.music.set(troca -1, a.music.get(e));
                        a.music.set(e,aux);
            }
        }
            }
        }
    }
    public void adicionaMusica(){
        System.out.println("Album: ");
        String nomeAlbum = scan.nextLine();
        for (album a: this.albuns) {
            if (nomeAlbum.equals(a.getTitulo())){
                System.out.println("Insira a música");
                Scanner insereMusica = new Scanner(System.in);
                String newMsc = insereMusica.nextLine();
                musica novaMusica = new musica(newMsc,a.getArtista());
                a.music.add(novaMusica);
            }
        }


    }
    public void removeMusica(){
        System.out.println("Album: ");
        String esteAlbum = scan.nextLine();
        for (album a: this.albuns) {
            if (esteAlbum.equals(a.getTitulo())){
                System.out.println("Insira a música");
                Scanner removeMusica = new Scanner(System.in);
                String tirarMsc = removeMusica.nextLine();
                for (int f = 0; f < a.getMusic().size(); f++){
                    if(tirarMsc.equals(a.music.get(f).getNome())) {
                        a.music.remove(f);
                        break;
                    }
                }
            }
        }

    }
    public void novoAlbum(){
        ArrayList<musica> music = new ArrayList<>();

        System.out.println("Novo Album\n");
        System.out.println("Titulo: ");
        String titulo = scan.nextLine();
        System.out.println("Artista: ");
        String artista = scan.nextLine();
        System.out.println("Quantidade de musicas: ");
        int qtdMus = Integer.parseInt(scan.nextLine());
        System.out.println("Lista de músicas: ");
        for(int i = 0; i < qtdMus; i++){
            System.out.print("Nome da música: ");
            String nome = scan.nextLine();

            music.add(new musica(nome, artista));

        }
        this.albuns.add(new album(titulo, artista, qtdMus, music));

    }

}
