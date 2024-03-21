import java.util.*;
public class Circulo {
        private float raio;

        public Circulo(float raio){this.raio = raio;}
        public float getRaio(){return this.raio;}

        public void calcularArea(){
            Scanner raio = new Scanner(System.in);
            System.out.printf("Digite o raio do círculo: ");
            this.raio = raio.nextFloat();
            double AreaC = Math.PI*Math.pow(this.raio,2);
            System.out.printf("A área do círculo é: %.2f",AreaC);
        }

}

