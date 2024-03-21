public class Livro {
    private String titulo;
    private String autor;
    int ano;

    //Construtor
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return  this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo =titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor=autor;
    }

    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void apresentarDados(){
        System.out.println("___________________________________");
        System.out.println("Título do livro: "+this.titulo);
        System.out.println("Autor do livro: "+this.autor);
        System.out.println("Ano Publicado: "+this.ano);

    }

}
