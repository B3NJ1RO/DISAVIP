// Promedio usando el operador rest (...)
export const promedio = (...notas) => 
    notas.reduce((suma, nota) => suma + nota, 0) / notas.length;

// Estado usando parámetro por defecto
export const estado = (nota, minima = 13) => 
    nota >= minima ? "Aprobado" : "Desaprobado";

// Reporte usando desestructuración, spread operator y template literals
export const reporte = ({ nombre, notas }) => {
    const prom = promedio(...notas);
    return `${nombre}: ${prom.toFixed(1)} - ${estado(prom)}`;
};