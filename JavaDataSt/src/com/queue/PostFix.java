package com.queue;

public class PostFix {
	static WarpperList<Character> list;
	public static void main(String[] args) {

		String ex="123*+";
		
		char[] chars=ex.toCharArray();
	    list=new WarpperList<>();
		for(char c:chars) {
			list.enqueue(c);
		}
		
		while(list.getSize()!=1) {
			for(int  i=0;i<list.getSize();i++)
				if(list.get(i)<'1'&&list.get(i)>'9') {
					calc(list.remove(i),list.remove(i-1),list.get(i-2));
					
				}
			
		}
		
	}

	private static void calc(Character character, Character character2, Character character3) {
		int result = 0;
		int num1=Integer.parseInt(character2+"");
		int num2=Integer.parseInt(character3+"");
		
		switch(character) {
		
		case '+':
			
			break;
		case '-':
			break;
		case'/':
			break;
		case'*':
			result=result+num1+num2;
			break;
		
		
		}
		
	}

}
