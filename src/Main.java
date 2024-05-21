//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paciente pedro = new Paciente();


        CitaMedica citaMedica = new CitaMedica("11/05/2023", "10:30" ,pedro,"Dolor de cuello", Estado.REALIZADA);
        System.out.println(citaMedica);


        ExpedienteMedico expedienteMedico = new ExpedienteMedico();
        expedienteMedico.setHistorial("El paciente tiene antecedentes de enfermedades respiratorias");
        expedienteMedico.setDiagnostico("Se diagnostica con COVID-19");
        expedienteMedico.setTratamiento("Se recomienda aislamiento y reposo en casa");
        expedienteMedico.setPrescripcion("Tomar medicamentos para la gripe y dolor de cabeza");

            System.out.println(expedienteMedico.getHistorial());
            System.out.println(expedienteMedico.getDiagnostico());
            System.out.println(expedienteMedico.getTratamiento());
            System.out.println(expedienteMedico.getPrescripcion());

            //hola


    }
}