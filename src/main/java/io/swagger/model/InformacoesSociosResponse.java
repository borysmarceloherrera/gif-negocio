package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InformacoesSociosResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class InformacoesSociosResponse   {
  @JsonProperty("nomeRazaoSocial")
  private String nomeRazaoSocial = null;

  @JsonProperty("cpfCnpj")
  private String cpfCnpj = null;

  @JsonProperty("participacaoCapitalSocial")
  private String participacaoCapitalSocial = null;

  @JsonProperty("qualificacao")
  private String qualificacao = null;

  public InformacoesSociosResponse nomeRazaoSocial(String nomeRazaoSocial) {
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

  public InformacoesSociosResponse cpfCnpj(String cpfCnpj) {
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

  public InformacoesSociosResponse participacaoCapitalSocial(String participacaoCapitalSocial) {
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

  public InformacoesSociosResponse qualificacao(String qualificacao) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacoesSociosResponse informacoesSociosResponse = (InformacoesSociosResponse) o;
    return Objects.equals(this.nomeRazaoSocial, informacoesSociosResponse.nomeRazaoSocial) &&
        Objects.equals(this.cpfCnpj, informacoesSociosResponse.cpfCnpj) &&
        Objects.equals(this.participacaoCapitalSocial, informacoesSociosResponse.participacaoCapitalSocial) &&
        Objects.equals(this.qualificacao, informacoesSociosResponse.qualificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeRazaoSocial, cpfCnpj, participacaoCapitalSocial, qualificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacoesSociosResponse {\n");
    
    sb.append("    nomeRazaoSocial: ").append(toIndentedString(nomeRazaoSocial)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    participacaoCapitalSocial: ").append(toIndentedString(participacaoCapitalSocial)).append("\n");
    sb.append("    qualificacao: ").append(toIndentedString(qualificacao)).append("\n");
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
