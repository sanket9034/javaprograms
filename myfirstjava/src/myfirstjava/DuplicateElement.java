package DailyTask;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {3,4,5,3,7};
   boolean status=false;
   for(int i=0;i<a.length;i++) {
	   for(int j=i+1;j<a.length;j++) {
		   if(a[i]==a[j]) {
			   System.out.println("Duplicate element found"+" "+a[i]);
			   status=true;
		   }
	   }
   }
   if(status==false)
	   System.out.println("duplicate not found");
	}

}
