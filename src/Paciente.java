public class Paciente extends Persona implements GestionCitas{
    private ExpedienteMedico expediente;
    private CitaMedica citaMedica;

    @Override
    public void programarCita() {
        System.out.println("Me gustaria programar una cita para el dia");
    }

    @Override
    public void cancelarCita() {
        System.out.println("Quiero cancelar mi cita para el dia");

    }

    @Override
    public void reprogramarCita() {
        System.out.println("Quiero reprogramar mi cita para el dia");
    }

    @Override
    public void consultarCita() {
        System.out.println("Quiero consultar mi cita");
    }
    public void comunicarSintomas(){

    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public ExpedienteMedico getExpediente() {
        return expediente;
    }

    public void setExpediente(ExpedienteMedico expediente) {
        this.expediente = expediente;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                '}';


    }
}
