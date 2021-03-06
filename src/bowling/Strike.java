package bowling;

public class Strike implements FrameStatus {
	public int score(Player player, int nowFrame){
		return 10 + player.pins[nowFrame + 1] + player.pins[nowFrame + 2];
	}
	
	public String dashBoard(Player player, int nowFrame){
		return "|   X   ";
	}
	
	public String dashBoard_LastFrame(Player player, int nowFrame){
		return "| X " + "| " + player.pins[nowFrame + 1] + " | " + player.pins[nowFrame + 2] + " |";
	}
	
	public int increaseNowFrame(int nowFrame){
		return nowFrame + 1;
	}
}
