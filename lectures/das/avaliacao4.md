---
title: Avaliação 4 - Framework
layout: default 
---

UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
DAS - Desenvolvimento Avançado de Software  

## Avaliação 4 - Frameworks e Desenvolvimento Baseado em Componentes

---

Instruções para a prova:

* Avaliação individual. 
* Entrega da avaliação via pull-request em repositório do GitHub. 
* Data e horário limites para entrega: 5 de dezembro de 2018, 18:00 horas. **Pull-requests enviados após esse horário não serão aceitos e, consequentemente, a avaliação será zerada.** 
* Formato da mensagem do pull-request:  
    *Matricula -- Nome do Aluno*
* Referência a ser utilizada para a prova:  
SPAGNOLI, Luciana de Araujo; BECKER, Karin. **Um Estudo Sobre o Desenvolvimento Baseado em Componentes**. 2003. 40 p. Relatório Técnico (Programa de Pós-Graduação em Ciência da Computação)- Faculda de Informática, PUC RS, Porto Alegre, 2003. Disponível em: <http://www.pucrs.br/facin-prov/wp-content/uploads/sites/19/2016/03/tr026.pdf>. Acesso em: 01 dez. 2018.

---



**Questão 1:** O Desenvolvimento Baseado em Componentes (DBC) é um método de desenvolvimento de software voltado para a reutilização de elementos previamente implementados e testados. Busca-se, com a utilização de tal método, aumentar a qualidade do software produzido e reduzir seu tempo de entrega. Para promover uma reutilização de componentes de maneira mais direta alguns elementos foram definidos de modo a guiar tanto a implementação dos componentes reutilizáveis quanto o desenvolvimento da aplicação com base na reutilização de tais componentes. Dentre esses elementos destacam-se o *framework de componentes*, o *modelo de componentes* e o próprio *componente de software*. A Figura 1 apresentada na página 11 de Spagnoli e Becker(2003) apresenta como esses elementos estão dispostos e relacionados em uma aplicação DBC. Para cada um desses elementos apresente claramente a) uma definição do elemento e b) seu papel (função) na abordagem DBC. Valor: 30 pontos, 10 pontos cada elemento.

Obs.: Apresente a resposta em um arquivo texto chamado *questao1.txt*.

**Questão 2:** Java Remote Method Invocation (JavaRMI) é uma biblioteca de Java utilizada para desenvolver aplicações que utilizam métodos distribuídos de maneira similar à aplicações não distribuídas. Apesar de não ser definida explicitamente como um _framework_, JavaRMI define um conjunto de elementos arquiteturais que devem ser considerados durante o desenvolvimento da aplicação pelo desenvolvedor, a saber: a) _stub_, b) _skeleton_, c) registro e d) serialização (_marshalling_ e _unmarshalling_) e invocação remota de métodos. Para maiores detalhes vide o tutorial presente em <https://www.oracle.com/technetwork/java/javase/tech/index-jsp-138781.html>.

Apresentados os elementos arquiteturais de JavaRMI, relacione-os aos elementos arquiteturais apresentados na Figura 1 do texto de Spagnoli e Becker (2003). Justifique sua resposta de modo a identificar claramente a similaridade entre as definições de Spagnoli e Becker (2003) e o papel desempenhado pelos elementos de JavaRMI. Valor: 40 pontos, 10 pontos cada elemento. 

Obs.: Apresente a resposta em um arquivo texto chamado *questao2.txt*.

**Questão 3:** Considere uma aplicação de trocas de mensagens entre diferentes pessoas. Cada pessoa que utiliza essa aplicação se registra a um servidor utilizando um identificador que o distingue das demais pessoas. Cada cliente poderá enviar dois tipos de mensagens: a) uma mensagem direta para um outro cliente e b) uma mensagem para todos os clientes (_broadcast_). Em ambos os casos a mensagem enviada deverá ser apresentada na tela do usuário destinatário. 

Com base no cenário descrito acima implemente em JavaRMI uma aplicação composta de objetos remotos e objeto servidor que seja capaz de permitir a comunicação entre diversos clientes. Através de comentários em código apresente, claramente, quem são os elementos arquiteturais de JavaRMI. Valor: 30 pontos.
