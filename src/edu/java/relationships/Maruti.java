package edu.java.relationships;

class Maruti extends Car {
  //Maruti extends Car and thus inherits all methods from Car (except final and static)  
    //Maruti can also define all its specific functionality  
    public void MarutiStartDemo(){  
        Engine MarutiEngine = new Engine();  
        MarutiEngine.start();  
    }  
} 
