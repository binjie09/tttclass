package com.tttclass;


public class Test {  
  public static void main(String[] args) {  
    System.out.println("Hello, OpenCV");  
    // Load the native library.  
    System.loadLibrary("opencv_java2411");  
    new DetectFaceDemo().run(); 
    
  }  
}  