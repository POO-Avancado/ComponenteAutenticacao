package Model;

import java.util.HashMap;

public class Autenticacao {
    private HashMap<String, String> usuarios;

    public Autenticacao() {
        usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String nomeUsuario, String senha) {
        if (usuarios.containsKey(nomeUsuario)) {
            System.out.println("Este nome de usuário já está em uso.");
            return;
        }

        usuarios.put(nomeUsuario, senha);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    public boolean autenticarUsuario(String nomeUsuario, String senha) {
        if (usuarios.containsKey(nomeUsuario) && usuarios.get(nomeUsuario).equals(senha)) {
            return true;
        }
        return false;
    }

}
