import java.util.*;

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
	    if(x.size() < y.size()){//let two arraylist to the same size
	    	k = y.size() - x.size();
	    	for(int q = 0; q < k; q++){
		    	x.add(0);
		    }
	    	l = y.size()-1;
	    }
	    else {
	    	k = x.size() - y.size();
	    	for(int q = 0; q < k; q++){
		    	y.add(0);
		    }
	    	l = x.size()-1;
	    }
	    
	    for(i = 0; i <= l; i++) {//sum of two big int 
	    	w = x.get(i) + y.get(i) + c;
	        if(w < 10) {
	            c = 0;
	        } else {
	            w = w - 10;
	            c = 1;
	        }
	        z.add(w);       
	    }
	    if(c == 1) {
			z.add(1);
		}
	    return z;
	}
}
	

