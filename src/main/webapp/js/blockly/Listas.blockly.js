window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Listas = window.blockly.js.blockly.Listas || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Listas.imprimir_resultador_escolar = async function() {
 var resultado_media, lista_notas, contador, nota, quantidade_notas, notas, soma_notas, i, lista, lista_de_nomes_com_idade, lista_anos, lista_de_nomes;
  contador = 1;
  lista_notas = [];
  quantidade_notas = parseFloat(window.prompt('Informe quantas notas você deseja inserir: '));
  while (contador <= quantidade_notas) {
    nota = parseFloat(window.prompt(String('Informe a nota ') + String(contador)));
    lista_notas.splice((contador - 1), 0, nota);
    contador = (contador + 1);
  }
  console.log(lista_notas);
  resultado_media = await this.blockly.js.blockly.Listas.calcular_media(lista_notas);
  if (resultado_media >= 6) {
    console.log(String('Parabéns, você foi aprovado com média: ') + String(resultado_media));
  } else {
    console.log(String('Você foi reprovado com média:') + String(resultado_media));
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Listas.calcular_media = async function(notas) {
 var resultado_media, lista_notas, contador, nota, quantidade_notas, soma_notas, i, lista, lista_de_nomes_com_idade, lista_anos, lista_de_nomes;
  soma_notas = 0;
  var i_end = notas.length;
  var i_inc = 1;
  if (1 > i_end) {
    i_inc = -i_inc;
  }
  for (i = 1; i_inc >= 0 ? i <= i_end : i >= i_end; i += i_inc) {
    soma_notas = (soma_notas + notas[(i - 1)]);
  }
  resultado_media = (soma_notas / notas.length);
  return resultado_media;
}

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
 var resultado_media, lista_notas, contador, nota, quantidade_notas, notas, soma_notas, i, lista, lista_de_nomes_com_idade, lista_anos, lista_de_nomes;
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
