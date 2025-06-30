class itemColecao {
    private String nome;
    private String genero;
    private String lancamento;
    private String review;
    public itemColecao(String nome, String genero, String lancamento, String review){
        this.nome = nome;
        this.genero = genero;
        this.lancamento = lancamento;
        this.review = review;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getLancamento (){
        return lancamento;
    }
    public void setLancamento(String lancamento){
        this.lancamento = lancamento;
    }
    public String getReview(){
        return review;
    }
    public void setReview(String review){
        this.review = review;
    }
    

}
