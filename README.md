Readme.md
Quando o git hub vem como padrão (master) 

$git config --global init.defaulBranch main ou 

$git branch -M main

O comando inicial do github é o:

$ git init

Para que saibamos os arquivos que contém na pasta em questão, utilizamos:

$git status

Este comando mostra os arquivos que estão na pasta mas ainda não reconhece como arquivos que deve tratar

Caso queiramos adicionar um arquivo podemos usar 

$git add [nome do arquivo] agora o git reconhece que temos mudanças a serem comitadas.

Quando temos vários arquivos a serem adicionamos podemos utilizar um dos 3 comandos:

$git add -A

$git add --all

$git add .

Caso algum arquivo não deva ser usado, utilizamos o comando:

$git rm --cached [nome do arquivo]

Caso queiramos remover todos os arquivos da visão do git, podemos usar:

$git rm --cached -r .

Logo depois de termos certeza que todos os arquivos são válidos, podemos fazer o commit:

$git commit -m "Mensagem que queremos"

Caso fizermos outra alteração no arquivo, podemos utilizar o git add e o git commit novamente

Lembre-se, a mensagem seja descritiva mas não seja tão grande.

############################################################################################

4 estados de um arquivo - ciclo de vida do arquivo:

1 - Untracked - Não rastreado

2 - Staged - Arquivo preparado, está pronto para ser salvo

3 - Unmodified - O arquivo está salvo, não pode ser alterado

4 - Modified - O arquivo está modificado

Existe um status superior, que é o Tracked que engloba o Unmodified, Modified e Stagied. 
Não engloba o Untrucked porque este arquivo o git não visualiza.

Usando na prática

1º Temos um arquivo chamado hello que criamos e está salvo.
   Para o git, este arquivo está Unmodified.

2º Caso fizermos alguma alteração no arquivo e aplicarmos o comando $git status, veremos que o arquivo irá
   para o status Staged (ou seja, o arquivo está pronto para ser commitado)

3° Depois que fizermos a alteração do arquivo e fizermos um $git status, veremos que o arquivo irá para staged,
   ou seja, pronto para ser commitado.

4º Caso adicionarmos um arquivo e alterarmos o arquivo em questão e fizermos um git add, essa alteração
leva para o status Untracked

############################################################################################

Caso queramos visualizar o que alteramos em um arquivo, podemos utilizar o comando

$git diff

Neste caso nós visualizamos a versão que foi modificada (modified) versus a versão não modificada (unmodified)
Mostra também as linhas que adicionamos e os arquivos que criamos

Caso alterarmos o arquivo e adicionarmos outro e criarmos um git add . e mesmo assim não lembrarmos o que 
foi feito em cada arquivo, podemos usar o comando:

git diff --cached
ou
git diff -- staged

Se quisermos verificar todas os commits, podemos usar o comando:

$git log

Caso a janela tenha muita informação, podemos navegar por ela utilizando as setas. Para que queiramos sair
da da visualização, utilizamos o comando :q

Caso não precisarmos de todas as informações utilizamos o comando:

$git log --oneline

Podemos usar também números para delimitar posição do commit, por ex:

$git log -1 
$git log -4

E podemos combinar com o git oneline

git log --oneline -1

Caso queremos ver tudo o que aconteceu, utilizamos os 

git log -p





