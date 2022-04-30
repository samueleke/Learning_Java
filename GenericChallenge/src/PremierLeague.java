import java.util.ArrayList;
import java.util.Collection;

public class PremierLeague <T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public PremierLeague(String name) {
        this.name = name;
    }

    public boolean add (T team){
        if (league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collection.sort(league);
        for (T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
