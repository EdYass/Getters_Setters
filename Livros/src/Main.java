
public class Main {
    public static void main(String[] args){
        Livro l1 = new Livro("","", 0);
        Livro l2 = new Livro("A morte de um pão","Pessoa", 2005);
        l1.setTitulo("A vida de um pão");
        l1.setAutor("João");
        l1.setAno(2003);

        l1.apresentarDados();
        l2.apresentarDados();
        System.out.println("___________________________________");
    }
}