window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Matematica = window.blockly.js.blockly.Matematica || {};

/**
 * Matematica
 */
window.blockly.js.blockly.Matematica.calcular_imc = async function() {
 var resultado_imc, altura, peso;
  altura = parseFloat(window.prompt('Informe sua altura'));
  peso = parseFloat(window.prompt('Informe seu peso'));
  resultado_imc = peso / (altura * altura);
  console.log(resultado_imc);
}
