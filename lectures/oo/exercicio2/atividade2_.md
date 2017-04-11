
---
title: Exercício prático
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

Atividade para realizar em dupla e entregar via GitHub. Uma entrega por dupla.
Prazo para entrega: ~~4/4/2017~~ 10/04/2017, 23:59:59.

**Questão 1:** Os termos abaixo estão relacionados ao paradigma de *Orientação por Objetos*. Defina cada um dos termos com base no livro-texto (Eck, David J. Introduction to Programming Using Java, 6th ed. 2011).
<br/><br/>
* classe

A classe é uma entidade que contém atributos e métodos, que são responsáveis por descrever objetos ou mais precisamente para criar objetos. Ela é um tipo de fábrica para a construção de objetos.
* objeto

Objetos são invocações das classes, são eles que dão vida à classe. Objeto é uma instância da classe, ou seja, a classe é uma forma para o objeto. Tratando de um bolo, a classe é a forma do bolo e o bolo é um objeto que pode ser de chocolate, laranja ou do que quer que você queira, e cada bolo que é feito é um novo objeto. 
* elementos de classe

Os elementos de uma classe são os atributos e métodos que cada classe possui.

* atributos

Atributos nada mais são do que as variáveis contidas em uma classe ou em um objeto. São as principais característica de um objeto quando eu o instancio através de uma classe. Por exemplo, a classe Aluno tem como objetos instanciados Pedro e Matheus, ambos possuem uma matrícula, nota, quantidade de faltas, etc. Cada uma dessas características são chamadas de atributos.  	
* métodos

Métodos são subrotinas que tem como estrutura o modificador, o tipo de retorno e a lista de parâmetros. Métodos são responsáveis por executar mudanças nos valores dos atributos dos objetos apenas com a chamada do mesmo, não sendo necessário que a main repita várias vezes o mesmo passo. Esses métodos estão presentes em cada classe e seus objetos herdam esses métodos, podendo ser ilimitados. 
* método construtor padrão

O construtor padrão também é uma subrotina, porém é uma subrotina especial, com o papel de alocar memória para o objeto e inicializar os atributos, retornando a referência para o objeto. Toda classe tem um construtor padrão assim que ela é criada, mesmo se o programador não declarar ela o sistema irá providenciar um método construtor padrão.
* método construtor alternativo

O método construtor alternativo, assim, como o padrão, também aloca um espaço na memória para o objeto, a diferença é que a inicialização dos atributos é feita de acordo com uma passagem de parâmetros. Diferente do método padrão, esse método pode atribuir quaisquer valores para os diversos atributos do objeto, bastanto apenas que sejam passados esses valores como parâmetro na chamado do método alternativo. 
* estado de um objeto

Ao conjunto de valores que os atributos de um objeto armazena em um instante, dá-se o nome de estado do objeto
* retenção de estado

Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.
<br/><br/>
**Questão 2:** 
<br/><br/>
a)**F**.
 "Dois objetos instanciados através do método construtor padrão terão o mesmo estado, entretanto, suas referências não serão iguais."<br/>
Os objetos serem estanciados através do mesmo método construtor apenas implica em terem o mesmo estado, mas não em referenciarem o mesmo objeto.
	
b)**F**.
 "Uma classe pode ter vários métodos construtores alternativos para instanciação de seus objetos."<br/>
Uma Classe pode ter quantos métodos construtores alternativos quiser.	
	
c)**V**.
 "Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo."
	
d)**F**.
 "Em Java, o operador .(ponto) serve para acessar os métodos e os atributos de um objeto".<br/>
Serve para acessar ambos, atributo e método.
	
e)**F**.
Em Java não existe métodos destrutores, e sim o que acontece é o desreferenciamento de um objeto, e depois o Garbage Collector passa avaliando a memória e é executado, destruindo esse objeto. O método finalize() é implementado em cada Classe e é chamado assim que o GC está quase destruindo o objeto, ai ele executa as ultimas instruções antes de destrui-lo.
<br/><br/>

## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*



[eckDavid]: http://math.hws.edu/javanotes/
