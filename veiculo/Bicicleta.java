package veiculo;
public class Bicicleta extends Veiculo {
   private String placa = "Sem placa";

@Override
public void setPlaca(String placa) {
    this.placa = placa;
    
}

@Override
public java.lang.String getPlaca() {
    return placa;
}  
}
