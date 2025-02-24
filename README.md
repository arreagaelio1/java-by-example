# Uso de Podman con OpenJDK y Ejecución de Programas Java

Este repositorio contiene ejemplos para:

1. Ejecutar un contenedor con OpenJDK 23 usando Podman.
2. Compilar y ejecutar un programa Java.

## 1. Ejecutar un Contenedor con OpenJDK

Se utiliza el siguiente comando para levantar un contenedor interactivo con OpenJDK 23:

```bash
podman run --rm -it --name java -v $(pwd)/src:/app/src -w /app docker.io/library/openjdk:23 bash
```

### Desglose del Comando

- **`podman run`**: Inicia un contenedor.
  - **`--rm`**: Elimina el contenedor automáticamente al salir.
  - **`-it`**: Ejecuta el contenedor en modo interactivo con terminal.
  - **`--name java`**: Asigna el nombre `java` al contenedor.
  - **`-v $(pwd)/src:/app/src`**: Monta el directorio `src` del host en `/app/src` del contenedor, permitiendo compartir archivos.
  - **`-w /app`**: Establece `/app` como directorio de trabajo dentro del contenedor.
  - **`docker.io/library/openjdk:23`**: Utiliza la imagen `openjdk:23` de Docker Hub.
  - **`bash`**: Inicia una sesión de Bash dentro del contenedor.

Una vez dentro del contenedor, podrás compilar y ejecutar programas Java sin tener Java instalado en el sistema host.

## 2. Compilar y Ejecutar un Programa Java

Dentro del contenedor, puedes compilar y ejecutar tus programas Java. Por ejemplo, para un archivo `CreatingVariables.java` ubicado en el directorio `src/basics/variables` se utilizan los siguientes comandos:

### Compilación

```bash
javac -d bin src/basics/variables/CreatingVariables.java
```

- **`javac`**: Compilador de Java.
- **`-d bin`**: Indica que los archivos compilados (bytecode) se deben colocar en el directorio `bin`.
- **`src/basics/variables/CreatingVariables.java`**: Ruta al archivo fuente.

Este comando compila `CreatingVariables.java` y coloca los archivos `.class` en el directorio `bin`.

### Ejecución

```bash
java -cp bin basics/variables/CreatingVariables
```

- **`java`**: Ejecuta la Máquina Virtual de Java (JVM).
- **`-cp bin`**: Establece el classpath en el directorio `bin` para que la JVM encuentre las clases compiladas.
- **`basics/variables/CreatingVariables`**: Ruta de la clase que contiene el método `main` a ejecutar.

Este comando inicia la ejecución del programa Java compilado.

## Resumen

- **Contenedor con Podman:** Permite ejecutar una sesión interactiva con OpenJDK 23.
- **Compilación:** Se realiza con `javac`, enviando los archivos compilados al directorio `bin`.
- **Ejecución:** Se inicia el programa con `java`, especificando el classpath adecuado.

Con este flujo de trabajo, puedes desarrollar y probar aplicaciones Java en un entorno aislado y sin modificar tu sistema host.

¡Espero que te resulte útil!
