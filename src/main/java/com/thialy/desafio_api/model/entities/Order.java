package com.thialy.desafio_api.model.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_order") // Adiciona a anotação @Table para renomear a tabela
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_controle", unique = true) // Adicionando a restrição de unicidade
    private String numeroControle;
    private Date dataCadastro;

    @Column(name = "nome_produto")
    private String nome;
    private Double valor_un;
    private Double valor_total;
    private Double valor_desconto;
    private Integer quantidade;
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
