# Dominando IDEs Java

- **APRESENTAÇÃO E VISÃO GERAL**
    - **APRESENTAÇÃO DO CURSO**
        
        Objetivos
        
        Ao final deste curso, o Dev será capaz de configurar o ambiente de desenvolvimento Java nos sistemas operacionais Linux e Windows.
        
        Com isso, conhecer um pouco as principais funcionalidades das IDEs mais utilizadas no mercado: Eclipese IDE e IntelliJ IDEA IDE.
        
        Percursos
        
        Aula 01 → Configurando Ambiente de desenvolvimento Java
        
        Aula 02 → Instalação e configuração do Eclipese IDE
        
        Aula 03 → Instalação e configuração da IntelliJ IDEA IDE
        
        Aula 04 → Outras opções
        
    - **VISÃO GERAL DO CURSO**
        
        **Objetivos da Aula**
        
        1. Conhecer um pouco da história do Java
        2. A plataforma Java e a Linguagem Java
        3. Versões do Java
        4. O que é IDE?
        
        **História do Java**
        
        Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90, na empresa Sun Microsystems e posteriormente adquirida pela Oracle em 2008.
        
        Desde seu lançamento, em maio de 1995, a plataforma Java foi adotada mais rapidamente do que qualquer outra linguagem de programação na história da computação.
        
        Tornou-se popular pelo seu uso na internet e está presente em navegadores, programas e jogos de computador, celular, calculadoras e etc.
        
        **Características do Java**
        
        Linguagem interpretada
        
        ![Untitled](Dominando%20IDEs%20Java%2009a7a7194e694edd99b1c607ec63275e/Untitled.png)
        
        Diferente das linguagens de programação compiladas, (a compilação do código se dá ainda em tempo de desenvolvimento) a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (JVM)
        
        ![Untitled](Dominando%20IDEs%20Java%2009a7a7194e694edd99b1c607ec63275e/Untitled%201.png)
        
        **Plataforma X Linguagem**
        
        A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem.
        
        Uma grande vantagem da plataforma é a de não estar presa a um único sistema operacional ou hardware, pois seus programas rodam através de uma máquina virtual que pode ser emulada.
        
        Java SE (Java Platform, Estandard Edition)
        
        Java EE (Java Platform, Enterprise Edition)
        
        Java ME (Java Platform, Micro Edition)
        
        **Fases da Execução Java**
        
        1. Escrevemos o seu código-fonte (arquivo com a extenão .java)
        2. Utilizamos o JDK para compilar o seu código-fonte e gerar o arquivo bytecode (arquivo com a extensão .class)
        3. Para executar o seu programa, a JVM lê o arquivo compilado (.class) e as bibliotecas padõres do Java que estão no JRE
        
        ![Untitled](Dominando%20IDEs%20Java%2009a7a7194e694edd99b1c607ec63275e/Untitled%202.png)
        
        **JDK x JRE**
        
        JDK (Java Developement Kit) →  é o Kit de Desenvolvimento Java responsável por compilar código-fonte (.java) em bytecode (.class)
        
        JVM (Java Virtual Machine) → é a Máquina Virtual do Java responsável por executar o bytecode (.class)
        
        JRE (Java Runtime Environment) → Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar  o seu código e para a JVM executar o seu programa.
        
        **Versões Java**
        
        Principal diferença entre OpenJDK e JDK Oracle: o **OpenJDK** é um Java totalmente open source com uma GNU General Public License e já o **JDK Oracle** requer uma licença comercial sob o Contrato de Licença de Código Binário Oracle
        
        Os lançamentos das versões OpenJDL LTS (suporte de ongo prazo) acontecem pelo menos a cada quatro anos.
        
        ![Untitled](Dominando%20IDEs%20Java%2009a7a7194e694edd99b1c607ec63275e/Untitled%203.png)
        
        **O que é IDE?**
        
        IDE, ou ambiente de desenvolvimento integrado, é um software que combina ferramentas comuns de desenvolvimento em uma única interface gráfica do usuário (GUI), facilitando o desenvolvimento de aplicações.
        
        O Java possui um conjunto de ferramentas para se desenvolver programas baseados nele, que são conhecidos como Java Development Kit ou JDK, sendo este o ambiente voltado para os desenvolvedores.
        
        A JDK faz parte do funcionamento das IDE's - programas de desenvolvimento como IntelliJ, Eclipse, NetBeans, entre outros.
        
        O **IntelliJ IDEA** é um ambiente de desenvolvimento integrado escrito em jJava para desenvolvimento de software de computador. Está disponível como uma edição da comunidade licenciada Apache 2, [6] e em uma edição comercial proprietária.
        
        O **Eclipese** é uma IDE  para desenvolvimento Java, Porém suporta várias outras linguagens. Ele foi feito em Java e segue o modelo open source de desenvolvimento de software.
        
