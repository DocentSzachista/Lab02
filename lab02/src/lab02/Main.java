package lab02;

import java.util.Scanner;

/*
 * Komentarz do algorytmu przeszukuj¹cego najlepszych graczy
 * Wzór: =Taktyka*(asysta+skutecznoœæ - strata)+ (100-Taktyka)*(blok+ przechwyt)
 * Przy tworzeniu obiektu Gracza statystyki s¹ podliczane wed³ug powy¿szego wzoru z uwzglêdnieniem
 * taktyki jak¹ chcemy podj¹æ (tj. czy chcemy dru¿ynê nastawion¹ na ofensywê czy te¿ na obronê).
 * Po ich podliczeniu gracze s¹ przyporz¹dkowywani do list w zale¿noœci od roli, gdzie ulegaj¹ sortowaniu
 * Po ich przesortowaniu zostaj¹ wrzucani do wspólnej listy, która jest naszym pe³nometra¿owym sk³adem.
 */
public class Main {
	public static void main(String[] args)
	{
		new FileReader("dane.txt", getInput());
	}
	
	
	private static int getInput()
	{
		System.out.println("W skali 0-100 okreœl poziom ofensywy dru¿yny do wybrania najoptyalniejszej.");
		Scanner input= new Scanner(System.in);
		int tactic;
		while(true)
		{
			if( input.hasNextInt())
			{
				tactic=input.nextInt();
				if(tactic<=100 && tactic>=0)
				{
					
					input.close();
					break;
				}
				else
				{
					System.out.println("Podana liczba nie le¿y w podanym zakresie.");
				}
			}
			else
			{
				input.next();
				System.out.println("Nie zosta³a podana liczba, proszê j¹ podaæ");
			}
		}
		return tactic;
	}
}
