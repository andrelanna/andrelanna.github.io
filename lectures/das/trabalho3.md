---
title: Trabalho em grupo 1
layout: default 
---
{% assign deadline = "23:59:59hs de 14 de junho de 2017" %}

**UnB - Universidade de Brasilia**

**FGA - Faculdade do Gama**

**DAS - Desenvolvimento Avançado de Software**

----


## Trabalho em grupo
#### Horário limite para entrega: {{ deadline }}.

#### Sobre o trabalho: 
Esse trabalho visa conciliar o aprendizado dos alunos sobre os conceitos
relacionados ao desenvolvimento de frameworks e componentes de software com a
prática de desenvolvimento de aplicações baseadas em frameworks. Espera-se que
ao final do trabalho os alunos consolidem através da prática os conceitos
relacionados ao desenvolvimento baseado em componentes através da adoção de um
framework e da reutilização de seus componentes. 

Os frameworks objetos de estudo desse trabalho foram escolhidos pelos grupos de
alunos e estão relacionados na Tabela 1. Os grupos deverão estudar a
documentação do framework de modo a identificar a) a arquitetura do framework,
b) modelo de componentes adotado, c) o modo de comunicação entre os componentes 
e d) os modos de extensão do framework. As seguintes características dos itens
acima deverão ser abordadas pelos grupos: 

a) Arquitetura do framework:
   - quais são os módulos que compõem a arquitetura do framework e qual a
     função que cada um deles desempenha?
   - quais são os _frozen-spots_ e os _hot-spots_ do framework? Como eles são
     definidos? Existe alguma regra associada à criação ou definição de tais
     _spots_?

b) Modelo de componentes: 
   - quais são os padrões ou convenções definidas pelo fabricante do framework
     para o desenvolvimento de componentes e o modo como eles se comunicam?
   - quais são os tipos de componentes definidos pelo framework? O que cada tipo
     de componente oferece/requer como serviço?
   - quais as formas de interação com os componentes a serem integrados no
     framework? 

c) Modo de comunicação:
   - Qual é o mecanismo de comunicação dos componentes integrados ao framework?  
   - Como um componente identifica os demais componentes integrados ao
     framework? É necessário o endereçamento explícito ou há transparência de
     localização? 

d) Extensão do framework: 
   - Para extender as funcionalidades do framework, qual o mecanismo adotado?
     Bibliotecas? Componentes? Serviços? Para cada um dos métodos de extensão
     adotados pelo framework, apresente como tal método de extensão deve ser
     adotado pelo desenvolvedor (i.e., apresente detalhes de implementação). 

Recomenda-se a leitura do relatório técnico sobre desenvolvimento baseado em
componentes da PUC-RS. Tal relatório pode ser acessado [aqui][relatorioDBC].
Outra referência recomendada é o artigo [Object-Oriented Application
Frameworks][artigoFW]
de Mohamed Fayad e Douglas Schmidt.

#### Grupos de trabalho:
Os grupos de trabalhos devem ter 4 ou 5 integrantes e foram definidos conforme a
Tabela 1. Cada grupo ficará encarregado em estudar o framework escolhido e
elaborar uma apresentação em slides contemplando os ítens apresentados na seção
acima.

| Grupo no. | Integrantes                                                                | Framework escolhido | 
|:---------:|:--------------------------------------------------------------------------:|:-------------------:|
|        1  | Jonathan M., Jonathan Rufino, Laércio Jr., Lucas Couto, Phelipe Wener      | Spring              |
|        2  | Arthur Temporim, Jéssica Cristina, João Paulo Busche, Marcelo Ferreira     | Django              |
|        3  | Luís Filipe Resende, Felipe César, Laura, Gabriel Araújo, Pedro Salles     | EmberJS             |
|        4  | Hugo, Dandara, Edson Gomes, Victor Navarro,  Matheus Miranda Lacerda       | Rails               |
|        5  | Renata, João, Mateus, Sabryna, Vitor Barbosa                               | VueJS               |
|        6  | Igor, Izabela, Lucas, Matheus, Paulo                                       | Ionic               |

**Tabela 1:** Definição de grupos de trabalho e frameworks escolhidos.

#### Entrega do trabalho

Todos os grupos de trabalho deverão entregar seus slides até as {{ deadline }}
via e-mail ao professor. **Trabalhos que forem submetidos fora desse prazo não
serão aceitos em hipótese alguma**, portanto recomenda-se não deixar a entrega
dos trabalhos para o último dia.

#### Apresentação do trabalho

As apresentações dos trabalhos acontecerão nos dias 16 e 21 junho de 2017, onde
cada grupo apresentará à turma os slides entregues via email ao professor. Em
cada aula 3 grupos escolhidos por sorteio apresentarão seus trabalhos. As
apresentações terão 20 minutos de duração e 5 minutos para questionamentos dos
alunos e professor. **Importante:** todos os alunos do grupo deverão participar
da apresentação dos slides. 

#### Em caso de dúvidas...

Caso os grupos tenham dúvidas quanto à ferramenta Reana-SPL, procurem o
professor em sua sala (UED-14) no horário de atendimento da turma ou nos
instantes finais das aulas.

----
*Última atualização: 3 de junho de 2017*

[repoOriginal]: https://github.com/andrelanna/reana-spl
[relatorioDBC]: http://www.pucrs.br/facin-prov/wp-content/uploads/sites/19/2016/03/tr026.pdf
[artigoFW]: http://dl.acm.org/citation.cfm?doid=262793.262798
