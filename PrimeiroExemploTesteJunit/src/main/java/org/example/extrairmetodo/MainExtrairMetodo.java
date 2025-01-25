package org.example.extrairmetodo;

import org.example.extrairmetodo.service.DesativarUsuariosWorker;

public class MainExtrairMetodo {
    public static void main(String[] args) {
        DesativarUsuariosWorker desativarUsuariosWorker = new DesativarUsuariosWorker();
        desativarUsuariosWorker.desativarUsuarios(2024, 01, 30);

    }
}
