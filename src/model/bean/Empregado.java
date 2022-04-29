/**
 * @author Garcia
 */
package model.bean;

public class Empregado {

    private int id;
    private String Empregado;
    private String CPF;
    private String cargo;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Empregado
     */
    public String getEmpregado() {
        return Empregado;
    }

    /**
     * @param Empregado the Empregado to set
     */
    public void setEmpregado(String Empregado) {
        this.Empregado = Empregado;
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
