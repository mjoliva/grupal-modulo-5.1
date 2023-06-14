/**********************************************
**                ANIMA TITLE                **
**********************************************/
const titulo = "    BE SAFE Asesores en riesgo laboral";
let mutable = titulo;  
document.title = mutable;

const mover_titulo2 = () => !mutable.match(/[a-z ]/i)
  ? document.title = mutable = titulo
  : document.title = mutable = mutable.replace(/[a-z ]/i, '.');

const id = setInterval(mover_titulo2, 500);

/**********************************************
**                ACCIONES                   **
**********************************************/


// Para una entrega posterior: //// event listener que recibe el form submit
const submitCreateCap = document.querySelector("#formCreateCapacitacion");
submitCreateCap.addEventListener("submit", capSubmitHandler);
////
function capSubmitHandler(e) {
	e.preventDefault();//	console.log("acabo de recibir los datos del formulario");
	const arr = e.target;//	// recorre los valores del formulario
	for(let i = 0; i < arr.length; i++) console.log(arr[i].value);//
	
	
	// si los datos son malos avisar y pedir nuevamente
	// si son buenos hacer fetch por POST
}
