package etu001969.framework; 
import java.util.HashMap;
import java.util.Map;

public class FrontServlet{
    private Map<String, Mapping> mappingUrls;
    
    public FrontServlet(){
        mappingUrls = new HashMap<>();
    } 
}