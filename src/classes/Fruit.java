package classes;

import java.util.ArrayList;

/**
 * La clase Fruit representa una fruta.
 */
public class Fruit  {
    /**
     * Nombre de la fruta.
     */
    public String name;

    /**
     * Lista de colores de la fruta.
     */
    private ArrayList<String> colors;

    /**
     * Peso promedio de la fruta.
     */
    private float averageWeight;

    /**
     * Constructor que inicializa el nombre de la fruta, la lista de colores y el peso promedio.
     *
     * @param name Nombre de la fruta
     * @param colors Lista de colores de la fruta
     * @param averageWeight Peso promedio de la fruta
     */
    public Fruit(String name, ArrayList<String> colors, float averageWeight){
        this.name = name;
        this.colors = colors;
        this.averageWeight = averageWeight;
    }

    /**
     * Establece la lista de colores de la fruta.
     *
     * @param colors Lista de colores de la fruta
     */
    public void setColors(ArrayList<String> colors){
        this.colors = colors;
    }

    /**
     * Devuelve la lista de colores de la fruta.
     *
     * @return Lista de colores de la fruta
     */
    public ArrayList<String> getColors(){
        return colors;
    }

    /**
     * Establece el peso promedio de la fruta.
     *
     * @param averageWeight Peso promedio de la fruta
     */
    public void setAverageWeight(float averageWeight){
        this.averageWeight = averageWeight;
    }

    /**
     * Devuelve el peso promedio de la fruta.
     *
     * @return Peso promedio de la fruta
     */
    public float getAverageWeight(){
        return averageWeight;
    }
}
