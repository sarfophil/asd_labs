package lab0;

public class Counter implements ObservableCounter
{
    private Frame textframe;
    private Frame rectframe;
    private Frame ovalframe;
    private int count;
    
   
    public Counter(TextFrame tf, RectFrame rf, OvalFrame of){
        count = 0;
        textframe=tf;
        rectframe=rf;
        ovalframe=of;
    }
    
    
    
    @Override
    public void update(OperationType operationType) {
    	if(operationType == OperationType.DECREMENT) {
    		decrement();
    	}else {
    		increment();
    	}
    	
    }
    
    public void increment(){
        count++;
        textframe.setCount(count);
        rectframe.setCount(count);
        ovalframe.setCount(count);
    }
    
    public void decrement(){
        if (count >0){
            count--;
            textframe.setCount(count);
            rectframe.setCount(count);
            ovalframe.setCount(count);
        }
    }

	



}