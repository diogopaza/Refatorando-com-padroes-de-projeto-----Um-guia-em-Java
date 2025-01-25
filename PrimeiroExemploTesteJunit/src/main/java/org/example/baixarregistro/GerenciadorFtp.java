package org.example.baixarregistro;

public class GerenciadorFtp {

    private String host = "ftp.com.br";
    private String porta = "2222";
    private String usuario = "beto";
    private String senha = "123";


    public ArquivoFtp requisitarFtp(String caminhoArquivo)  {
        ClienteFtp cliente = new ClienteFtp(host, porta);
        cliente.login(usuario, senha);
        return cliente.buscarArquivo(caminhoArquivo);
    }
}
