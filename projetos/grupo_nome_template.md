

### Projeto NOME_PROJETO

  - Equipe do Projeto:
    
    | RGM-Matrícula | Nome Completo | Curso | Github | Lattes 
    | - | - | - |  - | -
    | 11111111 | Geralt de Rívia  | Ciências da Computação |  [link](https://github.com.br/GeraltdeRívia) | [Lattes](http://lattes.cnpq.br/0843668802633139)
    | 22222222 | Aegon Targaryen  | Ciências da Computação |  [link](https://github.com.br/AegonTargaryen) | [Lattes](http://lattes.cnpq.br/0843668802633139)
    | 33333333 | Jiang Xiao Yu    | Ciências da Computação |  [link](https://github.com.br/AegonTargaryen) | [Lattes](http://lattes.cnpq.br/0843668802633139)
  
  - Imagem da Equipe:
  
	![](/projetos/20201/img/grupo_handsome_siblings_20022020.png)
	
  - Data de entrega:
    * 20/03/2020
    
  - Descrição:
    ```
    * O projeto consistiu na implementação de uma app SPA utilizando Spring Boot no back e Angular no Front
    Bla Bla Bla Bla Bla, as tabelas do projeto e os seus relacionamentos estão na sequência.  
    ```
     Ex: 
      
    | Cliente | Tipo |
    |-|-|
    | id | Numérico |
    | nome | Texto |
    | sobrenome | Texto |
    | dataCriacao | Data |
    | dataAtualização | Data |

    ```
   
  - O que é esperado como escopo mínimo:
    ```
    * Endpoints para realização de operações de crud das entidades informadas
    * Controle de segurança.
    * Testes unitários para as funcionalidades do sistema. 
    ```
    
  - O diferencial:
    ```
    * O Projeto se destaca dos demais pela automação de testes que foi incluída, ou seja, existem
    testes e2e.
    * O Projeto utiliza o template X, faz integração com X e Y.
    * O Projeto 
    ```
    
  - O que irei avaliar:
    ```
    * Seu código; 
    * Organização; 
    * Seus commmits e participação no projeto;
    ```

### Instruções

  - 0 https://githowto.com/ e https://learngitbranching.js.org/ para aprender a utilizar com Git:
  
  - 1 Faça o fork do projeto https://github.com/rodrigofujioka/papw/:
  
  - 2 Implemente o que foi pedido, utilize o código passdo como exemplo em sala de aula:
   
  - 3 Após concluir seu trabalho/Exercício faça um Merge Request para a branch spi_20201:
   
  - 4 Envie até a data combinada,  mensagem com o título  [PROJETO-SPI_20201][NOME_GRUPO_PROJETO] para a atividade informada no BlackBoard:     
  ```
  * ex:. [PROJETO-SPI_20201][ZEROBYTES_ZONAAZUL]
  ```
  
  - 5 Ao criar as entidades utilize o seguinte nome de pacote:
   
  - 5.1 - dev.nomedogrupo.nomedospacotes:      
  ```
  * Ex:. dev.zerobytes.model
  *      dev.zerobytes.resource
  *      dev.zerobytes.repository  
  *     dev.zerobytes.service          
  ```   
  
  - 5.2 - Os enpoints todos terão a seguinte anotação "/nomeGrupo/api" : 
  ```
  *  ex:. 
  *      @RequestMapping("/zerobytes/api")   //isso vai evitar conflitos na hora de inicializar o projeto.
  *      public class UsuarioResource {  }
  ```
       
  - 5.3 - As entidades devem ser mapeadas com o TableName apontando para tabelas com o nome grupo_NomeEntidade.
  ```
  * ex:.
  *     @Entity
  *     @Table("zerobytes_usuario")
  *    public class Usuario {}
  ```