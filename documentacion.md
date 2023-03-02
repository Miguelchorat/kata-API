# kata-API

Este proyecto utiliza Spring Framework para crear un servidor RESTful que permite el manejo de cervezas, cerveceras, categorías y estilos.


## Rutas Disponibles

| Endpoint         | Resultado                               | Método   |
|----------------- |-----------------------------------------|:--------:|
|`/beers`          | Muestra todas las cervezas              | GET      |
|`/beer`           | Añadir una cerveza                      | POST     |
|`/beer/{id}`      | Mostrar la cerveza con el id `{id}`     | GET      |
|`/beer/{id}`      | Eliminar una cerveza                    | DELETE   |
|`/beer/{id}`      | Modificar una cerveza                   | PUT      |
|`/beer/{id}`      | Modificar parcialmente una cerveza      | PATCH    |
|`/breweries`      | Listar todas las cerveceras             | GET      |
|`/brewerie/{id}`  | Mostrar la cervecera `{id}`             | GET      |
|`/categories`     | Listar todas las categorías             | GET      |
|`/categorie/{id}` | Mostrar la categoría `{id}`             | GET      |
|`/styles`         | Listar todos los estilos -style-        | GET      |
|`/style/{id}`     | Mostrar el estilo -style- `{id}`        | GET      |

## Controlador de Errores
El controlador de errores se encarga de manejar cualquier error que se presente durante la ejecución del servidor, incluyendo errores HTTP. En caso de que se presente un error, el controlador de errores mostrará un mensaje descriptivo del error y devolverá un código de estado HTTP apropiado.

## Software utilizado

Se ha realizado la escritura del código y su correspondiente testeo con el IDE de Intellij IDEA, para la creación del servidor y establecer la base de datos se ha usado el entorno MYSQL Workbench, utilizando mysql. Y para utilizar directamente la API mediante llamadas se ha utilizado la aplicación Insomnia.

## Cómo Ejecutar el Proyecto
Para ejecutar este proyecto, se debe de realizar pull de este repositorio, una vez se haya hecho, se deberá de crear la base de datos en Workbench (entre otras posibilidades), utilizando los scripts que se encuentran en la carpeta initSQL, y si se necesita modificar la configuración inicial que se encuentra en "application.properties" ajustando los datos de entrada correspondiente a la base de datos creada, una vez la base de datos se encuentre terminada, se podrá ejecutar "KataModuleApplication", se aloja en el puerto 8080. Una vez alojado se podrá realizar peticiones desde Insomnia utilizando: "localhost:8080/" seguido del dato de interés.

## Miembros del grupo de trabajo

  - Miguel Angel Chorat ([Miguelchorat](https://github.com/Miguelchorat))
  - Daniel Mera Sachse ([danielmera2912](https://github.com/danielmera2912))
