public class Medico extends Persona {
    private Especialidad especialidad;

    public Medico(String nombre, Especialidad especialidad, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}

