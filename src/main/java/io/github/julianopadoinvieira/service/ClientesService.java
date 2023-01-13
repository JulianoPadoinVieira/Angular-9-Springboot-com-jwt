package io.github.julianopadoinvieira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.julianopadoinvieira.model.ClienteModel;
import io.github.julianopadoinvieira.repository.ClientesRepository;


@Service
public class ClientesService {

  private ClientesRepository repository;

  @Autowired
  public ClientesService( ClientesRepository repository) {
    this.repository = repository;

  }
  

  public void salvarCliente(ClienteModel clienteModel){
    validarCliente(clienteModel);
    this.repository.persistir(clienteModel);
  }

  public void validarCliente(ClienteModel clienteModel){
    
  }

}
