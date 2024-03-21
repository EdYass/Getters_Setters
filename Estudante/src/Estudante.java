import java.util.*;

public class Estudante {
    private String nome;
    private int idade;
    private String curso;

    public Estudante(String nome, int idade, String curso){
        this.curso=curso;
        this.idade=idade;
        this.nome=nome;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome=nome;}
    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade=idade;}
    public String getCurso(){return this.curso;}
    public void setCurso(String curso){this.curso=curso;}

    public void coletarDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        this.nome = teclado.nextLine();
        System.out.print("Digite o curso: ");
        this.curso = teclado.nextLine();
        System.out.print("Digite a idade do aluno: ");
        this.idade = teclado.nextInt();
    }
    public void exibirDados(){
        System.out.println("O nome do aluno é: "+this.nome);
        System.out.println("O curso no aluno é: "+this.curso);
        System.out.println("A idade do aluno é: "+this.idade);
    }
}
