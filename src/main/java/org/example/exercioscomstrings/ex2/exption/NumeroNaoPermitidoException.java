package org.example.exercioscomstrings.ex2.exption;

public class NumeroNaoPermitidoException extends Exception {
    public NumeroNaoPermitidoException() {
        super("Número não é permitido.");
    }
}
