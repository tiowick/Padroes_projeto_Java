package Facade;

import Subsistema_Cep.Cep_Api;
import Subsistema_Crm.Crm_Service;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = Cep_Api.getInstancia().recuperarCidade(cep);
        String estado = Cep_Api.getInstancia().recuperarEstado(cep);


        Crm_Service.gravarCliente(nome, cep, cidade, estado);

    }
}
