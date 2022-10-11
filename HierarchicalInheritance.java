package oops7;

	import java.time.LocalDate;

	public class HierarchicalInheritance {

		
		public static void main(String[] args) {
			Athletic athletic = new Athletic(1, "Discuss Throw","Pune",LocalDate.of(1992, 5, 5));
			
			
			athletic.showathletic();
			System.out.println(athletic.toString());
			
			
			Cricket_player cPlayer = new Cricket_player(101, "sachin", "Mumbai", LocalDate.of(1976, 10, 5));
			cPlayer.cricketmethod();
			cPlayer.setJersyno(10);
			cPlayer.setTeamname("India");
			cPlayer.setTotalmatchplayed(500);
			cPlayer.setTotalruns(15000);
			cPlayer.setHighestscore(200);
			cPlayer.setAvg(140);
			
			
			System.out.println(cPlayer.toString());
			
			
			Football_player fPlayer = new Football_player(102, "Ronaldo", "portugal", LocalDate.of(1987, 7, 12));
			fPlayer.footballmethod();
			fPlayer.setJersyno(7);
			fPlayer.setTeamname("man united");
			fPlayer.setHighestgoal_in_a_match(4);
			fPlayer.setTotalgoals(300);
			fPlayer.setTotalmatchedplayed(206);
			
			System.out.println(fPlayer.toString());
		}
	}


