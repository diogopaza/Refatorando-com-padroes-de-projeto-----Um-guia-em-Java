package org.example.baixarregistro;

public class MainBaixarRegistros {
    public static void main(String[] args) {
        BaixarRegistrosDeVendaFtpNoBancoWorker worker = new BaixarRegistrosDeVendaFtpNoBancoWorker();
        worker.requisitarFtp("ftp://meu-arquivo");
    }
}
