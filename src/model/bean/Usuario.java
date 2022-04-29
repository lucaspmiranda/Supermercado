/**
 * @author Garcia
 */
package model.bean;

public class Usuario {

    private int Id;
    private String Login;
    private String Senha;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        this.Senha = Senha;
    }

}
