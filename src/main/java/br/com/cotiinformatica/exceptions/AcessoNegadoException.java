package br.com.cotiinformatica.exceptions;

public class AcessoNegadoException extends RuntimeException {

  @Override
  public String getMessage() {
    return "Acesso negado. Usuário inválido";
  }
}
