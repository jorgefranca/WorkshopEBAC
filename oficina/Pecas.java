package oficina;
public class Pecas {

    private String[] nome;
    private double[] valor;
   // private int qntDePeças = 0;

    public Pecas(String[] nome, double[] valor){
        this.nome = nome;
        this.valor = valor;
        //this.qntDePeças++;
    }

    public String[] getNome() {
        return nome;
        
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public double[] getValor() {
        return valor;
    }

    public void setValor( double[] valor) {
        this.valor = valor; 
    }

    public int getQntDePeças() {
        return nome.length;
    }

  //  public void setQntDePeças(int qntDePeças) {
   //     this.qntDePeças = qntDePeças;
   // }

    
    
}
