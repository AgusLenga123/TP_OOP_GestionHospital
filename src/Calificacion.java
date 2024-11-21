import java.util.ArrayList;
import java.util.List;

public class Calificacion implements GestionCalificacion {

    private Medico medicoReceptor;
    private List<Integer> puntajes = new ArrayList<>();
    private List<String> opiniones = new ArrayList<>();


    public Calificacion(Medico medicoReceptor) {
        this.medicoReceptor = medicoReceptor;
    }


    @Override
    public void enviarCalificacion(String opinion, int puntaje) {
        if (puntaje < 1 || puntaje > 5) {
            throw new IllegalArgumentException("El puntaje debe estar entre 1 y 5.");
        } else {
            puntajes.add(puntaje);
            opiniones.add(opinion);
        }
    }


    @Override
    public double obtenerPromedioCalificaciones() {
        if (puntajes.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (int puntaje : puntajes) {
            suma += puntaje;
        }
        return (int) suma / puntajes.size();
    }


    @Override
    public String generarInformeCalificaciones() {
        if (puntajes.isEmpty()) {
            return "No hay calificaciones registradas.";
        }
        StringBuilder informe = new StringBuilder();
        informe.append("Informe de calificaciones del doctor: " + medicoReceptor.getNombre() + "\n");
        informe.append("Número total de calificaciones: ").append(contarCalificaciones()).append("\n");
        informe.append("Promedio: ").append(String.format("%.2f", obtenerPromedioCalificaciones())).append("\n");
        informe.append("Opiniones:\n");
        for (String opinion : opiniones) {
            informe.append("- ").append(opinion).append("\n");
        }
        return informe.toString();
    }


    @Override
    public int contarCalificaciones() {
        return puntajes.size();
    }

    @Override
    public void limpiarCalificaciones() {
        puntajes.clear();
        opiniones.clear();
    }

}
