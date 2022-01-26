# TP5 cloud

## Create project

### Heroku 

Créer projet avec Maven :

```mvn archetype:generate -DarchetypeArtifactId=**jersey-heroku-webapp(a changer)** \ -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \ -DgroupId=**a changer** -DartifactId=**a changer** -Dpackage=**a changer** \ -DarchetypeVersion=2.32```

Installer packages :

```mvn clean package```

Lancer serveur avec Jetty :

```mvn jetty:run```

## Déploiement

Connexion 

```heroku create```

Déploiement avec git 

```git push heroku master```

Vérif 

```heroku ps```

Ouvrir site

```heroku open```

Détruire application

WebApp -> Settings -> *scroll* -> Delete App

### Addons

```heroku addons```

Ajout d'addon -> marketplace heroku -> associer avec l'app



### Erreurs :

UnsupportedClassVersionError -> Version de java -> passer en java 11 dans system.properties (racine du projet) puis ```mvn clean package``` -> redéployer
