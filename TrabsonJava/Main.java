package TrabsonJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, escolhaPaciente, escolhaMedico;
        Scanner input = new Scanner(System.in);
        Menus menu = new Menus();
        Paciente paciente = new Paciente("Adriano Araújo Dutra", "052.025.515-52", 20, "Masculino", "4002-8922", "Av. Padre Cacique, N° 891");
        Medico medico = new Medico("Maria Silva Barbosa", "132.645.515-05", 50, "Feminino", "0800-4004", "Av. Beira Rio, N° 1909", "Médica da Familia", "08:00 até 17:00");
        do {
            menu.menuPrincipal();
            escolha = input.nextInt();

            switch(escolha){
                case 1:
                do{
                    menu.menuPaciente();
                    escolhaPaciente = input.nextInt();
                    switch(escolha){
                        case 1:
                        paciente.agendaConsulta(paciente, null, null, null);
                        break;
                        case 2:
                        paciente.cancelarConsulta(null, null, null, null);
                        break;
                        case 3:
                        paciente.consultarHistoricoMedico();
                        break;
                        case 4:
                        paciente.atualizaCadastro(null, null);
                        break;
                        case 5:
                        paciente.exibirDados();
                        break;
                    }
                }while( escolhaPaciente != 0);






                break;
                case 2:
                menu.menuMedico();
                escolha = input.nextInt();
                break;
            }
        } while (escolha != 0);
        System.out.println("Programa encerrado!");
    }
}
