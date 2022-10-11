package oops7;

	import java.time.LocalDate;

	public class Hockey extends Athletic{

		public Hockey(int aid, String aname, String address, LocalDate dob) {
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
		public int getHighest_goal_in_a_match() {
			return highest_goal_in_a_match;
		}
		public void setHighest_goal_in_a_match(int highest_goal_in_a_match) {
			this.highest_goal_in_a_match = highest_goal_in_a_match;
		}
		public int getTotal_matched_played() {
			return total_matched_played;
		}
		public void setTotal_matched_played(int total_matched_played) {
			this.total_matched_played = total_matched_played;
		}
		public String teamname;
		public int jersyno;
		public int totalgoals;
		public int highest_goal_in_a_match;
		public int total_matched_played;
		@Override
		public String toString() {
			return "Hockey [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
					+ ", highest_goal_in_a_match=" + highest_goal_in_a_match + ", total_matched_played="
					+ total_matched_played + ", aid=" + aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob
					+ "]";
		}
		
		
		
	}
