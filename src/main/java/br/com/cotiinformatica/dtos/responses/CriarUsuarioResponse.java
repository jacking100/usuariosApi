package br.com.cotiinformatica.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record CriarUsuarioResponse(
        UUID id,
        String nome,
        String email,
        String perfil,
        LocalDateTime dataHoraCriacao
) {
}
