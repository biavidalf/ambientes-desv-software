/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Soma {
  public static String somarNumeros(int quantidade) {
    int soma = 0;
    Scanner scSoma = new Scanner(System.in);

    for (int i = 1; i <= quantidade; i++) {
      System.out.println("Número " + i + ": ");
      soma += scSoma.nextInt();
    }

    return "-> R: A soma dos " + quantidade + " números é igual a: " + soma;
  }
}