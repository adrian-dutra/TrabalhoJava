package TrabsonJava;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private String especialidade;
    private String horarioTrabalho;
    private List<Consulta> consultasAgendadas;

    Medico(String nome, String CPF, int idade, String genero, int numero, String endereco, String especialidade,
            String horarioTrabalho) {
        super(nome, CPF, idade, genero, numero, endereco);
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
        this.consultasAgendadas = new ArrayList<>();
    }

    public void consultarPaciente(Paciente paciente, String data, String hora, String sintomas) {
        Consulta consulta = new Consulta(paciente, this, data, hora, sintomas, sintomas);

        // implementar consulta
        paciente.setHistoricoMedico(consulta);
        this.consultasAgendadas.add(consulta);
        System.out.println("Consulta realizada");
    }

    public void olharAgenda() {
        if (!consultasAgendadas.isEmpty()) {
            System.out.println("Agenda:");
            for (Consulta consulta : consultasAgendadas) {
                System.out.println("Data: " + consulta.getData() + "Paciente: " + consulta.getPaciente().getNome());
            }
        } else {
            System.out.println("Nenhuma consulta agendada");
        }
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

    public void atualizaCadastro(String endereco, int numero, List<Consulta> historicoMedico, String especialidade, String horarioTrabalho, List<Consulta> consultasAgendadas) {
        super.atualizaCadastro(endereco, numero);
        this.consultasAgendadas = consultasAgendadas;
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;

    }
}
