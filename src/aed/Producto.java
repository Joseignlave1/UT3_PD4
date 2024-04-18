package aed;

public class Producto implements IProducto{
    private Comparable codigo;
    private Integer precio;
    private Integer stock;
    private String nombre;
    public Producto(Comparable codigo, String nombre, Integer precio, Integer stock) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }
    @Override
    public Comparable getCodProducto() {
        return this.codigo;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return this.stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        this.stock += stock;
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        this.stock -= stock;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
