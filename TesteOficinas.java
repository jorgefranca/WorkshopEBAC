import oficina.Oficina;
import oficina.OficinaBicicleta;
import oficina.OficinaCarroMoto;
import oficina.Pecas;
import veiculo.Bicicleta;
import veiculo.Carro;
import veiculo.Veiculo;

public class TesteOficinas {
   public static void main(String[] args) {
        
        Carro carro1 = new Carro();      
            carro1.setModelo("Fiat");
            carro1.setMarca("Honda");
            carro1.setCor("preto");
            carro1.setPlaca("STG 7898");
            carro1.setObservacao("Entrada dia 17/06 com defeito no motor, direção e câmbio");
            carro1.setDirecaoHidraulica(true);
            String[] nomesDasPecas = {"Motor", "Direção", "Câmbio"};
            double[] valorDasPecas = {100.00, 50.00, 200.0};
            Pecas pecasComDefeito1 = new Pecas(nomesDasPecas,valorDasPecas);

        Oficina oficina = new OficinaCarroMoto(carro1, pecasComDefeito1);
            oficina.setPecas(pecasComDefeito1);
            oficina.setDiasParaEntrega(10);
            oficina.calculaOrcamento();
            oficina.getDetalhes();

        System.out.println("**********************************");
        
        Veiculo bicicleta = new Bicicleta();
            bicicleta.setCor("Azul");
            bicicleta.setMarca("Caloi");
            bicicleta.setModelo("Estrada");
            bicicleta.setPlaca("");
            bicicleta.setObservacao("Entrada dia 15/06/2021 com pneu amassado e problema na corrente");
            String[] nomeDasPecasBK = {"Pneu dianteiro", "Corrente"};
            double[] valorDasPecasBK = {50.0, 20.0};
            Pecas pecaBike = new Pecas(nomeDasPecasBK, valorDasPecasBK);
        Oficina oficinaBike = new OficinaBicicleta(bicicleta, pecaBike);
            oficinaBike.setDiasParaEntrega(2);
            oficinaBike.calculaOrcamento();
            oficinaBike.getDetalhes();
   } 
}
