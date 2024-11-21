
public class TurnoMedico extends Cita{
    private String consultorio;
    private Paciente paciente;

    public TurnoMedico(Paciente paciente, Medico medico, String descripcion, String consultorio, String fecha) {
        super(medico, descripcion, fecha);
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public String getConsultorio() {
        return consultorio;
    }
    public Paciente getPaciente(){
        return paciente;
    }

    @Override
    public void cancelarCita(){
        System.out.println("Turno cancelado por: " + getPaciente().getNombre() +
                " con el medico: " + getMedico().getNombre() + "en el consultorio: " + consultorio);
        System.out.println();
    }

    @Override
    public void confirmarCita(){
        System.out.println("Turno confirmado para el paciente: " + getPaciente().getNombre() + " con el medico: " +
                getMedico().getNombre() + " en el consultorio: " + consultorio);
        System.out.println("");
    }

    @Override
    public String generarResumenCita(Persona persona) {
        return "Turno Médico para " + persona.getNombre() + " en el consultorio: " + consultorio
                + ", con el Dr. " + getMedico().getNombre() + ". Descripción: " + getDescripcion();
    }

}

