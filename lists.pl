/** H is head, T is tail, Y is "Return".
Take of Head and append to Tail.*/
rotateLeft([H|T],Y) :- append(T,[H],Y).
rotateRight(X,Y) :-  rotateLeft(Y,X).
/** X is list in, G is predicate, R is "Return"*/
filter(X,G,R) :- include(equals(G),X,R).
equals(X,Y) :- X == Y.
