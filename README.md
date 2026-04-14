**¿Qué hace la anotación @BeforeEach?**

Ejecuta un método antes de cada test, preparando el entorno de pruebas y haciendo que cada test comience de forma limpia

**¿Para qué sirve assertTrue?**

Sirve para comprobar que una condición es verdadera durante la ejecución de un test

**¿Qué diferencia hay entre findElement() y findElements()?**

findElement() devuelve un único elemento web, y si no lo encuentra lanza un error y el test falla. findElements() devuelve una lista de elementos, y si no encuentra ninguno, devuelve una lista vacía

**¿Por qué utilizamos una clase LoginPage en lugar de escribir todo en el test?**

Porque sigue el patrón Page Object Model, que consiste en separar la lógica de interacción con la página del código de los test
