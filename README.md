# pscPolideportivo

El cliente podrá reservar las distintas instalaciones que tenemos disponibles, para ello deberá elegir un horario que no esté ocupado previamente.
Si fuese necesario, también podrá reservar los materiales para realizar dicha actividad. 

Configuración
------------- 

**Construcción y prueba**

Se puede construir el proyecto y lanzar las pruebas unitarias con el comando

    mvn test

**Base de datos**

La configuración por defecto para la base de datos y los usuarios puede ser actualizada en el fichero *resources/datanucleus.properties*.

Las clases de datos deben ser procesadas antes de generar las tablas con el comando 

    mvn datanucleus:enhance

Para la creación de las tablas se debe ejecutar el comando de maven

    mvn datanucleus:schema-create

**Datos de prueba**

Se pueden introducir datos de prueba en la aplicación utilizando el comando de maven

 *pendiente*

**Inicio del servidor**

El servidor REST de la aplicación se lanza utilizando el comando:

 *pendiente*

Si el servidor ha sido iniciado correctamente se pueden obtener los datos de prueba accediendo con el navegador a la URL http://localhost:8080/pscPolideportivo/.


**Inicio de la aplicación cliente**

La aplicación cliente puede iniciarse usando el comando:

 *pendiente*