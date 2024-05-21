public class CitaMedica implements GestionCitas{
    private String fecha;
    private String hora;
    private String motivo;
    private static int contador = 0;
    private Doctor doctor;
    private Enfermero enfermero;
    private Paciente paciente;
    private Estado estado;

    public CitaMedica(String fecha, String hora,Paciente paciente, String motivo, Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.motivo = motivo;
        this.estado = estado;
        contador++;
    }



    @Override
    public void programarCita() {
        System.out.println("Usted sera atendido ");
    }

    @Override
    public void cancelarCita() {
        System.out.println("Usted ha cancelado su cita");

    }

    @Override
    public void reprogramarCita() {
        System.out.println("Su cita ha sido reprogramada para el dia");
    }

    @Override
    public void consultarCita() {
        System.out.println("Su cita esta programada para el dia");
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        CitaMedica.contador = contador;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente=" + paciente +
                ", motivo='" + motivo + '\'' +
                ", estado=" + estado +
                '}';
    }

}
