package EmpresaPersona;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private ArrayList<Moto> motos = new ArrayList<>();
	private ArrayList<Persona> colegas = new ArrayList<>();
	private ArrayList<Persona> amigos = new ArrayList<>();

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public void SetMoto(Moto moto){
		motos.add(moto);
	}
	public void SetColega(Persona colega){
		colegas.add(colega);
	}
	public void SetAmigos(Persona amigo){
		amigos.add(amigo);
	}

	public ArrayList<Moto> GetMotos(){
		return motos;
	}
	public ArrayList<Persona> GetColegas(){
		return colegas;
	}
	public ArrayList<Persona> GetAmigos(){
		return amigos;
	}
}