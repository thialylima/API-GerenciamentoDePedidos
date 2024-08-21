package com.thialy.desafio_api.model.entities;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_order") 
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do pedido", example = "1", required = false)
    private Long id;

    @Column(name = "numero_controle", unique = true) // Adicionando a restrição de unicidade
    @Schema(description = "Número de controle do pedido", example = "001", required = true)
    private String numeroControle;

    @Column(name = "data_cadastro")
    @Schema(description = "Data de cadastro do pedido", example = "2024-08-07T14:32:39", required = false)
    private Date dataCadastro;

    @Column(name = "nome_produto")
    @Schema(description = "Nome do produto", example = "Pipoca", required = true)
    private String nome;

    @Schema(description = "Valor unitário do produto", example = "2.77", required = true)
    private Double valor_un;

    @Schema(description = "Valor total do pedido", example = "69.25", required = false)
    private Double valor_total;

    @Schema(description = "Valor do desconto aplicado", example = "62.33", required = false)
    private Double valor_desconto;

    @Schema(description = "Quantidade do produto", example = "25", required = true)
    private Integer quantidade;

    @Column(name = "codigo_cliente")
    @Schema(description = "Código do cliente", example = "1", required = true)
    private Integer codigoCliente;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumeroControle() {
        return numeroControle;
    }
    public void setNumeroControle(String numeroControle) {
        this.numeroControle = numeroControle;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor_un() {
        return valor_un;
    }
    public void setValor_un(Double valor) {
        this.valor_un = valor;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Integer getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public Double getValor_desconto() {
        return valor_desconto;
    }
    public void setValor_desconto(Double valor_desconto) {
        this.valor_desconto = valor_desconto;
    }
    public Double getValor_total() {
        return valor_total;
    }
    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }
    
}
