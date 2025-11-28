/* ==========================================================
   scripts.js — JavaScript GLOBAL pour tout le portfolio
   Fonctionnalités :
   • Smooth scroll sur les liens internes
   • Mise en surbrillance du lien de navigation actif
   • Lazy-loading des images (logos et icônes)
   • Utilitaires légers non intrusifs
   ========================================================== */

document.addEventListener('DOMContentLoaded', () => {

  /* ----------------------------------------------------------
     1) SMOOTH SCROLL POUR LES ANCRES (#...)
     ---------------------------------------------------------- */
  document.querySelectorAll('a[href^="#"]').forEach(a => {
    a.addEventListener('click', (e) => {
      const id = a.getAttribute('href').slice(1);
      const target = document.getElementById(id);
      if (target) {
        e.preventDefault();
        target.scrollIntoView({ behavior: 'smooth', block: 'start' });
      }
    });
  });


  /* ----------------------------------------------------------
     2) HIGHLIGHT AUTOMATIQUE DU LIEN DE NAVIGATION ACTIF
     ---------------------------------------------------------- */
  const navLinks = [...document.querySelectorAll('header .head_nav a')];
  const currentPage = location.pathname.split('/').pop() || 'index.html';

  // Applique la classe active si le lien correspond à la page
  navLinks.forEach(a => {
    if (a.getAttribute('href') === currentPage) {
      a.classList.add('active');
    }
  });


  /* ----------------------------------------------------------
     3) LAZY-LOADING / OPTIMISATION DES IMAGES
     ---------------------------------------------------------- */
  const imgs = document.querySelectorAll('img');
  imgs.forEach(img => {
    if (!img.hasAttribute('loading')) {
      img.setAttribute('loading', 'lazy');
    }
  });


  /* ----------------------------------------------------------
     4) UTILITAIRE GLOBAL
     ---------------------------------------------------------- */
  window.siteScrollTo = (id) => {
    const el = document.getElementById(id);
    if (el) el.scrollIntoView({ behavior: 'smooth' });
  };

});
