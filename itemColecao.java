/**
 * @author Pedro, Cyrius
**/
 class itemColecao {
    private String nome;
    private String genero;
    private String dataLancamento;
    private String comentario;

    public itemColecao(String nome, String genero, String dataLancamento, String comentario){
        this.nome = nome;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
        this.comentario = comentario;}

    }
    public String getNome(){
        return nome;
    }
    public void setName(String nome){
        this.nome = nome;
    }
    public String geGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String dataLancamento(){
        return dataLancamento;
    }
    public void setDataLancamento(String dataLancamento){
        this.dataLancamento = dataLancamento;
    }