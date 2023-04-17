public class task4 {
    public static void main(String [] args) {
        
        int a = 3;
        int b = 7;
        int c = 68;
        int stop = 0;
        System.out.print(a + "? + ?" + b + "=" + c);
        for(int i=0; i<10; ++i){                  
            for(int j=0; j<10; ++j){
                if ((a*10)+i+(j*10)+b==c){                                          
                    stop = 1;
                    if (j==0){
                        System.out.print("\n" + a + i + " + " + b + " = " + c);
                    }
                    else{
                    System.out.print("\n" + a + i + " + " + j + b + " = " + c);
                    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                }    
            }
        }
        if(stop==0){
            System.out.print("Решение не найдено.");
        }
    }
    
}
