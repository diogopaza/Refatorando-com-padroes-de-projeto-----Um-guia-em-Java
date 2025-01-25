package org.example.baixarregistro;

public class ClienteFtp {

    private String host;
    private String porta;

    public ClienteFtp(String host, String porta) {
        this.host = host;
        this.porta = porta;
    }

    public void login(String usuario, String senha) {
        System.out.println("""
               Logando ao FTP com usuario %s e senha %s
                """.formatted(usuario, senha));
    }

    public ArquivoFtp buscarArquivo(String caminhoArquivo) {
        ArquivoFtp arquivoFtp = new ArquivoFtp(caminhoArquivo);
        return arquivoFtp;
    }
}
