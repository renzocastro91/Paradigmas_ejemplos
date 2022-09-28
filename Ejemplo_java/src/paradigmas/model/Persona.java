package paradigmas.model;

/*
 * Definición de la clase Persona
 */

public class Persona {
    /*
     * Definición de la variables de clases
     */
    static Integer piernas = 2;
    static Integer brazos = 2;
    /*
     * Definición de las variables de instancia
     */
    private Integer dni;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    /*
     * Definición del constructor
     */
    public Persona(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /*
     * Definición de los métodos getter y setter
     */
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*
     * Definimos los métodos de clase
     */

    public static Integer getBrazos() {
        return brazos;
    }
    public static Integer getPiernas() {
        return piernas;
    }

    public static void setPiernas(Integer valor_nuevo){
        piernas = valor_nuevo;
    }

    public static void setBrazos(Integer valor_nuevo){
        brazos = valor_nuevo;
    }
    /*
     * Generamos que el id del objeto sea el dni
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    /*
     * Cuando se lee el objeto devuelve apellido y nombre
     */
   

}
