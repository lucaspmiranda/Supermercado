/**
 * @author Garcia
 */
package model.bean;

public class Cliente {

    private int idclientes;
    private String nome;
    private String CPF;
    private String Data_nasc;

    /**
     * @return the idclientes
     */
    public int getIdclientes() {
        return idclientes;
    }

    /**
     * @param idclientes the idclientes to set
     */
    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Data_nasc
     */
    public String getData_nasc() {
        return Data_nasc;
    }

    /**
     * @param Data_nasc the Data_nasc to set
     */
    public void setData_nasc(String Data_nasc) {
        this.Data_nasc = Data_nasc;
    }
}
