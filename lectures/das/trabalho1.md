---
title: Trabalho em grupo 1
layout: default 
---
{% assign deadline = "23:59:59hs de 3 de maio de 2017" %}

**UnB - Universidade de Brasilia**

**FGA - Faculdade do Gama**

**DAS - Desenvolvimento Avançado de Software**

----


## Trabalho em grupo
#### Horário limite para entrega: {{ deadline }}.

#### Sobre o trabalho: 
Esse trabalho visa desenvolver as habilidades dos alunos em aplicar as operações
de refatoração em um projeto em Java. As operações de Refatoração a serem
aplicadas serão aquelas vistas até então em sala de aula. Serão consideradas,
para efeito de avaliação, apenas as operações de refatoração que não estão
automatizadas em ambientes de desenvolvimento.

O projeto que será o sujeito das operações de refatoração é a ferramenta
Reana-SPL, cujo objetivo é realizar a análise de confiabilidade de linhas de
produto de software. Para realizar as refatorações cada aluno deverá realizar um
*fork* do seguinte repositório do GitHub: [andrelanna/reana-spl][repoOriginal]  

A cada conjunto de operações de refatoração aplicadas uma versão do repositório
deverá ser gerada e nomeada através de uma tag. O conjunto de refatorações de
cada versão deverá compreender as operações de apenas um dos grupos do catálogo.
No total serão geradas 4 versões do repositório conforme a tabela apresentada
abaixo: 

| Ordem | Grupo de operações                    | Versão de entrada | Versão de saída |
|:-----:|:-------------------------------------:|:-----------------:|:---------------:|
|     1 | Composição de métodos                 | V0 (rep. original)| V1              |
|     2 | Movendo características entre objetos | V1                | V2              |
|     3 | Organizando dados                     | V2                | V3              |
|     4 | Simplificando expressoes condicionais | V3                | V4              |

As tags de cada versão do repositório deverão ser nomeadas conforme os valores
da coluna "Versão de saída" apresentados na tabela acima.

#### Grupos de trabalho:
Os grupos de trabalhos devem ter 4 ou 5 integrantes. Cada componente do grupo
deverá contribuir com a evolução do projeto ao menos uma vez de modo que cada
integrade do grupo deve ser responsável por pelo menos um *commit*. Cada commit
deverá conter em sua mensagem um breve relato das alterações realizadas com as
seguintes informações: 
* "mau-cheiro" de código identificado
* operação de refatoração aplicada
* classe / atributo / método impactado
* resultado da refatoração no projeto da aplicação
  - classe nova criada / extinta?
  - atributo / método movido?
  - criação de novos elementos em uma classe?
  - associações entre classes foram criadas ou extintas?
  - etc... 

Cada grupo de trabalho ficará encarregado de realizar suas refatorações em duas
suítes de teste, de modo que cada suíte de testes indicará os pontos que deverão
ser refatorados. A distribuição de suítes de teste para os grupos está descrita
pela tabela abaixo:

| Grupo no. | Integrantes                                                                | Suite de testes               | 
|:---------:|:--------------------------------------------------------------------------:|:-----------------------------:|
|        1  | Jonathan M., Jonathan Rufino, Laércio Jr., Lucas Couto, Phelipe Wener      | FDTMCTest, RDGNodeTest        |
|        2  | Arthur Temporim, Jéssica Cristina, João Paulo Busche, Marcelo Ferreira     | FDTMCTest, FDTMCToParamTest   |
|        3  | Luís Filipe Resende, Felipe César, Laura, Gabriel Araújo, Pedro Salles     | RDGNodeTest, FDTMCToParamTest |
|        4  | Hugo, Dandara, Edson Gomes, Victor Navarro,  Matheus Miranda Lacerda       | FDTMCTest, RDGNodeTest        |
|        5  | Renata, João, Mateus, Sabryna, Vitor Barbosa                               | FDTMCTest, FDTMCToParamTest   |
|        6  | Igor, Izabela, Lucas, Matheus, Paulo                                       | RDGNodeTest, FDTMCToParamTest |

#### Entrega do trabalho

O trabalho deverá ser entregue através de **um único para todo o grupo**
*pull-request* no [repositório original][repoOriginal] até as {{ deadline }}.
**Trabalhos que forem submetidos fora desse prazo não serão aceitos em hipótese
alguma**, portanto recomenda-se não deixar a entrega dos trabalhos para o último
dia.

#### Em caso de dúvidas...

Caso os grupos tenham dúvidas quanto à ferramenta Reana-SPL, procurem o
professor em sua sala (UED-14) no horário de atendimento da turma ou nos
instantes finais das aulas.

----
*Última atualização: 13 de abril de 2017*

[repoOriginal]: https://github.com/andrelanna/reana-spl
