package org.example.extrairmetodo.service;


import org.example.extrairmetodo.model.Usuario;

public class Email {
    public void notificarViaEmail(Usuario u) {
        try {
            System.out.println("Enviando ao email == " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Usuario desativado: " + u.getNome());
        } catch (RuntimeException | InterruptedException ex) {
            throw new RuntimeException("Erro ao enviar email");
        }
    }
}
