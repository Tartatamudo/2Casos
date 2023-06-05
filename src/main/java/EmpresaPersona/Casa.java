package EmpresaPersona;

import java.util.ArrayList;

public class Casa {

	private ArrayList<Persona> personas = new ArrayList<>();

	Casa(){

	}
	public void SetPersona(Persona persona){
		personas.add(persona);
	}

	public ArrayList<Persona> GetPersonas(){
		return personas;
	}
}