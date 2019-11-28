package lab0;

public class Counter implements ObservableCounter
{
    private Frame textframe;
    private Frame rectframe;
    private Frame ovalframe;
    private int count;

    public Counter(){
        count = 0;
    }
    

	@Override
	public void observe(TextFrame tf, RectFrame rf, OvalFrame of) {
        textframe=tf;
        rectframe=rf;
        ovalframe=of;
	}
    
	@Override
    public void increment(){
        count++;
        textframe.setCount(count);
        rectframe.setCount(count);
        ovalframe.setCount(count);
    }
    
	@Override
    public void decrement(){
        if (count >0){
            count--;
            textframe.setCount(count);
            rectframe.setCount(count);
            ovalframe.setCount(count);
        }
    }



}