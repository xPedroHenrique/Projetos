let form = document.querySelector('.form');

form.addEventListener('submit', function (evento) {
    evento.preventDefault();

    let inputPeso = evento.target.querySelector('#peso');
    let inputAltura = evento.target.querySelector('#altura');

    let peso = Number(inputPeso.value);
    let altura = Number(inputAltura.value);

    inputPeso.value = ''
    inputAltura.value = ''
    inputPeso.focus();
    inputAltura.focus();

    if (!peso) {
        resultado('Peso inválido', false)
        return;
    }

    if (!altura) {
        resultado('Altura inválida', false)
        return;
    }

    let imc = getImc(peso, altura);
    let nivelImc = getNivelImc(imc);

     let msg = `Seu IMC é ${imc} (${nivelImc}).`;
  
     resultado(msg, true);

})

function getNivelImc(imc) {
    let nivel = ['Abaixo do peso', 'Peso normal', 'Sobrepeso', 'Obesidade grau 1', 'Obesidade grau 2', 'Obesidade grau 3'];

    if (imc >= 39.9) return nivel[5];
    if (imc >= 34.9) return nivel[4];
    if (imc >= 29.9) return nivel[3];
    if (imc >= 24.9) return nivel[2];
    if (imc >= 18.5) return nivel[1];
    if (imc < 18.5) return nivel[0];

}

function getImc(peso, altura) {
    let imc = peso / (altura * altura);
    return imc.toFixed(2);
}

function criaP() {
    let p = document.createElement('p');
    return p;

}

function resultado(msg, isValid) {
    let res = document.querySelector('.res');
    res.innerHTML = '';

    let p = criaP();

    if (isValid) {
        p.classList.add('paragrafo-resultado');
    }
    else {
        p.classList.add('bad');
    }

    p.innerHTML = msg;
    res.appendChild(p);

}


