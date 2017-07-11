# UML-Editor - El editor de UML/INTERLIS 

## Configuración del sistema
Con el fin de compilar el editor UML, se debe instalar en su sistema un kit de desarrollo de software Java (JDK) versión 1,6 o una versión más reciente.
Una versión gratuita del kit de desarrollo de software de Java (JDK) está disponible en el sitio web http://Java.sun.com/J2SE/.
También se requiere la herramienta de compilación Ant. Descárguelo de http://Ant.apache.org e instálelo como se documenta allí.

## Instalación
Para instalar el editor UML, extraiga el archivo zip en un nuevo directorio.

## ¿Cómo compilar el proyecto?
Para compilar el editor UML, cambie al directorio recién creado e introduzca el siguiente comando en el prompt comandos:

~~~
ant compile jar run
~~~

Para crear una distribución binaria, utilice
~~~
ant bindist
~~~
