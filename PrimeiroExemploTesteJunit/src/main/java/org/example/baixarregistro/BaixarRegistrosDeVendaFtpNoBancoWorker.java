package org.example.baixarregistro;

public class BaixarRegistrosDeVendaFtpNoBancoWorker {

    public void requisitarFtp(String caminhoArquivo) {
        // codigo inicial
//        ClienteFtp cliente = new ClienteFtp(host, porta);
//        cliente.login(usuario, senha);
//        ArquivoFtp arquivo = cliente.buscarArquivo(caminhoArquivo);
//        repositorioDeVendas.salvarDeArquivo(arquivo);
        GerenciadorFtp gerenciadorFtp = new GerenciadorFtp();
        ArquivoFtp arquivo = gerenciadorFtp.requisitarFtp(caminhoArquivo);
        RepositorioDeVendas repositorioDeVendas = new RepositorioDeVendas();
        repositorioDeVendas.salvarDeArquivo(arquivo);
    }
}



