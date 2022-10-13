/* ALGORITMO 1 - NÚM PRIMO */
function primo(){
    let numero = document.getElementById("q1-i1").value;
    document.getElementById("resposta-q1").innerHTML = numeroPrimo(numero);
}

/* ALGORITMO 2 - SOMA */
function soma(){
  let numero1 = parseInt(document.getElementById("q2-i1").value);
  let numero2 = parseInt(document.getElementById("q2-i2").value);
  document.getElementById("resposta-q2").innerHTML = somarNumeros([numero1, numero2]);
}

/* ALGORITMO 3 - FIBONACCI */
function fibonacci(){
  let numero = document.getElementById("q3-i1").value;
  document.getElementById("resposta-q3").innerHTML = calcularFibonacci(numero);
}

/* ALGORITMO 4 - MDC */
function mdc(){
  let numero1 = parseInt(document.getElementById("q4-i1").value);
  let numero2 = parseInt(document.getElementById("q4-i2").value);
  document.getElementById("resposta-q4").innerHTML = calcularMdc(numero1, numero2);
}

/* ALGORITMO 5 - ORDENAR */
function ordenar(){
  let numero1 = document.getElementById("q5-i1").value;
  let numero2 = document.getElementById("q5-i2").value;
  let numero3 = document.getElementById("q5-i3").value;
  let numero4 = document.getElementById("q5-i4").value;
  document.getElementById("resposta-q5").innerHTML = ordenarVetor([numero1, numero2, numero3, numero4]);
}

/* ALGORITMO 6 - CONTAGEM */
function contar(){
  let numero1 = document.getElementById("q6-i1").value;
  let numero2 = document.getElementById("q6-i2").value;
  let numero3 = document.getElementById("q6-i3").value;
  let numero4 = document.getElementById("q6-i4").value;
  document.getElementById("resposta-q6").innerHTML = contagem([numero1, numero2, numero3, numero4]);
}

/* FUNÇÕES */
// ================= ALGORITMO 1 =================
function numeroPrimo(numero) {
    let divisores = 0;

    for (let i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }

    if (divisores == 2) {
      return "O número digitado (" + numero + ") é primo.";
    } else {
      return "O número digitado (" + numero + ") não é primo.";
    }
}

// ================= ALGORITMO 2 =================
function somarNumeros(numerosDigitados) {
    let soma = 0;
    for (let i = 0; i < numerosDigitados.length; i++) {
        soma += numerosDigitados[i];
    }

    return "A soma dos " + numerosDigitados.length + " números é igual a: " + soma;
}

// ================= ALGORITMO 3 =================
function calcularFibonacci(quantidadeTermos){
    let anterior = 0;
    let atual = 1;
    let resultado = "0, ";

    for(let i = 0; i < quantidadeTermos; i++){
      if(i == quantidadeTermos - 1){
        resultado += atual + ".";
      }else{
        resultado += atual + ", ";
      }
      let aux = atual;
      atual = anterior + aux;
      anterior = aux;
    }

    return "Série Fibonacci com " + quantidadeTermos + " termos: " + resultado;
}

// ================= ALGORITMO 4 =================
function calcularMdc(first, second){
    let resto;
    let f_old = first;
    let s_old = second;

    do{
      resto = first % second;
      first = second;
      second = resto;
    }while(resto != 0);

    return `MDC de ${f_old} e ${s_old} é igual a: ${first}`;
}

// ================= ALGORITMO 5 =================
function ordenarVetor(vetor) {
    let aux;

    // Ordenando
    for (let i = 0; i < vetor.length; i++) {
      for (let j = i + 1; j < vetor.length; j++) {
        if (vetor[i] > vetor[j]) {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }

    return "Valores Ordenados: " + vetor;
}

// ================= ALGORITMO 6 =================
function contagem(numeros) {
  let contagem = 0;
  for(let i = 0; i < numeros.length; i++){
    let atual = numeros[i];
    if(isInteiro(atual)){
      contagem++;
    }
  }
  return "Quantidade de números inteiros: " + contagem;

  function isInteiro(numero){
      let fracionada = parseInt(Math.round((numero - parseInt(numero)) * 100));
      return fracionada == 0 ? true : false;
  }
}