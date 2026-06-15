package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player
{
	public int id;
	public String playerName;
	public int scoredRuns;

	public Player(){}

	public Player(int id, String playerName, int scoredRuns)
	{
		this.id = id;
		this.playerName = playerName;
		this.scoredRuns = scoredRuns;
	}

	@Override
	public String toString()
	{
		return String.format("%10d %20s %10d", this.id, this.playerName, this.scoredRuns);
	}
}

public class ArrayListEx5 {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();

		players.add(new Player(834, "Smith", 809));
		players.add(new Player(174, "James", 571));
		players.add(new Player(251, "Eliz", 900));
		players.add(new Player(782, "Peter", 1400));

		Comparator c1 = new Comparator<Player>(){

			@Override
			public int compare(Player p1, Player p2)
			{
		        return Integer.compare(p1.id,p2.id);

			}
		};

		Collections.sort(players, c1);

		for(int i=0;i<players.size();i++)
		{
			System.out.println(players.get(i));
		}
		
	}

}
