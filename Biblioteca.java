import java.util.Scanner;
import java.util.HashMap;

public class Biblioteca{
    public static void main(String[] args) {

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        HashMap<String, Livro> livros = new HashMap<String, Livro>();
        Scanner scan = new Scanner(System.in);
        int menu; String cpf_consulta, ISBN_consulta;

        do{
        System.out.println("\n\n=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CONSULTAR ALUNO");
        System.out.println("[3] - CADASTRAR LIVRO");
        System.out.println("[4] - CONSULTAR LIVRO");
        System.out.println("[-1] - SAIR \n");
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
                        System.out.println("[1] - EXCLUIR CADASTRO DE ALUNO");
                        System.out.println("[2] - EDITAR DADOS DO ALUNO");
                        System.out.println("[0] - SAIR");
                        System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                        menu = scan.nextInt();
                   
                        switch(menu){
                            case 1:
                                scan.nextLine();
                                System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE ALUNO' SELECIONADA. CONTINUAR: ");
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
                                    break;
                                }

                            case 2:
                                do {
                                    System.out.println("\n\n::::::< EDITAR DADOS DO ALUNO >:::::: \n");
                                
                                    System.out.println("[1] - EDITAR NOME");
                                    System.out.println("[2] - EDITAR CPF");
                                    System.out.println("[3] - EDITAR MATRICULA");
                                    System.out.println("[4] - EDITAR E-MAIL");
                                    System.out.println("[5] - EDITAR TELEFONE");
                                    System.out.println("[6] - EDITAR ENDERECO");
                                    System.out.println("[0] - SAIR");
                                    System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                    menu = scan.nextInt();

                                    switch (menu) {
                                        case 1:
                                            scan.nextLine();
                                            System.out.print("NOVO NOME: ");
                                            nome = scan.nextLine();
                                            alunos.get(cpf_consulta).setNome(nome);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 2:
                                            scan.nextLine();
                                            System.out.print("NOVO CPF: ");
                                            cpf = scan.nextLine();
                                            alunos.get(cpf_consulta).setCpf(cpf);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 3:
                                            scan.nextLine();
                                            System.out.print("NOVO NUMERO DE MATRICULA: ");
                                            matricula = scan.nextLine();
                                            alunos.get(cpf_consulta).setMatricula(matricula);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 4:
                                            scan.nextLine();
                                            System.out.print("NOVO E-MAIL: ");
                                            email = scan.nextLine();
                                            alunos.get(cpf_consulta).setEmail(email);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 5:
                                            scan.nextLine();
                                            System.out.print("NOVO TELEFONE: ");
                                            telefone = scan.nextLine();
                                            alunos.get(cpf_consulta).setTelefone(telefone);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 6:
                                            scan.nextLine();
                                            System.out.print("NOVO ENDERECO: ");
                                            endereco = scan.nextLine();
                                            alunos.get(cpf_consulta).setEndereco(endereco);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        default:
                                            break;
                                    }
                                } while (menu != 0);
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
                    String codChamada;
                    String ISBN;
                    String titulo;
                    String dataPublic;
                    String editora;
                    String cidade;
                    String subtitulo;
                    String tituloOriginal;
                    String respPublic;
                    String palavraChave;
                    String numPaginas;

                    System.out.println("::::::< CADASTRAR LIVRO >:::::: \n");

                    scan.nextLine();
                    System.out.print("Código de Chamada: ");
                    codChamada = scan.nextLine();
		            System.out.print("ISBN: " );
                    ISBN = scan.nextLine(); 
		            System.out.print("Título: " );
                    titulo = scan.nextLine();
                    System.out.print("Título Original: " );
                    tituloOriginal = scan.nextLine();
                    System.out.print("Subtitulo: " );
                    subtitulo = scan.nextLine();
                    System.out.print("Número de páginas: " );
                    numPaginas = scan.nextLine();
		            System.out.print("Data de Publicação: " );
                    dataPublic = scan.nextLine();
		            System.out.print("Cidade: " );
                    cidade = scan.nextLine();
                    System.out.print("Editora: " );
                    editora = scan.nextLine();
                    System.out.print("Responsável pela Publicação: " );
                    respPublic = scan.nextLine();
                    System.out.print("Palavras-Chave: " );
                    palavraChave = scan.nextLine();

                    Livro liv = new Livro(codChamada, ISBN, titulo, dataPublic, editora, cidade, subtitulo, tituloOriginal, respPublic, palavraChave, numPaginas);
                    livros.put(ISBN, liv);

                    System.out.println("\n\n##---CADASTRO REALIZADO!---##\n");
                    break;
    
                case 4:
                    System.out.println("\n\n::::::< CONSULTA DE LIVRO >:::::: \n");
                    scan.nextLine();
                    System.out.print("\nDIGITE O ISBN DO LIVRO PARA REALIZAR A CONSULTA: ");
                    ISBN_consulta = scan.nextLine();

                    if (livros.get(ISBN_consulta) != null) {
                        livros.get(ISBN_consulta).DadosLivro();

                        System.out.println("\n\nMENU DE OPÇÕES (DADOS LIVRO): ");
                        System.out.println("[1] - EXCLUIR CADASTRO DO LIVRO");
                        System.out.println("[2] - EDITAR DADOS DO LIVRO");
                        System.out.println("[0] - SAIR");
                        System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                        menu = scan.nextInt();

                        switch(menu){
                            case 1:
                                scan.nextLine();
                                System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE LIVRO' SELECIONADA. CONTINUAR: ");
                                System.out.println("[1] - SIM");
                                System.out.println("[0] - NÃO");
                                System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                menu = scan.nextInt();
                                if(menu == 1){
                                    livros.remove(ISBN_consulta);
                                    System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                    break;
                                }
                                else{
                                    break;
                                }
                            case 2:
                                do {
                                    System.out.println("\n\n::::::< EDITAR DADOS DO LIVRO >:::::: \n");
                                
                                    System.out.println("[1] - EDITAR CÓDIGO DE CHAMADA");
                                    System.out.println("[2] - EDITAR ISBN");
                                    System.out.println("[3] - EDITAR TÍTULO");
                                    System.out.println("[4] - EDITAR TÍTULO ORIGINAL");
                                    System.out.println("[5] - EDITAR SUBTÍTULO");
                                    System.out.println("[6] - EDITAR NÚMERO DE PÁGINAS");
                                    System.out.println("[7] - EDITAR DATA DE PUBLICAÇÃO");
                                    System.out.println("[8] - EDITAR CIDADE");
                                    System.out.println("[9] - EDITAR EDITORA");
                                    System.out.println("[10] - EDITAR RESPONSÁVEL PELA PUBLICAÇÃO");
                                    System.out.println("[11] - EDITAR PALAVRAS-CHAVE");
                                    System.out.println("[0] - SAIR");
                                    System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                                    menu = scan.nextInt();

                                    switch (menu) {
                                        case 1:
                                            scan.nextLine();
                                            System.out.print("NOVO CÓDIGO DE CHAMADA: ");
                                            codChamada = scan.nextLine();
                                            livros.get(ISBN_consulta).setCodChamada(codChamada);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 2:
                                            scan.nextLine();
                                            System.out.print("NOVO ISBN: ");
                                            ISBN = scan.nextLine();
                                            livros.get(ISBN_consulta).setISBN(ISBN);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 3:
                                            scan.nextLine();
                                            System.out.print("NOVO TÍTULO: ");
                                            titulo = scan.nextLine();
                                            livros.get(ISBN_consulta).setTitulo(titulo);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 4:
                                            scan.nextLine();
                                            System.out.print("NOVO TÍTULO ORIGINAL: ");
                                            tituloOriginal = scan.nextLine();
                                            livros.get(ISBN_consulta).setTituloOriginal(tituloOriginal);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 5:
                                            scan.nextLine();
                                            System.out.print("NOVO SUBTÍTULO: ");
                                            subtitulo = scan.nextLine();
                                            livros.get(ISBN_consulta).setSubtitulo(subtitulo);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 6:
                                            scan.nextLine();
                                            System.out.print("NOVO NÚMERO DE PÁGINAS: ");
                                            numPaginas = scan.nextLine();
                                            livros.get(ISBN_consulta).setNumPaginas(numPaginas);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 7:
                                            scan.nextLine();
                                            System.out.print("NOVA DATA DE PUBLICAÇÃO: ");
                                            dataPublic = scan.nextLine();
                                            livros.get(ISBN_consulta).setDataPublic(dataPublic);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 8:
                                            scan.nextLine();
                                            System.out.print("NOVA CIDADE: ");
                                            cidade = scan.nextLine();
                                            livros.get(ISBN_consulta).setCidade(cidade);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 9:
                                            scan.nextLine();
                                            System.out.print("NOVA EDITORA: ");
                                            editora = scan.nextLine();
                                            livros.get(ISBN_consulta).setEditora(editora);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 10:
                                            scan.nextLine();
                                            System.out.print("NOVO RESPONSÁVEL PELA PUBLICAÇÃO: ");
                                            respPublic = scan.nextLine();
                                            livros.get(ISBN_consulta).setRespPublic(respPublic);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                        case 11:
                                            scan.nextLine();
                                            System.out.print("NOVAS PALAVRAS-CHAVE: ");
                                            palavraChave = scan.nextLine();
                                            livros.get(ISBN_consulta).setPalavraChave(palavraChave);
                                            System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                            break;
                                    
                                        default:
                                            break;
                                    }
                                } while (menu != 0);
                                livros.get(ISBN_consulta).DadosLivro();
                                break;
                            default:
                                break;
                        }
                    }else{
                        System.out.println("\n\n##---SEM CADASTRO DESTE LIVRO!---##\n");
                    }
                    break;

                default:
                    break;
            }

        }while (menu != -1);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        
        scan.close();
    }
}