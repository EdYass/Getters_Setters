import java.util.*;
public class Banco {
    private String titular;
    private float saldo;

    public Banco(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){return this.titular;}
    public void setTitular(String titular){this.titular=titular;}
    public float getSaldo(){return  this.saldo;}
    public void setSaldo(float saldo){this.saldo=saldo;}

    public void apresentarDados(){
        System.out.println("Nome do Titular: "+this.titular);
        System.out.println("O saldo é: "+this.saldo);
    }
    public void depositar(){
        System.out.print("Digite o valor a ser depositado: ");
        Scanner teclado = new Scanner(System.in);
        this.saldo =this.saldo + teclado.nextFloat();
        System.out.println("O saldo atual é: "+this.saldo);
        teclado.close();
    }

    public void sacar(){
        System.out.print("Digite o valor a ser sacado: ");
        Scanner teclado = new Scanner(System.in);
        float sacar = teclado.nextFloat();
        float saque = this.saldo - sacar;
        if ((this.saldo < sacar)||(this.saldo==0)){
            System.out.println("Saldo insuficiente");
            System.out.println("O saldo atual é: "+this.saldo);
        }else{
            System.out.println("O saldo atual é: "+saque);
        }
        teclado.close();
    }
}
