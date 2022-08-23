
/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Contagem {
  public static String contagem(Double maximo) {
    int contagem = maximo.intValue();

    /*
     * for(int i = 1; i < maximo; i++){
     * if(((Object)i).getClass().getSimpleName() == "Integer"){
     * contagem++;
     * }
     * }
     */
    return "-> R: " + contagem + " números inteiros";
  }
}