package br.com.cotiinformatica.controllers;

import br.com.cotiinformatica.dtos.requests.AutenticarUsuarioRequest;
import br.com.cotiinformatica.dtos.requests.CriarUsuarioRequest;
import br.com.cotiinformatica.exceptions.AcessoNegadoException;
import br.com.cotiinformatica.exceptions.EmailJaCadastradoException;
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

        try {
            return ResponseEntity.status(201)
                    .body(usuarioService.criarUsuario(request));
        }
        catch (EmailJaCadastradoException e) {

            return ResponseEntity.status(409).body(e.getMessage());
        }
        catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @PostMapping("autenticar")
    public ResponseEntity<?> autenticar
            (@RequestBody AutenticarUsuarioRequest request) {

        try{

            return ResponseEntity.ok()
                    .body(usuarioService.autenticarUsuario(request));

        }
        catch(AcessoNegadoException e){

            return ResponseEntity.status(401).body(e.getMessage());

        } catch (Exception e) {

            return ResponseEntity.status(500).body(e.getMessage());
        }

    }

}
