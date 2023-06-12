package TrabsonJava;

import java.util.List;
//import java.util.Collections;   
import java.util.ArrayList;

public class Paciente extends Pessoa{

	private List<Consulta> historicoMedico;

	Paciente(String nome, String CPF, int idade, String genero, String numero, String endereco){
		super(nome, CPF, idade, genero, numero, endereco );
		this.historicoMedico = new ArrayList<>();
	}

	public void agendaConsulta(Paciente paciente, Medico medico, String data, String hora){
		Consulta consulta = new Consulta(paciente, medico, data, hora, null, null);
		consulta.setAgendado(true);
		System.out.println("Consulta agendada para o dia " + data + " às " + hora + " com o doutor " + consulta.getMedico().getNome());
	} 

	public void cancelarConsulta(Consulta consulta,Medico medico, String data, String hora){
		consulta.setAgendado(false);
		System.out.println("Consulta Cancelada para o dia" + data +"às"+ hora + "com o doutor" + consulta.getMedico().getNome());
	}

	public void consultarHistoricoMedico(){
		if(!this.historicoMedico.isEmpty()){
			System.out.println("Histórico médico");
			for(Consulta consulta : this.historicoMedico){
                System.out.println("Data: " + consulta.getData() + "Médico: " + consulta.getMedico().getNome() + "Diagnóstico: " + consulta.getDiagnostico());
            }
		} else{
			System.out.println("Histórico médico vazio");
		}
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
        System.out.println("Nome: " + super.getNome() + "\n Idade: " + super.getIdade() + " \n Gênero: " + super.getGenero() + " \n Número: " + super.getNumero() + " \n Endereço: " + super.getEndereco() + "\n Histórico Médico: " + historicoMedico);
    }
}