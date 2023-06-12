package TrabsonJava;
abstract class Pessoa {
	
	private String nome, CPF, numero, genero, endereco;
    private int idade;
 
    public Pessoa(){}
    
    public Pessoa (String nome, String CPF, int idade, String genero, String numero, String endereco){
        
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.genero = genero;
        this.numero = numero;
        this.endereco = endereco;
    }

	public void exibirDados(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " \nGênero: " + genero + " \nNúmero: " + numero + " \nEndereço: " + endereco);
    }

	public void atualizaCadastro(String enderecoN, String numeroN){
		this.endereco = enderecoN;
		this.numero = numeroN;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}