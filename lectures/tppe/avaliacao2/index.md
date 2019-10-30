---
title: Trabalho 1
layout: default 
---

#### UnB - Universidade de Brasilia
#### FGA - Faculdade do Gama
#### TPPE - Técnicas de Programação para Plataformas Emergentes
------

Trabalho 1 (em substituição à avaliação 2)

Seja o seguinte cenário:

Uma nutricionista deseja uma aplicação para montar os cardápios semanais de seus pacientes.Em nutrição os alimentos são dividos em 8 categorias, a saber:
*  Grupo 1: Carboidratos. Exemplos: arroz, macarrão, etc... 
*  Grupo 2: Verduras e Legumes. Exemplos: Abóbora, couve, couve-flor, alface, etc... 
*  Grupo 3: Frutas. Exemplos: Abacaxi, maçã, etc... 
*  Grupo 4: Leite e derivados. Exemplos: manteira, iogurte, requeijão, etc...
*  Grupo 5: Carnes e Ovos. 
*  Grupo 6: Leguminosas e oleaginosas. Exemplos: feijão, lentilha, ervilha, etc...
*  Grupo 7: Óleos e Gorduras. Exemplos: Óleos de milho, soja, girassol, azeites, etc...
*  Grupo 8: Açúcares e Doces. Exemplos: açucar de cana, mascavo, etc...

Cada um desses itens possui sua própria medida. Exemplo: Arroz --> gramas, azeites --> ml, açúcares --> colheres, etc... 

O que essa nutricionista espera dessa aplicação é:   
1) Realizar cadastros de grupos e de seus itens. Esses grupos e itens deverão ser cadastrados apenas uma vez e persistidos em arquivos.  
2) Montar o cardápio semanal de seus pacientes ao escolher apenas os grupos de alimentos da refeição. Exemplo: Segunda-feira -> (Grupo1, Grupo 2, Grupo 5), Terça-feira -> (Grupo1, Grupo2, Grupo 4), etc...   
3) A montagem do cardápio de um dia específico deve ser feita de forma automatizada respeitando as seguintes restrições:   
	3.1) Para cada grupo deverá ser escolhido, de forma aleatória, apenas um elemento.  
	3.2) Pode haver repetição de um grupo de um dia para o outro, contudo os itens escolhidos não podem repetir. As repetições de itens são permitidas no máximo 2 vezes e apenas em refeições dentro do mesmo dia. Exemplo: segunda feira - almoço = (Arroz, Abóbora, Frango); segunda-feira - jantar = (Arroz, couve, frango).   
4) Os diversos cadastros da aplicação devem lançar exceções sempre que houver um campo vazio informado.  
5) Caso não exista uma combinação de cardápios que viole as restrições do item 3, uma exceção do tipo CardapioInvalidoException deve ser lançada e registrada em log.  

Construa essa aplicação, em uma linguagem Orientada a Objetos de sua escolha, utilizando as técnicas de TDD apresentadas em sala e algum framework de testes unitários para a linguagem.
