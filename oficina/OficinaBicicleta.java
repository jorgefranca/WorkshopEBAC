package oficina;

import veiculo.Veiculo;

public class OficinaBicicleta extends Oficina{
    
    private boolean machaNaBicicleta;

    public OficinaBicicleta(Veiculo veiculo, Pecas pecas){
        super(veiculo, pecas);
        //this.pecas = pecas;
    }

    public void setMachas(boolean v){
        this.machaNaBicicleta = v;
    }

    public boolean getMachas(){
        return machaNaBicicleta;
    }


}
