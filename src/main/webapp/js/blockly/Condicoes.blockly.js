window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Condicoes = window.blockly.js.blockly.Condicoes || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Condicoes.calcular_media = async function(n1, n2, n3) {
 var item, media, nome, nota1, nota2, nota3, x;
  media = 0 + (n1 + n2 + n3) / 3;
  return media;
}

/**
 * Condicoes
 */
window.blockly.js.blockly.Condicoes.informar_resultado = async function() {
 var item, media, n1, n2, n3, nome, nota1, nota2, nota3, x;
  nome = window.prompt('Informe seu nome');
  nota1 = parseFloat(window.prompt('Informe a nota 1'));
  nota2 = parseFloat(window.prompt('Informe a nota 2'));
  nota3 = parseFloat(window.prompt('Informe a nota 3'));
  media = await this.blockly.js.blockly.Condicoes.calcular_media(nota1, nota2, nota3);
  if (media >= 6) {
    console.log([nome,'Você foi aprovado com média: ',media].join(''));
  } else {
    console.log([nome,'Você foi reprovado com média: ',media].join(''));
  }
}
