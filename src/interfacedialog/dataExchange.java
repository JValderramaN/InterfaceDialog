/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedialog;

/**
 *
 * @author bruno
 */
public class dataExchange {
    private String Service;
    private String Login;
    
    dataExchange(){
        
    }
    
    dataExchange(String Serv, String Log){
        Service = Serv;
        Login = Log;
    }
    
    public void setServiceLogin(String Serv, String Log){
        Service = Serv;
        Login = Log; 
    }
    
    public String getService(){
        return Service;
    }
    
    public String getLogin(){
        return Login;
    }
}
