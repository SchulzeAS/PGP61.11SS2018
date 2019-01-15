a)
  im Funktionalen Paradigma versteht man als Kontext beispielsweiße
  globale Variablen und Dateien, ein Seiteneffekt ist es, diese zu verändern(Dateien speichern z.B)
_>
b)


  //Pseudocode
    global int divisor = 12

        function divideBy3(x) : float(
        setDivisor(3)
        return x / divisor
        )
        function divideXByZ(x,z) : float(
          setDivisor(z)
          return x / divisor
        )

      function main()(
      print(divisor) //-> 12
      divideBy3(324)
      print(divisor) //-> 3
      divideXByZ(5,9)
      print(divisor) //--> 9

      )
  //Pseudocode Ende
<_
Das Beispiel ist zwar sehr schlecht gewählt, aber hier kann man sehen
wie die globale Variable divisor durch dei Funktionen verändert wird
und man den Überblick verliert, wann der divisor welchen Wert enthält.
