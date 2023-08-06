const inputTarefa = document.querySelector('.nova-tarefa');
const btnTarefa = document.querySelector('.add-tarefa');
const tarefas = document.querySelector('.tarefas');

function criaLi() {
    const li = document.createElement('li');
    return li;
}

inputTarefa.addEventListener('keypress', function (e) {
    if (e.keyCode === 13) {
        if (!inputTarefa.value) return;
        criaTarefa(inputTarefa.value);
    }
});

function limaInput() {
    inputTarefa.value = '';
    inputTarefa.focus();
}

function criaTarefa(txtInput) {
    const li = criaLi();
    li.innerHTML = txtInput;
    tarefas.appendChild(li);
    limaInput();
    apagar(li);
    salvarTarefas();
}

function apagar(li) {
    li.innerText += ' ';
    const btnApagar = document.createElement('button');
    btnApagar.innerText = 'Apagar';
    btnApagar.setAttribute('class', 'apagar');
    btnApagar.setAttribute('title', 'Apagar essa tarefa');
    li.appendChild(btnApagar);
}

btnTarefa.addEventListener('click', () => {
    if (!inputTarefa.value) return;
    criaTarefa(inputTarefa.value);
});

document.addEventListener('click', e => {
    const el = e.target;

    if (el.classList.contains('apagar')) {
        el.parentElement.remove();
        salvarTarefas();
    }
});

function salvarTarefas() {
    const liTarefas = tarefas.querySelectorAll('li');
    const listaTarefas = [];

    for (let tarefa of liTarefas) {
        let txtTarefa = tarefa.innerText;
        txtTarefa = txtTarefa.replace('Apagar', '').trim();
        listaTarefas.push(txtTarefa);
    }

    const tarefasJSON = JSON.stringify(listaTarefas);
    localStorage.setItem('tarefas', tarefasJSON);
}

function addSave() {
    const tarefas = localStorage.getItem('tarefas');
    const lista = JSON.parse(tarefas);

    for (let tarefa of lista) {
        criaTarefa(tarefa);
    }
}

addSave();