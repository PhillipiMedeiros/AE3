
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		TadPilha p = new TadPilha(1000);
		
		int m=100;
		
		while(m>0){
		    p.empilha(m%2);
		    m = m/2;
		}
		p.imprime();
		System.out.println();
		p.imprimereverso();
	}
}
