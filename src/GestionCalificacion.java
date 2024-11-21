public interface GestionCalificacion {
    void enviarCalificacion(String opinion, int Puntaje);
    double obtenerPromedioCalificaciones();
    String generarInformeCalificaciones();
    int contarCalificaciones();
    void limpiarCalificaciones();
}