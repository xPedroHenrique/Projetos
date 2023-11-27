const mode = document.getElementById('mode-icon');

mode.addEventListener('click', () => {
    const fomr = document.getElementById('login-form');
    if (mode.classList.contains('fa-moon')) {
        mode.classList.remove('fa-moon');
        mode.classList.add('fa-sun');

        fomr.classList.add('dark');
        return;
    }

    mode.classList.add('fa-moon');
    mode.classList.remove('fa-sun');
    fomr.classList.remove('dark');
});

