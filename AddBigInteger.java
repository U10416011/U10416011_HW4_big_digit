import java.util.ArrayList;

class AddBigInteger {
	
	public ArrayList<Integer> add(String a, String b) {
		ArrayList<Integer> x = new ArrayList();
		ArrayList<Integer> y = new ArrayList();
		for(int i = a.length()-1; i >= 0; i--) {//put string into arraylist
			x.add((int)(a.charAt(i)-48));//char to int
		}
		for(int i = b.length()-1; i >= 0; i--) {//put string into arraylist
			y.add((int)b.charAt(i)-48);//char to int
		}
		int i, c = 0,w,l,k;
	    ArrayList<Integer> z = new ArrayList();
		return z;
	}
}
	

