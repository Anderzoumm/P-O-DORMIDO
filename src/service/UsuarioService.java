package service;

import entities.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsuarioService {

    private  static List<Usuario> usuarios = new ArrayList<>();

    public void Cadastro(String Name,String Email,String Senha,String Phone){
        Usuario user = new Usuario(Name,Email,Phone,Senha);
        usuarios.add(user);
    }

    public Boolean login(String email, String senha) {
        for (Usuario x : usuarios) {
            if (Objects.equals(x.getEmail(), email) &&
                    Objects.equals(x.getSenha(), senha)) {
                return true;
            }
        }
        return false;
    }
}
