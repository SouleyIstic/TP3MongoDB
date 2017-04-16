# TP3MongoDB
TP3: MONGODB + Morphia / Redis

Rappels:

Les objectifs de ce travail pratique sont les suivants 
Comprendre les bénéfices et les limites des bases nosql
Comprendre les différents types de bases nosql
Réaliser une application en utilisant une API comme Morphia proche de JPA en se plaçant dans un cadre classique de développement au dessus d’une base orientée document comme Mongo.
Comparer avec une base de données clé valeur haute performance comme Redis

Les tables d'une base de données relationnelle (BDR) correspondent à des collections en BDOD.
Une collection peut accueillir plusieurs structures de données différentes (une entrée = un "document").


1-Quelles sont les limites d’une base données orientées document (BDOD) ?

il est seulement possible d'ajouter des données qui correspondent à la structure de la base pour une BDR. 
Avec une BDOD, le développeur peut insérer n'importe quel type de données dans la collection, ce qui implique un gros risque d'avoir 
des structures de documents inconsistentes ou obsolètes avec de nombreuses mises à jour. 

2-Quelles sont les types de données stockés dans Redis?

Redis est une base de données open source de type clefs-valeurs mono-threadée.
Elle accueille les données de types :  chaînes de caractères, des hashs, des sets, des sets triés, des listes, des bitmaps, ou encore des coordonnées GPS

3-Que peut on faire comme types de requêtes ?

les structures de données gérée possède des caractéristiques uniques et commandes uniques.
 on peut utiliser un WHERE comme on le fait  habituellement dans une BDR, une valeur en table n'est accessible que via une clé. 
Alors qu'une clé est stockée comme un tableau de bytes.

Exemples de requêtes selon la structure de données:
