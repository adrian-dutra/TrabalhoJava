package TrabsonJava;

import java.util.List;
import java.util.Collections;   
import java.util.ArrayList;

abstract class Prontuario {
    private Paciente paciente;
    private List<Consulta> consultasAnteriores;
    private List<String> exameRealizado;

    public Prontuario(Paciente paciente){
        this.paciente = paciente;
        this.consultasAnteriores = new ArrayList<>();
        this.exameRealizado = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta){
        consultasAnteriores.add(consulta);
    }

    public void adicionarExameRealizado(String exame){
        exameRealizado.add(exame);
    }

    public void atualizaHistoricoMedico(){
        System.out.println("Histórico médico do paciente " + paciente.getNome() + ":");
        //implementar atualização
        for(Consulta consulta : consultasAnteriores){
            System.out.println("Data: " + consulta.getData() + ", Médico: " + consulta.getMedico().getNome() + ", Diagnóstico: " + consulta.getDiagnostico());
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public List<Consulta> getConsultasAnteriores() {
        return consultasAnteriores;
    }
    public List<String> getExameRealizado() {
        return exameRealizado;
    }



}
