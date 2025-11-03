package br.com.cotiinformatica.dtos.requests;

public record CriarUsuarioRequest(
        String nome,
        String email,
        String senha
) {
}
