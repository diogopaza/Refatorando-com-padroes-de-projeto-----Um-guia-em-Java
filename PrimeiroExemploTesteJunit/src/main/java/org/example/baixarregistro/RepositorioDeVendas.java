package org.example.baixarregistro;

public class RepositorioDeVendas {

    public void salvarDeArquivo(ArquivoFtp ftp) {
        System.out.println("Salvando arquivo: " + ftp.getCaminhoarquivo());
    }
}
