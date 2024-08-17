package dio.padroes.projeto.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.padroes.projeto.model.Cliente;
import dio.padroes.projeto.model.Endereco;
import dio.padroes.projeto.repository.ClienteReposiroty;
import dio.padroes.projeto.repository.EnderecoRepository;
import dio.padroes.projeto.service.ClienteService;
import dio.padroes.projeto.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteReposiroty clienteReposiroty;

    @Autowired 
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteReposiroty.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteReposiroty.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
    Optional<Cliente> verificarCliente = clienteReposiroty.findById(id);
    if (verificarCliente.isPresent()) {
        salvarClienteComCep(cliente);
    }
    
    }

    @Override
    public void deletar(Long id) {
        clienteReposiroty.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
        Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        
        cliente.setEndereco(endereco);
        clienteReposiroty.save(cliente);
    
        }
    
}
