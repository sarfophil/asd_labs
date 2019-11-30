package lab2.swimmer;

import java.util.*;

import lab2.dto.Swimmer;

public class SwimmersList_Old
{
    private Vector slist= new Vector();
    
    public void addSwimmer( Swimmer swimmer){
        slist.addElement(swimmer);
    }
    
    public Vector getVector(){
        return slist;
    }
}
