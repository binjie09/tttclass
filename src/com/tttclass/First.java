package com.tttclass;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;;
public class First {
	public static void main(String[] args) throws Exception {  
			VideoCapture v = new VideoCapture(1);
		v.grab();
    }  
}