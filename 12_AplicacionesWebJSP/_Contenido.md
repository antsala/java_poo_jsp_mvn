# 12. Aplicaciones web en Java (JSP)

Asegurarse que se está en el directorio ***java_poo_jsp_mvn/12_AplicacionesWebJSP***.

Vamos a aprender cómo utilizar páginas web como interfaz de usuario en Java. Usaremos JSP (JavaServer Pages) que nos permitirá mezclar código en ***Java*** con código ***HTML***. El código en Java que utilizaremos será muy parecido al que hemos venido utilizando hasta ahora. Cambiará únicamente lo relativo a mostrar información por pantalla (ahora se volcará todo a HTML) y la manera en que se introducen los datos, que se realizará mediante formularios.

Para ejecutar páginas ***JSP*** se necesita tener un contenedor web (servidor de aplicación) como Apache Tomcat, así que si no lo tienes instalado en tu IDE, debes hacerlo. 

***Apache Maven*** es una herramienta de gestión y construcción de proyectos de software en Java. Proporciona una forma de definir, estructurar y construir proyectos de software de manera repetible y coherente, lo que facilita su gestión y mantenimiento.

Maven utiliza un archivo de configuración llamado ***pom.xml*** (Project Object Model) que describe las dependencias del proyecto, la estructura de directorios, los plugins y otras configuraciones. A partir de este archivo, Maven puede descargar automáticamente las dependencias de la aplicación desde repositorios remotos, compilar el código fuente, ejecutar pruebas, empaquetar el proyecto en un archivo JAR, WAR o EAR, y generar informes de calidad del código.

Maven también proporciona una amplia variedad de plugins para tareas comunes de desarrollo, como la integración con herramientas de pruebas unitarias, generación de documentación, creación de informes de análisis de código, entre otros. Al automatizar la gestión de dependencias y la construcción del proyecto, Maven ayuda a los desarrolladores a enfocarse en el desarrollo de la lógica de negocio de la aplicación en lugar de lidiar con detalles de configuración y construcción.

Vamos a crear un nuevo proyecto JSP. Para ello, en VSC, mostramos la paleta de comandos (Ctrl+Mayús+P) y buscamos: ***Maven: Update Maven Archetype Catalog***, con lo que nos aparecerá ***Maven*** en la parte inferior del panel de explorador (a la izquierda).

Ponemos el ratón en ***Maven*** y hacemos clic en el botón ***+*** (Create Maven Project). Selecionamos el arquetipo ***maven-archetype-webapp***

a la pregunta de versión, respondemos con la última (v1.4)

Pulsamos enter cuando nos pregunte que introduzcamos la identificación del proyecto. Aceptamos ***com.example***.

Cuando pregunte por el identificador de artefacto del proyecto, nos propondrá  ***demo***, lo cambiamos por ***holamundo*** (solo admite minúsculas) y pulsamos ***Intro***.

Se abrirá un cuadro de diálogo en el que debemos elegir la carpeta que almacenará nuestro proyecto. Te recomiendo crear una como ***Mis_proyectos_MVN*** o similar. Seleccionala.
(Nota: El repositorio tiene todos los ejercicios en la carpeta ***Maven_Projects***, por si necesitas consultar algo)

Maven procederá a crear la estructura de directorios del proyecto. Es muy importante que observes que en la terminal te está pidiendo que introduzcas el valor de la propiedad ***version***. Pulsa ***Intro*** en la terminal para aceptar el valor propuesto (1.0-SNAPSHOT)

Por último, en la terminal se pide una confirmación final. Pulsa ***Intro*** para aceptar. Se creará el proyecto.

Ahora vamos a asegurar que el servidor ***Tomcat*** está iniciado. Para ello, en el panel del explorador, selecciona ***Servers*** y asegúrate que ***apache-tomcat*** está iniciado. Si no lo estuvieras, con el menú contextual puedes iniciarlo.

Vamos a editar el contenido de nuestra página ***JSP***. Para ello, en el explorador, ve a la carpeta del proyecto Maven que se ha creado, despliega la carpeta ***src*** y allí verás el archivo ***index.jsp***. Seleccionalo para que VSC lo abra.

Observa el contenido. Es una simple página HTML. Ahora aprenderás a compilarla con Maven. 

Para ello, en el explorador, selecciona ***Maven*** y verás una carpeta con el proyecto (holamundo). Despliégala y localiza ***package***. Haz clic en el icono del triángulo que aparece a su derecha para compilar el proyecto. Se generará el archivo ***war***.

En la carpeta de tu proyecto Maven, justo debajo de ***index.jsp*** verás una carpeta llamada ***target***, ahí es donde se encuentra el archivo ***war***. Localiza ***holamundo.war***.

Haz clic con botón derecho en ***holamundo.war***, y elige la opción ***Run on Server***. En la paleta de comandos aparecerán todos los servidores disponibles. Por ahora solo debe haber uno ***apache-tomcat***. Selecciónalo.

A la pregunta  de editar parámetros opcionales, responde con ***no***. Se desplegará la aplicación y, en ***Servers*** podrás verla. Haz clic con botón derecho en el despliegue y selecciona ***Server Actions*** y luego selecciona ***Show in browser***. Elige ***localhost:8080/holamundo***. Se abrirá el navegador y podrás ver tu despliegue.

(Nota: para eliminar un despliegue, haz clic con botón derecho en el despliegue que desees eliminar y selecciona ***Remove Deployment***)


Una aplicación JSP consistirá en una o varias páginas web que contendrá HTML con código Java “insertado”. Este código en Java puede
colocarse en cualquier parte del archivo y se delimita mediante las etiquetas ***<%*** y ***%>***.

Cuando desplegamos la aplicación sucede lo siguiente:

1. Todo el código (tanto HTML como JAVA) se envía al servidor Apache Tomcat por ejemplo.
2. El servidor deja intacto el código HTML y compila y ejecuta el código en Java. Generalmente el código Java genera código HTML mediante las instrucciones ***out.print*** y ***out.println***.
3. Por último, todo el código (ya solo queda HTML) se envía al navegador que es el que muestra la página. Recuerda que el navegador no entiende Java (entiende Javascript que es otro lenguaje diferente) y es imprescindible que todo el código Java haya sido traducido previamente.

A continuación vamos a desarrollar un ejemplo que mezcla Java y HTML.








Abrimos con VSC el archivo ***EjemploExcepciones01.java*** y lo estudiamos.

```
code ./EjemploExcepciones.java
```

Compilamos el programa y observamos la salida en la terminal. Intenta calcular la media de un número y un texto, se producirá una excepción.



[Vamos al siguiente capítulo](../13)

