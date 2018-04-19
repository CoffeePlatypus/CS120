public class Target extends Oval{
	private Oval middle,inner;

	public Target(int x, int y,int d){
		super(x,y,d,d);
		setBackground(Color.white);
		middle=newOval(d/6,d/6,2*d/3,2*d/3);
		middle.setBackground(Color.red);
		add(middle, 0);
		inner=new Oval(d/6,d/6,d/3,d/3);
		middle.add(inner,0);
	}
}
	