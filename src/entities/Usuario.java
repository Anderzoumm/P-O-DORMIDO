package entities;

import java.util.Objects;
import java.util.UUID;

public class Usuario {
    private String Name,email,phone;
    private String senha;

    public Usuario(String name, String email, String phone, String senha) {
        Name = name;
        this.email = email;
        this.phone = phone;
        this.senha = senha;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void AtualizarPerfil(String name,String phone,String email){
        setEmail(email);
        setName(name);
        setPhone(phone);
    }

    public void Login(String email,String Senha){};
}
