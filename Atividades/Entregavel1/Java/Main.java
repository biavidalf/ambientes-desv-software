
/*
  ENTREGÁVEL 1 - AMBIENTES DE DESENVOLVIMENTO DE SOFTWARE
  Beatriz Vidal, 2217226, ADS
  Algoritmos fundamentais em Java
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    printIntro();
    Scanner sc1 = new Scanner(System.in);

    /*
     * ================= ALGORITMO 1 =================
     */
    System.out.println("1. Verificar se o número é primo");
    System.out.println("Digite um número: ");
    System.out.println(Primo.numeroPrimo(sc1.nextInt()));

    printLine();

    /*
     * ================= ALGORITMO 2 =================
     */
    System.out.println("2. Somar números");
    System.out.println("Digite a quantidade de números a serem somados: ");
    System.out.println(Soma.somarNumeros(sc1.nextInt()));

    printLine();

    /*
     * ================= ALGORITMO 3 =================
     */
    System.out.println("3. Série Fibonacci");
    System.out.println("Digite a quantidade de termos na Série Fibonacci: ");
    System.out.println(Fibonacci.fibonacci(sc1.nextInt()));

    printLine();

    /*
     * ================= ALGORITMO 4 =================
     */
    System.out.println("4. MDC");
    System.out.println("Digite o primeiro número: ");
    int mdc1 = sc1.nextInt();
    System.out.println("Digite o segundo número: ");
    int mdc2 = sc1.nextInt();
    System.out.println(Mdc.mdc(mdc1, mdc2));

    printLine();
    
    /*
     * ================= ALGORITMO 5 =================
     */
    Ordem.ordenarVetor();

    printLine();
    /*
     * ================= ALGORITMO 6 =================
     */
    System.out.println("6. Contagem");
    System.out.println("Digite o número final da contagem: ");
    Double maximo = sc1.nextDouble();
    System.out.println(Contagem.contagem(maximo));
  }

  /*
   * ============ FUNÇÕES AUXILIARES DE FORMATAÇÃO ============
   */
  public static void printLine() {
    System.out.println("\n------------------------------------------------------------\n");
  }

  public static void printIntro() {
    System.out.println("============================================================");
    System.out.println("Entregável 1 - Ambientes de Desenvolvimento de Software");
    System.out.println("Author: Beatriz Vidal");
    System.out.println("============================================================\n");
  }

}