public class Random{
    public int[] shuffle(int[] values) {
        for(int i=0; i<2*values.length; i++){
            int r1=(int)(Math.random()*values.lenght);
            int r2=(int)(Math.random()*values.lenght);
            int tmp=values[r1];
            values[r1]=values[r2];
            values[r2]=tmp;
        }
        return values;
    }
}
        