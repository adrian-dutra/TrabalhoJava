package TrabsonJava;

import java.util.List;
import java.util.ArrayList;

public class Paciente extends Pessoa{

	private List<Consulta> historicoMedico;
	private Consulta consultaAgendada;

	Paciente(String nome, String CPF, int idade, String genero, String numero, String endereco){
		super(nome, CPF, idade, genero, numero, endereco );
		this.historicoMedico = new ArrayList<>();
	}

	public void agendaConsulta(Paciente paciente, Medico medico, String data, String hora){
		consultaAgendada = new Consulta(paciente, medico, data, hora, null, null);

		consultaAgendada.setAgendado(true);
		if(consultaAgendada.getMedico().getGenero() == "Masculino"){
		System.out.println("Consulta agendada para o dia " + consultaAgendada.getData() + " às " + consultaAgendada.getHora() + " com o doutor " + consultaAgendada.getMedico().getNome());
		} else{
            System.out.println("Consulta agendada para o dia " + consultaAgendada.getData() + " às " + consultaAgendada.getHora() + " com a Doutora " + consultaAgendada.getMedico().getNome());
        }
		this.historicoMedico.add(consultaAgendada);
		medico.adicionarConsulta(consultaAgendada);

	} 

	public void cancelarConsulta(Consulta consulta,Medico medico){
		if(consulta != null){
			if(consultaAgendada.getMedico().getGenero() == "Masculino"){
			System.out.println("Consulta cancelada para o dia " + consultaAgendada.getData() + " às " + consultaAgendada.getHora() + " com o doutor " + consultaAgendada.getMedico().getNome());
			} else{
            	System.out.println("Consulta cancelada para o dia " + consultaAgendada.getData() + " às " + consultaAgendada.getHora() + " com a Doutora " + consultaAgendada.getMedico().getNome());
     		}
			consultaAgendada.setAgendado(false);
		}
		else{
			System.out.println("Consulta não agendada, você precisa agendar uma consulta primeiro");
		}
	}

	public void consultarHistoricoMedico(){
		if(!this.historicoMedico.isEmpty()){
			System.out.println("Histórico médico");
			for(Consulta consulta : this.historicoMedico){
                System.out.println("Data: " + consulta.getData() + " Médico: " + consulta.getMedico().getNome() + " Diagnóstico: " + consulta.getDiagnostico());
            }
		} else{
			System.out.println("Histórico médico vazio");
		}
	}

	public Consulta getConsultaAgendada() {
		return consultaAgendada;
	}
	
	public List<Consulta> getHistoricoMedico(){
		return historicoMedico;
	}
	public void setHistoricoMedico(Consulta consulta){
		this.historicoMedico.add(consulta);
	}

	//Polimorfismo dinâmico
	
	public void atualizaCadastro(String endereco, String numero, List<Consulta> historicoMedico){
		super.atualizaCadastro(endereco,numero);
		this.historicoMedico = historicoMedico;
	}

	@Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Histórico Médico: " + historicoMedico);
    }
}