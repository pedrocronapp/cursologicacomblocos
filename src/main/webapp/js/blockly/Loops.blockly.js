window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Loops = window.blockly.js.blockly.Loops || {};

/**
 * Loops
 */
window.blockly.js.blockly.Loops.imprimir_tabuada_com_while = async function() {
 var item, contador, numero_tabuada, resultado_tabuada;
  numero_tabuada = parseFloat(window.prompt('Informe um número a ser calculado na tabuada'));
  contador = 0;
  while (contador < 11) {
    resultado_tabuada = (numero_tabuada * contador);
    console.log([numero_tabuada,'x',contador,'=',resultado_tabuada].join(''));
    contador = (contador + 1);
  }
}
