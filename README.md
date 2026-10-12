# Java 21 Demo

Application web simple avec Java 21 et Spring Boot 3.5.16.
Sans base de données et sans Lombok.

## Prérequis

- JDK 21
- Maven 3.6.3 ou plus récent

## Lancer en local

```sh
mvn spring-boot:run
```

Ouvrir http://localhost:8080/ pour la page d’accueil,
ou http://localhost:8080/api/hello pour une réponse JSON.

## Tester et créer le JAR

```sh
mvn clean verify
java -jar target/app.jar
```

Le port par défaut est 8080. Il peut être remplacé par la variable
d’environnement `PORT` ou l’option `--server.port=9090`.

## GitHub Actions

Le workflow utilise Microsoft Java 21, exécute les tests et produit
l’artefact `java21-app`, contenant `app.jar`.
Il ne déploie pas l’application sur Azure.

## Azure App Service

Pour un futur déploiement, choisir le runtime **Java 21 / Java SE** :
ce projet produit un JAR exécutable avec son serveur web intégré.
Le fichier à déployer est `target/app.jar`.
La création du dépôt et son workflow de build ne configurent aucun déploiement Azure.
