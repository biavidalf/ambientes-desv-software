/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Fibonacci{
  public static String fibonacci(int quantidadeTermos){
    int anterior = 0;
    int atual = 1;
    String resultado = "0, ";

    for(int i = 0; i < quantidadeTermos; i++){
      if(i == quantidadeTermos - 1){
        resultado += atual + ".";
      }else{
        resultado += atual + ", ";
      }
      int aux = atual;
      atual = anterior + aux;
      anterior = aux;
    }

    return "-> R: Série Fibonacci com " + quantidadeTermos + " termos: " + resultado;
  }
}