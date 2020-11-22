package lab02;

import java.util.Scanner;

/*
 * Komentarz do algorytmu przeszukuj�cego najlepszych graczy
 * Wz�r: =Taktyka*(asysta+skuteczno�� - strata)+ (100-Taktyka)*(blok+ przechwyt)
 * Przy tworzeniu obiektu Gracza statystyki s� podliczane wed�ug powy�szego wzoru z uwzgl�dnieniem
 * taktyki jak� chcemy podj�� (tj. czy chcemy dru�yn� nastawion� na ofensyw� czy te� na obron�).
 * Po ich podliczeniu gracze s� przyporz�dkowywani do list w zale�no�ci od roli, gdzie ulegaj� sortowaniu
 * Po ich przesortowaniu zostaj� wrzucani do wsp�lnej listy, kt�ra jest naszym pe�nometra�owym sk�adem.
 */
public class Main {
	public static void main(String[] args)
	{
		new FileReader("dane.txt", getInput());
	}
	
	
	private static int getInput()
	{
		System.out.println("W skali 0-100 okre�l poziom ofensywy dru�yny do wybrania najoptyalniejszej.");
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
					System.out.println("Podana liczba nie le�y w podanym zakresie.");
				}
			}
			else
			{
				input.next();
				System.out.println("Nie zosta�a podana liczba, prosz� j� poda�");
			}
		}
		return tactic;
	}
}
