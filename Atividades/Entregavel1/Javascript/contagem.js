/*
  * Author: Beatriz Vidal
  * Description: Contar os números inteiros
*/

export function contagem(qtd_numeros) {
  let contagem = 0;
  let numeros = [5, 8.9, 2, 4.3];

  for(let i = 0; i < qtd_numeros; i++){
    console.log("Número " + (i+1) + " da contagem: " + numeros[i]);
    let atual = numeros[i];
    if(isInteiro(atual)){
      contagem++;
    }
  }
  console.log("Quantidade de números inteiros: " + contagem);

  function isInteiro(numero){
      let fracionada = parseInt(Math.round((numero - parseInt(numero)) * 100));
      return fracionada == 0 ? true : false;
  }
}