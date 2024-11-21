public abstract class Cita implements GestionTurnos {

    protected Paciente paciente;
    private Medico medico;
    public String descripcion;
    private String fecha;

    public Cita(Medico medico, String descripcion, String fecha) {
        this.medico = medico;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String nuevaFecha){
        fecha = nuevaFecha;
    }

    public abstract String generarResumenCita(Persona persona);

    @Override
    public void solicitarCita(){}
    @Override
    public void confirmarCita(){}
    @Override
    public void cancelarCita(){}


}

