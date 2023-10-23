package br.com.fiap.produto.service;

import br.com.fiap.produto.dto.DtoCadastro;
import br.com.fiap.produto.model.Produto;
import br.com.fiap.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Transactional
    public DtoCadastro salvar(DtoCadastro dados){
        Produto produto = new Produto(dados);
        repository.save(produto);
        return dados;
    }
    
    @Transactional
    public void remover(Long id) {
    	repository.deleteById(id);
    }

}
