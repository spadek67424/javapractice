import java.util.Random;
class pair{
	public int x;
	public int y;
	public pair(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void get(){
		System.out.println(this.x);
		System.out.println(this.y);
	}

}


public class Kmean{
	public static void main(String[] argv){
		Random ran= new Random();
		pair p= new pair(ran.nextInt(50), ran.nextInt(50));
		p.get();
	}
}