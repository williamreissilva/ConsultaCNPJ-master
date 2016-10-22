package br.usjt.arqdsis.consultacnpj;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by elcio on 06/10/16.
 * https://www.receitaws.com.br/api
 * https://www.receitaws.com.br/v1/cnpj/[cnpj]
 */

public class ConsultaCNPJ implements Serializable {

    @SerializedName("data_situacao")
    private String dataSituacao;
    @SerializedName("motivo_situacao")
    private String motivoSituacao;
    @SerializedName("tipo")
    private String tipo;
    @SerializedName("nome")
    private String nome;
    @SerializedName("telefone")
    private String telefone;
    @SerializedName("situacao")
    private String situacao;
    @SerializedName("abertura")
    private String abertura;
    @SerializedName("natureza_juridica")
    private String naturezaZuridica;
    @SerializedName("cnpj")
    private String cnpj;
    @SerializedName("ultima_atualizacao")
    private String ultimaAtualizacao;
    @SerializedName("status")
    private String status;
    @SerializedName("fantasia")
    private String fantasia;
    @SerializedName("logradouro")
    private String logradouro;
    @SerializedName("numero")
    private String numero;
    @SerializedName("complemento")
    private String complemento;
    @SerializedName("cep")
    private String cep;
    @SerializedName("bairro")
    private String bairro;
    @SerializedName("municipio")
    private String municipio;
    @SerializedName("uf")
    private String uf;
    @SerializedName("email")
    private String email;
    @SerializedName("efr")
    private String efr;
    @SerializedName("situacao_especial")
    private String situacaoEspecial;
    @SerializedName("data_situacao_especial")
    private String dataSituacaoEspecial;
    @SerializedName("atividade_principal")
    private List<Atividade> atividadePrincipal;
    @SerializedName("atividades_secundarias")
    private List<Atividade> atividadesSecundarias;

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public String getMotivoSituacao() {
        return motivoSituacao;
    }

    public void setMotivoSituacao(String motivoSituacao) {
        this.motivoSituacao = motivoSituacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNaturezaZuridica() {
        return naturezaZuridica;
    }

    public void setNaturezaZuridica(String naturezaZuridica) {
        this.naturezaZuridica = naturezaZuridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public String getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }

    public List<Atividade> getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(List<Atividade> atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public List<Atividade> getAtividadesSecundarias() {
        return atividadesSecundarias;
    }

    public void setAtividadesSecundarias(List<Atividade> atividadesSecundarias) {
        this.atividadesSecundarias = atividadesSecundarias;
    }


    @Override
    public String toString() {
        return "ConsultaCNPJ" + "\n\n" +
                "Data Situacao: " + dataSituacao + "\n" +
                "Motivo Situacao: " + motivoSituacao + "\n" +
                "Tipo: " + tipo + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Situacao: " + situacao + "\n" +
                "Abertura: " + abertura + "\n" +
                "NaturezaZuridica: " + naturezaZuridica + "\n" +
                "Cnpj: " + cnpj + '\'' +
                "UltimaAtualizacao: " + ultimaAtualizacao + "\n" +
                "Status: " + status + "\n" +
                "Fantasia: " + fantasia + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Número: " + numero + '\'' +
                "Complemento: " + complemento + "\n" +
                "Cep: " + cep + "\n" +
                "Bairro: " + bairro + "\n" +
                "Municipio: " + municipio + "\n" +
                "Uf: " + uf + "\n" +
                "Email: " + email + "\n" +
                "Efr: " + efr + "\n" +
                "SituacaoEspecial: " + situacaoEspecial + "\n" +
                "DataSituacaoEspecial: " + dataSituacaoEspecial + "\n";
    }
}




