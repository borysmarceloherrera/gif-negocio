package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InformacoesEstabelecimentoResponseEndereco;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InformacoesEstabelecimentoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class InformacoesEstabelecimentoResponse   {
  @JsonProperty("tipoIdentificacao")
  private String tipoIdentificacao = null;

  @JsonProperty("numeroDocumentoIdentificacao")
  private String numeroDocumentoIdentificacao = null;

  @JsonProperty("nomeRazaoSocial")
  private String nomeRazaoSocial = null;

  @JsonProperty("inscricaoEstadual")
  private String inscricaoEstadual = null;

  @JsonProperty("juntaComercial")
  private String juntaComercial = null;

  @JsonProperty("dataInscricaoEstabelecimento")
  private LocalDate dataInscricaoEstabelecimento = null;

  @JsonProperty("cpfCnpj")
  private String cpfCnpj = null;

  @JsonProperty("participacaoCapitalSocial")
  private String participacaoCapitalSocial = null;

  @JsonProperty("qualificacao")
  private String qualificacao = null;

  @JsonProperty("codigoCNAE")
  private String codigoCNAE = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("tipoEndereco")
  private String tipoEndereco = null;

  @JsonProperty("endereco")
  private InformacoesEstabelecimentoResponseEndereco endereco = null;

  public InformacoesEstabelecimentoResponse tipoIdentificacao(String tipoIdentificacao) {
    this.tipoIdentificacao = tipoIdentificacao;
    return this;
  }

  /**
   * Get tipoIdentificacao
   * @return tipoIdentificacao
   **/
  @Schema(description = "")
  
    public String getTipoIdentificacao() {
    return tipoIdentificacao;
  }

  public void setTipoIdentificacao(String tipoIdentificacao) {
    this.tipoIdentificacao = tipoIdentificacao;
  }

  public InformacoesEstabelecimentoResponse numeroDocumentoIdentificacao(String numeroDocumentoIdentificacao) {
    this.numeroDocumentoIdentificacao = numeroDocumentoIdentificacao;
    return this;
  }

  /**
   * Get numeroDocumentoIdentificacao
   * @return numeroDocumentoIdentificacao
   **/
  @Schema(description = "")
  
    public String getNumeroDocumentoIdentificacao() {
    return numeroDocumentoIdentificacao;
  }

  public void setNumeroDocumentoIdentificacao(String numeroDocumentoIdentificacao) {
    this.numeroDocumentoIdentificacao = numeroDocumentoIdentificacao;
  }

  public InformacoesEstabelecimentoResponse nomeRazaoSocial(String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
    return this;
  }

  /**
   * Get nomeRazaoSocial
   * @return nomeRazaoSocial
   **/
  @Schema(description = "")
  
    public String getNomeRazaoSocial() {
    return nomeRazaoSocial;
  }

  public void setNomeRazaoSocial(String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
  }

  public InformacoesEstabelecimentoResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }

  /**
   * Get inscricaoEstadual
   * @return inscricaoEstadual
   **/
  @Schema(description = "")
  
    public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public InformacoesEstabelecimentoResponse juntaComercial(String juntaComercial) {
    this.juntaComercial = juntaComercial;
    return this;
  }

  /**
   * Get juntaComercial
   * @return juntaComercial
   **/
  @Schema(description = "")
  
    public String getJuntaComercial() {
    return juntaComercial;
  }

  public void setJuntaComercial(String juntaComercial) {
    this.juntaComercial = juntaComercial;
  }

  public InformacoesEstabelecimentoResponse dataInscricaoEstabelecimento(LocalDate dataInscricaoEstabelecimento) {
    this.dataInscricaoEstabelecimento = dataInscricaoEstabelecimento;
    return this;
  }

  /**
   * Get dataInscricaoEstabelecimento
   * @return dataInscricaoEstabelecimento
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getDataInscricaoEstabelecimento() {
    return dataInscricaoEstabelecimento;
  }

  public void setDataInscricaoEstabelecimento(LocalDate dataInscricaoEstabelecimento) {
    this.dataInscricaoEstabelecimento = dataInscricaoEstabelecimento;
  }

  public InformacoesEstabelecimentoResponse cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

  /**
   * Get cpfCnpj
   * @return cpfCnpj
   **/
  @Schema(description = "")
  
    public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public InformacoesEstabelecimentoResponse participacaoCapitalSocial(String participacaoCapitalSocial) {
    this.participacaoCapitalSocial = participacaoCapitalSocial;
    return this;
  }

  /**
   * Get participacaoCapitalSocial
   * @return participacaoCapitalSocial
   **/
  @Schema(description = "")
  
    public String getParticipacaoCapitalSocial() {
    return participacaoCapitalSocial;
  }

  public void setParticipacaoCapitalSocial(String participacaoCapitalSocial) {
    this.participacaoCapitalSocial = participacaoCapitalSocial;
  }

  public InformacoesEstabelecimentoResponse qualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
    return this;
  }

  /**
   * Get qualificacao
   * @return qualificacao
   **/
  @Schema(description = "")
  
    public String getQualificacao() {
    return qualificacao;
  }

  public void setQualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
  }

  public InformacoesEstabelecimentoResponse codigoCNAE(String codigoCNAE) {
    this.codigoCNAE = codigoCNAE;
    return this;
  }

  /**
   * Get codigoCNAE
   * @return codigoCNAE
   **/
  @Schema(description = "")
  
    public String getCodigoCNAE() {
    return codigoCNAE;
  }

  public void setCodigoCNAE(String codigoCNAE) {
    this.codigoCNAE = codigoCNAE;
  }

  public InformacoesEstabelecimentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
   **/
  @Schema(description = "")
  
    public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public InformacoesEstabelecimentoResponse tipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
    return this;
  }

  /**
   * Get tipoEndereco
   * @return tipoEndereco
   **/
  @Schema(description = "")
  
    public String getTipoEndereco() {
    return tipoEndereco;
  }

  public void setTipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
  }

  public InformacoesEstabelecimentoResponse endereco(InformacoesEstabelecimentoResponseEndereco endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
   **/
  @Schema(description = "")
  
    @Valid
    public InformacoesEstabelecimentoResponseEndereco getEndereco() {
    return endereco;
  }

  public void setEndereco(InformacoesEstabelecimentoResponseEndereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacoesEstabelecimentoResponse informacoesEstabelecimentoResponse = (InformacoesEstabelecimentoResponse) o;
    return Objects.equals(this.tipoIdentificacao, informacoesEstabelecimentoResponse.tipoIdentificacao) &&
        Objects.equals(this.numeroDocumentoIdentificacao, informacoesEstabelecimentoResponse.numeroDocumentoIdentificacao) &&
        Objects.equals(this.nomeRazaoSocial, informacoesEstabelecimentoResponse.nomeRazaoSocial) &&
        Objects.equals(this.inscricaoEstadual, informacoesEstabelecimentoResponse.inscricaoEstadual) &&
        Objects.equals(this.juntaComercial, informacoesEstabelecimentoResponse.juntaComercial) &&
        Objects.equals(this.dataInscricaoEstabelecimento, informacoesEstabelecimentoResponse.dataInscricaoEstabelecimento) &&
        Objects.equals(this.cpfCnpj, informacoesEstabelecimentoResponse.cpfCnpj) &&
        Objects.equals(this.participacaoCapitalSocial, informacoesEstabelecimentoResponse.participacaoCapitalSocial) &&
        Objects.equals(this.qualificacao, informacoesEstabelecimentoResponse.qualificacao) &&
        Objects.equals(this.codigoCNAE, informacoesEstabelecimentoResponse.codigoCNAE) &&
        Objects.equals(this.descricao, informacoesEstabelecimentoResponse.descricao) &&
        Objects.equals(this.tipoEndereco, informacoesEstabelecimentoResponse.tipoEndereco) &&
        Objects.equals(this.endereco, informacoesEstabelecimentoResponse.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoIdentificacao, numeroDocumentoIdentificacao, nomeRazaoSocial, inscricaoEstadual, juntaComercial, dataInscricaoEstabelecimento, cpfCnpj, participacaoCapitalSocial, qualificacao, codigoCNAE, descricao, tipoEndereco, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacoesEstabelecimentoResponse {\n");
    
    sb.append("    tipoIdentificacao: ").append(toIndentedString(tipoIdentificacao)).append("\n");
    sb.append("    numeroDocumentoIdentificacao: ").append(toIndentedString(numeroDocumentoIdentificacao)).append("\n");
    sb.append("    nomeRazaoSocial: ").append(toIndentedString(nomeRazaoSocial)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    juntaComercial: ").append(toIndentedString(juntaComercial)).append("\n");
    sb.append("    dataInscricaoEstabelecimento: ").append(toIndentedString(dataInscricaoEstabelecimento)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    participacaoCapitalSocial: ").append(toIndentedString(participacaoCapitalSocial)).append("\n");
    sb.append("    qualificacao: ").append(toIndentedString(qualificacao)).append("\n");
    sb.append("    codigoCNAE: ").append(toIndentedString(codigoCNAE)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    tipoEndereco: ").append(toIndentedString(tipoEndereco)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
