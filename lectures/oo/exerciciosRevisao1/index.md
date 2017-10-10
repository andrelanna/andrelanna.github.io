---
title: Exercícios de revisão para a Avaliação 1
layout: default
permalink: /lectures/oo/exerciciosRevisao1/index.html
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------


**Exercício 1:**  Os seguintes termos estão bem definidos para o paradigma de
orientação por objetos. Pede-se ao aluno que defina cada um dos termos com uma
sentença. Para os termos que o aluno tiver dúvidas, sugere-se a consulta às
seguintes referências: 

* Meilir Page-Jones. *Fundamentals of object-oriented design in UML*. 1st
  edition. Addison-Wesley Professional, 2000. Disponível na biblioteca da FGA.
  O conteúdo desse exercício está contido nos primeiros capítulos do livro, que
  tratam dos conceitos de OO.
* Cay S. Horstmann e Gary Cornell. *Core Java*. 8a edição. Pearson Addison
  Wesley, 2010. Disponível na biblioteca da FGA. 

Termos:

* Abstract
* Associação entre classes / objetos
* Atributos
* Classe abstrata
* Classes
* Construtor
* Elemento de uma classe
* Encapsulamento
* Escopo de classe
* Escopo de objeto
* Herança
* Interface
* Modificador de acesso
* Modificador de escopo
* Método abstrato
* Métodos
* Objetos
* Pacote
* Polimorfismo
* Private
* Protected
* Public
* Sobrecarga de métodos
* Sobrescrita de métodos
* Static


**Exercício 2:** Utilizando mapas conceituais relacione os termos do paradigma
de Orientação por Objetos apresentados no exercício 1. Um breve resumo sobre
mapas conceituais pode ser encontrado nesse
[link](http://www2.pelotas.ifsul.edu.br/glaucius/mpet_mcpf/material_apoio/apres_Mapas_Conceituais.pdf). 

**Exercício 3:** Dado o seguinte diagrama de classes informe quais são as
classes ou elementos conforme os itens a seguir:

![](/lectures/oo/exerciciosRevisao1/exercise3.png)

* Atributo de classe
* Atributo de objeto
* Classes abstratas
* Classes concretas
* Construtores alternativos
* Construtores padrão
* Métodos abstratos
* Métodos concretos
* Métodos de classe
* Métodos de objeto
* Pacotes



**Exercício 4:** Considerando ainda o diagrama de classes apresentado no
exercício 3, responda às seguintes questões:

  a) Por que os métodos set/getUniversidade na classe **Aluno** são estáticos?
  b) A associação de **AlunoExtensao** para **Projeto** mostra que um aluno de
extensão está associado a pelo menos um projeto de extensão (podendo ser parte
de mais de um projeto). Como essa associação é representada na classe
**AlunoExtensao**, quando implementada em Java? Apresente a instrução Java que
define tal associação.    
  c) De modo similar ao item anterior, apresente a instrução Java que define a
associação entre **Projeto** e **AlunoExtensao**, sabendo que um projeto de
extensão pode ter vários alunos (incluindo a possibilidade de não ter nenhum
aluno).    
  d) Considerando as classes do projeto, apresente *todos* os métodos
polimórficos por *sobrescrita de métodos*.
  e) Considerando as classes do projeto, apresente aquelas que não são capazes
de gerar objeto algum. 



**Exercício 5:** Considerando o diagrama de classes do Exercício 3 apresente,
para cada classe, quais os elementos (atributos e métodos) das demais classes
estão visíveis, conforme o exemplo abaixo:

| Classe | Aluno  | AlunoExtensao   | Graduação   | ... |
|:------:|:------:|:---------------:|:-----------:|:---:|
|Aluno   |  ---   | setIdade(), ... | graduacao(),| ... |
|AlunoExt|nome,...|      ---        | graduacao(),| ... |
|  ...   |  ...   |      ...        |   ...       | ... |
|Mundo   |  ...   |      ...        |   ...       | ... |

---

*Para os exercícios 6 a 10, pede-se que o aluno represente, através de uma
diagrama de classes, as classes (com seus atributos e métodos) e suas
associações de modo a atender o cenário descrito. Implemente as classes e seus
métodos em Java.* 


**Exercício 6:** Sistema de Arte:

Elabore um programa que permita o controle de uma coleção de quadros e de seus
pintores. Para cada quadro será fornecido um código de identificação, a
identificação do pintor, preço e ano de aquisição do mesmo.  Para cada pintor
será cadastrado o nome, seu código de identificação pessoal e o ano de
nascimento.  Faça um programa que apresente um menu simples as opções de:
  * cadastramento de um novo quadro; 
  * cadastramento de um novo pintor; 
  * listagem de todas as telas de um pintor informado, com o valor total da soma
    dos valores dos mesmos;
  * apresentação de todos os quadros cadastrados até o momento no programa; 
  * opção de encerrar o programa.

