package classes;

/**
 * La clase `Car` representa un automóvil.
 * Contiene información sobre el color, la marca y el año de fabricación de un automóvil.
 */
public class Car {
    /**
     * El color del automóvil
     */
    public String color;
    /**
     * La marca del automóvil
     */
    protected String brand;
    /**
     * El año de fabricación del automóvil
     */
    private int year;

    /**
     * Constructor que inicializa el color del automóvil, su marca, y año de fabricación.
     *
     * @param color El color del automóvil
     * @param brand La marca del automóvil
     * @param year El año de fabricación del automóvil
     */
    public Car(String color, String brand, int year){
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    /**
     * Establece la marca del automóvil
     *
     * @param brand La marca del automóvil
     */
    public void setBrand(String brand){
        this.brand = brand;
    }
    /**
     * Obtiene la marca del automóvil
     *
     * @return La marca del automóvil
     */
    public String getBrand(){
        return brand;
    }

    /**
     * Establece el año de fabricación del automóvil
     *
     * @param year El año de fabricación del automóvil
     */
    public void setYear(int year){
        this.year = year;
    }
    /**
     * Obtiene el año de fabricación del automóvil
     *
     * @return El año de fabricación del automóvil
     */
    public int getYear(){
        return year;
    }

}

