package com.tttclass;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.FrameGrabber.Exception;

import com.tttclass.client.MainForm;

import org.bytedeco.javacv.OpenCVFrameGrabber;


/**
 * 调用本地摄像头窗口视频
 * @see javavcCameraTest
 * @since javacv1.2
 */

public class JavavcCameraTest extends OpenCVFrameGrabber{
	public JavavcCameraTest(int deviceNumber) throws Exception  {
		super(deviceNumber);
		start(); // 开始获取摄像头数据
		// TODO Auto-generated constructor stub
		CanvasFrame canvas = new CanvasFrame("摄像头");
		canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setAlwaysOnTop(true);
		canvas.setResizable(true);
		while (true) {
			if (!canvas.isDisplayable()) {// 窗口是否关闭
				stop();// 停止抓取
				System.exit(2);// 退出
			}
			canvas.showImage(grab());// 获取摄像头图像并放到窗口上显示， 这里的Frame
			Frame frame=grab();
											// frame是一帧视频图像
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 50毫秒刷新一次图像
		}
	}

	public static void main(String[] args) throws Exception, InterruptedException {
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JavavcCameraTest gabber = new JavavcCameraTest(0);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
	}
}
