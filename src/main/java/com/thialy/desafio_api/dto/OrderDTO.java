package com.thialy.desafio_api.dto;

public class OrderDTO {
        private Integer numeroControle;
        private String nome;
        private Double valor_un;
        private Integer quantidade;
        private Integer codigoCliente;


        public Integer getNumeroControle() {
            return numeroControle;
        }
        public void setNumeroControle(Integer numeroControle) {
            this.numeroControle = numeroControle;
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
        public void setValor_un(Double valor_un) {
            this.valor_un = valor_un;
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

        
    }

