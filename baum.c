#include <stdio.h>
int main(void){

printf("enter dimension (giv odd number pls): \n");
int i = 0;
scanf("%i", &i); //einlesen von "i", & zur Adressierung, %i weil wir einen int einlesen.
//CHECK INPUT
if(i<1 || i>26 || i%2 == 0){	
printf("%s","NO YOU DONT! GIV GUD INPUT! \n");
return 0;
}
//Variablen Initialisieren.
char c = 65;
int k = 0;
int m = 0;
//RAHMENSCHLEIFE
for(k=0; k<i*2; k+=2){
//DIE NACHFOLGENDE SCHLEIFE ERZEUGT THEORETISCH LEERZEICHEN IN KORREKTER MENGE
//BERECHNUNG DURCH MAXIMALE ANZAHL(k = MITTE) - DERZEITIGE ANZAHL 
	for(m=0;m<(26-k)/2;m++){
	printf(" ");	
	}


//DIE NACHFOLGENDE FORSCHLEIFE ERZEUGT EINE REIHE AUS BUCHSTABEN ERFOLGREICH
char c = 65;
	int j = 0;
	for(j=0;j<(2*(k/2)+1);j++){

	if(j <= k / 2 -1){
		 printf("%c",c++);
		  //printf("%i",j);
		} 
	if(j > k / 2 -1){
		 printf("%c",c--);
		 //printf("%i",j);
		} 
		
	}
	printf("\n");
}
//ENDE DER FUNKTIONIERENDEN FORSCHLEIFE DO NOT TOUCH

printf("\n");
}
