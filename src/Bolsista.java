public class Bolsista extends Aluno{

    private float Bolsa;

    public void renovarBolsa(){

    }
   @Override
    public void pagarMensalidade(){
       System.out.println("Aluno(a) " + this.getNome() + " Bolsista, pagamento facilitado");

    }

    public float getBolsa() { return Bolsa;}

    public void setBolsa(float b) {Bolsa = b;}


}