Implemente as validações para os tipos de dados: Codigo: deve ser presente
somente numeros Date: Não deve haver datas no futuro

Restrição: Todos os dados de cada entidade em sua solução não poderão ser de
tipos de dados primitivos.  Dica: despreze as diferenças entre letras maiúsculas
e minúsculas na pesquisa do pintor.


**Exercício 7:** Empresa:   
Uma empresa contrata pessoas registrando seu nome, CPF e data de nascimento,
onde todas recebem o mesmo piso salarial de R$932,00.  Elabore um programa que
permita o cadastramento de várias pessoas como funcionário regular, prestação de
serviços ou gerencia de equipe.  O que difere cada uma destas pessoas é a forma
de calcular o salário
  * Para funcionário regular o calculo do salário deverá fornecer o piso
    salarial acrescido de 10%
  * Para prestação de serviço será calculado o pagamento através da quantidade
    de horas trabalhadas multiplicada por dois acrescido do próprio piso
salarial.
  * Para gerencia de equipe o salário a ser pago será obtido pela quantidade de
    projetos vezes 50% do piso salarial acrescido do próprio piso.

Após o usuário encerrar o cadastro apresente um menu que possibilite ao usuário
ter acesso ao total de funcionários cadastrados em cada uma das três categorias
e o total salarial a ser pago para mesma. Permaneça neste menu até que o usuário
escolha a opção que encerre o programa.


**Exercício 8:** Financeiro:   
Deseja-se realizar o controle de saques, pagamentos e depósitos uma instituição
financiera. A instituição possui diferentes tipos de contas. Um cliente desta
instituição pode possuir apenas um tipo de conta. As contas existentes são:
  *  Conta de débito: Realiza saques e depósitos.
  *  Conta de crédito: Realiza pagamentos baseado no limite de crédito e
     pagamento da própria fatura.
  *  Conta de crédito e débito: Possibilita o saque e depósito de valores, além
     de pagamentos baseados no limite de crédito.
  *  Conta de cŕedito especial: Semelhante ao crédito, mas possibilita o saque
     de valores de acordo com o limite de crédito.  

Implemente a solução de um sistema que recebe requisições para as operações
financeiras de um cliente e determina se aquela operação pode ou não ocorrer. Se
a operação puder ser executada, ela deve ocorrer.  Paca o cadastro de um
cliente, é necessário data de nascimento, nome, o número da conta deve ser
gerado de forma incremental começando do 1; Para remover um cliente é necessário
que ele realize o saque de todo o valor depositádo, caso tenha conta débito ou
zere o valor da fatura, caso seja conta crédito.

Faça todas as validações possíveis para garantir que os dados são concistentes.
Validações: 
  * nome: palavra não vazia, somente com caracteres alfabéticos;
  * conta: não pode ter saldo negativo;
  * data de nascimento: não aceita idade maior do que 120 anos e menor do que
    16;
  * não pode existir limite negativo no crédito;
  * saques não podem ser superiores aos valores: saldo e limite;
  * conta crédito não deve permitir pagamento que exceda limite;
  * conta débito não deve permitir pagamento maior do que saldo;
  * adicione outras validações que achar necessário;

Dica: organize adequadamente as classes em pacotes para as modelos, requisições,
validações e outros que julgar necessário.


---
**Exercício 9:** Uma fatura de uma companhia energética é calculada levando em
consideração três fatores: o valor do consumo do cliente ($$KwH \times
R$/KwH$$), o valor adicional devido à bandeira tarifária ($$KwH \times
adicional$$) e o valor do ICMS calculado sobre a soma dos valores consumidos. A
classe _Fatura_ apresentada abaixo implementa os atributos e métodos necessários
para o cálculo da fatura de um cliente. 

Considerando a implementação da classe _Fatura_ pede-se:

a) Crie o diagrama de classes de modo a representar a classe, seus atributos e
métodos. Atente-se ao pacote em que a classe está definida (represente-o).   
b) Quais são os elementos cujo escopo é de objeto? E quais são os elementos
cujo escopo é de classe?   
c) No método construtor alternativo da classe _Fatura_ há duas utilizações
distintas para o operador _this_. Quais são elas e qual a diferença entre elas?   
d) Quais os elementos (atributos e métodos) de _Fatura_ visíveis para classes
que eventualmente sejam definidas dentro do pacote em que ela se encontra? E
quais são os elementos visíveis para classes que forem definidas fora do pacote?


