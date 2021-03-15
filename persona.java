public class persona {

    //Propiedades
    private String name;
    private String lastName;
    private String birthDate;
    private int age;
    private String id;
    private String gender;
	private String height;

    //Constructor
    public persona(String nombre, String apellido, String fecha, int edad, String genero, string altura) {
        name = nombre;
        lastName = apellido;
        birthDate = fecha;
        age = edad;
        gender = genero;
		height = altura;
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
	
	
	public void setHeight(String altura) {
        height = altura;
    }

    public String getHeight() {
        return genero;
    }

}