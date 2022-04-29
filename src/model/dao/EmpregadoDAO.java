/**
 * @author Garcia
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Empregado;

public class EmpregadoDAO {

    public void create(Empregado e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO empregado (empregado,CPF,cargo)VALUES(?,?,?)");
            stmt.setString(1, e.getEmpregado());
            stmt.setString(2, e.getCPF());
            stmt.setString(3, e.getCargo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Empregado> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Empregado> empregados = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM empregado");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Empregado empregado = new Empregado();
                empregado.setId(rs.getInt("id"));
                empregado.setEmpregado(rs.getString("empregado"));
                empregado.setCPF(rs.getString("CPF"));
                empregado.setCargo(rs.getString("cargo"));
                empregados.add(empregado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpregadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return empregados;
    }

    public List<Empregado> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Empregado> empregados = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM empregado WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Empregado empregado = new Empregado();
                empregado.setId(rs.getInt("id"));
                empregado.setEmpregado(rs.getString("empregado"));
                empregado.setCPF(rs.getString("CPF"));
                empregado.setCargo(rs.getString("cargo"));
                empregados.add(empregado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpregadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return empregados;
    }

    public void update(Empregado e) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE empregado SET empregado = ? ,CPF = ?,cargo = ? WHERE id= ?");
            stmt.setString(1, e.getEmpregado());
            stmt.setString(2, e.getCPF());
            stmt.setString(3, e.getCargo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Empregado e) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM empregado WHERE id= ?");
            stmt.setInt(1, e.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
