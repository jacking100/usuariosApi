package br.com.cotiinformatica.controllers;

import br.com.cotiinformatica.dtos.requests.AutenticarUsuarioRequest;
import br.com.cotiinformatica.dtos.requests.CriarUsuarioRequest;
import br.com.cotiinformatica.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("criar")
    public ResponseEntity<?> criar
            (@RequestBody CriarUsuarioRequest request) {
        return ResponseEntity.ok()
                .body(usuarioService.criarUsuario(request));
    }

    @PostMapping("autenticar")
    public ResponseEntity<?> autenticar
            (@RequestBody AutenticarUsuarioRequest request) {
        return ResponseEntity.ok()
                .body(usuarioService.autenticarUsuario(request));
    }

}
