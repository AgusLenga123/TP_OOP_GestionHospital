import java.util.ArrayList;
import java.util.List;

public class Especialidad {
    private String nombre;
    private List<Medico> medicos;

    public Especialidad(String nombre) {
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void eliminarMedico(Medico medico) {
        medicos.remove(medico);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}

