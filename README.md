# Desarrollo Fullstack Java Trainee

*Ejercicio grupal del módulo 5*

Este repositorio es la suma de entregas parciales del módulo 5 del bootcamp, organizadas como "ejercicio grupal *n*" para terminar con la entrega final, "Sprint". En nuestro caso, para la parte frontend de las actividades hemos resuelto crear un sitio web que simula una empresa que ofrece asesorías en riesgos laborales  *TODO nombre por elegir*. El sitio corresponde a casos de uso de los empleados de la empresa, los que solo tendrán acceso una vez verificado el inicio de sesión.

<hr>

**Integrantes grupo 1**:

- César Marín, repo en [Github](https://github.com/ceomarin)
- Gabriel Ayala, repo en [Github](https://github.com/)
- Jesu Oliva, repo en [Github](https://github.com/)
- Ismael Vidal, repo en [Github](https://github.com/)
- Carlos Pizarro repo en [Github](https://github.com/CarlosPizarroMorales/modulo-5)

<hr>

## Sobre el orden de las entregas:

Las entregas se presentan en este README de acuerdo al orden natural en que han sido implementadas, no de acuerdo a su numeración. Esto es debido a que el orden sugerido implica utilizar dependencias que se implementan luego de la entrega en cuestión. Esta situación sucede en los ejercicios 2-3 y 4-5, por lo que el orden de implementación y entrega será:

1. [Entrega 1 - Ejercicio 1](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-1-Ejercicio-1)
2. [Entrega 2 - Ejercicio 3](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-2-Ejercicio-3)
3. [Entrega 3 - Ejercicio 2](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-3-Ejercicio-2)
4. [Entrega 4 - Ejercicio 5](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-4-Ejercicio-5)
5. [Entrega 5 - Ejercicio 4](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-5-Ejercicio-4)
6. [Entrega 6 - Ejercicio 6](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-6-Ejercicio-6)
7. [Entrega 7 - Ejercicio 7](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-7-Ejercicio-7)
8. [Entrega 8 - Sprint](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#Entrega-8-Sprint)

## *Requerimientos generales*

- Todas las vistas deben compartir una misma hoja de estilo.
- Las vistas deben ser responsive para al menos 3 *breakpoints*.
- Un mismo menú debe estar presente en todas las vistas otorgando navegabilidad al sitio. (Excepto Login)

## *Contexto*

En la última década, han aumentado los índices de accidentabilidad, especialmente en las
empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las
leyes y normativas que obligan a las empresas a tomar todaslas medidas necesarias para proteger
la vida y salud de los trabajadores. Para dar cumplimiento a la normativa y mantener ambientes
de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional,
lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas
necesarias para la seguridad. Muchas de las empresas que han optado por no invertir en asesoría
preventiva, se ven expuestas a aplicación de multas de las entidades fiscalizadoras, gastos por
días perdidos en accidentabilidad, bajas en la producción, alzas en el pago de cotizaciones (al
organismo administrador del seguro de accidentes del trabajo, ley 16.744), entre otros. Además,
hay que considerar posibles demandas y pagos de indemnizaciones a lostrabajadores y familiares
afectados por accidentes del trabajo.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos
laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben
ejecutar en cada una de las empresas que son clientes de la compañía. Este servicio finalmente
pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo
razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la
normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un
ahorro económico.

## *Problema*

La empresa no posee un sistema de información que le permita administrar toda la cantidad de
información que se genera, ni controlar las actividades y el recurso humano. Existen problemas
con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no

están disponibles para informarles sus actividades futuras. No existe registro del profesional que
ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente.
Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de
la capacitación, lo que trae consigo multas para la empresa. No se tiene un control de los clientes
que pagan y los que no, lo que hace que muchas actividades de los profesionales corran por
cuenta de la empresa, generando desbalances financieros. Las actividades se registran en
carpetas lo que dificulta el seguimiento de las asesorías y el resumen de resultados por empresa.
Además, generalmente no se cumplen c iertas actividades de control de implementación de
soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera multas para los
clientes, bajando la calidad del servicio. Los profesionales que han atendido la empresa
esporádicamente han variado, no existiendo un registro de la totalidad de actividades preventivas
realizadas y no se tiene certeza de los avances.

## *Solución*

Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y
que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes. El sistema debe permitir la planificación de actividades y el control
de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales
y los clientes para la respuesta temprana ante incidentes de seguridad.

## *Desarrollo*

Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
Hasta el momento se han definido las siguientes funcionalidades en el sistema:

## *Casos de uso*

| Caso de Uso | Description | Implementado en |
| --- | --- | --- |
| Inicio | Página de inicio con información relevante sobre el proyecto | Ejercicio 1 |
| Contacto | Formulario de contacto para realizar consultas | Ejercicio 1 |
| Crear Capacitacion | Formulario para crear una capacitación en el sistema | Ejercicio 1 |
| Listar Capacitaciones | Listar capacitaciones registradas | Ejercicio 3 |
| Login | Acceso a un usuario a través de rut y clave | Ejercicio 3 |
| Crear usuario | Formulario que permitirá crear un usuario en la plataforma | Ejercicio 5 |
| Listar usuarios | Servlet y vista que permitirá desplegar todos los usuarios | Ejercicio 5 |
| Editar Cliente | Permite editar datos de un usuario de tipo Cliente | Sprint |
| Editar Administrativo | Permite editar datos de un usuario de tipo Administrativo | Sprint |
| Editar profesional | Permite editar datos de un usuario de tipo Profesional | Sprint |

Otras funcionalidades:

| Funcionalidad | Descripción | Implementado en |
| --- | --- | --- |
| Cierre de sesión | Servlet que permite realizar el cierre de sesión | Ejercicio 2 |
| Validar Login | Para vistas Contacto, Crear Capacitación y Listar capacitaciones validar el inicio de sesión y si es FALSE, redireccionar a Login | Ejercicio 3 |
| conexion.Conexion | Clase que implementa patrón Singleton para retornar conexión a la base de datos | Ejercicio 4 |
| Package modelo | Paquete que contiene las entidades Usuario, Cliente, Administrativo, Profesional y Capacitacion | Ejercicio 5 |

<hr>

## Entrega 1 *Ejercicio 1*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Crear un proyecto web dinámico utilizando Eclipse IDE For Enterprise Java Developer.
2. Configurar el ambiente de servidor apache Tomcat para poder levantar el proyecto web.
3. Construir tres Servlets que utilicen métodos GET/POST. Los casos de uso implementados se pueden observar en la tabla de *[Casos de uso](notion://www.notion.so/ceomarin/readme-proyect-2486bf4fbcaa45f2b98cd12a51c28784#casos-de-uso)*
4. Cada servlet puede generar el código HTML o llamar a un archivo JSP.
5. La interfaz debe ser responsive, tener estilos y script JS si aplica.

Consideraciones:

- Para las vistas se ha optado por utilizar archivos JSP utilizando el método `getRequestDispatcher()`
- Se ha creado el package `controlador` para alojar los 3 servlets creados en esta entrega.
- Para la entrega y el proyecto general se utilizará Javascript Vanilla y Bootstrap 5.3

## Entrega 2 *Ejercicio 3*

Entregable:

- Archivo comprimido RAR con el proyecto.

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Crear servlet para Listar Capacitaciones: por ahora, solo desplegar sitio actual.
2. Crear servlet para Login: Pagina para iniciar sesión.
3. El servlet anterior debe validar usuario "admin" y clave 1234 de la siguiente manera:
    1. Si las credenciales son correctas, redirecciona al CdU "Contacto"
    2. Si las credenciales no son correctas, redirecciona al Login.
4. Las opciones del menú Contacto, Crear Capacitacion y Listar Capacitaciones ahora deben validar que se ha iniciado sesión:
    1. Si se ha iniciado correctamente, desplegar la vista
    2. Si no se ha iniciado correctamente, redirigir al Login

Consideraciones:

1. El proyecto dice que el login debe estar basado en rut y clave. ¿Qué implementar?
2. Es más razonable crear de inmediato una vista para Listar Capacitaciones con data *hardcodeada* pero que represente la vista final real para depurar estilos y responsividad.
3. ¿No tiene sentido redirigir al usuario a Contacto una vez que ha logueado correctamente?

## Entrega 3 *Ejercicio 2*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Corregir servlets que producen HTML por archivos JSP.
2. Aplicar CSS a cada sitio. Todos las vistas deben compartir la hoja de estilos.
3. Si es necesario utilice Javascript, incluso con librerías si lo requiere.
4. Las vistas deben compartir el mismo menú, a excepción del login.
5. Implementar servlet de cierre de sesión, que redirige a vista del Login.

Consideraciones:

1. Se utilizan archivos JSP desde la primera entrega, Bootstrap CSS, una sola hoja de estilos y un archivo Javascript Vanilla desde la primera entrega.
2. No se entiende si la vista inicial debería ser el Login o es Inicio. ¿Para qué redigirir al usuario al Login cuando se cierra sesión?

## Entrega 4 *Ejercicio 5*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Cambie el nombre del package con los servlets a `controlador`
2. Cree el package `modelo` y dentro, clases para:
3. `Usuario`, `Cliente`, `Profesional`, `Administrativo` y `Capacitacion`. Utilice los atributos adecuados.
4. Agregue servlet y vista para CdU "Crear usuario".
5. Agregue servlet y vista para CdU "Listar usuarios".
6. Mantener estilo general y responsividad.
7. Las vistas creadas sólo pueden ser desplegadas haciendo Login.

Consideraciones:

1. Utilizar los nombres finales de packages desde un principio. **No hacer doble trabajo**. *Leer bien primero*.
2. Definir formato utilizado para rut, puede ser: String[2], int[2], int rut + int digito, etc. Conversar.

## Entrega 5 *Ejercicio 4*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Utilizar BD creada en módulo 3 o crear ahora.
2. Crear package `conexion` con una clase que utilice patrón Singleton para retornar una conexión a la BD.
3. Sobre clase Capacitacion:
    1. Debe tener método para permitir registrar una capacitación en BD.
    2. Debe tener método para permitir listar capacitaciones registradas en BD.
4. En vista Crear Capacitación, validar campos en cliente con JS antes de enviar. Usar guía del módulo 4.
5. Considerar regla de integridad referencial Cliente 0..N Capacitacion: desactivar llave por ahora.

Consideraciones:

1. Sobre la BD: fijarse en entidades finales para crear modelo.

## Entrega 6 *Ejercicio 6*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:

1. Verificar *integridad* de construcción de clases en package `modelo`.
2. Crear package `interfaces`, con una interfaz con 2 métodos:
    1. `public ArrayList<Capacitacion> listarCapacitaciones();` para listar capacitaciones.
    2. `public void registrarCapacitacion(Capacitacion c);` para crear capacitación.
3. Crear package `implementacion` con una clase que implementa la interfaz anterior.
4. `listarCapacitaciones();` debe listar al menos 3 capacitaciones creadas manualmente.
5. `registrarCapacitacion(c);` debe mostrar objeto `c` por la consola de Java.
6. Modificar servlet "Listar Capacitaciones". Ahora debe invocar el método `listarCapacitaciones()` de la clase anterior para mostrar el resultado en la vista JSP.
7. Modificar servlet "Crear capacitacion". Ahora al recibir los datos procesados, debe invocar otro servlet que crea objeto `Capacitacion c` y con ese objeto invoca `registrarCapacitacion(c)`. Luego, muestra mensaje de confirmación por vista JSP.

Consideraciones:

1. Existe "NOTA 2": Los ejercicios solicitados no registran datos en BD. Tal funcionalidad será abordada en otro ejercicio. Confirmar
2. Existe "NOTA 3": Usar esta [referencia](http://blog.oscarscode.com/es/java-es/introduccion-a-mvc-con-servlets-y-jsp/) como ejemplo de lo que se busca lograr.
3. Ejercicio ambiguo. Consultar bien el uso o no-uso de la BD en este ejercicio.
4. Requisitos que no interfieren con ejercicios anteriores deberían ser implementados desde el principio si es posible.
5. Crear código de "Listar Capacitaciones" y "Crear capacitación" lo antes posible y dejar comentado si interfiere con entregas anteriores.

## Entrega 7 *Ejercicio 7*

Entregable:

- Documento con al menos 4 capturas de pantalla documentando el proceso.

Requisitos de la entrega:

1. Agregar funcionalidad para listar usuarios, creando clases necesarias para ello.
2. Generar archivo WAR con el proyecto.
3. Cargar WAR en instancia local del servidor Tomcat
4. Ejecutar plataforma ingresando directamente desde el navegador a la dirección de Tomcat

Consideraciones:

1. Por ahora ninguna.

## Entrega 8 *Sprint*

Entregable:

- Archivo comprimido RAR con el proyecto.

Requisitos de la entrega:
1.

Consideraciones:
1.