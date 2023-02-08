/**
 * Clase Employee (Empleado)
 * La clase representa a un empleado con su nombre, edad y salario.
 */
public class Employee {
    /**
     * Atributo privado que representa el nombre del empleado
     */
    private String name;

    /**
     * Atributo privado que representa la edad del empleado
     */
    private int age;

    /**
     * Atributo protegido que representa el salario del empleado
     */
    protected double salary;

    /**
     * Constructor de la clase Employee
     * @param name Nombre del empleado
     * @param age Edad del empleado
     * @param salary Salario del empleado
     */
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Método para establecer el nombre del empleado
     * @param name Nombre del empleado
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Método para obtener el nombre del empleado
     * @return Nombre del empleado
     */
    public String getName(){
        return name;
    }

    /**
     * Método para establecer la edad del empleado
     * @param age Edad del empleado
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Método para obtener la edad del empleado
     * @return Edad del empleado
     */
    public int getAge(){
        return age;
    }

    /**
     * Método para establecer el salario del empleado
     * @param salary Salario del empleado
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * Método para obtener el salario del empleado
     * @return Salario del empleado
     */
    public double getSalary(){
        return salary;
    }

    /**
     * Método para acceder al valor calculado para el descuento en el salario del empleado
     * @param discount Porcentaje de descuento
     * @return Valor del descuento
     */
    public double salaryDiscount(double discount){
        discount = socialSecurityDiscount();
        return discount;
    }

    /**
     * Método privado para calcular el descuento por seguridad social
     * @return Valor del descuento por seguridad social
     */
    private double socialSecurityDiscount(){
        return salary * 0.04;
    }
}
