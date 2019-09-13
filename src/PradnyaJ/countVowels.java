class countVowels
{
	int a=0;
	int i=0;
	int e=0;
	int o=0;
	int u=0;
	
	void numOfVowels(String str)
	{
		for(int j=0;j<str.length();j++)
		{
			char chkChar= str.charAt(j);
			if(chkChar == 'a'||chkChar=='A')
				a++;
			if(chkChar == 'e'||chkChar=='E')
				e++;
			if(chkChar == 'i'||chkChar=='I')
				i++;
			if(chkChar == 'o'||chkChar=='O')
				o++;
			if(chkChar == 'u'||chkChar=='U')
				u++;
		}
		if(a>0)
		System.out.println("Count of A is :"+ a);
		if(e>0)
		System.out.println("Count of E is :"+ e);
		if(i>0)
		System.out.println("Count of I is :"+ i);
		if(o>0)
		System.out.println("Count of O is :"+ o);
		if(u>0)
		System.out.println("Count of U is :"+ u);
		
	}
	public static void main(String a[])
	{
		countVowels cntVowel = new countVowels();
		cntVowel.numOfVowels("PineApple");
		
		
	}
	
}