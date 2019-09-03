package JavaStringPgm;

public class SunStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Maulik Kanani";
		String ans = msg.substring(3, 9); // start index taken but last index
											// not taken.
		String ans1 = msg.substring(0, msg.length());
		System.out.println(ans);
		System.out.println(ans1);

		msg.substring(0, 3); // No value returned as we are not capturing msg
								// value.
		System.out.println(msg);
		
		
       // Replace and replaceFirst functions
		String ans2 = msg.replace('u', 'z');                          // not able to handle regular expression as it requires string parameters only
		System.out.println("After replace function use="+ans2);
		
		ans2=msg.replaceFirst("z", "u");                              // able to handle regular expression
		System.out.println("After replace first function use="+ans2);

	}

}