```java 
package ceb;

public class Fatura {
    
    protected static final float adcBandeiraVerde = 0.0f;
    protected static final float adcBandeiraAmarela = 0.02f;
    protected static final float adcBandeiraVermelha1 = 0.03f;
    protected static final float adcBandeiraVermelha2 = 0.035f;
    
    
    private static int bandeira;
    public static final int VERDE = 1; 
    public static final int AMARELA = 2;
    public static final int VERMELHA1 = 3;
    public static final int VERMELHA2 = 4;
    
    public static final float custoKwH = 0.512629f;
    public static final float txICMS = 0.0f;
    
    private int medicaoAnterior;
    private int medicaoAtual;
    private String mes;
    private int ano;
    private int consumoKwh;
    private float totalFatura;
    private float valorBase;
    private float valorAdicional;
    private float valorImpostos;
    
    
    
    public Fatura() {
        System.out.println("Executando construtor padrão.");
    }
    
    public Fatura(int medicaoAnterior, int medicaoAtual, String mes, int ano) {
        this();
        System.out.println("Atribuindo valores aos atributos.");
        this.medicaoAnterior = medicaoAnterior;
        this.medicaoAtual = medicaoAtual;
        this.mes = mes;
        this.ano = ano;
    }
    
    public float calcularValorTotalFatura() {
        if (medicaoAnterior == 0 || medicaoAtual == 0) {
            System.out.println("Valor de medicao está zerado. ");
            totalFatura = -1;
        }
        //Calculo da fatura
        calcularConsumoKwH();
        calcularValorBase();
        calcularAdicional();
        calcularICMS();
        
        totalFatura = valorBase + valorAdicional + valorImpostos;
        return totalFatura;
    }

    private float calcularICMS() {
        valorImpostos = valorBase * txICMS;
        return valorImpostos;
    }

    private float calcularAdicional() {
        switch (bandeira) {
        case VERDE:
            valorAdicional = consumoKwh * adcBandeiraVerde;
            break;
        case AMARELA:
            valorAdicional = consumoKwh * adcBandeiraAmarela;
            break;
        case VERMELHA1:
            valorAdicional = consumoKwh * adcBandeiraVermelha1;
            break;
        case VERMELHA2:
            valorAdicional = consumoKwh * adcBandeiraVermelha2;
            break;

        default:
            System.out.println("Bandeira invalida ou não-selecionada.");
            valorAdicional = 0;
            break;
        }
        return valorAdicional;
    }

    private float calcularValorBase() {
        valorBase = consumoKwh * custoKwH;
        return valorBase;
    }

    private void calcularConsumoKwH() {
        consumoKwh = medicaoAtual - medicaoAnterior;
    }

    public static void setBandeira(int b) {
        bandeira = b;
    }
    
    public String imprimirFatura() {
        String resposta = "";
        
        resposta = imprimirCabecalho(resposta);
        resposta = imprimirCorpoFatura(resposta);
        resposta = imprimirRodape(resposta);
        
        return resposta;
    }

    private String imprimirRodape(String resposta) {
        for (int i=0; i<40; i++) {
            resposta += "-";
        }
        resposta += "\n\n\n";
        return resposta;
    }

    private String imprimirCorpoFatura(String resposta) {
        resposta += "KwH consumidos: " + consumoKwh + '\n';
        resposta += "Valor base: " + valorBase + '\n';
        resposta += "Adicional bandeira: " + valorAdicional + '\n';
        resposta += "ICMS: " + valorImpostos + '\n';
        resposta += "VALOR TOTAL: " + totalFatura + '\n';
        return resposta;
    }

    private String imprimirCabecalho(String resposta) {
        resposta += "FATURA - " + getMes() + '/' + getAno() + '\n';
        for (int i=0; i <= 40; i++) {
            resposta += '-';
        }
        resposta += '\n';
        return resposta;
    }

    public String getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
```



e) Considerando a implementação da classe _Principal_ ocorreu fora do pacote em
que _Fatura_ está implementada, responda às seguintes questões. A implementação
de _Principal_ está apresentada abaixo.

* O que as seguintes instruções abaixo estão fazendo? 
```java
    Fatura.setBandeira(Fatura.VERDE);
```
```java
    Fatura[] faturas = new Fatura[4];
```
```java
    faturas[1] = new Fatura(10,20, "Agosto", 2017);
```

```java 
import ceb.Fatura;

public class Principal {

    public static void main(String[] args) {
        Fatura.setBandeira(Fatura.VERDE);
        
        Fatura[] faturas = new Fatura[4];
        
        faturas[0] = new Fatura(0, 20, "Agosto", 2017);
        faturas[1] = new Fatura(10,20, "Agosto", 2017);
        faturas[2] = new Fatura(25,55, "Agosto", 2017);
        faturas[3] = new Fatura(15, 20, "Agosto", 2017);
        
        for (Fatura f : faturas) {
            f.calcularValorTotalFatura();
            System.out.println(f.imprimirFatura());
        }
    }
}
```
