package This;

public class This {
	void m()
	{
		System.out.println(this);
		}
	public static void main(String[] args) {
		This obj=new This();
		System.out.println(obj);
		obj.m();
	}
}
