package EmpresaPersona;

import java.util.ArrayList;

public class Departamento {

	private String nombreDepartamento;
	private ArrayList<Grupo> grupos = new ArrayList<>();

	public Departamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public String GetNombre(){
		return nombreDepartamento;
	}
	public ArrayList<Grupo> grupos(){
		return grupos;
	}

	public void SetGrupo(Grupo grupo){
		grupos.add(grupo);
	}
}