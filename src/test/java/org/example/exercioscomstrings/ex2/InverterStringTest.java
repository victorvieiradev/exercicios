package org.example.exercioscomstrings.ex2;

import org.example.exercioscomstrings.ex2.exption.NumeroNaoPermitidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InverterStringTest {
    @Test
    public void deveConverterStringParaMaiusculaERetornarElaAoContrario() throws NumeroNaoPermitidoException {
        InversorString inverterString = new InversorString();
        String palavra = "Victor";
        String palavraInvertida = inverterString.inverterEExibirEmMaiuscula(palavra);
        Assertions.assertEquals("ROTCIV", palavraInvertida);

    }

    @Test
    public void deveInverterStringCasoelaSejaminusculaEExibirMaiuscula() throws NumeroNaoPermitidoException {
        InversorString inversorString = new InversorString();
        String palavra = "victor";
        String palavraInvertida = inversorString.inverterEExibirEmMaiuscula(palavra);
        Assertions.assertEquals("ROTCIV", palavraInvertida);
    }

    @Test
    public void deveInverterStringQuandoElaVirComLetrasMaiusculaseMinusculas() throws NumeroNaoPermitidoException {
        InversorString inversorString = new InversorString();
        String palavra = "ViCtor";
        String palavraInvertida = inversorString.inverterEExibirEmMaiuscula(palavra);
        Assertions.assertEquals("ROTCIV", palavraInvertida);
    }

    @Test
    public void deveLancarExceptionNumeroNaoPermitidoQuandoStringForNumerica() {
        InversorString inversorString = new InversorString();
        String palavra = "1234";

        NumeroNaoPermitidoException ex = Assertions.assertThrows(
                NumeroNaoPermitidoException.class,
                () -> inversorString.inverterEExibirEmMaiuscula(palavra)
        );

        Assertions.assertEquals("Número não é permitido.", ex.getMessage());
    }

    @Test
    public void deveLancarNumeroNaoPermitidoExceptionQuandoVirStringComLetraseNumeros() {
        InversorString inversorString = new InversorString();
        String palavra = "o1";
        NumeroNaoPermitidoException ex =
                Assertions.assertThrows(
                        NumeroNaoPermitidoException.class,
                        () -> inversorString.inverterEExibirEmMaiuscula(palavra)
                );
        Assertions.assertEquals("Número não é permitido.", ex.getMessage());
    }


}