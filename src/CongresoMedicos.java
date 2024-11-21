
import java.util.List;

public class CongresoMedicos extends Cita{
    private List<Medico> medicosParticipantes;

    public CongresoMedicos(Medico medico, String descripcion, String fecha, String modalidad, List<Medico> medicosParticipantes) {
        super(medico, descripcion, fecha);
        this.medicosParticipantes = medicosParticipantes;
    }

    public List<Medico> getMedicosParticipantes() {
        return medicosParticipantes;
    }

    @Override
    public void solicitarCita(){
        System.out.println("El congreso: " + this.descripcion + ", ha sido cancelado");
        System.out.println("");
    }

    public void confirmarCita(){
        System.out.println("El congreso: " + this.descripcion + ", ha sido confirmado");
        System.out.println("");
    }

    public void cancelarCita(){
        System.out.println("El congreso: " + this.descripcion + ", ha sido cancelado");
        System.out.println("");
    }

    @Override
    public String generarResumenCita(Persona persona) {
        return "Congreso Médico solicitado por: " + persona.getNombre();
    }
}


