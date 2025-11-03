package br.com.cotiinformatica.services;

import br.com.cotiinformatica.dtos.requests.AutenticarUsuarioRequest;
import br.com.cotiinformatica.dtos.requests.CriarUsuarioRequest;
import br.com.cotiinformatica.dtos.responses.AutenticarUsuarioResponse;
import br.com.cotiinformatica.dtos.responses.CriarUsuarioResponse;
import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.PerfilRepository;
import br.com.cotiinformatica.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerfilRepository perfilRepository;

    public CriarUsuarioResponse criarUsuario
            (CriarUsuarioRequest request) {

        var usuario = new Usuario();

        usuario.setNome(request.nome());
        usuario.setEmail(request.email());
        usuario.setSenha(request.senha());
        usuario.setDataHoraCriacao(LocalDateTime.now());

        usuario.setPerfil(perfilRepository.findByNome("Operador"));

        usuarioRepository.save(usuario);

        return new CriarUsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getPerfil().getNome(),
                usuario.getDataHoraCriacao()
        );
    }

    public AutenticarUsuarioResponse autenticarUsuario
            (AutenticarUsuarioRequest request) {
        //TODO
        return null;
    }

}
