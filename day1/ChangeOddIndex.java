package Week3HomeAssignment.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String text = "changeme";
		 
		 char[] up = text.toCharArray();
		
		for(int i=0;i<up.length;i++)
		{
			if(i%2!=0) {
				
				up[i] = Character.toUpperCase(up[i]);
			}
		}
		
		System.out.println("Given String has changed the ODD Index...." + new String(up));
	}


	}


