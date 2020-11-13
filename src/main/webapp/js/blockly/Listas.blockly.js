window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Listas = window.blockly.js.blockly.Listas || {};

function listsGetSortCompare(type, direction) {
  var compareFuncs = {
    "NUMERIC": function(a, b) {
        return parseFloat(a) - parseFloat(b); },
    "TEXT": function(a, b) {
        return a.toString() > b.toString() ? 1 : -1; },
    "IGNORE_CASE": function(a, b) {
        return a.toString().toLowerCase() > b.toString().toLowerCase() ? 1 : -1; },
  };
  var compare = compareFuncs[type];
  return function(a, b) { return compare(a, b) * direction; }
}

/**
 * Listas
 */
window.blockly.js.blockly.Listas.manipular_listas = async function() {
 var item, lista, lista_anos, lista_de_nomes, lista_de_nomes_com_idade;
  lista_de_nomes = ['Maria', 'José', 'Pedro'];
  console.log(String('O usuário na posição 2 é: ') + String(lista_de_nomes[1]));
  console.log('Mudando nome...');
  lista_de_nomes[1] = 'Filipe';
  console.log(String('O usuário na posição 2 é: ') + String(lista_de_nomes[1]));
  console.log(String('O tamanho da sua lista é: ') + String(lista_de_nomes.length));
  console.log('--------------------');
  lista_anos = [2020, 1964, 2008];
  console.log(lista_anos);
  console.log(lista_anos.slice().sort(listsGetSortCompare("NUMERIC", 1)));
  console.log('--------------------');
  lista_de_nomes_com_idade = [['Maria', 60], ['Pedro', 50]];
  console.log(String('O usuário na posição 2 é: ') + String(lista_de_nomes_com_idade[1]));
}
