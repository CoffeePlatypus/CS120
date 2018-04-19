public class SplitList {
    public SimpleList<Integer> split(SimpleList<Integer> values) {
        SimpleList<Integer> firstHalf=new SimpleList<Integer>();
        values.reset();
        int length=values.size();
        for(int i=0; i<length/2;i++) {
            firstHalf.add(values.next());
            values.remove();
        }
        return values;
    }
    public SimpleList<Integer> merge(SimpleList<Integer> l1, SimpleList<Integer>l2) {
        SimpleList<Integer> merged= new SimpleList<Integer>();
        while(l1.size>0 && l2.size()>0){
            l1.reset();
            l2.reset();
            Integer f1=l1.next();
            Integer f2=l2.next();
            if(f1<f2) {
                merged.add(f1);
                l1.remove();
            }else{
                merged.add(f2);
                l2.remove();
            }
        }
            l1.reset();
            while(l1.size()>0) {
                merged.add(l1.next());
                l1.remove();
            }
            while(l2.size()>0) {
                merged.add(l2.next())
                l2.remove();
            }
    }
    //merdge sort!!!!!!!!!!1
    public void sort(SimpleList<Integer> values) {
        if(values.size()<=1){
            return values
        }
        SimpleList<Integer> firstHalf=split(values);
        sort(firstHalf);
        sort(values);
        SimpleList<Integer> merged=merge(firstHalf, values);
        merged.reset();
        while(merged.hasNext()){
            values.add(merged.next());
        }
    }
        
        
        
}
