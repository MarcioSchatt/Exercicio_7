import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área de um círculo:");

        double area = sc.nextDouble();
        double dobroArea = area * 2;
        sc.close();

        System.out.println("O dobro da área de " + area + "m é " + dobroArea + "m");
    }
}