window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Matematica = window.blockly.js.blockly.Matematica || {};

function mathRandomInt(a, b) {
  if (a > b) {
    // Swap a and b to ensure a is smaller.
    var c = a;
    a = b;
    b = c;
  }
  return Math.floor(Math.random() * (b - a + 1) + a);
}

function mathIsPrime(n) {
  // https://en.wikipedia.org/wiki/Primality_test#Naive_methods
  if (n == 2 || n == 3) {
    return true;
  }
  // False if n is NaN, negative, is 1, or not whole.
  // And false if n is divisible by 2 or 3.
  if (isNaN(n) || n <= 1 || n % 1 != 0 || n % 2 == 0 || n % 3 == 0) {
    return false;
  }
  // Check all the numbers of form 6k +/- 1, up to sqrt(n).
  for (var x = 6; x <= Math.sqrt(n) + 1; x += 6) {
    if (n % (x - 1) == 0 || n % (x + 1) == 0) {
      return false;
    }
  }
  return true;
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Matematica.verificar_primo = async function() {
 var item, altura, numero, peso, resultado_imc;
  numero = mathRandomInt(1, 1000);
  console.log(numero);
  console.log(mathIsPrime( Math.abs( Math.trunc(numero))));
}

/**
 * Matematica
 */
window.blockly.js.blockly.Matematica.calcular_imc = async function() {
 var item, altura, numero, peso, resultado_imc;
  altura = parseFloat(window.prompt('Informe sua altura'));
  peso = parseFloat(window.prompt('Informe seu peso'));
  resultado_imc = peso / (altura * altura);
  console.log(resultado_imc);
}
