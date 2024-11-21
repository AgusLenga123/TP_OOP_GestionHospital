import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private List<Medico> listaMedicos = new ArrayList<>();
    private List<Especialidad> listaEspecialidades = new ArrayList<>();
    private List<Paciente> listaPacientes = new ArrayList<>();

    // Constructor
    public Hospital(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        listaEspecialidades.add(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public List<Especialidad> getListaEspecialidades() {
        return listaEspecialidades;
    }
}
