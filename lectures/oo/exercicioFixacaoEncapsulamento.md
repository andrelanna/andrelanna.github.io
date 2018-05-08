---
title: Plano de ensino - 2018/1
permalink: /lectures/oo/exercicioFixacaoEncapsulamento.html
layout: default 
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### DAS - Desenvolvimento Avançado de Software
------


Para cada um dos cenários descritos abaixo faça o que se pede abaixo: 

* Modelar um diagrama de classes quais as classes e seus atributos para o seu projeto de software. 
* As classes deverão ser organizadas em pacotes de modo a agrupar as classes afins e, consequentemente, criar _namespaces_ para serem utilizados pela aplicação.
* Implementar uma classe Principal que deverá apresentar ao usuário o menu de opções da aplicação. Todos as funcionalidades previstas para a aplicação deverão ficar disponíveis nesse menu. Obs.: você deverá ser capaz de identificar quais são essas funcionalidades com base em cada cenário descrito. 

**Cenário 1:** Considere uma aplicação bancária a ser desenvolvida. Para cada correntista deverão ser informados o nome, sexo e CPF. Cada correntista deverá ser vinculado à, no máximo, uma conta-corrente. Cada conta-corrente deverá ser caracterizada por um número de agência, número da conta e saldo. O saldo no momento da abertura deve ser igual a R$0,00. Uma conta pode originar várias transações sendo que cada transação pode ser depósito, saque ou transferência de um valor para outra conta-corrente. Cada operação tem um custo conforme definido abaixo: 

|  Operação     |  Custo, em R$  |
|:--------------|:---------------|
| Depósito      | R$ 0,00        |
| Saque         | R$ 4,00        |
| Transferencia | R$ 8,00        |
