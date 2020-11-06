window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Datas = window.blockly.js.blockly.Datas || {};

/**
 * Datas
 */
window.blockly.js.blockly.Datas.calcular_dias_de_vida = async function() {

  console.log(['Você está vivo a: ',this.cronapi.dateTime.getDaysBetweenDates(this.cronapi.dateTime.getNow(), this.cronapi.dateTime.newDate(parseFloat(window.prompt('Informe seu ano de nascimento')), parseFloat(window.prompt('Informe seu mês de nascimento')), parseFloat(window.prompt('Informe seu dia de nascimento')), 0, 0, 0)),'dias'].join(''));
}
