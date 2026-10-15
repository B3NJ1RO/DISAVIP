import estudiantes, { curso } from "./datos.js";
import { reporte } from "./calculos.js";

// Imprimir título en HTML y consola
console.log(`Curso: ${curso}`);
document.querySelector("#curso").textContent = `Curso: ${curso}`;

// Clonar el primer estudiante con spread operator y actualizar nombre
const nuevo = { ...estudiantes[0], nombre: "Ana María" };

// Unir listas usando spread operator de arreglo
const todos = [...estudiantes, nuevo];

// Obtener referencia de la lista HTML
const listaReportes = document.querySelector("#reportes");

// Generar reportes
todos.forEach(estudiante => {
    const rep = reporte(estudiante);
    console.log(rep);
    listaReportes.innerHTML += `<li>${rep}</li>`;
});