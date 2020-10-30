window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Variavel = window.blockly.js.blockly.Variavel || {};

/**
 * Variavel
 */
window.blockly.js.blockly.Variavel.cadastrarCNH = async function() {
 var item, cathab, cpf, nome;
  nome = window.prompt('Informe o seu nome: ');
  cpf = window.prompt('Informe o seu CPF: ');
  cathab = window.prompt('Informe a categoria da sua habilitação:  ');
  console.log(String('Nome: ') + String(nome));
  console.log(String('CPF: ') + String(cpf));
  console.log(String('Categoria da Habilitação: ') + String(cathab));
}
