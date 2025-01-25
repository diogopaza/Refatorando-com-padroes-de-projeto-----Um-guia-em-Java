package org.example.extrairmetodo.service;
import org.example.extrairmetodo.repository.RepositorioUsuario;



public class DesativarUsuariosWorker {

    //EXTRAIR METODO
    //metodo desativarUsuarios se chama assim mas faz muito amis doque isso
    public void desativarUsuarios(int year, int month,int day) {
        RepositorioUsuario repositorio = new RepositorioUsuario();
        repositorio.desativarUsuariosBefore(year, month, day);
    }
}
