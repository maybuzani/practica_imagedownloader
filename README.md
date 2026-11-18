# practica_imagedownloader

### ¿Cuál es la diferencia entre representar la dirección de un recurso mediante URL y establecer una conexión?

| Concepto | `URL` | `openConnection()` |
| :--- | :--- | :--- |
| **Naturaleza** | **Local y sintáctica:** Ocurre completamente en la memoria del programa. | **De red real y activa:** Involucra al sistema operativo y la red. |
| **Funcionamiento** | Analiza la cadena de texto de la dirección (protocolo, servidor, puerto, ruta) para estructurarla lógicamente como un objeto en Java. | Abre un canal de comunicación físico/lógico (un **socket TCP**) hacia el servidor remoto. |
| **Interacción con el servidor** | **No realiza peticiones externas;** ni siquiera verifica si el sitio web o servidor existe realmente. | **Se comunica con el servidor web,** envía peticiones de red y queda a la espera de la respuesta. |
#
### ¿En qué se diferencian URLConnection y HttpURLConnection? 
URLConnection es una clase abstracta genérica que permite manejar conexiones a diferentes tipos de protocolos de red yHttpURLConnection es una subclase específica para HTTP y HTTPS que añade métodos especializados y muy útiles para trabajar con este protocolo web.
#
### ¿Por qué se establecen tiempos máximos? 
Para evitar que la aplicación se quede congelada (bloqueada) indefinidamente si el servidor web está caído, responde demasiado lento o hay problemas de red.
#
### ¿Qué significa HTTP 404? 
Es un código de estado de error del lado del servidor que indica que el recurso o la página solicitada no fue encontrada en la dirección especificada.
#
### ¿Qué sucede si la conexión funciona, pero el servidor devuelve un error?
El canal de red se abre con éxito y el servidor responde.
