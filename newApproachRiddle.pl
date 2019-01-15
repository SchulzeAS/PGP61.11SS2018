right_of(X, Y) :- X is Y+1.
left_of(X, Y) :- right_of(Y, X).

next_to(X, Y) :- right_of(X, Y).
next_to(X, Y) :- left_of(X, Y).

solve(X) :- solve(X,ParkPlatz).

solve(X,ParkPlatz) :-           %  lot, owner, cd , brand, color, origin
          ParkPlatz = [car(1, Owner1, Cd1, Brand1, Color1, Origin1),
                       car(2, Owner2, Cd2, Brand2, Color2, Origin2),
                       car(3, Owner3, Cd3, Brand3, Color3, Origin3),
                       car(4, Owner4, Cd4, Brand4, Color4, Origin4),
                       car(5, Owner5, Cd5, Brand5, Color5, Origin5)],
                       %          lot Owner     cd          Brand1   color      origin
                       member(car(4,  _,        eminem,     _,        _,        _),ParkPlatz),
                       member(car(_,  _,        _,          ferrari,  red,      _),ParkPlatz),
                       member(car(_,  teacher,  _,          _,        silver,   _),ParkPlatz),
                       member(car(_,  _,        madonna,    vw,       _,        _),ParkPlatz),
                       member(car(B,  _,        _,          _,        blue,     _),ParkPlatz),
                       member(car(N,  _,        _,          smart,    _,        _),ParkPlatz),
                       member(car(C,  _,        _,          _,        _,        hamburg),ParkPlatz),
                       member(car(_,  _,        _,          _,        green,    hamburg),ParkPlatz),
                       member(car(D,  _,        _,          _,        brown,    _),ParkPlatz),
                       member(car(_,  butcher,  abba,       _,        _,        _),ParkPlatz),
                       member(car(E,  _,        beatles,    _,        _,        _),ParkPlatz),
                       member(car(F,  teacher,  _,          _,        _,        _),ParkPlatz),
                       member(car(_,  notary,   _,          _,        _,        cologne),ParkPlatz),
                       member(car(_,  carpenter,_,          ford,     _,        _),ParkPlatz),
                       member(car(G,  _,        _,          _,        _,        berlin),ParkPlatz),
                       member(car(H,  baker,    _,          _,        _,        _),ParkPlatz),
                       member(car(I,  _,        _,          _,        _,        stuttgart),ParkPlatz),
                       member(car(M,  _,        _,          bmw,      _,        munich),ParkPlatz),
                       next_to(G,H),
                       next_to(E,F),
                       next_to(M,B),
                       next_to(B,N),
                       next_to(C,D),
                       abs(M-I)>1,

                       member(car(_,X,heino,_,_,_),ParkPlatz).
