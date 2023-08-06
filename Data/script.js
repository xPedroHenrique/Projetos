let dia = document.getElementById('dia');
let mes = document.getElementById('mes');
let ano = document.getElementById('ano');

let data = new Date();

let d = data.getDate();

let m = data.getMonth() + 1;

let y = data.getFullYear();

if(d < 10) d = '0' + d;

if(m < 10) m = '0' + m;

dia.textContent = d;

mes.textContent = m;

ano.textContent = y;

let horas = document.getElementById('horas')
let minutos = document.getElementById('minutos')
let segundos  = document.getElementById('segundos')

let relogio = setInterval(function time(){
    let data = new Date();
    let hr = data.getHours();
    let mn = data.getMinutes();
    let seg = data.getSeconds();

    if(hr < 10) hr = '0' + hr;
    if(mn < 10) mn = '0' + mn;
    if(seg < 10) seg = '0' + seg;

    horas.textContent = hr;
    minutos.textContent = mn;
    segundos.textContent = seg;
})



