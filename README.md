# practica_imagedownloader

### ¿Cuál es la diferencia entre representar la dirección de un recurso mediante URL y establecer una conexión?

| Concepto | `URL` | `openConnection()` |
| :--- | :--- | :--- |
| **Naturaleza** | **Local y sintáctica:** Ocurre completamente en la memoria del programa. | **De red real y activa:** Involucra al sistema operativo y la red. |
| **Funcionamiento** | Analiza la cadena de texto de la dirección (protocolo, servidor, puerto, ruta) para estructurarla lógicamente como un objeto en Java. | Abre un canal de comunicación físico/lógico (un **socket TCP**) hacia el servidor remoto. |
| **Interacción con el servidor** | **No realiza peticiones externas;** ni siquiera verifica si el sitio web o servidor existe realmente. | **Se comunica con el servidor web,** envía peticiones de red y queda a la espera de la respuesta. |
