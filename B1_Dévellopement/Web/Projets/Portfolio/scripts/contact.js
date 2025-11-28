document.addEventListener('DOMContentLoaded', () => {

    const form = document.querySelector('.contact_form');
    if (!form) return;

    form.addEventListener('submit', (e) => {
        const existing = document.querySelector('.contact-message');
        if (existing) existing.remove();

        const msg = document.createElement('div');
        msg.className = 'contact-message';
        msg.innerText = 'Envoi en cours...';
        msg.style.color = '#555';
        form.parentElement.appendChild(msg);
    });

});
