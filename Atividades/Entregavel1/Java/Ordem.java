/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/
import java.util.Scanner;

public class Ordem {
  public static void ordenarVetor() {
    Scanner scanner1 = new Scanner(System.in);
      System.out.println("5. Ordenação");
    System.out.println("Quantos valores você quer digitar?: ");
    int tamanho = scanner1.nextInt();

    int[] vetor = new int[tamanho];
    int aux;

    for (int i = 0; i < tamanho; i++) {
      int x = i + 1;
      System.out.println("Valor " + x + ": ");
      vetor[i] = scanner1.nextInt();
    }

    // Ordenando
    for (int i = 0; i < tamanho; i++) {
      for (int j = i + 1; j < tamanho; j++) {
        if (vetor[i] > vetor[j]) {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }

    System.out.println("------------------------------------------------");
    System.out.println("-> R: Valores Ordenados: ");
    for(int i = 0; i < tamanho; i++){
      System.out.println(vetor[i]);}
  }
}