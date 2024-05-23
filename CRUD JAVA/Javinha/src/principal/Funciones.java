package principal;

import Conexao.Conexao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Funciones {
    
    private static Conexao conexao = new Conexao(); 
    private static Connection connection = conexao.getConexao(); 
    private static PreparedStatement ps = null;
    
    public static boolean isRegister(Sentencias s) {
        String sql = Sentencias.REGISTRAR;
        try {
            ps = connection.prepareStatement(sql); 
            ps.setString(1, s.getNome());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getIdade());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
            return false;
        }
    }
    
    public static boolean isUpdate(Sentencias s) {
        String sql = Sentencias.ATUALIZAR;
        try {
            ps = connection.prepareStatement(sql); 
            ps.setString(1, s.getNome());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getIdade());
            ps.setString(4, s.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
            return false;
        }
    }
    
    public static boolean isDelete(Sentencias s) {
        String sql = Sentencias.ELIMINAR;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
            return false;
        }
    }
    
    public static boolean isTruncate() {
        String sql = Sentencias.ELIMINAR_TODOS;
        try {
            ps = connection.prepareStatement(sql); 
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
            return false;
        }
    }
    
    public static void setListar(String buscar) {
        DefaultTableModel modelo = (DefaultTableModel) Crud.tabla.getModel();
        
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        String sql = "";
        
        if (buscar.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM usuarios WHERE ("
                    + "Nome LIKE'%" + buscar + "%' OR "
                    + "Email LIKE'%" + buscar + "%' OR "
                    + "Idade LIKE'%" + buscar + "%'"
                    + ")";
        }
        
        String datos[] = new String[4];
        try {
            Statement st = connection.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("Nome");
                datos[2] = rs.getString("Email");
                datos[3] = rs.getString("Idade");
                modelo.addRow(datos);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public static String extraerIDMAX() {
        String sql = "SELECT MAX(id) FROM usuarios";
        int id = 0;
        try {
            Statement st = connection.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                id = rs.getInt(1);
            }
            
            if (id == 0) {
                id = 1;
            } else {
                id = id + 1;
            }
            
            return String.valueOf(id);
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex); 
            return null;
        }
    }
}
