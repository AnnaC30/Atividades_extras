package com.example;

public class Senha {
    public boolean senhaValida(String senha) {
        return senha != null && senha.length() >= 8;
    }
}
