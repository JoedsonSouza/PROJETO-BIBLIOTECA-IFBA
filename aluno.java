public class aluno {

	private String nome, cpf, matricula; private Integer cod_cadastro;
	
	public aluno (String nome, String cpf, String matricula, Integer cod_cadastro){
	
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.cod_cadastro = cod_cadastro;
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
	
	public void setCod_cadastro(Integer cod){
		this.cod_cadastro = cod;
	}
	public Integer getCod_cadastro(){
		return this.cod_cadastro;
	}

	public void DadosAluno(){
		System.out.println("\nNome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Matricula: "+this.matricula);
		System.out.println("Codigo de cadastro: "+this.cod_cadastro);
	}
}
