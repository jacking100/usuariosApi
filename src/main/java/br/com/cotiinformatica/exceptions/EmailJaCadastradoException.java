package br.com.cotiinformatica.exceptions;

public class EmailJaCadastradoException extends RuntimeException {


  @Override
  public String getMessage() {
    return "O email informado já cadastrado. Tente outro";
  }
}

