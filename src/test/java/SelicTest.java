import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelicTest {

    @Test
    public void deveRetornarTaxaSelic() {
        Selic.getInstance().setTaxaSelic(12.75f);
        assertEquals(12.75f, Selic.getInstance().getTaxaSelic());
    }

    @Test
    public void deveRetornarUltimaAtualizacao() {
        Selic.getInstance().setUltimaAtualizacao("21/09/2023 08:35");
        assertEquals("21/09/2023 08:35", Selic.getInstance().getUltimaAtualizacao());
    }
}