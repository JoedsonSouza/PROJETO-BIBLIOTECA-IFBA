import java.util.HashMap;
import java.util.Map;

public class cad_aluno{

	Map<String, aluno> alu = new HashMap<String, aluno>();
	
	public void cadastrar(String nome, String cpf, String matricula, String email, String telefone, String endereco){
		
		aluno a1 = new aluno (nome, cpf, matricula, email, telefone, endereco);		
		alu.put(cpf, a1);
	}
}
