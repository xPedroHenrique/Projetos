function relogio() {
    let relogio = document.querySelector('.relogio');
    let seconds = 0;
    let timer;

    function getseconds(seconds) {
        const date = new Date(seconds * 1000);
        return date.toLocaleTimeString('pt-BR', {
            hour12: false,
            timeZone: 'UTC'
        })
    }

    function onRelogio() {
        timer = setInterval(function () {
            seconds++;
            relogio.innerHTML = getseconds(seconds);
        }, 1000)
    }

    document.addEventListener('click', function (event) {
        const element = event.target;

        if (element.classList.contains('iniciar')) {
            relogio.classList.remove('pausado');
            onRelogio();
        }

        if (element.classList.contains('pausar')) {
            relogio.classList.add('pausado');
            clearInterval(timer)
        }

        if (element.classList.contains('zerar')) {
            relogio.classList.remove('pausado');
            relogio.innerHTML = '00:00:00';
            seconds = 0;
            clearInterval(timer);
        }
    })
}

relogio();