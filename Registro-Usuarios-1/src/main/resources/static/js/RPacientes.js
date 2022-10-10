const tyc = document.getElementById("avisoPrivacidad");
const enviar = document.getElementById("enviar");

const cambiarCondiciones = () => tyc.checked ? enviar.disabled = false : enviar.disabled = true;