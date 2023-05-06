public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerniver(){
        this.idade++;

    }

    public String getNome() { return nome;}

    public void setNome(String n) {this.nome = n;}

    public int getIdade() {return idade;}

    public void setIdade(int i) {this.idade = i;}

    public String getSexo() {return sexo;}

    public void setSexo(String s) {this.sexo = s;}

    @Override
    public String toString() {
    return "Pessoa{ " +"nome=" + this.nome +", idade=" + this.idade +", sexo=" + this.sexo + "}";
    }
    //@Override
    //	public String toString() {
    //		return "Rua: " + this.rua + ", Número: " + this.numero +
    //			   ", Cidade: " + this.cidade + ", Estado: " + this.estado +
    //			   ", CEP: " + this.cep;
}
