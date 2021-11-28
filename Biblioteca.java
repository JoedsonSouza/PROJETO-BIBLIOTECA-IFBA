import java.util.Scanner;
import java.util.HashMap;

public class Biblioteca{
    public static void main(String[] args) {

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        Scanner scan = new Scanner(System.in);
        int menu = -1; String cpf_consulta;

        do{
        System.out.println("\n\n=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CONSULTAR ALUNO");
        System.out.println("[3] - CADASTRAR LIVRO");
        System.out.println("[0] - SAIR \n");
        System.out.print("DIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        menu = scan.nextInt();

            switch (menu) {
                case 1:
                    String nome;
                    String cpf;
                    String matricula;
                    String email;
                    String telefone;
                    String endereco;
    
                    System.out.println("\n\n::::::< CADASTRAR ALUNO >:::::: \n");
    
                    //ARMAZENAR ALUNOS EM UMA ÚNICA VARIÁVEL E USAR O CPF COMO KEY

                    scan.nextLine();
                    System.out.print("NOME: ");
                    nome = scan.nextLine();
                    System.out.print("CPF: ");
                    cpf = scan.nextLine();
                    System.out.print("NÚMERO DE MATRÍCULA: ");
                    matricula = scan.nextLine();
                    System.out.print("EMAIL: ");
                    email = scan.nextLine();
                    System.out.print("TELEFONE: ");
                    telefone = scan.nextLine();
                    System.out.print("ENDEREÇO: ");
                    endereco = scan.nextLine();
                    Aluno alu = new Aluno(nome, cpf, matricula, email, telefone, endereco);
                    alunos.put(cpf, alu);

                    System.out.println("\n\n##---CADASTRO REALIZADO!---##\n");
                    break;

                case 2:
                    System.out.println("\n\n::::::< CONSULTA DE ALUNO >:::::: \n");
                    scan.nextLine();
                    System.out.print("\nDIGITE O CPF DO ALUNO PARA REALIZAR A CONSULTA: ");
				    cpf_consulta = scan.nextLine();

                    if(alunos.get(cpf_consulta) != null){
                        alunos.get(cpf_consulta).DadosAluno();

                        System.out.println("\n\nMENU DE OPÇÕES (DADOS ALUNO): ");
                        System.out.println("[1] - EXCLUIR DADO DE ALUNO");
                        System.out.println("[2] - ");
                        System.out.println("[0] - SAIR");
                        System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                        menu = scan.nextInt();
                   
                        switch(menu){
                            case 1:
                                scan.nextLine();
                                System.out.println("\n\nOPÇAO 'EXCLUIR DADO DE ALUNO' SELECIONADA. CONTINUAR: ");
                                System.out.println("[1] - SIM");
                                System.out.println("[0] - NÃO");
                                System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                menu = scan.nextInt();
                                if(menu == 1){
                                    alunos.remove(cpf_consulta);
                                    System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                    break;
                                }
                                else{
                                    menu = -1;
                                    break;
                                }

                            default:
                                menu = -1;
                                break;
                        }

                    }else{ 
                        System.out.println("\n\n##---SEM CADASTRO DESTE ALUNO!---##\n");
                        break;
                    }
                    break;

                case 3:
                    System.out.println("::::::< CADASTRAR LIVRO >:::::: \n");
                    break;
    
                default:
                    break;
            }

        }while (menu != 0);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        
        scan.close();
    }
}