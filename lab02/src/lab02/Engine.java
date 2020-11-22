package lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Klasa maj�ca za zadanie sortowa� graczy najpierw wed�ug roli na boisku a potem wed�ug ich statystyk
 * w zale�no�ci od tego czy skupiamy si� bardziej na ofensywie czy te� defensywie
 */
public class Engine 
{
	private List<Player> bramkarz = new ArrayList<Player>();
	private List<Player> rozgrywajacy= new ArrayList<Player>();
	private List<Player> skrzydlowi = new ArrayList<Player>();
	private List<Player> obrotowi = new ArrayList<Player>();
	public void addToList(char position, Player person)
	{
		switch(position)
		{
		case 'b':
			bramkarz.add(person);
			break;
		case 'o':
			obrotowi.add(person);
			break;
		case 's':
			skrzydlowi.add(person);
			break;
		case 'r':
			rozgrywajacy.add(person);
			break;
		default:
			System.out.print("Wyst�pi� b��d podczas zaczytywania pozycji gracza z pliku");
			break;
		}
	}
	
	public List<Player> sort()
	{
		List<Player> team= new ArrayList<Player>();
		 Collections.sort(obrotowi);
		 Collections.sort(bramkarz);
		 Collections.sort(skrzydlowi);
		 Collections.sort(rozgrywajacy);
		 for(int i=0; i<3; i++ )
		 {
			 if(i==0)
			 {
				 team.add(bramkarz.get(i));
				 team.add(obrotowi.get(i));
			 }
			 if(i<2)
			 {
				 team.add(skrzydlowi.get(i));
			 }
			 team.add(rozgrywajacy.get(i));
			 
		 }
		 return team;
	}
	
}
