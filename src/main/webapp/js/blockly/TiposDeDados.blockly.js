window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.TiposDeDados = window.blockly.js.blockly.TiposDeDados || {};

/**
 * TiposDeDados
 */
window.blockly.js.blockly.TiposDeDados.imprimirDados = async function() {
 var item, caracter, numeroDecimal, numeroInteiro, stringTexto, variavelBooleana;
  numeroInteiro = 5;
  numeroDecimal = -7.5;
  caracter = 'A';
  stringTexto = 'Olá Mundo!';
  variavelBooleana = false;
  console.log(numeroInteiro);
  console.log(numeroDecimal);
  console.log(caracter);
  console.log(stringTexto);
  console.log(variavelBooleana);
}
