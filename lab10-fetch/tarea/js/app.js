async function mostrarPosts() {
    const lista = document.querySelector("#posts");
    try {
        // 1. Petición a la API usando la URL de las publicaciones del usuario 1
        const res = await fetch("https://jsonplaceholder.typicode.com/posts?userId=1");
        
        // Verificar si la respuesta no fue satisfactoria (ej. error 404)
        if (!res.ok) throw new Error("Error en la solicitud");

        // 2. Convertir la respuesta HTTP a formato JSON
        const posts = await res.json();

        // 3. Transformar los datos a elementos HTML <li> y renderizar
        lista.innerHTML = posts
            .map(post => `<li>${post.title}</li>`)
            .join("");

    } catch (error) {
        // 4. Manejo de excepciones en caso de fallo
        lista.innerHTML = "<li>No se pudo cargar la información</li>";
    }
}

mostrarPosts();