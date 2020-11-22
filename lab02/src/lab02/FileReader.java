package lab02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class FileReader 
{
	private List<Player> players;
	public FileReader(String fileName, int tactic)
	{
	
		File file= new File(fileName);
		FileReader.countLines(file);
			try (Scanner scan= new Scanner(file ) )
			{
				Engine engine= new Engine();
				scan.nextLine();
				scan.useDelimiter(";|\\r?\\n|\\r");
				while (scan.hasNext())
				{
					Player person= new Player();
					person.setId(scan.nextInt());
					person.setPosition(scan.next().charAt(0));
					String[] listaStatystyk = scan.next().split(",");
					
					int i=0;
					for(Statistic stat : Statistic.values())
					{
						
					person.getStatistics().put(stat, Integer.parseInt(listaStatystyk[i++].trim()));
					
					}
					person.setOverallScore(tactic);
					engine.addToList(person.getPosition(), person);
					
				}
			
					System.out.println("Sk³ad dru¿yny o najlepszych statystykach ");
					players=engine.sort();
					for(Player player : players)
					{
						System.out.println(player.toString());
					}
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
	
	}
	private static void countLines(File file)
	{
		try (Scanner countNumberOfLines= new Scanner(file))
		{
			int numberOfLines=0;
			countNumberOfLines.nextLine();
			while(countNumberOfLines.hasNext())
			{
				countNumberOfLines.nextLine();
				numberOfLines++;
			}
			countNumberOfLines.close();
			if(numberOfLines<7)
			{
				System.out.print("Niewystarczaj¹ca iloœæ zawodników, program siê zakoñczy");
				System.exit(0);
			}
			else if(numberOfLines>=40)
			{
				System.out.print("Za du¿y sk³ad do rozpatrywania, proszê go zmniejszyæ. Program siê zakoñczy");
				System.exit(0);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
