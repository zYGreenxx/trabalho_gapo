package projeto_ceu.dao;

import java.sql.*;
import projeto_ceu.dto.CeuDTO;

public class CeuDAO {
    public CeuDAO(){
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirCliente(CeuDTO clienteDTO){
        try{
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into cliente (nome_cli, datadenas_cli, localdenas_cli, regiao_cli, datamorte_cli, "
                    + "localmorte_cli, causamorte_cli, frequentouig_cli, estadocivil_cli, profissao_cli, espirito_cli, herdeiro_cli) values ( "
                    + "'" + clienteDTO.getNome_cli() + "', "
                    + "'" + clienteDTO.getDatadenas_cli() + "', "
                    + clienteDTO.getLocaldenas_cli() + ", "
                    + "'" + clienteDTO.getRegiao_cli() + "', "
                    + "'" + clienteDTO.getDatamorte_cli() + "', "
                    + "'" + clienteDTO.getLocalmorte_cli() + "', "
                    + "'" + clienteDTO.getCausamorte_cli() + "', "
                    + "'" + clienteDTO.getFrequentouig_cli() + "', "
                    + "'" + clienteDTO.getEstadocivil_cli() + "')";
                    + "'" + clienteDTO.getProfissao_cli() + "', "
                    + "'" + clienteDTO.getEspirito_cli() + "', "
                    + "'" + clienteDTO.getHerdeiro_cli() + "', ";
                   
            
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
}
