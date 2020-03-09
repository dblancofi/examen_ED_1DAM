public class persona {

    //Propiedades
    private String name;
    private String lastName;
    private String birthDate;
    private int age;
    private String gender;

    //Constructor
    public persona(String nombre, String apellido, String fecha, int edad, String genero) {
        name = nombre;
        lastName = apellido;
        birthDate = fecha;
        age = edad;
        gender = genero;
    }
    
    //Métodos - getters&setters

    public void setName(String nombre) {
        name = nombre;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String apellido) {
        lastName = apellido;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(String fecha) {
        birthDate = fecha;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setAge(int edad) {
        age = edad;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String genero) {
        gender = genero;
    }

    public String getGender() {
        return gender;
    }

}