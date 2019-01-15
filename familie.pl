/**    Kinder von ronney.
-- child(X,ronney)
Alle Familienmitglieder, die keine Kinder haben.
--(man(X);woman(X)),(not(child(Y,X))).
Familienmitglieder, die verheiratet sind und keine Kinder haben.
--married(X,Y), not(child(Z,X)).
Alle unehelichen Kinder.
--(child(Y,X),child(Z,X)),not(married(Y,Z)).
--> produziert ein bisschen überflüssigen Output.
*/

/**father/mother/parent(X,Y) – X ist Vater/Mutter/Elternteil von Y*/
parent(X,Y) :- child(Y,X).
father(X,Y) :- child(Y,X), man(X).
mother(X,Y) :- child(Y,X), woman(X).
/**husband/wife(X,Y) – X ist Mann/Frau von Y*/
wife(X,Y) :- married(X,Y), woman(X).
husband(X,Y) :- married(X,Y),man(X).
/**grandfather/grandmother/grandparent(X,Y) – X ist Großvater/Großmutter/Großelternteil von Y*/
grandfather(X,Y) :- father(X,Z), parent(Z,Y).
grandmother(X,Y) :- mother(X,Z), parent(Z,Y).
grandparent(X,Y) :- parent(X,Z), parent(Z,Y).

/**son/daughter/child(X,Y) – X ist Sohn/Tochter von Y
child cannot be implemented, because will end in infinite loop. so it must remain an axiom.*/
son(X,Y) :- child(X,Y), man(X).
daughter(X,Y) :- child(X,Y), woman(X).

/**brother/sister/sibling(X,Y) – X ist Bruder/Schwester/Geschwister von Y*/
brother(X,Y) :- sibling(X,Y), man(X).
sister(X,Y)  :- sibling(X,Y), woman(X).
sibling(X,Y) :- (child(X,Z),child(Y,Z)), X\==Z.
/**uncle/aunt(X,Y) – X ist Onkel/Tante von Y*/
uncle(X,Y)   :- (child(Y,Z), sibling(Y,X)), man(X).
aunt(X,Y)    :- (child(Y,Z), sibling(Y,X)) woman(X).




%	First generation
man(jim).
woman(elisabeth).
man(ricky).
married(elisabeth,ricky).
married(ricky,elisabeth).


%	Second generation
woman(melissa).
man(john).
man(elvis).
woman(mary).
man(chris).
woman(anne).
woman(amanda).
man(bill).
child(john,jim).
child(john,elisabeth).
child(mary,jim).
child(mary,elisabeth).
child(chris,jim).
child(chris,elisabeth).
child(amanda,elisabeth).
child(amanda,ricky).
married(melissa,john).
married(john,melissa).
married(elvis,mary).
married(mary,elvis).
married(amanda,bill).
married(bill,amanda).

%	Third generation
woman(linda).
man(harold).
woman(maryanne).
man(ronney).
woman(jane).
man(edmond).
woman(joanna).
woman(jenna).
man(george).
child(harold,melissa).
child(harold,john).
child(maryanne,melissa).
child(maryanne,john).
child(ronney,elvis).
child(ronney,mary).
child(edmond,chris).
child(edmond,anne).
child(joanna,chris).
child(joanna,anne).
child(george,amanda).
child(george,bill).
married(ronney,jane).
married(jane,ronney).
married(jenna,george).
married(george,jenna).

%	Fourth generation
man(edmund).
woman(melinda).
man(david).
man(jimmy).
man(ken).
woman(christina).
man(ben).
child(edmund,linda).
child(edmund,harold).
child(david,ronney).
child(david,jane).
child(jimmy,ronney).
child(jimmy,jane).
child(ken,ronney).
child(ken,jane).
child(christina,jenna).
child(christina,george).
married(edmund,melissa).
married(melissa,edmund).
married(ken,christina).
married(christina,ken).

%	Fifth generation
man(henry).
woman(lisa).
man(lee).
woman(britney).
woman(anna).
child(henry,edmund).
child(henry,melinda).
child(lisa,melinda).
child(lisa,jimmy).
child(lee,christina).
child(britney,christina).
child(anna,ben).
child(anna,christina).
