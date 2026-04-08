# Proyecto-Stellaris-Mision-Stargate
La agencia espacial "Stellaris" necesita una aplicación de consola para planificar y ejecutar misiones de exploración. El sistema debe permitir configurar naves, gestionar el ciclo de vida de una misión y procesar las comunicaciones entre la base y la nave.

 ¿Qué incluye?

Se aplican varios patrones de diseño:

* Factory → para crear diferentes tipos de naves
* Adapter → para integrar un sistema externo
* State → para manejar el estado de la misión
* Observer → para la comunicación entre la nave y la base

Además, se incluye un sistema de registro de eventos para el reporte final.


 Pilares de la Programación Orientada a Objetos

En el proyecto se aplican los 4 pilares fundamentales:

* **Encapsulamiento**

  * Se protege el estado interno de las clases (ej: atributos como `nombre` en `Nave`).

* **Abstracción**

  * Se utilizan clases e interfaces abstractas como `Nave` y `EstadoMision` para definir comportamientos generales.

* **Herencia**

  * Clases como `NaveExploracion` y `NaveCombate` heredan de `Nave`.

* **Polimorfismo**

  * Se usan métodos que cambian su comportamiento según el objeto, como `mostrarTipo()` o los estados de la misión.


 ¿Cómo funciona?

El programa sigue este flujo:

1. Creas la nave (elige tipo y nombre)
2. Se prepara el sistema
3. Inicia la simulación con un menú interactivo
4. Puedes avanzar la misión o enviar mensajes
5. Al salir, se muestra un reporte de todo lo que pasó


  Estructura

El proyecto está organizado por paquetes:

* factory
* adapter
* state
* observer
* utils
* main

Proyecto realizado para la materia de Programación Orientada a Objetos.

