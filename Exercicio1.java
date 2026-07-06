package Prática_8_3_JAVA_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª cor: ");
            cores.add(leia.nextLine());
        }

        System.out.println("\nListar todas as cores:");

        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:");

        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
}