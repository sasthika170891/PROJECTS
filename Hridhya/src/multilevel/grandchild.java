
package multilevel;

public class grandchild extends child{

	public static void main(String[] args) {
		
		
		//parent<=> child<=> grandchild
		
		// grandchild<=> child
		/// indirectly connected with parent
		
		// grandchild=> parent, child, its own mthds
		
		grandchild.gs();
		grandchild g= new grandchild();
		g.gn();
		
		g.cn();
		g.cs();
		
		g.pn();
		g.ps();
		
		
	}
	
	public static void gs()
	{
		System.out.println("gchild class statc method");
	}
	
	public void gn()
	{
		System.out.println("gchild class non static method");
	}
	
}
