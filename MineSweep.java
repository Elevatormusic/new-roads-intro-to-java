public class MineSweep {
    public static void main(String[] args) {
        
        int max = 10;
        int min = 1;

        int range = (max - min) + 1;     
        int randomNum = (int)(Math.random() * range) + min;
        
        double[] x = {1,2,3,4};
        /*
        x[0] = 3.5;
        */
        for (int i = 0; i < x.length; i++){
            x[i] = Math.random() * 10;
        }
        
        
        
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
          }
        
        

    }
    
}