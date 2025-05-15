
window.onload = iniciar;

function iniciar() {
  let evento = cargarEvento();

  let rango= document.getElementById("rango");
  let valor = document.getElementById("valor");

  valor.value= rango.value;
  valor.addEventListener("input",valueHandler);
  rango.addEventListener("input",rangeHandler);
}

async function cargarEvento(){
      const request = await fetch('evento', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      const evento = await request.json();

      titulo_tema=document.getElementById("titulo_tema");
      titulo_evento=document.getElementById("titulo_evento");
      descripcion_evento=document.getElementById("descripcion_evento");



      titulo_tema.innerHTML = evento.tema;
      titulo_evento.innerHTML =evento.nombre;
      descripcion_evento.innerHTML = evento.descripcion;

      seleccion_tema=document.getElementById("seleccion_tema");
      seleccion_tema.innerHTML=`<option>${evento.tema}</option>`;
}


function rangeHandler(){
    console.log("rango");
    valor.value=rango.value;
}

function valueHandler(){
    console.log("valor");
    rango.value=valor.value;
}




