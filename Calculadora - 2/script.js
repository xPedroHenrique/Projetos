function Calculadora() {
    this.display = document.querySelector('.display');

    this.iniciar = () => {
        this.clickBtn();
        this.pressEnter();
    }

    this.clickBtn = () => {
        document.addEventListener('click', e => {
            const el = e.target;
            if (el.classList.contains('btn-num')) this.addNum(el);
            if (el.classList.contains('btn-clear')) this.clear();
            if (el.classList.contains('btn-del')) this.del();
            if (el.classList.contains('btn-eq')) this.realizaConta();
        });
    }

    this.pressEnter = () => {
        document.addEventListener('keyup', e => {
            if (e.keyCode === 13) {
                this.realizaConta();
            }
        });
    }

    this.realizaConta = () => {
        try {
            const conta = eval(this.display.value);
            if (!conta) {
                alert('Conta inválida!');
                return;
            }
            this.display.value = conta;
        } catch (e) {
            alert('Conta inválida!');
            return;
        }
    }

    this.clear = () => this.display.value = '';
    this.del = () => this.display.value = this.display.value.slice(0, -1);

    this.addNum = el => {
        this.display.value += el.innerText;
        this.display.focus();
    }
}

const calculadora = new Calculadora();
calculadora.iniciar();