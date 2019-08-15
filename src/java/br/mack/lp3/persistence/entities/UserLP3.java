package br.mack.lp3.persistence.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 41526740
 */
@Entity
//@Table(name= "lp3_userlp3")
public class UserLP3 implements Serializable {
    
    private String name, email,senha, endereco;
    long telefone;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chavinha")
    private long id_userlp3;
    
    public UserLP3() {
    }

    public UserLP3(String name, String email, long id_userlp3, String senha) {
        this.name = name;
        this.email = email;
        this.id_userlp3 = id_userlp3;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId_userlp3() {
        return id_userlp3;
    }

    public void setId_userlp3(long id_userlp3) {
        this.id_userlp3 = id_userlp3;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "UserLP3{" + "name=" + name + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + ", telefone=" + telefone + ", id_userlp3=" + id_userlp3 + '}';
    }
    
    
}