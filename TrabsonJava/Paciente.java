package TrabsonJava;

import java.util.List;
import java.util.Collections;   
import java.util.ArrayList;

public class Paciente extends Pessoa{

	private List<Consulta> historicoMedico;

	Paciente(String nome, String CPF, int idade, String genero, int numero, String endereco){
		super(nome, CPF, idade, genero, numero, endereco );
		this.historicoMedico = new ArrayList<>();
	}

	public void agendaConsulta(Medico medico, String data, String hora){
		Consulta consulta = new Consulta(this, medico, data, hora);
		//implementar consulta
		System.out.println("Consulta agendada para o dia" + data +"às"+ hora + "com o doutor" + consulta.getMedico().getNome());
	}

	public void cancelarConsulta(Consulta consulta,Medico medico, String data, String hora){
		//implementar cancelamento
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
	
	public List<Consulta> getHistoricoMedico() {
		return historicoMedico;
	}
	public void setHistoricoMedico(List<Consulta> historicoMedico) {
		this.historicoMedico = historicoMedico;
	}
}
