package paradigmas;

import paradigmas.model.Persona;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Instanciamos un objeto de tipo Persona
         */
        Persona persona_1 = new Persona(34755781, "Ramiro", "Quintana");
        Persona persona_2 = new Persona(41787452, "Johana", "Alonso");

        /*
         * Identidad del objeto
         */
        System.out.println(persona_1);
        /*
         * Llamamiento a los métodos de clase
         */
        System.out.println("La cantidad de brazos de persona_1 es: "+persona_1.getBrazos());
        System.out.println("La cantidad de brazos de persona_2 es: "+persona_2.getBrazos());

         /*
         * Llamamiento a los métodos de instancia
         */
        System.out.println("El apellido de persona_1 es: "+persona_1.getApellido());
        System.out.println("El apellido de persona_2 es: "+persona_2.getApellido());


        /*
         * Modificamos solo en 1 objeto el valor de brazos y se va a ver reflejados en todos los objetos que sean instanciados de la clase Persona
         */
        persona_1.setBrazos(1);

         /*
         * Modificamos solo en 1 objeto el valor de la variable de instancia apellido
         */
        persona_1.setApellido("Bermudez");
        P
        /*
         * Volvemos a llamar a los métodos de clase para verificar que cambiar para todas las instancias
         */
        System.out.println("La cantidad de brazos de persona_1 es ahora: "+persona_1.getBrazos());
        System.out.println("La cantidad de brazos de persona_2 es ahora: "+persona_2.getBrazos());

        /*
         * Volvemos a mostrar para ver cómo impacta el cambio de valor de una variable de instancia
         */
        System.out.println("El apellido de persona_1 es: "+persona_1.getApellido());
        System.out.println("El apellido de persona_2 es: "+persona_2.getApellido());
        
    }
}
