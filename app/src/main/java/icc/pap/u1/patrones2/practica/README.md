# Sistema de Gestión de Pedidos

## Patrones de Diseño Seleccionados

### 1. Patrón Singleton (`ConfiguracionSistema`)
- **Razon:** La empresa requiere que exista una unica instancia encargada de administrar la configuración general compartida por toda la aplicacion. Este patron evita haci que hayan varias instancias de una misma

### 2. Patrón Factory Method 
- **Razon:** Permite centralizar la creacion de las subclases concretas PedidoPresencial y PedidoLinea sin acoplar el codigo principal de la aplicación a sus clases especificas. Esto cumple con el requisito de permitir la incorporación de nuevas modalidades de pedidos en el futuro sin modificar el codigo principal