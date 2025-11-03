package br.com.cotiinformatica.dtos.requests;

public record AutenticarUsuarioRequest(
        String email,
        String senha
) {
}
