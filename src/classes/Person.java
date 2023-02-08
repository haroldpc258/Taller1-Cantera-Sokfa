package classes;

import java.util.Date;

/**
 * La clase Person representa a una persona.
 */
public class Person {
    /**
     * Nombre de la persona.
     */
    private String name;

    /**
     * Primer apellido de la persona.
     */
    private String lastName1;

    /**
     * Segundo apellido de la persona.
     */
    private String lastName2;

    /**
     * Fecha de nacimiento de la persona.
     */
    public Date dateBirth;

    /**
     * Altura de la persona.
     */
    public float height;

    /**
     * Constructor que inicializa el nombre, los apellidos, la fecha de nacimiento y la altura de la persona.
     *
     * @param name Nombre de la persona
     * @param lastName1 Primer apellido de la persona
     * @param lastName2 Segundo apellido de la persona
     * @param dateBirth Fecha de nacimiento de la persona
     * @param height Altura de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param name Nombre de la persona
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return Nombre de la persona
     */
    public String getName(){
        return name;
    }

    /**
     * Establece el primer apellido de la persona.
     *
     * @param lastName1 Primer apellido de la persona
     */
    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }

    /**
     * Devuelve el primer apellido de la persona.
     *
     * @return Primer apellido de la persona
     */
    public String getLastName1(){
        return lastName1;
    }

    /**
     * Establece el segundo apellido de la persona.
     *
     * @param lastName2 Segundo apellido de la persona
     */
    public void setLastName2(String lastName2){
        this.lastName2 = lastName2;
    }

    /**
     * Devuelve el segundo apellido de la persona.
     *
     * @return Segundo apellido de la persona
     */
    public String getLastName2(){
        return lastName2;
