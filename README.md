# RomanNumerals
[![CircleCI](https://circleci.com/gh/geleouet/RomanNumerals/tree/master.svg?style=svg)](https://circleci.com/gh/geleouet/RomanNumerals/tree/master)

[![Coverage Status](https://coveralls.io/repos/github/geleouet/RomanNumerals/badge.svg?branch=master)](https://coveralls.io/github/geleouet/RomanNumerals?branch=master)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=geleouet_RomanNumerals&metric=alert_status)](https://sonarcloud.io/dashboard?id=geleouet_RomanNumerals)


Sources produite lors du kata vidéo


# Sujet
Ecrire un convertisseur de nombres en chiffres romains.
On peut trouver la spécification de l'écriture sur [wikipédia](https://fr.wikipedia.org/wiki/Num%C3%A9ration_romaine)

# Objectifs
Expérimenter la démarche du TDD (test driven developpement)

# Citations
"Il y a une minute, tous les codes des participants fonctionnaient"
"Tous les codes produits sont testables par définition"
"On a une documentation exécutable"
"On a un harnais de sécurité pour le refactoring"

# Test Unitaire
**F.I.R.S.T**

***F*** Fast (rapide)

***I*** Independant (ou Isolated isolé) lien avec 3A (Arrange, Act, Assert)

***R*** Repeatable ( répétable, ne dépend pas de l'environnement )

***S*** Self validating ( auto - validant)

***T*** Timely ( au bon moment, juste après ou avant le code) 


**Un test n'est pas un Test Unitaire si:**
 - Interroge la base de données
 - Discute avec le réseau
 - Utilise le système de fichiers
 - est non parallélisable
 - demande une préparation de l'environnement avant exécution

# Vocabulaire
 - Tests contravariance
Couplage comportement _vs_ couplage structure

 - Tests sociables ou non
 -- sociable => école classique, Détroit
 -- non sociable => école mockist, London  
>   _Martin Fowler_

# Cycle TDD

Red -> Green -> Refactor

> Make it work, make it right, make it fast 
> _Kent Beck_

## Cycles
### Minute par minute
 - Ecriture de code motivé  _par design_ par les besoins exprimés par les tests
### Dizaine de minutes
 - Tests de plus en plus spécifiques
 - Code de plus en plus générique

### Heure par heure
 - Frontières du domaine
 - Clean architecture

# Transformations autorisées
[UncleBob](https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)

Nécessaire pour construire un chemin d'étapes en _baby steps_


