package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InformacoesEstabelecimentoResponseEndereco
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class InformacoesEstabelecimentoResponseEndereco   {
  @JsonProperty("rua")
  private String rua = null;

  @JsonProperty("bairro")
  private String bairro = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("complemento")
  private String complemento = null;

  @JsonProperty("cep")
  private String cep = null;

  @JsonProperty("cidade")
  private String cidade = null;

  @JsonProperty("estado")
  private String estado = null;

  public InformacoesEstabelecimentoResponseEndereco rua(String rua) {
    this.rua = rua;
    return this;
  }

  /**
   * Get rua
   * @return rua
   **/
  @Schema(description = "")
  
    public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public InformacoesEstabelecimentoResponseEndereco bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  /**
   * Get bairro
   * @return bairro
   **/
  @Schema(description = "")
  
    public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public InformacoesEstabelecimentoResponseEndereco numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   **/
  @Schema(description = "")
  
    public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public InformacoesEstabelecimentoResponseEndereco complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

  /**
   * Get complemento
   * @return complemento
   **/
  @Schema(description = "")
  
    public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public InformacoesEstabelecimentoResponseEndereco cep(String cep) {
    this.cep = cep;
    return this;
  }

  /**
   * Get cep
   * @return cep
   **/
  @Schema(description = "")
  
    public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public InformacoesEstabelecimentoResponseEndereco cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  /**
   * Get cidade
   * @return cidade
   **/
  @Schema(description = "")
  
    public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public InformacoesEstabelecimentoResponseEndereco estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   **/
  @Schema(description = "")
  
    public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacoesEstabelecimentoResponseEndereco informacoesEstabelecimentoResponseEndereco = (InformacoesEstabelecimentoResponseEndereco) o;
    return Objects.equals(this.rua, informacoesEstabelecimentoResponseEndereco.rua) &&
        Objects.equals(this.bairro, informacoesEstabelecimentoResponseEndereco.bairro) &&
        Objects.equals(this.numero, informacoesEstabelecimentoResponseEndereco.numero) &&
        Objects.equals(this.complemento, informacoesEstabelecimentoResponseEndereco.complemento) &&
        Objects.equals(this.cep, informacoesEstabelecimentoResponseEndereco.cep) &&
        Objects.equals(this.cidade, informacoesEstabelecimentoResponseEndereco.cidade) &&
        Objects.equals(this.estado, informacoesEstabelecimentoResponseEndereco.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rua, bairro, numero, complemento, cep, cidade, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacoesEstabelecimentoResponseEndereco {\n");
    
    sb.append("    rua: ").append(toIndentedString(rua)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
