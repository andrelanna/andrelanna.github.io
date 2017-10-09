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
