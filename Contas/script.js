function soma() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    let res = document.getElementById('res');

    if (n1 <= 0 || n2 <= 0) {
        res.innerHTML = `<p>Inválido!</p>`
    } else {
        res.innerHTML = `<p><strong>${n1} + ${n2} = ${Number(n1) + Number(n2)}</strong></p>`
    }
}

function sub() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    let res = document.getElementById('res');

    if (n1 <=  0 || n2 <= 0) {
        res.innerHTML = `<p>Inválido!</p>`
    } else {
        res.innerHTML = `<p><strong>${n1} - ${n2} = ${n1 - n2}</strong></p>`
    }
}

function multi() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    let res = document.getElementById('res');

    if (n1 <= 0 || n2 <= 0) {
        res.innerHTML = `<p>Inválido!</p>`
    } else {
        res.innerHTML = `<p><strong>${n1} x ${n2} = ${n1 * n2}</strong</p>`
    }
}

function divi() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    let res = document.getElementById('res');

    if (n1 <= 0 || n2 <= 0) {
        res.innerHTML = `<p>Inválido!</p>`
    } else {
        res.innerHTML = `<p><strong>${n1} / ${n2} = ${n1 / n2}</strong></p>`
    }
}

function gerar() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    let res = document.getElementById('res');

    if (n1 <= 0 || n2 <= 0) {
        res.innerHTML = `<p>Inválido!</p>`
    } else {
        res.innerHTML = `<p><strong>${n1} ** ${n2} = ${n1 ** n2}</strong></p>`
    }
}