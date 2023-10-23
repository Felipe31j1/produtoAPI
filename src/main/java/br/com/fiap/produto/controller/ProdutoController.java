package br.com.fiap.produto.controller;

import br.com.fiap.produto.dto.DtoCadastro;
import br.com.fiap.produto.service.ProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    private static final Logger logger = LoggerFactory.getLogger(ProdutoController.class);


    @PostMapping("/cadastrar")
    public ResponseEntity cadastrar(@Valid @RequestBody DtoCadastro dados){
        try {
            service.salvar(dados);
            logger.info("Produto salvo com sucesso!");
            return ResponseEntity.status(HttpStatus.CREATED).body(dados);
        }
        catch (Exception e){
            logger.error(e.getMessage(), e);
            String retorno = "Erro ao salvar produto: " + e.getMessage();
            return ResponseEntity.internalServerError().body(retorno);
        }
    }

    @PutMapping("/editar")
    public ResponseEntity editar(){

        return ResponseEntity.ok().build();
    }

    @GetMapping("/exibir")
    public ResponseEntity exibir(){

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/remover")
    public ResponseEntity<String> remover(@RequestBody Long id) {
        try {
            service.remover(id);
            logger.info("Produto removido com sucesso!");
            return ResponseEntity.ok("Produto removido com sucesso");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            String retorno = "Erro ao remover produto: " + e.getMessage();
            return ResponseEntity.internalServerError().body(retorno);
        }
    }

}
