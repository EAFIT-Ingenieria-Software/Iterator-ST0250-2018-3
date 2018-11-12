## 1. Integrantes del Equipo

> + Manuela Valencia Toro
> + Laura Sánchez Córdoba
> + Orlando Montoya Benítez

## 2. Nombre del Patrón
>Iterator Pattern

## 3. Problemática del patrón
> Iterator es un patrón de diseño de comportamiento. Define una interfaz
que declara los métodos necesarios para acceder secuencialmente a un
grupo de objetos de una colección. Algunos de los métodos que podemos
definir en la interfaz Iterador son:}

    Primero(), Siguiente(), HayMas() y ElementoActual().
>Este patrón de diseño permite recorrer una estructura de datos sin que sea
necesario conocer la estructura interna de la misma.

## 4. Modelo de Clases o Secuencia del Ejemplo
>![Iterator Pattern UML Diagram](https://www.tutorialspoint.com/design_pattern/images/iterator_pattern_uml_diagram.jpg)
## 5. Lenguaje de programación del patrón
>Java

## 6. Descripción de ejecución del código
>Se crea una interfaz de Iterador que narra el método de navegación y una interfaz de Contenedor que vuelve al Iterador. Las clases concretas que implementen la interfaz del contenedor serán responsables de implementar la interfaz del iterador y usarla.

>IteratorPattern, nuestra clase de demostración utilizará NamesRepository, una implementación de clase concreta para imprimir los Nombres almacenados como una colección en NamesRepository.

## 7. Sitios web  consultados
>[Patrón Iterator](http://patronesdediseno.blogspot.com/2009/05/patroniterator.html)

>[Iterator](http://migranitodejava.blogspot.com/2011/06/iterator.html)

>[Iterator Pattern](https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm)