# language: es

Característica: Realizar compra de articulo
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar la compra de un articulo


  @EscenarioSinValor
  Escenario: agregar articulo al carrito de compra
    Dado  que un cliente accede a la web de compras
    Cuando el agrega Cristian , Ramos , Crist@gmail.com , 18 , 200 , Bogota , 06/02/2021 , 07/13/1998/14:30 , crist al carrito
    Entonces el ve los productos en el carrito de compras


  @EscenarioConValor
  Esquema del escenario: agregar producto al carrito de compras
    Dado  que un cliente accede a la web de compras
    Cuando  el agrega un producto al carrito1
      |<nombreProducto>|<apellido>|
    Entonces el ve los productos en el carrito de compras


    Ejemplos:
      |nombreProducto|apellido|
      |Cristian  |Ramos       |