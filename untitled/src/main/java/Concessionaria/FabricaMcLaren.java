package Concessionaria;

public class FabricaMcLaren implements  FabricaAbstrata {
    @Override
    public Veiculo createVeiculo() {
        return new McLaren();
    }

    @Override
    public Cor createCor() {
        return new Preto();
    }
}
