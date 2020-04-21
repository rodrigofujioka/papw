Olá, seja bem vindo a mais uma prática de desevolvimento com o professor PHD Rodrigo c. Fujioka:
Projeto de avaliação da unidade 01: Programação Avançada para Web
Período:  19 a 23 de Abril de 2020. 

* Meu site: http://www.rodrigofujioka.com
* Meu lattes: [lattes](http://lattes.cnpq.br/0843668802633139)
* Meu linkedin: [@rodrigofujioka](https://www.linkedin.com/in/rodrigofujioka/)
* Meu instagram: [@rodrigofujioka](https://www.instagram.com/rodrigofujioka) 
* Meu facebook: [@rodrigofujioka](https://www.facebook.com/rodrigofujioka)

### Avaliação um da turma 2020.1 do curso de Computação.  
  
  - Prazo de entrega do link no Github:
    * 27/04/2020  19:00 
    
  - Horários em que serão realizados os questionamentos do código:  
    * 27/04/2020  20:00 - 22:00 
   
### Instruções e Pontuações


  - 1 Implementar uma api RestFull, para isso utilize como base a representação das entidades descritas no tópico 1.1
  
  *  1.1 - Entidades a serem mapeadas: 1,0
  		
	 -| status  1 (Abertas), 2 (Fechadas) |-

		| Department | Tipo |		
		|-|-|
		| departmentName | String |
		
		---

		| Task | Tipo |
		|-|-|
		| title | String |
		| description | String |
		| taskPoints | Long|
		| status | Long|
		| startDate | Date|		
		| endDate | Date|

		---
						
		| Person | Tipo |
		|-|-|
		| firstName | String |
		| lastName | String |
		| email | String |
		| phoneNumber | String |
		| hireDate | Date|

		---
			
		| Project | Tipo |
		|-|-|
		| projectTitle | String |
		| manager | Person,
		| minSalary | Long|
		| maxSalary | Long |

		---
		
		| ProjectHistory | Tipo |
		|-|-|
		| startDate | Date|
		| endDate | Date|
		| manager | Person |
    
    
    
     <p align="center"><img src="https://github.com/rodrigofujioka/papw/blob/feature/cc_20201/projetos/20201/avaliacaocc/cc_202001_avaliacao_um.png" alt="Diagrama de Entidade" /> </p>
  
  - 2 Implemente os services, repositorys, DTO, Endpoints Rest para as entidade do item 1.1: (0,5)
  
      <p align="center"><img src="https://github.com/rodrigofujioka/papw/blob/feature/cc_20201/projetos/20201/avaliacaocc/cc_202001_avaliacao_uml_sequence.png" alt="Diagrama de Sequência" /> </p>
  
  
  
  - 3 Customização : (1,0)
  -  3.1 - Implemente um endpoint que retorne todas as tasks desenvolvidas em um período de datas.  
  -  3.2 - Implemente um endpoint que retorne todas as tasks desenvolvidas em um período de datas e que estão com status 2 (Fechadas)
  -  3.3 - Implemente um endpoint que retorne todas as tasks desenvolvidas em um período de datas e que estão com status 1 (Abertas)
  -  3.4 - Implemente um endpoint que retorne todas as tasks que estejam em um intervalo de pontuação, 
  
   
  - 4 - Testes unitários para os services (0,5) 
   

  - 5 Após concluir seu projeto envie o link para o exerício avaliacao_um no BlackBoard
  - 5.1 - Deixei seu código pronto para as perguntas que vão ser realizadas no dia da avaliação.
  - 5.2 - Você vai precisar estar com a webcam, seja do celular ou notebook ligada durante as perguntas. 
   
    ```
