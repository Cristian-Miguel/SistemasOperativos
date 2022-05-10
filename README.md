# SitemasOperativos
Para poder ejecutarlo necesitaremos lo siguiente:

- el jdk bin en las variables del sistema
- el javacc descargado y si bin en las variables del sistama
- el proyecto JavaApplication10 cambiar las rutas del archivo MiniIDE en donde se encuentra el Parse y el ensambler
- el archivo ruta.txt dentro del proyecto JavaApplication10 con la ruta especifica del parse que tengas actualmente, sin quitar el #ensambler.jj
- el archivo ruta.txt en el proyecto comandos con la ruta especifica del parse, sin quitar el #ensambler.jj
- cambiar la ruta especifica de la variable Direccion en el archivo consola.java, con la ruta de la carpeta archivos, en el proyecto Comandos.

Una vez hecho esto cambios lo corremos, el proyecto funciona como un task manager, los comandos que funcionan son los siguientes
- run archivo
- stop archivo
- kill archivo
- start archivo
El archivo serian todos los txt que se encuentran en la carpeta archivos donde se ejecutan el javacc. mostramos tambien las memoria de la computadora actual.
