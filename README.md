# Patrones de Diseño

## Integrantes

- Brayan Yesid Baez Mendoza
- Melissa Alejandra Pérez Patiño
- Nicolás David Rincón Cañón

## Descripción

Se nos muestran tres casos donde vemos problemáticas presentadas al realizar diferentes desarrollos; el objetivo inicial es identificar el tipo de patrón más apropiado para la solución de los problemas tras analizar uno por uno, posteriormente es necesario crear un diagrama de clases de cada solución que se dará a los problemas previamente presentados y analizados, con el fin de estructurar y diseñar con anticipación cada uno de los códigos que se realizarán, y así poder finalizar la solución de las problemáticas vistas creando los respectivos códigos, implementando los patrones ya identificados.

## Objetivos

- Identificar los patrones de diseño más apropiados en base a las necesidades que se tengan
- Crear diagramas de clases que representen la arquitectura y diseño del código
- Implementar los patrones de diseño de forma correcta en el código

## Patrones de Diseño - Identificación

## Problema 1
### Patrón de Comportamiento: Template Method

Elección del Patrón de Diseño "Template Method" para la Tienda en Línea:

La elección del patrón "Template Method" para la tienda en línea se basó en su capacidad para gestionar de manera eficiente el proceso de procesamiento de pedidos, adaptándolo a las particularidades de cada tipo de producto.

Implementación del Patrón "Template Method":

Se creó una clase abstracta "ProcesadorPedido" con un método abstracto "procesarPedido," que encapsuló los pasos generales del proceso. Mediante subclases para diferentes tipos de productos, se personalizaron los pasos específicos, como validar fechas de vencimiento para alimentos o tallas de ropa.

En resumen, el patrón "Template Method" permitió un proceso de pedido uniforme y compartido, adaptable a diversos productos, y resultó en una arquitectura modular y fácil de mantener para la tienda en línea.


![Template method (1)_page-0001](https://github.com/WhtNr/Patrones_de_Diseno/assets/93276000/0343265b-00a0-4b41-bd7a-62d7695366b6)


## Problema 2
### Patrón Estructural: Adapter
En el ejercicio dos, el nuevo sistema de pago tenía una interfaz incompatible con la plataforma actual, lo que dificultaba su integración directa. Para resolver este problema, implementaste el patrón de diseño "Adapter".

El objetivo del ejercicio era permitir que el nuevo sistema de pago digital pudiera utilizarse como una opción de pago en la plataforma existente, a pesar de sus diferencias de interfaz. Lo primero que se realizó para solucionar este problema y utilizar el patrón de diseño “adapter” fue crear una interfaz “plataformaExistente” que define el contrato para los métodos relacionados con el pago. se crean tres clases concretas `MedioPagoCredito` y `MedioPagoPayPal` que implementan la interfaz “PlataformaExistente” y proporcionan formas de pago existentes en la plataforma. Por consiguiente, se crea la nueva interfaz “NuevoSistemaPago” que define el contrato para el nuevo sistema de pago, luego, se implementó la clase “MedioPagoNuevo” que implementa la interfaz “NuevoSistemaPago” y representa el nuevo sistema de pago digital, se diseña la clase `AdaptadorNuevoSistema` que actúa como un adaptador entre la interfaz `PlataformaExistente` y la interfaz `NuevoSistemaPago`. Esta clase toma una instancia de `NuevoSistemaPago` y, a través de su implementación de `PlatsformaExistente`, adapta la interfaz incompatible del nuevo sistema de pago al contrato de la plataforma existente.

Por último, al utilizar el patrón de diseño "Adapter" con la clase `AdaptadorNuevoSistema`, se logra integrar el nuevo sistema de pago digital en la plataforma existente sin tener que cambiar la estructura de la plataforma ni la implementación del nuevo sistema de pago. El adaptador permitió que ambas interfaces se comunicaran de manera efectiva, facilitando la expansión de opciones de pago en la plataforma de comercio electrónico.

Este ejercicio ilustra cómo el patrón de diseño "Adapter" se utiliza para resolver problemas de integración entre sistemas con interfaces incompatibles, permitiendo la colaboración entre componentes que de otra manera no podrían trabajar juntos de manera directa.

![Diagrama en blanco_page-0001](https://github.com/WhtNr/Patrones_de_Diseno/assets/93276000/d532621e-61be-48d2-a00d-ca79c6ecc95d)


## Problema 3
### Patrón Creacional: Builder

En el tercer caso, se requiere un patrón creacional debido a la construcción de una orden personalizada de pizza. Optamos por el patrón Builder, que permite crear objetos con múltiples componentes de manera incremental. En este contexto, las características de la pizza se construyen por separado y luego se combinan en el objeto final "Pizza". Además, se crea un objeto "Factura" que proporciona al usuario información detallada sobre el pedido, incluyendo los precios individuales de cada componente. La necesidad de personalización total en este caso hace que la separación y combinación de componentes sea esencial.

![Diagrama en blanco](https://github.com/WhtNr/Patrones_de_Diseno/assets/93276000/85e35331-9eca-41df-a133-b222ec46170e)


## Aprendizajes



