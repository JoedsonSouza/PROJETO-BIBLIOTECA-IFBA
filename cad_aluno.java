import java.util.HashMap;
import java.util.Map;

public class cad_aluno{

	private static int codigo_aluno = 1;

	Map<String, aluno> alu = new HashMap<String, aluno>();
	
	public void cadastrar(String nome, String cpf, String matricula){
		aluno a1 = new aluno (nome, cpf, matricula, codigo_aluno);		
		alu.put(cpf, a1);
		codigo_aluno++;
	}
	
}
