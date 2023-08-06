function gerar() {
    let num = document.getElementById('num');
    let comeca = document.getElementById('com');
    let termina = document.getElementById('ter');
    let tab = document.getElementById('seltab');

    if (num < 0) {
        tab.innerHTML = 'Somente número positivos...'
    } else {
        let n = Number(num.value);
        let i = Number(comeca.value);
        let f = Number(termina.value);
        tab.innerHTML = "";
        while (i <= f) {
            let item = document.createElement('option')
            item.text = `${n} x ${i} = ${n * i}`
            item.value = `tab${i}`
            tab.appendChild(item)
            i++
        }
    }

}