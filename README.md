# devcartevis
On va se mettre dans la peau d'un developpeur java auquel on demande :
	Une esn avec plusieurs bu souhaite mettre en place une simple application lui permettant d'avoir la liste de ses developpeurs 
	via une carte de visite:
		- consulter la liste des cartes de visite
		- mettre à jour une carte de visite
		- supprimer une cartede visite
		- rajouter une carte de visite 
		
		- un batch permettant d'intégrer les cartes de visite de consultant permettant changer de bu
		- l'intégration via jms
		-
		
		- aller rapidement en production (1 jour de dev)
		- souhaite déployer l'application sur ses 5 sites (Etats Unis, France, Senegal, Australie, Inde)
		
		
		- la sécrité n'est pas forcément demandé dans une première version vu que l'application sera utilisé en interne


devcartevis-v1: expliquer comment lancer spring boot, autoconfig, explication log et jar

	avec le starter web, devtools
	avec le starter actuator
	simple rest api pour consulter, rajouter, mettre à jour, supprimer
	customisation de la banniere
	mettre en place des fichiers de properties pour la dev et la production
	changer le port utilisé sur les deux environnements
	
devcartevis-v2: coushe data et rest api

	rajouter les starter , jpa, h2, flyway
	
	
devcartevis-v3: couche presentation: mise en place des controlleurs
	
	starter thymleaf
	
devcartevis-v4: mise en place de la sécurité 

	starter security
	
devcartevis-v5:
	starter batch et jms
