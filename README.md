
📝 Sprint I – Programación en Java

Este repositorio contiene las actividades del Sprint I de Java, organizadas por temas y niveles de dificultad.
Cada apartado recoge diferentes ejercicios que trabajan fundamentos de Programación Orientada a Objetos (POO), herencia, polimorfismo, manejo de excepciones y entrada segura por teclado.

📂 Estructura del Proyecto

Los ejercicios están organizados dentro del paquete principal src/sprint01:

sprint01
├── InheritanceAndPolymorphism01
│      ├── level01A   → Clases abstractas y jerarquías (Instrumentos)
│      ├── level01B   → Métodos estáticos vs no estáticos (Car)
│      └── level02A   → Herencia entre clases (Phone / Smartphone)
│
└── Exceptions01
├── level01A   → Excepción personalizada (EmptySaleException)
└── level02A   → Lectura segura desde teclado (Entrance)


Cada nivel contiene varios ejercicios completos, con sus clases y un archivo Main para ejecutar la práctica.

🧩 Descripción de los Ejercicios
🔶 1. Inheritance & Polymorphism (Herencia y Polimorfismo)
🔹 Level 01A – Musical Instruments

Objetivo: practicar clases abstractas, herencia y jerarquías.
Incluye:

Clase abstracta Instrument

Subclases: WindInstrument, PercussionInstrument, StringInstrument

Método abstracto play()

Demostración de bloques estáticos de inicialización (carga de clases solo 1 vez)

🔹 Level 01B – Car Class (Static / Non-static methods)

Objetivo: comprender la diferencia entre métodos estáticos y de instancia.
Incluye:

Campos estáticos vs instanciados

Métodos estáticos para utilidades

Métodos de instancia que trabajan sobre el estado del objeto

🔹 Level 02A – Phone / Smartphone

Objetivo: profundizar en herencia y uso de interfaces.
Incluye:

Clase base Phone

Subclase Smartphone

Interfaces adicionales según el enunciado (p. ej. Camera, GPS, etc.)

Sobrescritura de métodos (@Override)

🔶 2. Exceptions (Gestión de excepciones)
🔹 Level 01A – EmptySaleException

Objetivo: crear una excepción personalizada y gestionar errores típicos.
Incluye:

Clase Product

Clase Sale con lista de productos y cálculo del total

Excepción personalizada EmptySaleException

Manejo de IndexOutOfBoundsException

🔹 Level 02A – Console Input Reader (Entrada segura por teclado)

Objetivo: crear una clase utilitaria para lectura validada desde teclado.
Incluye:

Clase estática Entrance

Un único Scanner compartido

Métodos para:

readByte

readInt

readFloat

readDouble
(gestionando InputMismatchException)

Métodos con excepción personalizada EntranceException:

readChar (solo acepta un carácter)

readString (no permite vacío)

readYesNo (respuesta válida y/n o s/n)

Bucle de reintentos hasta que la entrada sea válida

🛠️ Tecnologías Utilizadas

Java (JDK 21)

IntelliJ IDEA Community Edition

Git y GitHub para control de versiones

Entorno de ejecución mediante consola o IDE

▶️ Cómo Ejecutar los Ejercicios

Clonar el repositorio:

git clone https://github.com/anaruth-hub/Sprint-I.git


Abrir el proyecto en IntelliJ IDEA

Navegar al ejercicio deseado dentro de src/sprint01/...

Ejecutar el archivo Main correspondiente desde IntelliJ

🤝 Contribuciones

Este repositorio forma parte del material de aprendizaje del Sprint I.
Se aceptan sugerencias, mejoras o correcciones.