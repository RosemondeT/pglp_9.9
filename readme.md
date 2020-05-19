#Logiciel de dessin 

#### Objectif du projet
Réaliser un logiciel de dessin qui permet de faire une description textuelle et de 
de manipuler les figures géométriques telles que: des cercles, des rectangles, des carrés et des triangles.
<hr>

#### Description des figures
* Un cercle est une figure géométrique ayant un centre et un rayon.
Exemple: Cercle(centre=(0,0),rayon=10)

* Un carre est une figure géométrique ayant un origine et un côté
Exemple: Carre(origine=(5,5), coté=20)

* Un rectangle est une figure ayant un origine, une longeur, une largeur. La longeur doit être toujours supérieure
à la largeur.
Exemple: Rectangle(origine=(3,3), longueur=30, largeur=10) 

* Un triangle est une figure qui a trois côtés.
Exemple: Triangle(cote1(2,4), cote2(3,5), cote3(1,0))

<hr>

#### Manuel Utilisateur

Une figure géométrique est un cercle, un carré, un rectangle, un triangle.
Cette application possède plusieurs fonctionnalités à savoir:

* Créer une figure géométrique
* Déplacer une figure géométrique
* Afficher une ou un ensemble de figure géométrique 
* Sauvegarder une ou un ensemble de figure géométrique 
* Supprimer une figure géométrique
* Restaurer une commande precedemment annulée
* Annuler la dernière commande
* Quitter le programme.

Pour passer une commande voici les exemples de commandes valides:

* Pour créer un cercle: c1 = Cercle((0, 0), 50)
* Pour créer un carré: c2 = Carre((0, 0), 30)
* Pour créer un rectancle: r1 = Rectangle((0, 0), 40, 10)
* Pour créer un triangle: t1 = Triangle((0, 0), (2, 2), (4, 0))
* Pour déplacer un cercle : move(c1, (10, 20))
* Pour supprimé un carré: delete(r1, t1)
* Pour restaurer une commande precedemment annulée: redo ou REDO
* Pour annuler la dernière commande: undo ou UNDO
* Pour quitter le programme: exit ou EXIT
                               
<hr>

#### Manuel technique

Les technologies utlisées pour la réalisation de cette application:
* Le langage java pour l'écriture du code
* Maven pour la construction du projet
* JDBC pour permettre la communication avec une base de donnée

Les dépendances utilisées:
* Apache derby pour la base de données
* Junit pour les tests unitaires
* spotbugs utilisé pour détecter les bugs du programme

Les designs patterns utilisés:
* Le pattern Composites
* Le pattern Command
* Le pattern DAO

<hr>

#### Hiérarchie de classe représentant les formes graphiques.

* Une classe Interface FormeGraphique disposant des mèthodes: 
* void move(double x, double y) pour le déplacement des figures
* void printForme()pour l'affichage des figures
*  String getNom(); qui permet de retourner le nom d'une figure donnée

Plusieurs classes implémentent cette l'interface FormeGraphique à savoir :
* Cercle
* Carre
* Rectangle
* Triangle
<hr>


#### Representation de la notion de groupe en appliquant le pattern Composite

Pour implémenter la notion de groupe avec le pattern Composite, cela a necessité la 
création d'une classe Groupe_FormeGraphique implémentant la méthode FormeGraphique et
 disposant des méthodes remove, add et getChild
  
<hr>

#### Utlisation du pattern DAO et JDBC pour rendre les formes persistants.

Pour rendre les formes persistants, cela a necesiité la création:

* D'une classe Abtraite nommée DAO qui contient les opérations CRUD
* d'une classe DAOFactory qui représente la fabrique du DAO
* des classes CercleDAO, CarreDAO, RectangleDAO, TriangleDAO qui héritent de la classe DAO et implémentent 
les méthodes CRUD de celle-ci

Pour permettre la communication avec une base de données en utilisant le driver JDBC, cela a necessité la création d'une classe 
Login qui permet la connexion à une base de données Derby et la création des digfférentes Tables.

<hr>

#### La classe DarwingTUI et DarwingApp.

La classe DarwingApp est une classe qui communique avec la classe DarwingTUI qui est une classe
dont l'objectif est d'analyser les commandes.La classe DarwingApp repcupère la saisie de l'utilisateur, la passe à la classe DarwingTUI qui analyse la saisie afin de détecter d'éventuelles erreurs syntaxiques avant de faire appelle un interpreteur charger de detecter le type de commande et l'executer.

 <hr>
 
#### Utilisation du pattern Command

Les commandes ont été implémentées en utilisant le pattern Command.
* On a la classe Commande qui est une interface possèdant la méthode excute().
Plusieurs classes implémentent cette classe à savoir:
* La classe CommandeCercle chargée d'executer les commandes liées à un cercle
* La classe CommandeCarre chargée d'executer les commandes liées à un carré
* La classe CommandeRectangle chargée d'executer les commandes liées à un rectangle
* La classe CommandeTriangle chargée d'executer les commandes liées à un triangle
* La classe CommandeMove qui permet de déplacer une forme graphique donnée
* La classe CommandeAffiche qui permet d'afficher une commande donnée
* La classe CommandeLoad qui permet le chargement d'un ensemble de commande à la demande de l'utilisateur
* La classe CommandeRedo qui permet de restaurer d'une commande precedemment annulé
* La classe CommandeUndo qui permet d'annuler la dernière commande effectuée par l'utlisateur
* La classe  CommandeSave qui permet de sauvergarder les commandes de l'utilisateur à sa demande
* La classe CommandeQuit qui permet de quitter le programme
* La classe Interpreteur qui permet d'interpreter le type de commande et d'executer.

 <hr>

#### Auteur

|            Nom              |               Email                    |
|-----------------------------|----------------------------------------|
|                             |                                        |
| Traoré Rosemonde Bénédicte  | rosemonde-benedicte.traore@ens.uvsq.fr |



    







 