📚 Tarea Programación 3 — Maven + Librería + Ofuscación

Este repositorio contiene el desarrollo de una práctica enfocada en el uso de Maven, creación de una librería local, implementación manual de una estructura de datos tipo pila, validación de expresiones algebraicas y aplicación de ofuscación reproducible.

---

🎯 Objetivo

El objetivo de esta práctica fue:

- Gestionar dependencias con Maven
- Crear una librería local reutilizable
- Consumir la librería desde otro proyecto
- Implementar una pila manual (sin usar "Stack" de Java)
- Validar expresiones algebraicas usando dicha pila
- Aplicar ofuscación reproducible desde "pom.xml"
- Realizar ingeniería inversa del JAR
- Ejecutar pruebas funcionales desde consola

---

📁 Estructura del repositorio

El repositorio contiene dos proyectos principales:

/umg.edu.gt.data-structure.stack   → Librería (implementación de la pila)
/stackHandler                      → Aplicación que consume la librería
/evidencias                        → Capturas solicitadas
README.md

---

⚙️ Requisitos

- JDK 11
- Maven instalado
- Terminal o CMD
- IDE (opcional)

---

🧱 Parte A — Dependencia Maven entre proyectos

Primero se creó la librería de la pila y se instaló en el repositorio local:

mvn clean install

Luego se agregó como dependencia en el proyecto "stackHandler" usando las mismas coordenadas ("groupId", "artifactId", "version").

Compilación del proyecto:

mvn clean package

---

🧠 Parte B — Implementación funcional

Se implementó manualmente una estructura de pila enlazada.

Funciones principales:

- push
- pop
- peek
- isEmpty
- getSize / length
- getNodeInit

El validador ("SymbolValidator") utiliza la pila para verificar el balance de símbolos.

Casos probados

Válido

(a+b) * [c-d] → true

Inválido

([)] → false

Las pruebas se ejecutan desde consola mediante la clase "App".

---

🔐 Parte C — Ofuscación reproducible

Se configuró ProGuard dentro del "pom.xml" mediante un perfil Maven.

Comando para generar el JAR ofuscado:

mvn clean verify -P obfuscate

Resultados generados:

- JAR normal
- JAR ofuscado

El comportamiento del programa se mantiene igual.

---

🔎 Parte D — Ingeniería inversa

Se decompiló el JAR ofuscado usando herramientas como:

- JD-GUI
- CFR

Observaciones

- Los nombres de clases y métodos cambian
- Se pierde claridad estructural
- La lógica sigue siendo comprensible, pero más difícil de leer

Esto demuestra que la ofuscación agrega una capa básica de protección.

---

🧪 Parte E — Pruebas desde consola

Ejemplo de ejecución:

java -jar stackHandler-1.0.0.jar "(a+b)"
java -jar stackHandler-1.0.0-obfuscated.jar "(a+b)"

El resultado es el mismo antes y después de la ofuscación.

---

✅ Conclusión

Esta práctica permitió comprender cómo:

- Maven gestiona dependencias entre proyectos
- Se construyen librerías reutilizables
- Las estructuras de datos pueden implementarse manualmente
- La ofuscación protege parcialmente el código
- El proceso de build puede automatizarse de forma profesional

El proyecto compila correctamente al clonarlo y puede ejecutarse desde consola.

---

👤 Autor
Dayly Orellana

