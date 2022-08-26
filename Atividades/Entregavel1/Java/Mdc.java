/*
  * Author: Beatriz Vidal
  * Description: Calcular o MDC
*/
import java.util.Scanner;

public class Mdc {
public static String mdc(int first, int second){
    int resto;
    int f_old = first;
    int s_old = second;

    do{
      resto = first % second;
      first = second;
      second = resto;
    }while(resto != 0);

    return String.format("-> R: MDC de %d e %d é igual a: %d", f_old, s_old, first);
  }
}