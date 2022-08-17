
/*
  ENTREGÁVEL 1 - AMBIENTES DE DESENVOLVIMENTO DE SOFTWARE
  Beatriz Vidal, 2217226, ADS
  Algoritmos fundamentais em Java
  Replit link: https://replit.com/@BeatrizVidal/Entregavel1#Main.java
*/
import java.util.Scanner;

class Main {
  public static String numeroPrimo(int numero) {
    int divisores = 0;

    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }

    if (divisores == 2) {
      return "R: O número digitado (" + numero + ") é primo.";
    } else {
      return "R: O número digitado (" + numero + ") não é primo.";
    }
  }

  public static void printLine() {
    System.out.println("\n------------------------------------------------------------\n");
  }

  public static void main(String[] args) {
    System.out.println("============================================================");
    System.out.println("Entregável 1 - Ambientes de Desenvolvimento de Software");
    System.out.println("Author: Beatriz Vidal");
    System.out.println("============================================================\n");

    Scanner sc1 = new Scanner(System.in);

    System.out.println("1. Verificar se o número é primo");
    System.out.println("Digite um número: ");
    System.out.println(numeroPrimo(sc1.nextInt()));

    printLine();
  }
}