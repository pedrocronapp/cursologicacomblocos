window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Loops = window.blockly.js.blockly.Loops || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Loops.imprimir_tabuadas = async function() {
 var item, contador, i, j, numero_aleatorio, numero_tabuada, palpite, resultado_tabuada;
  for (i = 0; i <= 10; i++) {
    for (j = 0; j <= 10; j++) {
      resultado_tabuada = (i * j);
      console.log([i,'x',j,'=',resultado_tabuada].join(''));
    }
  }
}

function mathRandomInt(a, b) {
  if (a > b) {
    // Swap a and b to ensure a is smaller.
    var c = a;
    a = b;
    b = c;
  }
  return Math.floor(Math.random() * (b - a + 1) + a);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Loops.adivinhar = async function() {
 var item, contador, i, j, numero_aleatorio, numero_tabuada, palpite, resultado_tabuada;
  numero_aleatorio = mathRandomInt(1, 10);
  while (palpite != numero_aleatorio) {
    palpite = parseFloat(window.prompt('Informe seu palpite (1 a 10)'));
    if (palpite == numero_aleatorio) {
      console.log('Parabéns, você acertou o número sorteado!');
      break;
    } else {
      if (palpite > numero_aleatorio) {
        console.log('O número é menor');
      } else {
        console.log('O número é maior');
      }
    }
  }
}

/**
 * Loops
 */
window.blockly.js.blockly.Loops.imprimir_tabuada_com_while = async function() {
 var item, contador, i, j, numero_aleatorio, numero_tabuada, palpite, resultado_tabuada;
  numero_tabuada = parseFloat(window.prompt('Informe um número a ser calculado na tabuada'));
  contador = 0;
  while (contador < 11) {
    resultado_tabuada = (numero_tabuada * contador);
    console.log([numero_tabuada,'x',contador,'=',resultado_tabuada].join(''));
    contador = (contador + 1);
  }
}
