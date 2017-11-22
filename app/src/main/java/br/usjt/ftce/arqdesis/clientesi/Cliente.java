package br.usjt.ftce.arqdesis.clientesi;

import java.io.Serializable;

/**
 * Created by asbonato on 9/18/16.
 */
public class Cliente implements Serializable, Comparable<Cliente> {
    private int id;
    private String nome;
    private String fone;
    private String email;

    public Cliente(int id, String nome, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente c) {
        return this.nome.compareTo(c.getNome());
    }

    public String getFoto() {
        String foto = email.replace('@', '_');
        return foto.replace('.', '_');
    }
}
