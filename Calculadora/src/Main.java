import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        double num1 = s.nextDouble();

        System.out.print("Insira outro numero: ");
        double num2 = s.nextDouble();

        System.out.print("Deseja fazer qual operação? \n1- Somar \n2- Subtrair \n3- Dividir \n4- Multiplicar\n");
        int op = s.nextInt();

        double resultado = 0;

        switch (op) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
            case 4:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        System.out.printf("O resultado é: %.4f%n" , resultado);
    }
}
