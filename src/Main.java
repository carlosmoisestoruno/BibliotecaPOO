public class Main {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Libro
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupery", "123456789");
        libro1.mostrarDetalle();

        System.out.println();

        //Creamos a un usuario
        Usuario usuario = new Usuario("Carlos Perez", 1);
        System.out.println(usuario);

        System.out.println();

        //Crear un libro prestado
        LibroPrestado libroPrestado = new LibroPrestado("1984", "Carlos", "123456", "Carlos Perez", "2025-01-20");
    }
}
