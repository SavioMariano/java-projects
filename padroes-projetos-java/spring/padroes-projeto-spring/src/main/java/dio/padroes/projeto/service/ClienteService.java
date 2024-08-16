package dio.padroes.projeto.service;

import org.springframework.stereotype.Service;

import dio.padroes.projeto.model.Cliente;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
