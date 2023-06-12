package TrabsonJava;

public class Menus {
    public Menus(){}

    public void menuPrincipal(){
            System.out.println("===========================");
            System.out.println("Escolha um tipo de usuário:");
            System.out.println("1 - Paciente");
            System.out.println("2 - Médico");
            System.out.println("0 - Termina o programa");
            System.out.println("===========================");
    }
    public void menuPaciente(){
        System.out.println("====================================");
        System.out.println("Escolha uma ação para paciente:");
        System.out.println("1 - Agendar consulta");
        System.out.println("2 - Cancelar consulta");
        System.out.println("3 - Consultar histórico médico");
        System.out.println("4 - Atualizar cadastro");
        System.out.println("5 - Exibir dados do paciente");
        System.out.println("0 - Sai de paciente");
        System.out.println("====================================");
    }

    public void menuMedico(){
        System.out.println("====================================");
        System.out.println("Escolha uma ação para médico:");
        System.out.println("1 - Consultar paciente");
        System.out.println("2 - Olhar agenda");
        System.out.println("3 - Atualizar cadastro");
        System.out.println("4 - Exibir dados do médico");
        System.out.println("0 - Sai de médico");
        System.out.println("====================================");
    }
}
