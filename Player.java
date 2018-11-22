import java.util.*;  //B0444223吳昀叡
public class Player {
	private String name;// 玩家名字
	private int chips;// 玩家的總籌碼
	private int bet;//玩家下注的籌碼
	private ArrayList<Card> oneRoundCard=new ArrayList<Card>();// 此局的卡

	public Player(String name, int chips) 
	{
		this.name=name;
		this.chips=chips;
	}
	
	public String getName() 
	{
		
		return name;
	}
	public int makeBet() 
	{
		bet=1;
		if(chips<=0) {
			return 0;
		}
		
		return bet;
	}
	
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard=cards;
	}
	public boolean hitMe() 
	{
		int a1=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card c=new Card(null,0);
			c=oneRoundCard.get(i);
			a1+=c.getRank();
		}
		
		if(a1<=16) 
		{
			
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
	
	public int getTotalValue() 
	{
		int a2=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card c=new Card(null,0);
			c=oneRoundCard.get(i);
			a2+=c.getRank();
		}
		return a2;
	}
	public  int getCurrentChips() {
		return chips;
	}
	public void increaseChips(int diff) {
		chips=chips+diff;
	}
	public void sayHello() {
		System.out.println("Hello , I am "+name+" .");
		System.out.println("I have "+chips+" chips");
	}
}
