package Google;

public class Google1 {
   
    
	public static void main(String[] args)  {
       
      
            int out_ = solve("prprprrp", 7, 10);
            System.out.println(out_);
            
        

    }
    static int solve(String S, int X, int Y){
       // Type your code here
       int count=1,resultx=0,resulty=0;
    
       do{
           boolean str1=S.contains("pr");
           boolean str2=S.contains("rp");
          if(str1){
        	 
              S=S.replaceFirst("pr","");
              
              resultx++;
              
          }
          else if(str2){
              S=S.replaceFirst("rp","");
             
              resulty++;
          }
          else
          count=0;
         
       }while(count!=0);
       
       return Math.max(X*resultx+Y*resulty,Y*resultx+X*resulty);
    }
}