package View;

import Model.Autenticacao;
import Model.AutenticacaoHashMap;
import Model.InterfaceUsuario;

public class AutenticacaoTerminal {
    public static void main(String[] args) {
        Autenticacao autenticacao = new AutenticacaoHashMap();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(autenticacao);
        interfaceUsuario.exibirMenu();
    }
}
