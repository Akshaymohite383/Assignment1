package oops7;


	import java.time.LocalDate;

	public class Cricket_player extends Athletic{

		
		
		public Cricket_player(int aid, String aname, String address, LocalDate dob) {
			super(aid, aname, address, dob);
			// TODO Auto-generated constructor stub
		}
		public String teamname;
		public int jersyno;
		public int totalruns;
		public int highestscore;
		public int avg;
		public int totalmatchplayed;
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
		public int getTotalruns() {
			return totalruns;
		}
		public void setTotalruns(int totalruns) {
			this.totalruns = totalruns;
		}
		public int getHighestscore() {
			return highestscore;
		}
		public void setHighestscore(int highestscore) {
			this.highestscore = highestscore;
		}
		public int getAvg() {
			return avg;
		}
		public void setAvg(int avg) {
			this.avg = avg;
		}
		public int getTotalmatchplayed() {
			return totalmatchplayed;
		}
		public void setTotalmatchplayed(int totalmatchplayed) {
			this.totalmatchplayed = totalmatchplayed;
		}
		@Override
		public String toString() {
			return "Cricket_player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalruns=" + totalruns
					+ ", highestscore=" + highestscore + ", avg=" + avg + ", totalmatchplayed=" + totalmatchplayed
					+ ", aid=" + aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob + "]";
		}
		public void cricketmethod() {
			System.out.println("CRICKET METHOD");
		}
	

}
