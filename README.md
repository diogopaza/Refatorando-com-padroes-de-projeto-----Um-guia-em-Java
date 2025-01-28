# Refatorando-com-padroes-de-projeto-----Um-guia-em-Java

<p>Padroes de projeto e um topico avancado em Orientacao a Objetos (OO). <p>

<h3>Extrair Metodo</h3>
<p>Extrair metodo e uma tecnica bem simples e poderosa, usada quando e preciso quebrar um metodo que tem mais de uma responsabilidade. Um dos desafios de um método ter várias responsabilidades é que este método provavelmente terá vários casos de testes associados.</p>

<h3>Mover Metodo</h3>
<p>Mover metodo pode ser usado quando temos um método que utiliza mais informacoes de outra classe do duqe da propria. Assim reduzimos a complexidade do codigo, pois o metodo vai ter acesso a todas as informacoes locais da nova classe em vez de ficar perguntando antes de tomar acoes.</p>

<h3>Mover Campo</h3>
<p>Util quando um atributo e mais usado em outra classe doque em sua propria.</p>

<h3>Extrair Classe</h3>
<p>Extrair classe e uma evolucao de Extrair Metodo Usamos essa tecnica quando uma classe possui mais de uma responsabilidade. Para construir a nova classe, vamos usar utilizar a tecnica Mover Campo e Mover Metodo.</p>

<h3>Padroes de Projeto</h3>
<p>Podemos definir padroes de projeto como uma solucao comum para um problema em um determinado contexto. Todos os padroes tentam resolver algum tipo de especifico de problema. O contexto de um problema e o fator principal ao decidir aplicar um padrao ou nao. Apçicar um padrao por aplicar pode resultar em um design muito mais complexo do que o necessario.</p>

<h3>Caracteristicas do Java</h3>
<p>Java e estaticamente tipado, e o compilador faz as validacoes de tipos antes mesmo do programa executar. Porem nem tudo em Java e representado como um Objeto. Um bom exemplo sao os tipos primitivos, como o int, que nao posseum metodos para serem chamados.</p>

<h3>Polimorfismo</h3>
<p>Todo Objeto em Java herda de uma classe - java.lang.Object, assim Object e considerado um tipo mais generico.</p>
<p>Ser generico quer dizer, de maneira simplificada, que uma variavel do tipo Object pode receber qualquer outro Objeto. 
  
```java
Object variavelGenerica = new	String();
variavelGenerica = new	Integer();
variavelGenerica =	new	MinhaClasse();
```

</p>
<p>Outro exemplo e como o Java lida com uma lista de dados. A classe List e a classe base para diversar implementacoes, cada implementacao de List, por exemplo ArrayList e LinkedList, pode definir seus detalhes sem que uma variavel do tipo List sofra alteracoes 

  ```java
  List minhaLista = new ArrayList<String>();
  minhaLista.add("oi");
  System.out.println(minhaLista.get(0));

  minhaLista = new LinkedList<Integer>();
  minhaLista.add("oi");
  minhaLista.get(0));
  ```
  </p>
  <p>Dessa forma Polimorfismo e usado em alguns padroes de projeto para garantir que implementacaoes diferentes possam ser usadas sem que o codigo que as utiliza precise mudar.</p>

  <h3>Sobrecarga e Sobrescrita de metodos</h3>
  <p>Uma das maneiras mais basicas de Polimorfismo e sobrescrever ou sobrecarregar metodos.</p>
  <p>No exemplo abaixo iremos sobreescrever o metodo toString que e herdado de Object (lembrando que Object e a classe base para todas as outras)</p>

  <p>Exemplo sobrescrita de metodo - Polimorfismo basico - usando @Override
    
    ```java    
    MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.setNomeClasse("Polimorfismo");
        System.out.println(minhaClasse.toString());
        ```        
  
  </p>
  <p>No exemplo acima o metodo toString e totalmente substituido, mas tambem podemos manter o antigo comportamento usando o super
   
    ```java    
    System.out.println(minhaClasse.simulaToStringComSuper());
    ```
</p>

<h2>Padroes Comuns</h2>
<h3>Factory: Gerenciando a criacao de Objetos</h3>
<p></p>




<h3>Referencias</h3>
<p>Este repositorio e um estudo e implementacao do livro abaixo:</p>
<p><sub>Livro: Refatorando com padrões de projeto - Um guia em Java</sub></p>

