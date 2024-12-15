package org.example.exercioscomstrings.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilTest {
    @Test
    public void deveRetornarTrueQuandoAStringRecebidaConterCaracteresNaoNumericos() {
        String str = "oi";
        Boolean eString = Util.eString(str);
        Assertions.assertTrue(eString);
    }

    @Test
    public void deveRetornarFalseQuandoAStringRecebidaConterNumeros() {
        String str = "1234";
        Boolean eString = Util.eString(str);
        Assertions.assertFalse(eString);
    }


}