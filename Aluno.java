import java.util.Scanner;

public class Aluno {

	private String nome, cpf, matricula, email, telefone, endereco;
	Scanner scan = new Scanner(System.in);
	private int menuStudent;
	
	public Aluno(){

	}

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

	public int getMenuStudent() {
		return menuStudent;
	}

	public void setMenuStudent(int menu) {
		this.menuStudent = menu;
	}

	public void cadastrarAluno(){
		System.out.println("\n\n::::::< CADASTRAR ALUNO >:::::: \n");

		//ARMAZENAR ALUNOS EM UMA ÚNICA VARIÁVEL E USAR O CPF COMO KEY
		System.out.print("NOME: ");
		setNome(scan.nextLine());
		System.out.print("CPF: ");
		setCpf(scan.nextLine());
		System.out.print("NÚMERO DE MATRÍCULA: ");
		setMatricula(scan.nextLine());
		System.out.print("EMAIL: ");
		setEmail(scan.nextLine());
		System.out.print("TELEFONE: ");
		setTelefone(scan.nextLine());
		System.out.print("ENDEREÇO: ");
		setEndereco(scan.nextLine());
	}

	public void menuAluno(){
		System.out.println("\n\nMENU DE OPÇÕES (DADOS ALUNO): ");
		System.out.println("[1] - EXCLUIR CADASTRO DE ALUNO");
		System.out.println("[2] - EDITAR DADOS DO ALUNO");
		System.out.println("[0] - SAIR");
		System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
		setMenuStudent(scan.nextInt());
	}

	public void menuEditarDados(){
		System.out.println("\n\n::::::< EDITAR DADOS DO ALUNO >:::::: \n");
                                
		System.out.println("[1] - EDITAR NOME");
		System.out.println("[2] - EDITAR CPF");
		System.out.println("[3] - EDITAR MATRICULA");
		System.out.println("[4] - EDITAR E-MAIL");
		System.out.println("[5] - EDITAR TELEFONE");
		System.out.println("[6] - EDITAR ENDERECO");
		System.out.println("[0] - SAIR");
		System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
		setMenuStudent(scan.nextInt());
	}

	public void DadosAluno(){

		System.out.println("\n\n-----DADOS DO ALUNO-----\n");
		System.out.println("NOME: "+ getNome());
		System.out.println("CPF: "+ getCpf());
		System.out.println("MATRICULA: "+ getMatricula());
		System.out.println("E-MAIL: "+ getEmail());
		System.out.println("TELEFONE: "+ getTelefone());
		System.out.println("ENDERECO: "+ getEndereco());
	}
}
