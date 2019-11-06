---
title: Enunciado do trabalho - 2019/2
permalink: /lectures/oo/enunciadoTrabalho.html
layout: default 
---

### Trabalho prático OO

Seja o seguinte cenário: 

Uma universidade deseja catalogar seus espaços físicos para utilização exclusiva de aulas. A cada um desses espaços devem ser definidos quais os tipos de aulas que podem ser executadas, a citar: graduação, pós-graduação (Strictu ou Latu Sensu) ou extensão. A sala de aula está localizada em um prédio da instituição o qual também deverá ser catalogado. Cada sala de aula tem uma ocupação máxima determinada pelo número de carteiras que ela comporta. Cada sala de aula tem ainda um nome atribuído e algumas informações adicionais como, por exemplo, se ela possui ar-condicionado, projetor e televisão.

Os períodos de aula são definidos pela própria instituição. A UnB, **por exemplo**, possui os seguintes horários: 08:00 -- 9:50; 10:00 -- 11:50, 12:00 -- 13:50; 14:00 -- 15:50; 16:00 -- 17:50; 19:00 -- 20:40; 20:50 -- 10:30. Esses horários deverão ser utilizados como base para distribuição de turmas entre as salas da instituição. 

A taxa de ocupação de uma sala é dada pelo quociente entre o número de períodos de aula ocupados por disciplinas pelo número de periodo de aulas em que ela esteve vazia. A taxa de ocupação de um prédio é dada pelo quociente de número de período de aulas em que suas salas estiveram ocupadas por aulas pelo número de período de aulas em que as salas estiveram vazias.

---

Dado o cenário acima faça o que se pede: 

1. Crie um diagrama de classes UML que represente o cenário acima. O diagrama deverá mostrar, claramente, quais são as classes que compõem o cenário, seus atributos, e os relacionamentos entre classes. **Observação:** certamente haverá classes e atributos que não estão descritos no cenário, mas que são necessários para o desenvolvimento do projeto.
2. Crie um programa, em uma linguagem OO à sua escolha, que seja capaz de:
   * cadastrar os prédios de uma instituição de ensino e suas salas de aula incluindo, necessariamente, o nome da sala, a sua capacidade máxima e os recursos que estão disponíveis;  
   * cadastrar turmas para as disciplinas da instituição de ensino. As turmas deverão, portanto, ter necessariamente um vínculo com sua disciplina. 
   * cadastrar todos os períodos de aula da instituição de ensino.

3. Os seguintes casos de erro deverão ser tratados pela aplicação:
   * se uma turma for cadastrada sem uma disciplina associada, uma exceção do tipo **DisciplinaNaoInformadaException** deverá ser lançada e tratada. 
   * se uma turma for cadastrada sem um professor associado a ela, uma exceção do tipo **ProfessorNaoAtribuidoException** deverá ser lançada e tratada.
   * se nao for atribuido pelo menos um tipo de aulas para uma sala, uma excecao do tipo **TipoDeAulaNaoAtribuidoException** deverá ser lançada e tratada.
   * 
