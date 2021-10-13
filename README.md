# AREP-ParcialSegundoTercio-CalculatorApi

Parcial 2 de AREP

## Autor

- Miguel Angel Fuquene Arias

Operaciones Asignadas:

- Arcotangente atan(x)
- Logaritmo Natural ln(x)

## Pasos para compilar y ejecutar

- Abra su ventana de comandos CMD y ejecute git clone https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte.git
- Ingrese al proyecto clonado y ejecute mvn compile
- Abra NetBeans  o su Ide preferida y ejecute el proyecto
- Abra el browser y vaya al la url: https://localhost:4567/ln?value=3.1416
- Si desea probar la otra operacion cambie ln por atan en el link del punto anterior

## Instrucciones para despliegue

1. Acceda a la máquina virtual por medio de la llave privada que hay en este repositorio y luego actualice la maquina con el siguiente comando

- sudo yum update -y

2. Instale docker con este comando

- sudo yum install docker

3. Inicie el servicio de Docker

- sudo service docker start

4. Configure su usuario en el grupo de docker para no tener que ingresar “sudo” cada vez que invoca un comando de este

- sudo usermod -a -G docker ec2-user

5. Desconectes de la máquina virtual e ingrese nuevamente para que la configuración de grupos de usuarios tenga efecto. Ejecute el siguiente comando para crear una instancia de la imagen creada en Dockerhub y para mapearlo a su puerto fisico 42000.

- docker run -d -p 42000:6000 --name dockerimageaws javier3005/arep-parcial

6. Abra el puerto 42000 del security group de la máxima virtual para acceder al servicio
7. Finalmente ingrese al url que le da su maquina virtual de AWS y añada a la url :42000/ln?value=3.1416 para probar la operacion logaritmo natural o :42000/atan?value=3.1416 para el arcotangente

## Links
- DockerHub https://hub.docker.com/repository/docker/miguelfuquene1024/arepsegundocorteparcial
- Video https://youtu.be/7AYeyBpYyR0


## Evidencia de funcionamiento

- Corriendo por consola

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/PorConsola.png)

- Corriendo por NetBeans

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/PorNetBeans.png)

- Corriendo localmente

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/Localmente.png)

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/Localmente2.png)

- Contenedor Docker

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/Docker.png)

- Subido a DockerHub

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/DockerHub.png)

- Instancia EC2 creada en AWS

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/InstanciaAws.png)

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/Instancia.png)

- Puertos en AWS

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/PuertosAws.png)

- Prueba final desplegada en AWS

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/AwsPrueba1.png)

![](https://github.com/MiguelFuquene1024/AREP-ParcialSegundoCorte/blob/master/img/AwsPrueba2.png)

## Contrucción 

- NetBeans-Editos decódigo y ambiente de desarrollo(IDE)
- Maven-gestor de dependencias 
- Docker-Software para crear, probar e implementar APIs por medio de contenedores
- Spark-Micro Framework para crear APIs







