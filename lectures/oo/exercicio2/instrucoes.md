---
title: Exercício prático
layout: default
---

A entrega dos exercícios de fixação será realizada através de *pull-requests* no [repositório original][repositorioOriginal] do [GitHub][github]. 

Cada dupla deverá enviar sua resposta como uma alteração no arquivo **atividade2.md**, de modo que as respostas deverão ser escritas logo abaixo o enunciado de cada questão.

---

### Criando um **Fork** do repositório original

A primeira coisa a se fazer para entrega das questões é realizar um **fork** no repositório original. Em resumo, um **fork** permite que você crie uma versão do repositório original em sua conta Github e evolua-o independentemente.

Para criar o fork do repositório em sua conta, acesse sua conta no Github e pesquise pelo repositorio **andrelanna**.

![buscaRepositorio][buscaRepositorio]

Em seguida, acesse o repositório **andrelanna/andrelanna.github.io**. Na tela seguinte você verá o conteúdo do repositório

![conteudoRepositorio][conteudoRepositorio]

No canto superior direito clique no ícone **Fork** para criar uma versão do repositório original em sua conta do GitHub. Ao final do processo de fork, você terá sua própria versão do repositório **andrelanna/andrelanna.github.io** para trabalhar e evoluir.

---

### Respondendo as questões do exercícios. 

Para responder as questões dos exercícios, os alunos deverão editar o arquivo **/lectures/oo/exercicio2/atividade2.md**. O conteúdo desse arquivo está descrito através da linguagem [Markdown][markdown], cuja proposta é facilitar a geração de conteúdo estático (arquivos HTML) ao prover um conjunto de instruções simplificado. Um resumo das instruções MD pode ser encontrado [aqui][markdownCheatsheet].

Portanto para cada questão a ser respondido, a dupla deverá realizar os seguintes passos (que serão detalhados em seguida):

1) alterar o arquivo **atividade2.md** de modo a incluir as respostas das questões.

2) adicionar as mudanças em um *commit* e enviá-los ao github.

3) fazer um *pull-request* para o repositório original. 

Para permitir a identificação da dupla, pede-se que a cada questão os alunos sejam identificados da seguinte forma a cada commit: 

*matricula aluno 1 - nome completo do aluno 1*

*matricula aluno 2 - nome completo do aluno 2*


A seguir os passos 1, 2, e 3 listados acima serão descritos detalhadamente.

**Passo 1**

Utilizando o editor de sua preferência, altere o arquivo *atividade2.md* de modo a adicionar a resposta após o enunciado da questão. 

Salve o arquivo texto.


**Passo 2**


Na linha de comando de seu sistema operacional (prompt de comando ou PowerShell em Windows, Terminal em Linux ou MacOS), acesse a pasta em que se encontra o arquivo *atividade2.md*. 

Para ver as alterações que foram realizadas no diretório, digite o seguinte comando: 

{% highlight PowerShell %}
git status
{% endhighlight %}

Dentre a lista dos arquivos não-rastreados (*untracked files*) ou modificados deverá constar o arquivo *atividade2.md*, conforme mostra a imagem abaixo: 

![arquivoModificado][arquivoModificado]

É necessário que você adicione-o ao conjunto de mudanças (que posteriormente será enviado ao GitHub). Para adicioná-lo, execute o seguinte comando na linha de comando de seu SO.

{% highlight PowerShell %}
git add atividade2.md
{% endhighlight%}

Certifique-se de que o arquivo foi adicionado ao conjunto de mudanças. Para isso, execute novamente o comando:

{% highlight PowerShell %}
git status
{% endhighlight %}

O resultado da execução desse comando deve mostrar que o arquivo faz parte do conjunto de mudanças, conforme demonstra a figura abaixo: 

![arquivoAdicionado][arquivoAdicionado]

Uma vez que os arquivos a serem submetidos já estão adicionados, as alterações devem ser "empacotadas" em um *commit*. Para cada commit é necessário, ao menos, adicionar uma mensagem informando o que o commit contem. A instrução para realizar tal tarefa é 

{% highlight PowerShell %}
git commit -m "mensagem"
{% endhighlight %}

Para facilitar a identificação dos commits, solicito que os alunos informem na mensagem do commit qual a questão que está sendo submetida. Exemplo: 

{% highlight PowerShell%}
git commit -m "Questao 1."
...
git commit -m "Questao 2."
...
git commit -m "Questao 3."
{% endhighlight%}

Depois do commit ter sido criado pelas instruções acima é necessário enviá-lo ao **seu** repositório no GitHub. Esse procedimento também é chamado de **push**. Para isso, execute a seguinte instrução na linha de comando de seu SO: 

{% highlight PowerShell %}
git push
{% endhighlight %}

O resultado da execução desse comando será similar ao apresentado pela figura abaixo:

![resultadoCommit][resultadoCommit]





[repositorioOriginal]: https://github.com/andrelanna/andrelanna.github.io
[github]: https://github.com

[buscaRepositorio]: buscaRepositorio.png
[conteudoRepositorio]: conteudoRepositorio.png
[markdown]: https://daringfireball.net/projects/markdown/
[markdownCheatsheet]: https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet 
[arquivoModificado]: arquivoModificado.png
[arquivoAdicionado]: arquivoAdicionado.png
[resultadoCommit]: resultadoCommit.png
