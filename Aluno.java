public class Aluno {

	private String nome, cpf, matricula, email, telefone, endereco;
	
	public Aluno (String nome, String cpf, String matricula, String email, String telefone, String endereco){
	
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;

	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return this.matricula; 
	}
	
	public void setEmail(String email){
		this.email= email;
	}
	public String getEmail(){
		return this.email; 
	}

	public void setTelefone(String telefone){
		this.telefone= telefone;
	}
	public String getTelefone(){
		return this.telefone; 
	}

	public void setEndereco(String endereco){
		this.endereco= endereco;
	}
	public String getEndereco(){
		return this.endereco; 
	}

	public void DadosAluno(){

		System.out.println("\n\n-----DADOS DO ALUNO-----\n");
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Matricula: "+this.getMatricula());
		System.out.println("E-mail: "+this.getEmail());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Endereco: "+this.getEndereco());
	}
}
