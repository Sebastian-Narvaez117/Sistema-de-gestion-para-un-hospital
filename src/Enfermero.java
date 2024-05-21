public class Enfermero extends Persona implements GestionCitas{
    private ExpedienteMedico[] expedienteMedicoList;
    private Paciente[] pacienteList;
    private CitaMedica[] citaMedicaList;

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

    public void asistirPaciente(Paciente paciente){

    }


    public void asistirDoctor(Doctor doctor){

    }

    public CitaMedica[] getCitaMedicaList() {
        return citaMedicaList;
    }

    public void setCitaMedicaList(CitaMedica[] citaMedicaList) {
        this.citaMedicaList = citaMedicaList;
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
}
