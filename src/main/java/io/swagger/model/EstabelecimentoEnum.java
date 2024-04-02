package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EstabelecimentoEnum
 */
public enum EstabelecimentoEnum {
  INSTALA_O("Em Instalação"),
    FUNCIONAMENTO("Em Funcionamento");

  private String value;

  EstabelecimentoEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EstabelecimentoEnum fromValue(String text) {
    for (EstabelecimentoEnum b : EstabelecimentoEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
