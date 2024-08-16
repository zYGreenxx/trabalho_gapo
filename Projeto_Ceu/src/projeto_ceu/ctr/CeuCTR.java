package projeto_ceu.ctr;

import java.sql.ResultSet;
import projeto_ceu.dto.CeuDTO;
import projeto_ceu.dao.CeuDAO;

public class CeuCTR {
    CeuDAO clienteDAO = new CeuDAO();
    
    public CeuCTR(){
    }
    
    public String inserirCliente(CeuDTO clienteDTO){
        try{
            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente cadastrado com sucesso!!!";
            }else{
                return "Cliente NÃO cadastrado!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO cadastrado!!!";
        }
    }
}
