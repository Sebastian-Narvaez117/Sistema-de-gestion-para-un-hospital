public class Doctor extends Persona implements GestionCitas{
    private String id;
    private String especialidad;
    private ExpedienteMedico[] expedienteMedicoList;
    private Paciente[] pacienteList;
    private CitaMedica[] citaMedicaList;
    private Especialidad especcialidad;

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

    public void diagnosticar(Paciente paciente){

    }

    public void atenderPaciente(Paciente paciente){

    }

    public void recetar(Paciente paciente){

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExpedienteMedico[] getExpedienteMedicoList() {
        return expedienteMedicoList;
    }

    public void setExpedienteMedicoList(ExpedienteMedico[] expedienteMedicoList) {
        this.expedienteMedicoList = expedienteMedicoList;
    }

    public Paciente[] getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(Paciente[] pacienteList) {
        this.pacienteList = pacienteList;
    }

    public CitaMedica[] getCitaMedicaList() {
        return citaMedicaList;
    }

    public void setCitaMedicaList(CitaMedica[] citaMedicaList) {
        this.citaMedicaList = citaMedicaList;
    }

    public Especialidad getEspeccialidad() {
        return especcialidad;
    }

    public void setEspeccialidad(Especialidad especcialidad) {
        this.especcialidad = especcialidad;
    }
}
