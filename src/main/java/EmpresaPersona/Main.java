package EmpresaPersona;

public class Main {
    public static void main(String[] args) {
        InicioPrograma();
    }

    public static void InicioPrograma() {
        Persona persona = new Persona("Agustin");

        Moto moto = new Moto("Harley Davidson 1200 Custom");
        persona.SetMoto(moto);

        Empresa empresa = new Empresa("naviera Tesoros del Mar S.A.");

        Departamento departamento = new Departamento("adquisiciones");

        Grupo grupo = new Grupo();
        grupo.SetEmpleado(persona);

        departamento.SetGrupo(grupo);

        empresa.SetDepartamento(departamento);

        Persona persona1 = new Persona("Francisco");

        persona.SetColega(persona1);
        persona1.SetColega(persona);

        Departamento departamento1 = new Departamento("Ventas");
        Grupo grupo1 = new Grupo();
        grupo.SetEmpleado(persona1);

        departamento1.SetGrupo(grupo1);

        empresa.SetDepartamento(departamento1);

        Persona persona2 = new Persona("Francisca");

        Moto moto1 = new Moto("Kawasaki Ninja ZX 6R 636");
        persona2.SetMoto(moto1);

        persona1.SetAmigos(persona2);
        persona2.SetAmigos(persona1);

        Condominio condominio = new Condominio("Nuevo Amanecer");
        Casa casa = new Casa();
        casa.SetPersona(persona);
        casa.SetPersona(persona1);
        condominio.SetCasa(casa);
    }
}
