package Graph;

import java.util.HashMap;

public class Graphs {
    public class Vertex{
        HashMap<String,Integer> nbrs=new HashMap<>();
    }

    HashMap<String,Vertex> vtcs;

    public Graphs(){
        vtcs=new HashMap<>();
    }

    public int numvertex(){
        return vtcs.size();
    }
    public boolean containvertex(String vname){
        return vtcs.containsKey(vname);
    }

    public void addvertex(String vname){
        Vertex vt=new Vertex();
        vtcs.put(vname,vt);
    }
}
