package EmpresaPersona;

import java.util.ArrayList;

public class Condominio {

	private String nombreCondominio;
	private ArrayList<Casa> casas = new ArrayList<>();

	public Condominio(String nombreCondominio) {
		this.nombreCondominio = nombreCondominio;
	}

	public String GetNombre(){
		return nombreCondominio;
	}
	public ArrayList<Casa> GetCasas(){
		return casas;
	}
	public void SetCasa(Casa casa){
		casas.add(casa);
	}
}