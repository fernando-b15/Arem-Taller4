# Arem-Taller4

Este taller fue realizado para reforzar los conceptos de reflexion de clases y servidores web realizando un prototipo de framework llamado microspring que admite cargar un POJO y desplegar un servidor que sea capas de acceder a los recursos estaticos en un path y a los recursos dinamicos que estan definidos en el POJO   


# Pre-Requisitos

Para el uso de la aplicacion se requiere que el computador tenga instalados los siguientes prerequisitos:

   * Java 8
   * Maven
   * Git
   
# Instalacion

Para comenzar la instalacion porfavor copie el siguiente comando en su linea de comandos :

~~~
git clone https://github.com/fernando-b15/Arem-Taller4
~~~

![image4](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/clone.PNG)

Posteriormente desde linea comandos ingrese al directorio de la aplicacion con el siguinete comando :

~~~
cd Arem-Taller4
~~~

Ahora para realizar la compilacio y empaquetacion de la aplicacion ,ingrese el siguinete comando:

~~~
mvn package
~~~

![image1](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/package.PNG)

# Ejecucion

Para la ejecucion del programa desde linea de comandos , ingrese el siguinete codigo

~~~
java -cp target/classes co.edu.escuelaing.sparkd.microspring.MicroSpringBoot co.edu.escuelaing.sparkd.microspring.Controllers
~~~

![image3](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/run.PNG)

Ahora podemos ver como podemos acceder al recurso estatico index.html de la siguinete forma

![image5](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/estatico.PNG)

Tambien podemos acceder a los recursos dinamicos como:

   * hello
   ![image6](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/hello.PNG)

   * pi
   ![image7](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/pi.PNG)

   * webapp
   ![image8](https://github.com/fernando-b15/Arem-Taller4/blob/master/img/webapp.PNG)


# Licencia

La aplicacion cuenta con la siguiente [MIT LICENCE](https://github.com/fernando-b15/Arem-Taller1/blob/master/LICENSE) 

# Autor

   * [Fernanado Barrera Barrera](https://github.com/fernando-b15) :guitar:
