package TrabsonJava;
abstract class Pessoa {
	
	private String nome, CPF, genero, endereco;
    private int idade, numero;
 
    public Pessoa(){}
    
    public Pessoa (String nome, String CPF, int idade, String genero, int numero, String endereco){
        
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.genero = genero;
        this.numero = numero;
        this.endereco = endereco;
    }

	public void atualizaCadastro(String enderecoN, int numeroN){
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
