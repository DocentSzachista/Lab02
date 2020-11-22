package lab02;
import java.util.*;

/*
 * Klasa trzymaj¹ca wszystkie informacje o graczu
 */
public class Player implements Comparable<Player>
{
	private int id;
	private char position;
	private int overallScore;
	private HashMap<Statistic,Integer> statistics= new HashMap<>();
	public Integer getId()
	{
		return this.id;
	}
	public char getPosition()
	{
		return this.position;
	}
	public void setId(Integer id)
	{
		this.id=id;
	}
	public void setPosition(char position)
	{
		this.position=position;
	}
	public HashMap<Statistic, Integer> getStatistics() 
	{
		return statistics;
	}
	public int getOverallScore() 
	{
		return overallScore;
	}
	public void setOverallScore(int focus) 
	{
		int block=statistics.getOrDefault(Statistic.BLOCK, 0);
		int intercept=statistics.getOrDefault(Statistic.INTERCEPT, 0);
		int assist=statistics.getOrDefault(Statistic.ASSIST, 0);
		int loose= statistics.getOrDefault(Statistic.LOOSE, 0);
		int efficiency=statistics.getOrDefault(Statistic.EFFICIENCY, 0);
		overallScore=focus*(assist+efficiency -2*loose)+(100-focus)*(block+intercept);
	}
	public String toString()
	{
		return "id "+this.id+" rola: "+this.position+" ogolny score "+this.overallScore+ " Statystyki: "+this.statistics.entrySet() ;
	}
	
	public int compareTo(Player another)
	{
		if(this.overallScore<another.getOverallScore())
		{
		return 1;
		}
		else if(this.overallScore==another.getOverallScore())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
