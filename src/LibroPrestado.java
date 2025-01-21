public class LibroPrestado extends Libro{
    private String nombreUsuario;
    private String fechaPrestamo;

    //Constructor

    public LibroPrestado(String titulo, String autor, String isbn, String nombreUsuario, String fechaPrestamo) {
        super(titulo, autor, isbn);
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", prestado a = " + nombreUsuario + '\'' +
                ", fechaPrestamo ='" + fechaPrestamo + '\'';
    }
}
