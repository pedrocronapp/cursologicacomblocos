window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Funcoes = window.blockly.js.blockly.Funcoes || {};

/**
 * Esta função informar no console o resultado da cotação.
 */
window.blockly.js.blockly.Funcoes.informar_conversao = async function() {
 var item, conversao, cotacao, resultado, valor, x;
  valor = parseFloat(window.prompt('Informe o valor a ser convertido: '));
  cotacao = parseFloat(window.prompt('Informe o valor da cotação do dia: '));
  conversao = await this.blockly.js.blockly.Funcoes.converter_dolar_em_real(valor, cotacao);
  console.log(conversao);
}

/**
 * Funcoes
 */
window.blockly.js.blockly.Funcoes.converter_dolar_em_real = async function(valor, cotacao) {
 var item, conversao, resultado, x;
  resultado = valor * cotacao;
  return resultado;
}
