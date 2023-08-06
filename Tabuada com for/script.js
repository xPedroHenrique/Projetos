function gerar() {
    let n = document.getElementById('txtn')
    let tab = document.getElementById('seltab')
    if (n.value.length == 0) {
        window.alert('Por favor, digite um número!')
    } else {
        let num = Number(n.value)
        let c = 1
        tab.innerHTML = ""
        for (let c = 1; c <= 10; c++) {
            let item = document.createElement('option')
            item.text = `${num} x ${c} = ${num * c}`
            item.value = `tab${c}`
            tab.appendChild(item)
            n.value = ""
            n.focus()

        }
    }

}

