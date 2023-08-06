function gerar() {
    let num = document.getElementById('num');
    let comeco = document.getElementById('com');
    let fim = document.getElementById('fim');
    let res = document.querySelector('.res');

    if (num.value == 0) {
        alert = `ERRO...`
    } else {
        let n = Number(num.value);
        let i = Number(comeco.value);
        let f = Number(fim.value);
        res.innerHTML = "";
        for (let c = i; c <= f; c++) {
            res.innerHTML += `<p>${n} x ${c} = ${n * c}</p>`;
            num.value = "";
            num.focus();
            comeco.value = "";
            comeco.focus();
            fim.value = "";
            fim.focus();
        }

    }

}
