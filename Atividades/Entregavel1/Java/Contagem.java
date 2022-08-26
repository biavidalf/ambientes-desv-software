/*
  * Author: Beatriz Vidal
  * Description: Contar os números inteiros
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