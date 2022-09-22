/*
  ENTREGÁVEL 1 - AMBIENTES DE DESENVOLVIMENTO DE SOFTWARE
  Beatriz Vidal, 2217226, ADS
  Algoritmos fundamentais em Javascript
*/
import { numeroPrimo } from "./primo.js";
import { somarNumeros } from "./soma.js";
import { mdc } from "./mdc.js";
import { fibonacci } from "./fibonacci.js";
import { ordenarVetor } from "./ordem.js";
import { contagem } from "./contagem.js";

console.log(`===============================
    ALGORITMOS FUNDAMENTAIS
    Author: Beatriz Vidal
===============================\n`)

/*
* ================= ALGORITMO 1 =================
*/
console.log("ALGORITMO 1: Número Primo");
console.log(numeroPrimo(5) + "\n");

/*
* ================= ALGORITMO 2 =================
*/
console.log("ALGORITMO 2: Somar números");
console.log(somarNumeros([5, 4, 7, 2]) + "\n");

/*
* ================= ALGORITMO 3 =================
*/
console.log("ALGORITMO 3: Série Fibonacci");
console.log(fibonacci(6) + "\n");

/*
* ================= ALGORITMO 4 =================
*/
console.log("ALGORITMO 4: MDC");
console.log(mdc(15, 13) + "\n");

/*
  * ================= ALGORITMO 5 =================
*/
console.log("ALGORITMO 5: Ordenar Vetor");
console.log(ordenarVetor([5, 7, 2, 1]) + "\n");

/*
  * ================= ALGORITMO 6 =================
*/
console.log("ALGORITMO 6: Contar Inteiros")
console.log(contagem(4) + "\n");