- **AMBIENTE DE DESENVOLVIMENT UBUNTU**
    
    [GitHub - cami-la/curso-dio-dominando-ides-java: Repositório do curso Dominando IDEs Java. Curso este oferecido pela Digital Innovation one e ministrado por mim.](https://github.com/cami-la/curso-dio-dominando-ides-java)
    
    - **INSTALAÇÃO JDK E GIT NO UBUNTU**
        
        [https://www.youtube.com/embed/fXOwgLVBuEk](https://www.youtube.com/embed/fXOwgLVBuEk)
        
    - **INSTALAÇÃO INTELLKIJ E ECLIPSE NO UBUNTU**
        
        [https://www.youtube.com/embed/15sEEWwb_8o](https://www.youtube.com/embed/15sEEWwb_8o)
        
- **AMBIENTE DE DESENVOLVIMENTO WINDOWS**
    - **INSTALAÇÃO JDK E GIT NO WINDOWS**
        
        [https://www.youtube.com/embed/MoxMrVNFdTU](https://www.youtube.com/embed/MoxMrVNFdTU)
        
        ```java
        public class PrimeiroProg {
        	public static void main (String args[]){
        		System.out.println("Hello Word!");
        	}
        }
        ```
        
        ```bash
        javac PrimeiroProg.java #compilar o programa
        java PrimeiroProg #executar o programa
        ```
        
    - **INSTALAÇÃO INGELLIJ E ECLIPCE NO WINDOWS**
        
        [https://www.youtube.com/embed/9BcGFHw7Z-M](https://www.youtube.com/embed/9BcGFHw7Z-M)
        
- **ECLIPSE**
    - **CRIANDO SEU PRIMEIRO PROJETO COM ECLIPSE**
        
        [https://www.youtube.com/embed/xZs5n5ifDhY](https://www.youtube.com/embed/xZs5n5ifDhY)
        
    - **ATALHOS**
        
        [https://www.youtube.com/embed/iOcTLsjoqzk](https://www.youtube.com/embed/iOcTLsjoqzk)
        
    - **GIT E GITHUB**
        
        [https://www.youtube.com/embed/TrRxzTvJVN4](https://www.youtube.com/embed/TrRxzTvJVN4)
        
        Ao vincular o git no eclipse indico fazer via ssh, o usuário será preenchido automaticamente com git e a senha será a chave ssh cadastrado na máquina.
        
    - **DEBUG**
        
        [https://www.youtube.com/embed/fgGAQe7uOkM](https://www.youtube.com/embed/fgGAQe7uOkM)
        
    - **ULTIMAS OBSERVAÇÕES SOBRE ECLIPSE**
        
        [https://www.youtube.com/embed/3E95fwkCNis](https://www.youtube.com/embed/3E95fwkCNis)
        
- **INTELLIJ**
    - **CRIANDO SEU PRIMEIRO PROJETO COM INTELLIJ**
        
        [https://www.youtube.com/embed/-0em44igtPs](https://www.youtube.com/embed/-0em44igtPs)
        
    - **MAIS ATALHOS E VERSIONAMENTO**
        
        [https://www.youtube.com/embed/lVBeuaSIN8A](https://www.youtube.com/embed/lVBeuaSIN8A)
        
    - **DEBUG**
        
        [https://www.youtube.com/embed/mVFal-RzrUs](https://www.youtube.com/embed/mVFal-RzrUs)
        
    - **PLUGINS**
        
        [https://www.youtube.com/embed/85TT4e7Z1sM](https://www.youtube.com/embed/85TT4e7Z1sM)
