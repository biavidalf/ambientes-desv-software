/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Primo{
  public static String numeroPrimo(int numero) {
    int divisores = 0;

    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }

    if (divisores == 2) {
      return "-> R: O número digitado (" + numero + ") é primo.";
    } else {
      return "-> R: O número digitado (" + numero + ") não é primo.";
    }
  }
}