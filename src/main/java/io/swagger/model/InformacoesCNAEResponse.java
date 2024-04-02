package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InformacoesCNAEResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class InformacoesCNAEResponse   {
  @JsonProperty("codigoCNAE")
  private String codigoCNAE = null;

  @JsonProperty("descricao")
  private String descricao = null;

  public InformacoesCNAEResponse codigoCNAE(String codigoCNAE) {
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

  public InformacoesCNAEResponse descricao(String descricao) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacoesCNAEResponse informacoesCNAEResponse = (InformacoesCNAEResponse) o;
    return Objects.equals(this.codigoCNAE, informacoesCNAEResponse.codigoCNAE) &&
        Objects.equals(this.descricao, informacoesCNAEResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoCNAE, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacoesCNAEResponse {\n");
    
    sb.append("    codigoCNAE: ").append(toIndentedString(codigoCNAE)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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
