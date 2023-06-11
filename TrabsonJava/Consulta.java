package TrabsonJava;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data, hora, Sintomas, diagnostico;

    public Consulta(){}
    public Consulta(Paciente paciente, Medico medico, String data, String hora, String Sintomas, String diagnostico){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.Sintomas = Sintomas;
        this.diagnostico = diagnostico;
    }


    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public String getData() {
        return data;
    }
    public String getHora() {
        return hora;
    }
    public String getSintomas() {
        return Sintomas;
    }
    public String getDiagnostico() {
        return diagnostico;
    } 
}
