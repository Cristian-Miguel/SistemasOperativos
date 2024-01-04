# Sitemas Operativos
Para poder ejecutarlo necesitaremos lo siguiente:

- la ruta del jdk bin en las variables del sistema
- el javacc descargado y su ruta bin en las variables del sistema
- el proyecto JavaApplication10 cambiar las rutas del archivo MiniIDE en donde se encuentra el Parse y el ensambler
- el archivo ruta.txt dentro del proyecto JavaApplication10 con la ruta específica del parse que tengas actualmente, sin quitar el #ensambler.jj
- el archivo ruta.txt en el proyecto comandos con la ruta específica del parse, sin quitar el #ensambler.jj
- cambiar la ruta específica de la variable Direccion en el archivo consola.java, con la ruta de la carpeta archivos, en el proyecto Comandos.
- cuando abramos el proyecto comandos puede preguntar resolver el problema de agregar el proyecto JavaApplication10 en las librerías, si no pregunta agreguen el proyecto a la librería

Una vez hecho estos cambios lo corremos, el proyecto funciona como un task manager, los comandos que funcionan son los siguientes:
- run archivo
- stop archivo
- kill archivo
- start archivo

El archivo serian todos los txt que se encuentran en la carpeta, archivos donde se ejecutan el javacc, además mostramos la memoria de la computadora actual.

![image](https://user-images.githubusercontent.com/65196566/167525521-edeff88e-1559-4baf-b238-f59d2d45476e.png)




