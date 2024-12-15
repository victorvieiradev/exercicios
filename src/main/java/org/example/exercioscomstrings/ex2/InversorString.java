package org.example.exercioscomstrings.ex2;

import org.example.exercioscomstrings.ex2.exption.NumeroNaoPermitidoException;
import org.example.exercioscomstrings.util.Util;

public class InversorString {

    public String inverterEExibirEmMaiuscula(String palavra) throws NumeroNaoPermitidoException {
        if (!Util.eString(palavra)) {
            throw new NumeroNaoPermitidoException();
        }
        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }
        return palavraInvertida.toString().toUpperCase();
    }
}
