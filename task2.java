
public class task2 {
    public static void main(String[]args){
        int[] array = new int[1001];
        for(int i=1; i<array.length; ++i){
            array[i]=i;
            int count=0;
            for(int j=1; j<array.length;++j){
                if (array[i]%j==0){
                   count= count+1;      
            }
            }
            if(count==2){                
                System.out.print(array[i]+ " ");
            }

        }
    }
}