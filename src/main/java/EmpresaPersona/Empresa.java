package EmpresaPersona;

import java.util.ArrayList;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Departamento> departamentos = new ArrayList<>();

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public void SetDepartamento(Departamento departamento){
		departamentos.add(departamento);
	}
	public ArrayList<Departamento> GetDepartamentos(){
		return departamentos;
	}
	public String GetNombre(){
		return nombreEmpresa;
	}
}