package TrabsonJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Data, Hora, Sintomas, Diagnostico, Endereco, Numero;
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
                    switch(escolhaPaciente){

                        case 1:
                        System.out.println("Você está agendando uma consulta !");
                        System.out.println("==================================");
                        System.out.println("para agendar consulta digite as informações:");
                        System.out.println("Data:");
                        input.nextLine();
                        Data = input.nextLine();
                        System.out.println("Hora:");
                        Hora = input.nextLine();
                        paciente.agendaConsulta(paciente, medico, Data, Hora);
                        break;

                        case 2:
                        paciente.cancelarConsulta(paciente.getConsultaAgendada(), medico);
                        break;

                        case 3:
                        paciente.consultarHistoricoMedico();
                        break;

                        case 4:
                        System.out.println("Atualização cadastral");
                        System.out.println("Digite novo endereço");
                        input.nextLine();
                        Endereco = input.nextLine();
                        System.out.println("Digite novo Número");
                        Numero = input.nextLine();
                        paciente.atualizaCadastro(Endereco, Numero);
                        break;

                        case 5:
                        paciente.exibirDados();
                        break;
                    }
                }while( escolhaPaciente != 0);

                break;

                case 2:
                do{
                    menu.menuMedico();
                    escolhaMedico = input.nextInt();
                    switch(escolhaMedico){

                        case 1:
                        System.out.println("Você está consultando um paciente!");
                        System.out.println("==================================");
                        System.out.println("para começar a consulta digite a data e hora:");
                        input.nextLine();
                        System.out.println("Data:");
                        Data = input.nextLine();
                        System.out.println("Hora:");
                        Hora = input.nextLine();
                        System.out.println("Pergunte os sintomas:");
                        Sintomas = input.nextLine();
                        Diagnostico = "Virose";
                        medico.consultarPaciente(paciente, Data, Hora, Sintomas , Diagnostico);
                        break;

                        case 2:
                        medico.olharAgenda();
                        break;

                        case 3:
                        //medico.atualizaCadastro(Data, Sintomas, null, Diagnostico, Hora, null);
                        break;

                        case 4:
                        medico.exibirDados();
                        break;
                    }
                }while(escolhaMedico != 0);
                break;
            }

        }while (escolha != 0);
        System.out.println("Programa encerrado!");
    }
}
