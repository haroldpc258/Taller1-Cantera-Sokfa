/**
 * La clase `Book` representa un libro
 */
package classes;

public class Book {
    /**
     * Título del libro
     */
    private String title;

    /**
     * Autor del libro
     */
    private String author;

    /**
     * Número de páginas del libro
     */
    public int pages;

    /**
     * Contructor que inicializa el título, autor y una cantidad de páginas del libro.
     *
     * @param title título del libro
     * @param author autor del libro
     * @param pages cantidad de páginas del libro
     */
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    /**
     * Asigna un nuevo título al libro.
     * @param title nuevo título del libro
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Devuelve el título del libro.
     * @return título del libro
     */
    public String getTitle(){
        return title;
    }

    /**
     * Asigna un nuevo autor al libro.
     * @param author nuevo autor del libro
     */
    public void setAuthor(String author){
        this.author = author;
    }

    /**
     * Devuelve el autor del libro.
     * @return autor del libro
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Agrega una cantidad determinada de páginas al libro.
     * @param numPages cantidad de páginas a agregar
     */
    protected void addPages(int numPages){
        pages += numPages;
    }
}
