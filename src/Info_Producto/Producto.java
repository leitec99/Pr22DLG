package Info_Producto;

public class Producto {
    private String codigo;
    private String nombre;
    private float precio;

    public Producto() {
        this.codigo = "00";
        this.nombre = "producto 0";
        this.precio = 0;
    }

    public Producto(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 10;
    }

    public Producto(Producto other) {
        this.codigo = other.codigo;
        this.nombre = other.nombre;
        this.precio = other.precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
