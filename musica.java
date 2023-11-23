
    public class musica {
        private String nome;
        private String artista;
        private int duracao;

        public musica(String nome, String artista){
            this.nome = nome;
            this.artista = artista;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }

        public int getDuracao() {
            return duracao;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }
    }


