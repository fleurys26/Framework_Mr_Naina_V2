package etu001969.framework; 
public class Mapping {
        private String className;
        private String method;
        
    public Mapping (String className,String method){
        this.className = className;
        this.method = method;
    }
    // Getters and setters
    public String getClassName(){
        return className;
    }
    public void setclassName(String classname){
        this.className= className;
    }
    public String getMethod(){
        return method;
    }
    public void setMethod (String method){
        this.method = method;

    }
}
