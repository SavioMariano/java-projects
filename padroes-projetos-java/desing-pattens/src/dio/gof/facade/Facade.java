package dio.gof.facade;

import dio.gof.subsistema1.crm.CrmService;
import dio.gof.subsistema2.cep.CepAPI;

/**
 * Facade
 */
public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
            
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}