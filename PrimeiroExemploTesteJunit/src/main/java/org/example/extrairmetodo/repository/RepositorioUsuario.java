package org.example.extrairmetodo.repository;

import org.example.extrairmetodo.model.Usuario;
import org.example.extrairmetodo.service.Email;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioUsuario {

    public List<Usuario> all(){
        List<Usuario> usuarios = new ArrayList<>();
        var usuario = new Usuario("Beto",true, LocalDate.of(2020, 2, 10));
        var usuario1 = new Usuario("Luiz",true,LocalDate.of(2023, 2, 10));
        var usuario2 = new Usuario("Alberto",true,LocalDate.of(2021, 6, 30));
        var usuario3 = new Usuario("Romario",true,LocalDate.of(2025, 1, 10));
        var usuario4 = new Usuario("Bebeto",false,LocalDate.of(2025, 1, 10));
        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    public void desativarUsuariosBefore(int year, int month,int day) {
        System.out.println("Desativando usuarios");
        Email email = new Email();
        var usuarios = this.listarUsuariosUltimoLoginBefore(LocalDate.of(year, month, day));
        usuarios.stream()
                .forEach(usuario -> {
                    this.desativar(usuario);
                    email.notificarViaEmail(usuario);
                });
    }

    public List<Usuario> listarUsuariosUltimoLoginBefore(LocalDate date) {
        System.out.println("Listando por último login ");
        List<Usuario> usuarios = this.all().stream()
                .filter(usuario -> usuario.getUltimoLogin().isBefore(date)
                        && usuario.getEstaAtivo().equals(true))
                .collect(Collectors.toList());
        return usuarios;
    }

    public void desativar(Usuario u) {
        u.setEstaAtivo(false);
    }
}
