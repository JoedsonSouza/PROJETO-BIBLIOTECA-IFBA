public class Livro{
    private String codChamada, ISBN, titulo, dataPublic, editora, cidade, subtitulo, tituloOriginal, respPublic, palavraChave, numPaginas;

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