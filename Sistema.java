import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sistema{
    public static void main(String[] args) {

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        HashMap<String, Livro> livros = new HashMap<String, Livro>();
        HashMap<String, Aluno> vinculo = new HashMap<String, Aluno>();
        Scanner scan = new Scanner(System.in);
        Biblioteca menu = new Biblioteca(); 
        String cpf_consulta, ISBN_consulta;
        
        

        do{
        menu.menuOpcoes();

            switch (menu.getMenu()) {
                case 1:
                    //--CADASTRO DO ALUNO--// 
                    Aluno alu = new Aluno();                   
                    alu.cadastrarAluno();
                    alu = new Aluno(alu.getNome(), alu.getCpf(), alu.getMatricula(), alu.getEmail(), alu.getTelefone(), alu.getEndereco());
                    alunos.put(alu.getCpf(), alu);

                    System.out.println("\n\n##---CADASTRO REALIZADO!---##\n");
                    break;

                case 2:
                    System.out.println("\n\n::::::< CONSULTA DE ALUNO >:::::: \n");
                    System.out.print("\nDIGITE O CPF DO ALUNO PARA REALIZAR A CONSULTA: ");
				    cpf_consulta = scan.nextLine();

                    if(alunos.get(cpf_consulta) != null){
                        alunos.get(cpf_consulta).DadosAluno();
                        alunos.get(cpf_consulta).menuAluno();
                   
                        switch(alunos.get(cpf_consulta).getMenuStudent()){
                            case 1:
                                System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE ALUNO' SELECIONADA. CONTINUAR: ");
                                System.out.println("[1] - SIM");
                                System.out.println("[0] - NÃO");
                                System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                alunos.get(cpf_consulta).setMenuStudent(scan.nextInt());
                                if(alunos.get(cpf_consulta).getMenuStudent() == 1){
                                    alunos.remove(cpf_consulta);
                                    System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                    break;
                                }
                                else{
                                    break;
                                }

                            case 2:
                                do {
                                    alunos.get(cpf_consulta).menuEditarDados();

                                    switch (alunos.get(cpf_consulta).getMenuStudent()) {
                                        case 1:
                                            System.out.print("NOVO NOME: ");
                                            alunos.get(cpf_consulta).setNome(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 2:
                                            System.out.print("NOVO CPF: ");
                                            alunos.get(cpf_consulta).setCpf(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 3:
                                            System.out.print("NOVO NUMERO DE MATRICULA: ");
                                            alunos.get(cpf_consulta).setMatricula(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 4:
                                            System.out.print("NOVO E-MAIL: ");
                                            alunos.get(cpf_consulta).setEmail(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 5:
                                            System.out.print("NOVO TELEFONE: ");
                                            alunos.get(cpf_consulta).setTelefone(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 6:
                                            System.out.print("NOVO ENDERECO: ");
                                            alunos.get(cpf_consulta).setEndereco(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        default:
                                            break;
                                    }
                                } while (alunos.get(cpf_consulta).getMenuStudent() != 0);
                                alunos.get(cpf_consulta).DadosAluno();
                                break;    
                            default:
                                break;
                        }

                    }else{ 
                        System.out.println("\n\n##---SEM CADASTRO DESTE ALUNO!---##\n");
                        break;
                    }
                    break;

                case 3:
                    Livro liv = new Livro();
                    liv.cadastrarLivro();
                    liv = new Livro(liv.getCodChamada(), liv.getISBN(), liv.getTitulo(), liv.getDataPublic(), liv.getEditora(), liv.getCidade(), liv.getSubtitulo(), liv.getTituloOriginal(), liv.getRespPublic(), liv.getPalavraChave(), liv.getNumPaginas());
                    livros.put(liv.getISBN(), liv);
                    
                    System.out.println("\n\n##---CADASTRO REALIZADO!---##\n");
                    break;
    
                case 4:
                    System.out.println("\n\n::::::< CONSULTA DE LIVRO >:::::: \n");
                    System.out.print("\nDIGITE O ISBN DO LIVRO PARA REALIZAR A CONSULTA: ");
                    ISBN_consulta = scan.nextLine();

                    if (livros.get(ISBN_consulta) != null) {
                        livros.get(ISBN_consulta).DadosLivro();
                        livros.get(ISBN_consulta).menuLivro();

                        switch(livros.get(ISBN_consulta).getMenuBook()){
                            case 1:
                                System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE LIVRO' SELECIONADA. CONTINUAR: ");
                                System.out.println("[1] - SIM");
                                System.out.println("[0] - NÃO");
                                System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                livros.get(ISBN_consulta).setMenuBook(scan.nextInt());
                                if(livros.get(ISBN_consulta).getMenuBook() == 1){
                                    livros.remove(ISBN_consulta);
                                    System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                    break;
                                }
                                else{
                                    break;
                                }
                            case 2:
                                do {
                                    livros.get(ISBN_consulta).menuEditarDados();

                                    switch (livros.get(ISBN_consulta).getMenuBook()) {
                                        case 1:
                                            System.out.print("NOVO CÓDIGO DE CHAMADA: ");
                                            livros.get(ISBN_consulta).setCodChamada(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 2:
                                            System.out.print("NOVO ISBN: ");
                                            livros.get(ISBN_consulta).setISBN(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 3:
                                            System.out.print("NOVO TÍTULO: ");
                                            livros.get(ISBN_consulta).setTitulo(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 4:
                                            System.out.print("NOVO TÍTULO ORIGINAL: ");
                                            livros.get(ISBN_consulta).setTituloOriginal(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 5:
                                            System.out.print("NOVO SUBTÍTULO: ");
                                            livros.get(ISBN_consulta).setSubtitulo(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 6:
                                            System.out.print("NOVO NÚMERO DE PÁGINAS: ");
                                            livros.get(ISBN_consulta).setNumPaginas(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 7:
                                            System.out.print("NOVA DATA DE PUBLICAÇÃO: ");
                                            livros.get(ISBN_consulta).setDataPublic(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 8:
                                            System.out.print("NOVA CIDADE: ");
                                            livros.get(ISBN_consulta).setCidade(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 9:
                                            System.out.print("NOVA EDITORA: ");
                                            livros.get(ISBN_consulta).setEditora(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 10:
                                            System.out.print("NOVO RESPONSÁVEL PELA PUBLICAÇÃO: ");
                                            livros.get(ISBN_consulta).setRespPublic(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 11:
                                            System.out.print("NOVAS PALAVRAS-CHAVE: ");
                                            livros.get(ISBN_consulta).setPalavraChave(scan.nextLine());
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                    
                                        default:
                                            break;
                                    }
                                } while (livros.get(ISBN_consulta).getMenuBook() != 0);
                                livros.get(ISBN_consulta).DadosLivro();
                                break;
                            case 3:
                                System.out.println("\n\n::::::< VINCULAR LIVRO A UM ALUNO >:::::: \n");
                                System.out.print("\nDIGITE O CPF DO ALUNO PARA REALIZAR O VINCULO: ");
                                cpf_consulta = scan.nextLine();
                                vinculo.put(ISBN_consulta, alunos.get(cpf_consulta));
                                livros.remove(ISBN_consulta);
                                break;    
                            default:
                                break;
                        }
                    }else{
                        System.out.println("\n\n##---SEM CADASTRO DESTE LIVRO!---##\n");
                    }
                    break;
                case 5:
                    System.out.println("\n\n::::::< LIVROS DISPONÍVEIS >:::::: \n");
                    for(Map.Entry<String, Livro> entrada : livros.entrySet()){
                        String codLivro = entrada.getKey();
                        Livro l = entrada.getValue();
                        System.out.println(l.getTitulo());
                    }
                    break;
            
                default:
                    break;
            }

        }while (menu.getMenu() != -1);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        
        scan.close();
    }
}