package Concessionaria;

public class Comprador {
    private Veiculo veiculo;
    private Cor cor;

    public Comprador(FabricaAbstrata fabrica) {
        this.veiculo = fabrica.createVeiculo();
        this.cor = fabrica.createCor();
    }

    public String informarVeiculo() {
        return this.veiculo.getMarca();
    }

    public String informarMotor() {
        return this.veiculo.getMotor();
    }

    public String informarCor() {
        return this.cor.getCor();
    }

}
