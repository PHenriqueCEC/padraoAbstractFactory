package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompradorTest {

    @Test
    void deveEmitirMcLaren() {
        FabricaAbstrata fabrica = new FabricaMcLaren();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("McLaren", comprador.informarVeiculo());
    }

    @Test
    void deveEmitirRenault() {
        FabricaAbstrata fabrica = new FabricaRenault();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("Renault", comprador.informarVeiculo());
    }

    @Test
    void deveEmitirCorPreta() {
        FabricaAbstrata fabrica = new FabricaMcLaren();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("Preto", comprador.informarCor());
    }

    @Test
    void deveEmitirCorAzul() {
        FabricaAbstrata fabrica = new FabricaRenault();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("Azul", comprador.informarCor());
    }

    @Test
    void deveEmitirMotorMcLaren() {
        FabricaAbstrata fabrica = new FabricaMcLaren();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("V6", comprador.informarMotor());
    }

    @Test
    void deveEmitirMotorRenault() {
        FabricaAbstrata fabrica = new FabricaRenault();
        Comprador comprador = new Comprador(fabrica);
        assertEquals("V8", comprador.informarMotor());
    }

}
