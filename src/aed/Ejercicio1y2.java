package aed;


/**
 *
 * @author abadie
 */
public class Ejercicio1y2 {

    public static void main(String[] args){

        Almacen almacen = new Almacen("Pastoriza", "099390485", "Almacen de Jose", 100);
        String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/v-jlavecchia/Desktop/UT3_PD4/out/production/UT3_PD4/aed/altas.txt");
        String[] lineasArchivoVentas = ManejadorArchivosGenerico.leerArchivo("/C:/Users/v-jlavecchia/Desktop/UT3_PD4/out/production/UT3_PD4/aed/ventas.txt");
        int montoTotal = 0;
        int montoTotalReducido = 0;
        int precioTotalVendido = 0;
        for(String linea : lineasArchivo) {
            String[] productos = linea.split(",");
            Producto producto = new Producto(Integer.parseInt(productos[0]), productos[1], Integer.parseInt(productos[2]), Integer.parseInt(productos[3]));
            almacen.insertarProducto(producto);
            montoTotal += producto.getPrecio() * producto.getStock();
            for(String lineaVenta : lineasArchivoVentas) {
                String[] productosVendidos = lineaVenta.split(",");
                String codigoString = producto.getCodProducto().toString();
                if(Integer.parseInt(productosVendidos[0]) == Integer.parseInt(codigoString)) {
                    almacen.restarStock(producto.getStock(), Integer.parseInt(productosVendidos[1]));
                    precioTotalVendido += Integer.parseInt(productosVendidos[1]) * producto.getPrecio();
                    montoTotalReducido = montoTotal - precioTotalVendido;
                    System.out.println(producto.getPrecio());
                    System.out.println(precioTotalVendido);
                }
            }

        }
        //Ejercicio 1 y 2
        System.out.println("Monto total " + montoTotal);
        System.out.println("El stock se ha reducido en: " + precioTotalVendido);
        System.out.println("Monto total reducido " + montoTotalReducido);
    }
    
}
