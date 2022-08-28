# ArquitecturaLaboratorioI

1- Construir una aplicación con patrón MVC que incorpora capas para representar presentación, 
negocio y persistencia usando Java Spring Boot.

Singuiendo los pasos del tutorial se cumple con la necesidad del primer punto:

<img width="226" alt="image" src="https://user-images.githubusercontent.com/70864970/187084790-2037233a-cc07-478e-b1e9-232c4c258f4a.png">

2- Sobre la arquitectura construida en el punto anterior aplicar el patrón Business Delegate.

Para el segundo punto se requería sobre la arquitectura construida en el punto anterior aplicar el patrón Business Delegate.
Con el fin de dar solución al punto se implemento el patrón de diseño Proxy de la siguiente manera:

1- Se creo una interface llamada InterfeceEmployeeService en el paquete de service con todos los métodos de la clase employeeservice.
2- A la clase del employeeservice se le agrego un extends de la interfaz InterfeceEmployeeService.
3- Se creo un paquete con el nombre BusinessDelegate.
4- Se agrego un clase llamada EmployeeServiceProxy y se le agrego un extends de la clase EmployeeService.
5- Por ultimo en la clase EmployeeController se creo un objeto con base a la interfaz instanciado con la clase EmployeeServiceProxy desde donde se consumirán todos los métodos de la clase EmployeeService.

Con esto se da por implementado el patrón Business Delegate.

<img width="541" alt="image" src="https://user-images.githubusercontent.com/70864970/187084885-c2e5fcaa-a482-4c44-a022-d020c53ddc2c.png">
