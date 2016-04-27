package hiriq;


public class tester {

	public static void main(String[] args) {
				
				boolean[] B=new boolean[33];
				HiRiQ W=new HiRiQ((byte) 0) ;
				W.print(); System.out.println(W.IsSolved());
				HiRiQ X=new HiRiQ((byte) 1) ;
				X.print(); System.out.println(X.IsSolved());
				HiRiQ Y=new HiRiQ((byte) 2) ;
				Y.print(); System.out.println(Y.IsSolved());
				HiRiQ Z=new HiRiQ((byte) 3) ;
				Z.print(); System.out.println(Z.IsSolved());
				HiRiQ V=new HiRiQ((byte) 4) ;
				V.print(); System.out.println(V.IsSolved());
			}
		}
