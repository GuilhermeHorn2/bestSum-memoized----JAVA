package misc;


public class main_misc {
	//private static long[][] cache = new long[999][999];//
    private static String[] cache = new String[999]; 
	
	public static void main(String[] args) {
		
		//
      int[]v = {1,2,5,25};   
      System.out.println(bestSum(100,v));

		
	}
	private static String bestSum(int t,int[]v) {
		if(t == 0) {
			return "";
		}
		if(t < 0) {
			return null;
		}
		if(cache[t] != "key" && cache[t] != null) {
			return cache[t];
		}
		if(cache[t] == "key") {
			return null;
		}
		String shortest = null;
		for(int i = 0;i < v.length;i++) {
			int r = t-v[i];
			String s = bestSum(r,v);
			if(s != null) {
				s += " "+ v[i];
				if(shortest == null) {
					shortest = s;
				}
				else if(shortest.length() >= s.length()) {
					shortest = s;
				}
			}
			
		}		
		if(shortest == null) {
			cache[t] = "key";
		}
		cache[t] = shortest;
		return shortest;
	}
	
	}
	

	
	

	
		
	
	


	

	
	

