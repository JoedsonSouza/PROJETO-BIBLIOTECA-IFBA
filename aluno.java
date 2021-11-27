public class aluno {

	private String nome, cpf, matricula, email, telefone, endereco;
	
	public aluno (String nome, String cpf, String matricula, String email, String telefone, String endereco){
	
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
	public String getendereco(){
		return this.endereco; 
	}

	public void DadosAluno(){

		System.out.println("\n\nNome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Matricula: "+this.matricula);
		System.out.println("E-mail: "+this.email);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Endereco: "+this.endereco+"\n\n");
	}
}
