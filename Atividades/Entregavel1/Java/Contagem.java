/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Contagem {
  public static String contagem(int qtd_numeros) {
    Scanner scanner1 = new Scanner(System.in);
    int contagem = 0;
    for(int i = 0; i < qtd_numeros; i++){
      System.out.println("Digite o número " + (i+1) + " da contagem: ");
      double atual = scanner1.nextDouble();
      if(isInteiro(atual)){
        contagem++;
      }
    }
    return "Quantidade de números inteiros: " + contagem;
  }

  public static boolean isInteiro(double numero){
    int fracionada = (int)Math.round((numero - (int)numero) * 100);
    return fracionada == 0 ? true : false;
  }
}