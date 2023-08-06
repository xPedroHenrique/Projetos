function criaCalculadora() {
    return {
        display: document.querySelector('.display'),
        btnClear: document.querySelector('.btn-clear'),

        iniciar() {
            this.clickBtn();
            this.pressEnter();
        },

        clickBtn() {
            document.addEventListener('click', e => {
                const el = e.target;
                if (el.classList.contains('btn-num')) {
                    this.btnDisplay(el.innerText);
                }
                if (el.classList.contains('btn-clear')) {
                    this.clear();
                }
                if (el.classList.contains('btn-del')) {
                    this.remove();
                }
                if (el.classList.contains('btn-eq')) {
                    this.realizaConta();
                }
            });
        },

        pressEnter() {
            document.addEventListener('keyup', e => {
                if (e.keyCode === 13) {
                    this.realizaConta();
                }
            });
        },

        realizaConta() {
            let conta = this.display.value;
            try {
                conta = eval(conta);
                if (!conta) {
                    alert('Conta inválida!');
                    return;
                }
                this.display.value = String(conta);
            } catch (e) {
                alert('Conta inválida!');
                return;
            }
        },

        clear() {
            this.display.value = '';
        },

        remove() {
            this.display.value = this.display.value.slice(0, -1);
        },

        btnDisplay(valor) {
            this.display.value += valor;
            this.display.focus();
        }
    }
}
const calculadora = criaCalculadora();
calculadora.iniciar();