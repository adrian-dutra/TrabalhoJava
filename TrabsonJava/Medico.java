package TrabsonJava;

import java.util.List;
import java.util.ArrayList;

public class Medico extends Pessoa{
    private String especialidade;
    private String horarioTrabalho;
    private String CRM;
    private List<Consulta> consultasAgendadas;

    Medico(String nome, String CPF, int idade, String genero, String numero, String endereco, String especialidade,
            String horarioTrabalho, String CRM){
        super(nome, CPF, idade, genero, numero, endereco);
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
        this.CRM = CRM;
        this.consultasAgendadas = new ArrayList<>();
    }

    public  Prontuario consultarPaciente(Paciente paciente, String data, String hora, String sintomas, String diagnostico) {
        Consulta consulta = new Consulta(paciente, this, data, hora, sintomas, diagnostico);
        Prontuario  prontuario = new Prontuario(paciente);
        
        paciente.setHistoricoMedico(consulta);
        this.consultasAgendadas.add(consulta);
        System.out.println("O seu diagnóstico é: " + diagnostico);
        System.out.println("");
        System.out.println(this.getNome() + "\nCRM: "+CRM);
        System.out.println("");
        System.out.println("Consulta realizada");
        prontuario.adicionarConsulta(consulta);
        prontuario.adicionarExameRealizado(diagnostico);
        return prontuario;
    }

    public void adicionarConsulta(Consulta consulta){
        consultasAgendadas.add(consulta);
    }

    public void removerarConsulta(Consulta consulta){
        consultasAgendadas.remove(consulta);
    }

    public void olharAgenda(){
        if (!consultasAgendadas.isEmpty()){
            System.out.println("Agenda:");
            for (Consulta consulta : consultasAgendadas){
                System.out.println("Data: " + consulta.getData() + " Hora: " + consulta.getHora() + " Paciente: " + consulta.getPaciente().getNome());
            }
        } else{
            System.out.println("Nenhuma consulta agendada");
        }
    }

    public String getNome(){
        return super.getNome();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }
    public void setConsultasAgendadas(List<Consulta> consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    //Polimorfismo dinâmico

    public void atualizaCadastro(String endereco, String numero, String especialidade, String horarioTrabalho) {
        super.atualizaCadastro(endereco, numero);
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Especialidade: " + especialidade + "\nHorário de trabalho: " + horarioTrabalho);
    }
}