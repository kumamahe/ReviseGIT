package Test;

import java.util.HashMap;

public class Frequencyofcharacters {
	
	public static void main(String[] args) {
		
		String name="hello";
		String split[]=name.split("");
		//HashMap<Integer, String> map=new HashMap<Integer, String>();
		for(int i=0;i<=split.length;i++)
		{
			int freq=1;
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equals(split[j]))
				{
					freq++;
					System.out.println(split[i]+"----"+freq);
				}
				else
				{
					System.out.println(split[i]+"----"+freq);
				}
				
			}
			
			
			
			
			
			
			
			
	
		}
	}

}
