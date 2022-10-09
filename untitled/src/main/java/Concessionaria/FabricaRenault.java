package Concessionaria;

public class FabricaRenault implements FabricaAbstrata {

    @Override
    public Veiculo createVeiculo() {
        return new Renault();
    }

    @Override
    public Cor createCor() {
        return new Azul();
    }
}
