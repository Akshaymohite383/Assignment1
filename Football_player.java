package oops7;

	import java.time.LocalDate;

	public class Football_player extends Athletic {
		public Football_player(int aid, String aname, String address, LocalDate dob) {
			super(aid, aname, address, dob);
			// TODO Auto-generated constructor stub
		}
		public String getTeamname() {
			return teamname;
		}
		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}
		public int getJersyno() {
			return jersyno;
		}
		public void setJersyno(int jersyno) {
			this.jersyno = jersyno;
		}
		public int getTotalgoals() {
			return totalgoals;
		}
		public void setTotalgoals(int totalgoals) {
			this.totalgoals = totalgoals;
		}
		public int getHighestgoal_in_a_match() {
			return highestgoal_in_a_match;
		}
		public void setHighestgoal_in_a_match(int highestgoal_in_a_match) {
			this.highestgoal_in_a_match = highestgoal_in_a_match;
		}
		public int getTotalmatchedplayed() {
			return totalmatchedplayed;
		}
		public void setTotalmatchedplayed(int totalmatchedplayed) {
			this.totalmatchedplayed = totalmatchedplayed;
		}
		public String teamname;
		public int jersyno;
		public int totalgoals;
		public int highestgoal_in_a_match;
		public int totalmatchedplayed;
		@Override
		public String toString() {
			return "Football_player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
					+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", totalmatchedplayed=" + totalmatchedplayed
					+ ", aid=" + aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob + "]";
		}

		public void footballmethod() {
			System.out.println("Football method");
		}
		
		
	}


