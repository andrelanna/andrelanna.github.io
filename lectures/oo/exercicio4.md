---
title: Exercício 4 - Revisão de estruturas de linguagens de programaçao / Introdução linguagem Java.
permalink: /lectures/oo/exercicio4.html
layout: default
---
{% assign atualizacao = "21 de março de 2018." %}
{% assign title = "Revisão de estruturas de linguagens de programação / Introdução à Linguagem Java." %}

## Exercício 4 - {{ title }}

De uma maneira geral o  cálculo do Imposto de Renda de Pessoa Física (IRPF) é
feito mês a mês tomando como base os rendimentos recebidos pelo contribuinte e
as deduções legais às quais ele tem direito. A base de cálculo do imposto de
renda é dada ao subtrair as deduções dos rendimentos. Ao valor obtido (base de
cálculo) é feito o cálculo do imposto. Os detalhes de cada um dos ítens que
compõem o cálculo do imposto estão apresentados abaixo.

**Rendimentos tributáveis:** todo rendimento recebido pela pessoa física sujeito
à tributação deve ser considerado. Exemplos de rendimentos tributáveis: salário,
aluguéis, indenizações, valores recebidos de outras pessoas físicas ou
jurídicas, etc... 

Exemplo: 

| Tipo de rendimento    |     Valor R$ |
|-----------------------|--------------|
| Salário               |      5000,00 |
| Aluguel               |      1500,00 |
| Reembolso de despesas |      1000,00 |
| **Total**             |  **7500,00** |

{% assign DEDUCAO_DEPENDENTE = "189,59" %}
**Deduções legais:** algumas despesas do contribuinte realizadas no mês podem
ser abatidas do total de rendimentos para efeitos de cálculo da base do imposto.
Algumas dessas despesas são abatidas em sua totalidade (como por exemplo pensão
alimentícia, despesas médicas, contribuição previdenciária oficial). No caso de
haver dependentes, é possível abater o valor de R${{ DEDUCAO_DEPENDENTE }} por
cada dependente naquele mês. 

Exemplo: 

| Tipo de despesa             |     Valor R$ |
|-----------------------------|--------------|
| Contribuição previdenciária |      1000,00 |
| Plano de saúde              |       300,00 |
| Pensão alimentícia          |       600,00 |
| Dependentes (2)             |       379,18 |
| **Total**                   |  **2279,18** |

**Base de cálculo:** a base de cálculo do imposto é calculada por subtrair o
total de deduções do total de rendimentos. 

Exemplo: 

 Base de cálculo = R$7500,00 - R$2279,18 = **R$5.220,82**

**Cálculo do imposto:** 
O cálculo do imposto é dividido em faixas de modo que cada faixa tem sua própria
alíquota. Para o valor obtido da base de cálculo calcula-se o valor a ser pago
em cada faixa de valores conforme sua alíquota (demonstradas na tabela abaixo):

|   Faixa     |   Valores                                 | Alíquota | 
|-------------|-------------------------------------------|----------|
| Faixa 1     | Base          $$\leq$$ R$1.903,98         | Isento   |
| Faixa 2     | R$1.903,98 $$<$$ Base $$\leq$$ R$2.826,66 | 7,5%     |
| Faixa 3     | R$2.826,66 $$<$$ Base $$\leq$$ R$3.751,06 | 15,0%    |
| Faixa 4     | R$3.751,06 $$<$$ Base $$\leq$$ R$4.682,69 | 22,5%    |
| Faixa 5     | R$4.682,69 $$<$$ Base                     | 27,5%    |

Exemplo:

Considerando que a base de cálculo é de R$5.220,82, o valor de imposto a ser
pago em cada faixa está representado pela tabela abaixo: 


|   Faixa     |   Valores  | Valor do Imposto | 
|-------------|------------|------------------|
| Faixa 1     | R$1.903,98 |   R$0,00         |
| Faixa 2     |   R$922,67 |  R$69,20         |
| Faixa 3     |   R$924,40 | R$138,66         |
| Faixa 4     |   R$913,63 | R$205,57         |
| Faixa 5     |   R$556,14 | R$152,94         |
| **TOTAL**   | R$5.220,82 | R$566,37         |



Observação: o aluno poderá confirmar a corretude de seu exercício utilizando o
[simulador de cálculo de IRPF][simuladorIRPF]  disponibilizado na página da Receita Federal. 

[simuladorIRPF]: http://www26.receita.fazenda.gov.br/irpfsimulaliq/private/pages/simuladoraliquota.jsf?tipoSimulador=M



---

<sup>_Última atualização: {{ atualizacao }}_</sup>
