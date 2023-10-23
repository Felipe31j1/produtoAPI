package br.com.fiap.produto.dto;

import javax.validation.constraints.*;
import java.time.LocalDate;

public record DtoCadastro (
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        String codigoBarras,
        @NotNull @Positive
        Double valorCompra,
        @NotNull @Positive
        Double valorVenda,
        @NotNull
        LocalDate dataFabricacao,
        @NotNull
        LocalDate validade,
        @NotNull @Positive
        Double altura,
        @NotNull @Positive
        Double largura,
        @NotNull @Positive
        Double profundidade,
        @NotNull @Positive
        Double pesoGramas,
        @NotNull @Positive
        Double volume,
        @NotNull @Min(0)
        Integer quantidade){
}
