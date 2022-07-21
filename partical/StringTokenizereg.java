package New;

import java.util.StringTokenizer;

public class StringTokenizereg {

	public static void main(String[] args) {
		//StringTokenizer s = new StringTokenizer("welcom to Anudip Foundation to Mumbai");
		StringTokenizer st = new StringTokenizer("welcom ,to, Anudip, Foundation, to, Mumbai,");

		while(st.hasMoreTokens()) {
			//System.out.println(s.nextToken());
			System.out.println(st.nextToken(","));
		}

}
}