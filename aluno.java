public class aluno {

	private String nome, cpf; private Integer cod_cadastro, matricula;
	
	public aluno (String nome, String cpf, Integer matricula, Integer cod_cadastro){
	
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
	
	public void setMatricula(Integer matricula){
		this.matricula = matricula;
	}
	public Integer getMatricula(){
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
