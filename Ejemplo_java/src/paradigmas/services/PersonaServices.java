package paradigmas.services;

import paradigmas.model.Persona;

public class PersonaServices implements IPersona{

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona + "registrada");
        
    }
    
}
