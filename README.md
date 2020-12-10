# ExerciciosAdapter

### Exercícios realizados na disciplina de Programação VI, utilizando o padrão Adapter.

#### Descrição do Problema

Considere a construção de um programa para reprodução de arquivos de ́audio (player de música) com capacidade de reproduzir arquivos nos seguintes formatos: mp3, wav e wma. Há uma classe específica para tratar os arquivos de ́audio de cada um dos formatos de ́audio. As classes que processam arquivos nos formatos mp3 e wav atendem (isto ́e, realizam) uma interface com os seguintes métodos:

* O método abrir() ́e utilizado para carregar um arquivo de ́audio na memória.

* O método reproduzir() ́e utilizado para reproduzir o arquivo de ́audio que foi carregado na memória pelo método abrir(). A reprodução começa a partir do início do arquivo.

* O método parar() ́e utilizado para fechar o arquivo, liberando a memória ocupada.

Já a reprodução de arquivos no formato wma utiliza a classe WmaPlay que possui os seguintes métodos:

* O método setFile() ́e utilizado para definir o nome do arquivo que será utilizado pelo objeto de reprodução de arquivos wma.

* O método open() ́e utilizado para abrir o arquivo definido pelo método setFile().

* O método setLocation() ́e utilizado para indicar a posição do arquivo onde deve iniciar a reprodução do ́audio. Para começar a partir do início do arquivo, deve-se fornecer como argumento, o valor “0”.

* O método play() ́e utilizado para reproduzir o arquivo aberto com o método open(). O arquivo de  ́audio começa a ser reproduzido a partir da posição indicada pelo método setLocation.

* O método stop() ́e utilizado para parar a reprodução do arquivo.

A classe principal, que implementa o método estático main() ́e a classe audioPlayer.

Diante destas necessidades, pede-se:

1. Utilize o padrão de projeto Adapter para que seja possível incorporar a interface FormatoAudio na reprodução de arquivos no formato wma.
Observação: a classe WmaPlay não pode ser modificada.

2. Elabore o diagrama de classes da solução.

3. Crie uma classe com o método main() para demonstrar a utilização do adaptador da classe WmaPlay.

#### Diagrama de Classes

<img src="Diagrama Classes.PNG" heigth="600" width="600">