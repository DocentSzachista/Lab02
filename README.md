# Program labolatoria doktor Kubik 2020
## Treść problemu:

Podczas laboratorium należy rozwiązać problem selekcji 7 zawodników, którzy mają pojawić się na boisku podczas meczu piłki ręcznej, gdy znane są: skład drużyny (lista zawodników wraz ze statystykami ich osiągnięć) oraz bieżący cel (ofensywa, defensywa). Oczywiście tak zdefiniowany problem jest dużym uproszczeniem sytuacji rzeczywistej. Nie uwzględniane są wszystkie przepisy gry ani możliwe sytuacje. Zakładamy, że statystyki zawodników podane są w pliku tekstowym o zawartości odpowiadającej poniższemu schematowi:

Nr zawodnika; Pozycja; Statystyka: asysta, blok, przechwyt, strata, skuteczność
1;b;0,0,0,0,20
2;o;40,30,30,40,70
...

Statystyki mają postać tabelaryczną: pierwszy wiersz to wiersz nagłówkowy, kolejne kolumny rozdzielone są średnikami, elementy w kolumnie rozdzielone są przecinkami. Nr zawodnika jest unikalny (jest to liczba całkowita). Pozycja, na jakiej gra dany zawodnik reprezentowana jest pierwszą literą jej nazwy, odpowiednio do: bramkarz, obrotowy, rozgrywający, skrzydłowy. Liczby w kolumnie Statystyka są całkowite i reprezentują procentowo, odpowiednio, osiągnięcia każdego z zawodników w danym elemencie.
Cel powinien być parametrem zadawanym w programie, przyjmującym wartości od 0 do 100. Wartość 100 oznacza skupienie się tylko na ofensywie, wartość 0 oznacza skupienie się tylko na defensywie, zaś wartości pośrednie - uwzględnienie ofensywy i defensywy w odpowiednim procencie.
Należy zaproponować sposób wyliczania wartości dokonanej selekcji (uwzględniając wpływ poszczególnych statystyk na osiągnięcie celu). Liczba wszystkich zawodników nie może być mniejsza niż 7, ale też nie większa niż 40.
Znalezione rozwiązanie, tj. wyznaczony skład drużyny przy zadanym celu oraz wartość dokonanej selekcji, należy wypisać na ekranie. Pozostałe szczegóły mają być zgodne z ustaleniami poczynionymi na początku zajęć.
