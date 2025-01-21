public class Main {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Libro
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupery", "123456789");

        //Usar los metodos del objeto
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("ISBN: " + libro1.getIsbn());


        //Modificar el titulo
        libro1.setTitulo("El principito - Ed. ilustrada");
        System.out.println("Nuevo titulo: " + libro1.getTitulo());
    }
}
