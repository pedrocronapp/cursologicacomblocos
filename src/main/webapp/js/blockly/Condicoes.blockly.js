window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Condicoes = window.blockly.js.blockly.Condicoes || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Condicoes.reajustar_salario = async function() {
 var item, media, n1, n2, n3, nome, nota1, nota2, nota3, novo_salario, salario_atual;
  salario_atual = parseFloat(window.prompt('Informe seu salário atual:'));
  if (salario_atual >= 0) {
    if (salario_atual <= 1045) {
      novo_salario = salario_atual * 1.1;
      console.log(String('Seu salário foi reajustado em 10%: ') + String(novo_salario));
    } else if (salario_atual > 1045 && salario_atual <= 4180) {
      novo_salario = salario_atual * 1.05;
      console.log(String('Seu salário foi reajustado em 5%: ') + String(novo_salario));
    } else if (salario_atual <= 15000) {
      novo_salario = salario_atual * 1.025;
      console.log(String('Seu salário foi reajustado em 2.5%: ') + String(novo_salario));
    } else {
      console.log('Salario acima do teto, consulte o RH.');
    }
  } else {
    console.log('Salário inferior a 0');
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Condicoes.calcular_media = async function(n1, n2, n3) {
 var item, media, nome, nota1, nota2, nota3, novo_salario, salario_atual;
  media = 0 + (n1 + n2 + n3) / 3;
  return media;
}

/**
 * Condicoes
 */
window.blockly.js.blockly.Condicoes.informar_resultado = async function() {
 var item, media, n1, n2, n3, nome, nota1, nota2, nota3, novo_salario, salario_atual;
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
