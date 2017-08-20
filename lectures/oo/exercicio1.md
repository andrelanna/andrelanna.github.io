---
title: Exercicio 1 - Orientação por Objetos
permalink: /lectures/oo/exercicio1.html 
layout: default 
---
{% assign atualizacao = "18 de agosto de 2017."%}



## Aula 1 - Revisão de estruturas de linguagens de programação / Introdução à linguagem Java.

**Exercício 1:**  
Faça um programa em Java, que seja capaz de calcular os $$n$$ primeiros termos de uma progressão aritmética, de razão $$r$$ e primeiro termo $$a_0$$. A fórmula do $$n$$-ésimo termo de um P.A. é $$a_n = a_0 + (n-1)\times r$$.


**Exercício 2:**
Faça um programa em Java que seja capaz de calcular todos os números primos inteiros $$x$$ dentro do intervalo $$1 \leq x \leq n$$, usando as três estruturas de repetição vistas em sala de aula.

**Exercício 3:** 
Faça um programa em Java que, dados dois vetores de inteiros $$a$$ e $$b$$, realize a soma desses dois vetores e o armazene em um vetor $$c$$. Ao final, o vetor $$c$$ deverá ser apresentado ao usuário. Atenção: no caso dos vetores serem de tamanhos diferentes, complemente o vetor de menor tamanho com $$0$$ até que ele atinja o tamanho do maior vetor.

**Exercício 4:** 
Faça um programa em Java que, dadas duas matrizes de inteiros $$a$$ e $$b$$, realize a multiplicação dessas duas matrizes e armazene a matriz resultante em uma matriz $$c$$. Ao final, a matriz $$c$$ deverá ser apresentada ao usuário. Atenção: no caso das matrizes não tiver dimensões que permita a multiplicação, uma mensagem de erro deverá ser informada ao usuário.

---
__Resolução (parcial) do exercício 3__

_Os alunos deverão utilizar o código abaixo como base para continuar a desenvolver o exercício._

```java
public class Exercicio3 {
    
    public static void main(String[] args) {
        // declaracao dos vetores a serem somados
        int[] a,
              b,
              c;
        int d1,
            d2;
        
        //Ler a dimensão do primeiro vetor
        System.out.println("Informe a dimensao do primeiro vetor");
        Scanner in = new Scanner(System.in);
        d1 = in.nextInt();
        
        //Criar o primeiro vetor
        a = new int[d1];
        
        //ler o vetor
        a = preencherVetor(a);
        
        //imprimir o vetor
        imprimirVetor(a);
    }
    
    static int[] preencherVetor(int[] vetor) {
        int d = vetor.length;
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i<d; i++) {
            System.out.println("Informe " + i);
            vetor[i] = in.nextInt();
        }
        return vetor;
    }
    
    static void imprimirVetor(int[] vetor) {
        System.out.print("[");
        for (int a : vetor) {
            System.out.print(a + ", ");
        }
        System.out.println("]");
    }
}
```


---
<sup>_Última atualização: {{ atualizacao }}_</sup>
