# 🎓 Sprint I – Programación en Java

Este repositorio contiene las actividades del Sprint I de Java, organizadas por temas y niveles de dificultad.  
Cada apartado incluye ejercicios para practicar:

- Programación Orientada a Objetos (POO)
- Herencia y polimorfismo
- Interfaces
- Métodos estáticos y no estáticos
- Manejo de excepciones
- Entrada segura por teclado

---

## 📁 Estructura del Proyecto

Los ejercicios están organizados dentro del paquete principal:



```
sprint01
│
├── InheritanceAndPolymorphism01
│   ├── level01A → Clases abstractas y jerarquías (Instrumentos)
│   ├── level01B → Métodos estáticos vs no estáticos (Car)
│   └── level02A → Herencia entre clases (Phone / Smartphone)
│
└── Exceptions01
    ├── level01A → Excepción personalizada (EmptySaleException)
    └── level02A → Lectura segura desde teclado (Entrance)
```



---

## 🟣 Clases principales  
## 🟣 Clases auxiliares  
## 🟣 Excepciones personalizadas  
## 🟣 Archivo Main para ejecutar la práctica

---

# 📘 Descripción de los Ejercicios

---

## 1️⃣ Inheritance & Polymorphism (Herencia y Polimorfismo)

### 🔹 Level 01A – Musical Instruments  
**Objetivo:** practicar clases abstractas, herencia y jerarquías.

Incluye:
- Clase abstracta `Instrument`
- Subclases: `WindInstrument`, `PercussionInstrument`, `StringInstrument`
- Método abstracto `play()`
- Demostración de bloques estáticos

---

### 🔹 Level 01B – Car Class (Static / Non-static methods)

**Objetivo:** comprender la diferencia entre métodos estáticos y de instancia.

Incluye:
- Campos estáticos vs instanciados
- Métodos estáticos de utilidad
- Métodos que operan sobre el estado del objeto

---

### 🔹 Level 02A – Phone / Smartphone

**Objetivo:** profundizar en herencia e interfaces.

Incluye:
- Clase base: `Phone`
- Subclase: `Smartphone`
- Interfaces adicionales según enunciado
- Uso de @Override

---

# 2️⃣ Exceptions – Manejo y Creación de Excepciones

### 🔹 Level 01A – EmptySaleException

**Objetivo:** crear una excepción personalizada.

Incluye:
- Clase `Product`
- Clase `Sale` con lista de productos
- Excepción `EmptySaleException`
- Manejo de `IndexOutOfBoundsException`

---

### 🔹 Level 02A – Console Input Reader (Entrada segura por teclado)

**Objetivo:** crear una clase utilitaria para lectura validada desde teclado.

Incluye:
- Clase estática `Entrance`
- Un único objeto `Scanner`
- Métodos validados:

Con InputMismatchException:
- `readByte(String message)`
- `readInt(String message)`
- `readFloat(String message)`
- `readDouble(String message)`

Con Excepción personalizada `EntranceException`:
- `readChar(String message)`
- `readString(String message)`
- `readYesNo(String message)`

Características:
- Bucle de reintentos hasta entrada válida
- Mensajes personalizados
- Código limpio y reutilizable

## 🟩 3. Java Collections (Colecciones)

En esta sección se practican las colecciones más usadas de la librería `java.util`, como:
- `ArrayList`
- `LinkedHashSet`
- `HashMap`
- `ListIterator`

Cada ejercicio desarrolla un aspecto clave de las colecciones: duplicados, orden, iteración segura, uso de mapas, y lectura/escritura de archivos.

---

### 🔹 Level 01A — Ejercicio 1: Duplicados (ArrayList & LinkedHashSet)

**Objetivos:**
- Crear una lista (`ArrayList`) con los meses del año dejando fuera “August”.
- Insertar “August” en su posición correcta.
- Comprobar el comportamiento de los duplicados.
- Convertir la lista en un `LinkedHashSet` para eliminar duplicados.
- Recorrer la colección con:
  - `for-each`
  - `Iterator`

**Clases creadas:**
- `Month.java`
- `MonthsMain.java`

**Estado del ejercicio:** ✔️ *Completado*

---

### 🔹 Level 01B — Ejercicio 2: Iteradores y Modificación Segura

**Objetivos:**
- Practicar el uso de `ListIterator`.
- Modificar elementos mientras se recorren sin generar errores.
- Evitar `ConcurrentModificationException`.

**Estado del ejercicio:** ⬜ *Pendiente*

---

### 🔹 Level 02A — Ejercicio 3: HashMap y Contadores

**Objetivos:**
- Usar `HashMap<String, Integer>` para contar elementos.
- Recorrer claves y valores.
- Ordenar e imprimir resultados.

**Estado del ejercicio:** ⬜ *Pendiente*

---

### 🔹 Level 02B — Ejercicio 4: Lectura y Escritura de Archivos

**Objetivos:**
- Leer archivos con `BufferedReader`.
- Procesar datos y almacenarlos en una colección.
- Crear un archivo de salida con los resultados.

**Estado del ejercicio:** ⬜ *Pendiente*


---

## 🛠️ Tecnologías Utilizadas

- Java JDK 21
- IntelliJ IDEA Community Edition
- Git & GitHub
- Consola / Terminal

---

## ▶️ Cómo Ejecutar los Ejercicios

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/anaruth-hub/Sprint-I.git


Abre el proyecto en IntelliJ IDEA
Navega al ejercicio deseado dentro de:
src/sprint01/...
Ejecuta el archivo Main...


## 🤝 Contribuciones

Este repositorio forma parte del material de aprendizaje del Sprint I.
Se aceptan sugerencias, mejoras o correcciones.
