# Tarea 3 · La factura bajo el microscopio
Pareja: David C y Faisal · GitHub: IZialexI, faisxl20

## Reto 1 · Compilar desde la terminal
- Comando usado y resultado (captura: capturas/reto1.png) javac Factura.java, la captura pues está en capturas
- ¿Qué es Factura.java? ¿Y Factura.class? ¿Quién ejecuta el .class? Factura.java es el código fuente, el que editamos nosotros, y Factura.class es el bytecode, el archivo que ejecuta la JVM (Java Virtual Machine)
- ¿Por qué no se ha generado Factura.class la primera vez? no se ha generado, porque hay errores en el código, entonces no compila

## Reto 2 · Errores de compilación
| Nº | Línea | Mensaje de javac     | Tipo (léxico / sintaxis / semántica) | Corrección  |
|----|-------|----------------------|--------------------------------------|-------------|
| 1  |  15   |illegal character: '#'|Léxico: Caracter inválido en el nombre|Eliminar '#' |
| 2  |  17   |    ';' expected      |Sintáctico: Falta ';', es obligatorio |Añadir ';'   |
| 3  |       |  incompatible types  |   Semántico: Comprobación de tipos   |int -> double|
Captura del programa funcionando: capturas/reto2.png
(En la captura incluyo el error en el cálculo)
## Reto 3 · Depuración del error lógico
| Variable  | Valor esperado | Valor real |
|-----------|----------------|------------|
| descuento |      18.00     |    6.00    |
| total     |     123.42     |   137.94   |
- Línea del error y explicación: En la línea 27, el segundo condicional sobreescribía el valor de la variable `descuento` en lugar de sumarlo al descuento ya calculado en el primer condicional.
- Corrección:Para corregirlo, se ha modificado esa línea en `Factura.java` para que el nuevo descuento del 5% se sume al descuento que ya teníamos acumulado. La línea corregida queda así:
`descuento = descuento + (base * 0.05);`
- Mi propia prueba (producto, precio, cantidad, socio → total):
Producto: Raqueta
Precio: 60
Cantidad: 2
Socio: S
Total: 123.42
Captura del depurador: capturas/reto3.png

## Reto 4 · Reutilización
- Métodos creados y para qué sirve cada uno:
- ¿Qué ventaja tiene frente al código anterior?

## Reto 5 · ¿Qué lenguaje elegirías?
- Caso A (web de la tienda):
- Caso B (propuesta en ensamblador):
