package br.com.fiap.produto.model;

import br.com.fiap.produto.dto.DtoCadastro;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private String codigoBarras;

    @Column
    private Double valorCompra;

    @Column
    private Double valorVenda;

    @Column
    private LocalDate dataFabricacao;

    @Column
    private LocalDate validade;

    @Column
    private Double altura;

    @Column
    private Double largura;

    @Column
    private Double profundidade;

    @Column
    private Double pesoGramas;

    @Column
    private Double volume;

    @Column
    private Integer quantidade;

    public Produto(DtoCadastro dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.codigoBarras = dados.codigoBarras();
        this.valorCompra = dados.valorCompra();
        this.valorVenda = dados.valorVenda();
        this.dataFabricacao = dados.dataFabricacao();
        this.validade = dados.validade();
        this.altura = dados.altura();
        this.largura = dados.largura();
        this.profundidade = dados.profundidade();
        this.pesoGramas = dados.pesoGramas();
        this.volume = dados.volume();
        this.quantidade = dados.quantidade();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(codigoBarras, produto.codigoBarras) && Objects.equals(valorCompra, produto.valorCompra) && Objects.equals(valorVenda, produto.valorVenda) && Objects.equals(dataFabricacao, produto.dataFabricacao) && Objects.equals(validade, produto.validade) && Objects.equals(altura, produto.altura) && Objects.equals(largura, produto.largura) && Objects.equals(profundidade, produto.profundidade) && Objects.equals(pesoGramas, produto.pesoGramas) && Objects.equals(volume, produto.volume) && Objects.equals(quantidade, produto.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, codigoBarras, valorCompra, valorVenda, dataFabricacao, validade, altura, largura, profundidade, pesoGramas, volume, quantidade);
    }
}
