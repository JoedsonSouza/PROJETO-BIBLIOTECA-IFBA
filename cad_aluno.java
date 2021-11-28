import java.util.HashMap;
import java.util.Map;

public class cad_aluno{

	Map<String, Aluno> alu = new HashMap<String, Aluno>();
	
	public void cadastrar(String nome, String cpf, String matricula, String email, String telefone, String endereco){
		
		Aluno a1 = new Aluno (nome, cpf, matricula, email, telefone, endereco);		
		alu.put(cpf, a1);
	}
}
