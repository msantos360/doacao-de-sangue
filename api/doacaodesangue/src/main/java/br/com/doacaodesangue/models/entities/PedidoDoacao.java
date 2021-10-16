package br.com.doacaodesangue.models.entities;

import br.com.doacaodesangue.models.dtos.PedidoDoacaoDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PedidoDoacao {

    @Id
    public Long id;
    public String nome;
    public String sexo;
    public String tipoSanguineo;
    public String cep;
    public String rua;
    public String numero;
    public String bairro;
    public String complemento;
    public String uf;
    public String cidade;

    public PedidoDoacao(PedidoDoacaoDto pedidoDoacaoDto) {
        this.nome = pedidoDoacaoDto.getNome();
        this.sexo = pedidoDoacaoDto.getSexo();
        this.tipoSanguineo = pedidoDoacaoDto.getTipoSanguineo();
        this.cep = pedidoDoacaoDto.getCep();
        this.rua = pedidoDoacaoDto.getRua();
        this.numero = pedidoDoacaoDto.getNumero();
        this.bairro = pedidoDoacaoDto.getBairro();
        this.complemento = pedidoDoacaoDto.getComplemento();
        this.uf = pedidoDoacaoDto.getUf();
        this.cidade = pedidoDoacaoDto.getCidade();
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return sexo;
    }

    public void setCpf(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
