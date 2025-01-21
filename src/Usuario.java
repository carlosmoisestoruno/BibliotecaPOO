public class Usuario {
    private String nombre;
    private int id;
    private boolean tienePrestamo;

    //Constructor
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.tienePrestamo = false; //Por defecto no tiene prestamo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public boolean isTienePrestamo() {
        return tienePrestamo;
    }

    public void setTienePrestamo(boolean tienePrestamo) {
        this.tienePrestamo = tienePrestamo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", tienePrestamo=" + tienePrestamo +
                '}';
    }
}
