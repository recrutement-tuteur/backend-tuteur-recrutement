# Mon Projet Spring Boot

Un projet Spring Boot pour [décrire brièvement l'objectif du projet].

## Prérequis

Avant de pouvoir démarrer ce projet, vous devez avoir installé les éléments suivants :

- **Java 17+** (ou la version compatible avec votre projet)
- **Maven**
- **IDE** comme IntelliJ IDEA, Eclipse, ou Visual Studio Code
- **Base de données** 

## Cloner le dépôt

Clonez ce dépôt en utilisant la commande suivante :

```bash
git clone https://github.com/recrutement-tuteur/backend-tuteur-recrutement.git
```

## Configuration

Pour configurer la base de données, vous pouvez modifier le fichier `application.properties` avec les informations appropriées :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_la_bd
spring.datasource.username=root
spring.datasource.password=root
```
## Lancer l'application


```bash
mvn spring-boot:run
```