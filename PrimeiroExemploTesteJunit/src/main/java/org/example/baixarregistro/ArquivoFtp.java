package org.example.baixarregistro;

public class ArquivoFtp {

    private String caminhoarquivo;
   public ArquivoFtp(String caminhoArquivo) {
       this.caminhoarquivo = caminhoArquivo;
   }

    public String getCaminhoarquivo() {
        return caminhoarquivo;
    }

    public void setCaminhoarquivo(String caminhoarquivo) {
        this.caminhoarquivo = caminhoarquivo;
    }
}
