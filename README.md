# Sincronizacion-CountDownLatch

Programación concurrente usando hilos y la clase CountDownLatch

## Ejecución

Se simula la creación de un desayuno, cada paso se realiza en una clase que hereda de Thread

- Un hilo para hacer tostadas
- Un hilo para hacer zumos
- Un hlo para hacer cafés
- Un hilo para untar las tostadas

## Paso 1:

- Se inicializan los hilos y se ejecuta
- Con la clase CountDownLatch se controlan cuándo acaba la ejecución de todos los hilos para avisar que se ha terminado el programa.

## Paso 2: 

El hilo de untar tostadas es lanzado desde hacer tostadas, de esta forma seguimos controlando en el programa que hasta que no termine untar tostadas no termine el programa.

## JDK

Se usa la versión 11

## Fuente

https://www.youtube.com/watch?v=-VZits6eWf8
