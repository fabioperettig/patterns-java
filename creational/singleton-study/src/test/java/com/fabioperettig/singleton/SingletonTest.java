package com.fabioperettig.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void deveSerAMesmaInstancia() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();

        // Verifica se os dois objetos apontam para o mesmo endereço de memória
        assertSame(instance1, instance2);

        instance1.setAppName("Alterado na Instância 1");
        assertEquals("Alterado na Instância 1", instance2.getAppName());
    }
}
