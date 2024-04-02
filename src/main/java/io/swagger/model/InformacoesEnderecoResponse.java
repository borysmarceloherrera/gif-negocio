package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InformacoesEstabelecimentoResponseEndereco;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InformacoesEnderecoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class InformacoesEnderecoResponse   {
  @JsonProperty("tipoEndereco")
  private String tipoEndereco = null;

  @JsonProperty("endereco")
  private InformacoesEstabelecimentoResponseEndereco endereco = null;

  public InformacoesEnderecoResponse tipoEndereco(String tipoEndereco) {
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

  public InformacoesEnderecoResponse endereco(InformacoesEstabelecimentoResponseEndereco endereco) {
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
    InformacoesEnderecoResponse informacoesEnderecoResponse = (InformacoesEnderecoResponse) o;
    return Objects.equals(this.tipoEndereco, informacoesEnderecoResponse.tipoEndereco) &&
        Objects.equals(this.endereco, informacoesEnderecoResponse.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoEndereco, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacoesEnderecoResponse {\n");
    
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
