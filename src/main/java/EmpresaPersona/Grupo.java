package EmpresaPersona;


import java.util.ArrayList;

public class Grupo {

	private ArrayList<Persona> empleados = new ArrayList<>();

	public Grupo() {
	}

	public void SetEmpleado(Persona empleado){
		empleados.add(empleado);
	}
}