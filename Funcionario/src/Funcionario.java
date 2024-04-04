import java.util.*;

public class Funcionario {
    private String nome;
    private String cargo;
    private int idade;

    public Funcionario(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getCargo(){return this.cargo;}
    public void setCargo(String cargo){this.cargo=cargo;}

    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade=idade;}

    public void coletarDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Funcionário: ");
        this.nome = teclado.nextLine();
        System.out.print("Digite o cargo do Funcionário: ");
        this.cargo = teclado.nextLine();
        System.out.print("Digite a idade do Funcionário: ");
        this.idade = teclado.nextInt();
        teclado.close();

    }
    public void apresentarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Idade: "+this.idade);
    }

}
