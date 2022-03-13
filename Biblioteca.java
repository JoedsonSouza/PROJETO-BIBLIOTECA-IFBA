import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca{
    Scanner scan = new Scanner(System.in);
    private int menu;
    private String cpf_consulta;
    private String ISBN_consulta;
    HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
    HashMap<String, Livro> livros = new HashMap<String, Livro>();
    HashMap<String, Aluno> vinculo = new HashMap<String, Aluno>();
    HashMap<String, Livro> indisponiveis = new HashMap<String, Livro>();
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Biblioteca(){

    }

    public int getMenu() {
        return menu;
    }
    public void setMenu(int menu) {
        this.menu = menu;
    }
    public String getCpf_consulta() {
        return cpf_consulta;
    }
    public void setCpf_consulta(String cpf_consulta) {
        this.cpf_consulta = cpf_consulta;
    }
    public String getISBN_consulta() {
        return ISBN_consulta;
    }
    public void setISBN_consulta(String iSBN_consulta) {
        ISBN_consulta = iSBN_consulta;
    }

    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    public void menuOpcoes(){
        System.out.println("\n\n=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CONSULTAR ALUNO");
        System.out.println("[3] - CADASTRAR LIVRO");
        System.out.println("[4] - CONSULTAR LIVRO");
        System.out.println("[5] - LISTAR LIVROS DISPONÍVEIS");
        System.out.println("[6] - LISTAR LIVROS INDISPONÍVEIS");
        System.out.println("[-1] - SAIR \n");
        System.out.print("DIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        
        setMenu(scan.nextInt());
    }

    public void respostaMenu(){
        switch (getMenu()) {
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
                scan.nextLine();
                setCpf_consulta(scan.nextLine());

                if(alunos.get(getCpf_consulta()) != null){
                    alunos.get(getCpf_consulta()).DadosAluno();
                    alunos.get(getCpf_consulta()).menuAluno();
               
                    switch(alunos.get(getCpf_consulta()).getMenuStudent()){
                        case 1:
                            System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE ALUNO' SELECIONADA. CONTINUAR: ");
                            System.out.println("[1] - SIM");
                            System.out.println("[0] - NÃO");
                            System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                            alunos.get(getCpf_consulta()).setMenuStudent(scan.nextInt());
                            if(alunos.get(getCpf_consulta()).getMenuStudent() == 1){
                                alunos.remove(getCpf_consulta());
                                System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                break;
                            }
                            else{
                                break;
                            }

                        case 2:
                            do {
                                alunos.get(getCpf_consulta()).menuEditarDados();

                                switch (alunos.get(getCpf_consulta()).getMenuStudent()) {
                                    case 1:
                                        System.out.print("NOVO NOME: ");
                                        alunos.get(getCpf_consulta()).setNome(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 2:
                                        System.out.print("NOVO CPF: ");
                                        alunos.get(getCpf_consulta()).setCpf(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 3:
                                        System.out.print("NOVO NUMERO DE MATRICULA: ");
                                        alunos.get(getCpf_consulta()).setMatricula(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 4:
                                        System.out.print("NOVO E-MAIL: ");
                                        alunos.get(getCpf_consulta()).setEmail(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 5:
                                        System.out.print("NOVO TELEFONE: ");
                                        alunos.get(getCpf_consulta()).setTelefone(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 6:
                                        System.out.print("NOVO ENDERECO: ");
                                        alunos.get(getCpf_consulta()).setEndereco(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    default:
                                        break;
                                }
                            } while (alunos.get(getCpf_consulta()).getMenuStudent() != 0);
                            alunos.get(getCpf_consulta()).DadosAluno();
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
                scan.nextLine();
                setISBN_consulta(scan.nextLine());

                if (livros.get(getISBN_consulta()) != null) {
                    livros.get(getISBN_consulta()).DadosLivro();
                    livros.get(getISBN_consulta()).menuLivro();

                    switch(livros.get(getISBN_consulta()).getMenuBook()){
                        case 1:
                            System.out.println("\n\nOPÇÃO 'EXCLUIR CADASTRO DE LIVRO' SELECIONADA. CONTINUAR: ");
                            System.out.println("[1] - SIM");
                            System.out.println("[0] - NÃO");
                            System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
                            livros.get(getISBN_consulta()).setMenuBook(scan.nextInt());
                            if(livros.get(getISBN_consulta()).getMenuBook() == 1){
                                livros.remove(getISBN_consulta());
                                System.out.println("\n\n##---REMOÇÂO CONCLUIDA!---##\n");
                                break;
                            }
                            else{
                                break;
                            }
                        case 2:
                            do {
                                livros.get(getISBN_consulta()).menuEditarDados();

                                switch (livros.get(getISBN_consulta()).getMenuBook()) {
                                    case 1:
                                        System.out.print("NOVO CÓDIGO DE CHAMADA: ");
                                        livros.get(getISBN_consulta()).setCodChamada(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 2:
                                        System.out.print("NOVO ISBN: ");
                                        livros.get(getISBN_consulta()).setISBN(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 3:
                                        System.out.print("NOVO TÍTULO: ");
                                        livros.get(getISBN_consulta()).setTitulo(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 4:
                                        System.out.print("NOVO TÍTULO ORIGINAL: ");
                                        livros.get(getISBN_consulta()).setTituloOriginal(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 5:
                                        System.out.print("NOVO SUBTÍTULO: ");
                                        livros.get(getISBN_consulta()).setSubtitulo(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 6:
                                        System.out.print("NOVO NÚMERO DE PÁGINAS: ");
                                        livros.get(getISBN_consulta()).setNumPaginas(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 7:
                                        System.out.print("NOVA DATA DE PUBLICAÇÃO: ");
                                        livros.get(getISBN_consulta()).setDataPublic(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 8:
                                        System.out.print("NOVA CIDADE: ");
                                        livros.get(getISBN_consulta()).setCidade(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 9:
                                        System.out.print("NOVA EDITORA: ");
                                        livros.get(getISBN_consulta()).setEditora(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 10:
                                        System.out.print("NOVO RESPONSÁVEL PELA PUBLICAÇÃO: ");
                                        livros.get(getISBN_consulta()).setRespPublic(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                    case 11:
                                        System.out.print("NOVAS PALAVRAS-CHAVE: ");
                                        livros.get(getISBN_consulta()).setPalavraChave(scan.nextLine());
                                        System.out.println("\n\n##---ALTERAÇÃO CONCLUIDA!---##\n");
                                        break;
                                
                                    default:
                                        break;
                                }
                            } while (livros.get(getISBN_consulta()).getMenuBook() != 0);
                            livros.get(getISBN_consulta()).DadosLivro();
                            break;
                        case 3:
                            System.out.println("\n\n::::::< VINCULAR LIVRO A UM ALUNO >:::::: \n");
                            String cpfAluno2 = null;
                            for(Map.Entry<String, Aluno> entrada : alunos.entrySet()){
                                String cpfAluno = entrada.getKey(); // recebo o valor da chave que referencia o map
                                Aluno a = entrada.getValue();       // recebo o valor vinculado a determinada chave
                                cpfAluno2 = cpfAluno;
                                System.out.println("Nome: " + a.getNome());
                                System.out.println("CPF: " + a.getCpf());  // mostro o valor referente àquela chave
                                System.out.println("\n");
                            }
                            System.out.print("DIGITE O CPF DO ALUNO PARA REALIZAR O VINCULO: ");
                            cpf_consulta = scan.nextLine();
                            if (!cpf_consulta.equals(cpfAluno2)) {
                                System.out.println("\n\n##---SEM CADASTRO DESTE ALUNO!---##\n");
                            }else{
                                vinculo.put(getISBN_consulta(), alunos.get(cpf_consulta));
                            
                                indisponiveis.put(getISBN_consulta(), livros.get(ISBN_consulta));

                                livros.remove(getISBN_consulta());
                            
                                System.out.println("\n\n##---VÍNCULO REALIZADO!---##\n");
                            }
                            
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
                    String codLivro = entrada.getKey(); // recebo o valor da chave que referencia o map
                    Livro l = entrada.getValue();       // recebo o valor vinculado a determinada chave
                    System.out.println(l.getTitulo());  // mostro o valor referente àquela chave
                }
                break;
            case 6:
                System.out.println("\n\n::::::< LIVROS INDISPONÍVEIS >:::::: \n");
                for(Map.Entry<String, Livro> entrada : indisponiveis.entrySet()){
                    String codLivro = entrada.getKey(); // recebo o valor da chave que referencia o map
                    Livro l = entrada.getValue();       // recebo o valor vinculado a determinada chave
                    System.out.println("Livro: " + l.getTitulo());
                    System.out.println("ISBN: " + l.getISBN());
                    System.out.println("\n:::::: ALUNO VINCULADO ::::::");

                    //RETORNAR ALUNO VINCULADO
                    for(Map.Entry<String, Aluno> entrada2 : vinculo.entrySet()){
                        String alunoVinc = entrada2.getKey(); // recebo o valor da chave que referencia o map
                        Aluno a = entrada2.getValue();       // recebo o valor vinculado a determinada chave
                        if (alunoVinc.equals(l.getISBN())) { // se o ISBN do livro vinculado ao aluno for igual ao ISBN do livro indisponível || , então será mostrado os dados desse aluno vinculado separadamente (se o livro 1 pertence ao aluno 1, então os seus dados serão mostrados junto dos dados do livro 1).
                            a.DadosAlunoVinculado();
                        }
                        
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                }
                break;
        
            default:
                break;
        }
    }

}