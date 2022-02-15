import java.util.Scanner;

public class Livro{
    private String codChamada, ISBN, titulo, dataPublic, editora, cidade, subtitulo, tituloOriginal, respPublic, palavraChave, numPaginas;
    Scanner scan = new Scanner(System.in);
    private int menuBook;

    public Livro(){

    }

    public Livro(String codChamada, String ISBN, String titulo, String dataPublic, String editora, String cidade, String subtitulo, String tituloOriginal, String respPublic, String palavraChave, String numPaginas){
        this.codChamada = codChamada;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.dataPublic = dataPublic;
        this.editora = editora;
        this.cidade = cidade;
        this.subtitulo = subtitulo;
        this.tituloOriginal = tituloOriginal;
        this.respPublic = respPublic;
        this.palavraChave = palavraChave;
        this.numPaginas = numPaginas;
    }

    public String getCodChamada() {
        return codChamada;
    }

    public void setCodChamada(String codChamada) {
        this.codChamada = codChamada;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublic() {
        return dataPublic;
    }

    public void setDataPublic(String dataPublic) {
        this.dataPublic = dataPublic;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getRespPublic() {
        return respPublic;
    }

    public void setRespPublic(String respPublic) {
        this.respPublic = respPublic;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getMenuBook() {
        return menuBook;
    }

    public void setMenuBook(int menu) {
        this.menuBook = menu;
    }

    public void cadastrarLivro(){
        System.out.println("::::::< CADASTRAR LIVRO >:::::: \n");

        System.out.print("Código de Chamada: ");
        setCodChamada(scan.nextLine());
        System.out.print("ISBN: " );
        setISBN(scan.nextLine());
        System.out.print("Título: " );
        setTitulo(scan.nextLine());
        System.out.print("Título Original: " );
        setTituloOriginal(scan.nextLine());
        System.out.print("Subtitulo: " );
        setSubtitulo(scan.nextLine());
        System.out.print("Número de páginas: " );
        setNumPaginas(scan.nextLine());
        System.out.print("Data de Publicação: " );
        setDataPublic(scan.nextLine());
        System.out.print("Cidade: " );
        setCidade(scan.nextLine());
        System.out.print("Editora: " );
        setEditora(editora);
        System.out.print("Responsável pela Publicação: " );
        setRespPublic(scan.nextLine());
        System.out.print("Palavras-Chave: " );
        setPalavraChave(scan.nextLine());
    }

    public void menuLivro(){
        System.out.println("\n\nMENU DE OPÇÕES (DADOS LIVRO): ");
        System.out.println("[1] - EXCLUIR CADASTRO DO LIVRO");
        System.out.println("[2] - EDITAR DADOS DO LIVRO");
        System.out.println("[0] - SAIR");
        System.out.print("\nDIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        setMenuBook(scan.nextInt());
    }

    public void menuEditarDados(){
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
		setMenuBook(scan.nextInt());
	}

    public void DadosLivro(){

		System.out.println("\n\n-----DADOS DO LIVRO-----\n");
		System.out.println("Código de Chamada: " + getCodChamada());
		System.out.println("ISBN: " + getISBN());
		System.out.println("Título: " + getTitulo());
        System.out.println("Título Original: " + getTituloOriginal());
        System.out.println("Subtitulo: " + getSubtitulo());
        System.out.println("Número de páginas: " + getNumPaginas());
		System.out.println("Data de Publicação: " + getDataPublic());
		System.out.println("Cidade: " + getCidade());
        System.out.println("Editora: " + getEditora());
        System.out.println("Responsável pela Publicação: " + getRespPublic());
        System.out.println("Palavras-Chave: " + getPalavraChave());
	}
}