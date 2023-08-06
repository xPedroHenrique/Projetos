function relogio() {
    const time = setInterval(() => {
        let horas = document.getElementById('horas');
        let minutos = document.getElementById('minutos');
        let segundos = document.getElementById('segundos');
        const data = new Date();
        let hrs = data.getHours();
        let min = data.getMinutes();
        let seg = data.getSeconds();

        if (hrs < 10) hrs = '0' + hrs;
        if (min < 10) min = '0' + min;
        if (seg < 10) seg = '0' + seg;

        horas.textContent = hrs;
        minutos.textContent = min;
        segundos.textContent = seg;
    });
}

relogio();