public class Funcionario extends  Pessoa{
    private  int setor;
    private boolean trabalhando;
    private float salario;

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;

    }

    public int getSetor() {return setor;}

    public void setSetor(int setor) {this.setor = setor;}

    public boolean getTrabalhando() {return trabalhando;}

    public void setTrabalhando(boolean trabalhando) {this.trabalhando = trabalhando;}
public float getsalario(){ return salario;}

    public void setSalario(float salario) {this.salario = salario;}


}
