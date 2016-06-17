/**
 * 
 */
package com.archi.image.cropimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.archi.image.pojo.ImageAbstract;
/**
 * @author rudi
 *
 */
public class CropImageFactory extends ImageAbstract {

	/**
	 * 
	 */
	
	public CropImageFactory() {
		// TODO Auto-generated constructor stub
	}
    
   
    public static void cropImage(String urlimage, String urldestination, int x, int y, int width, int height) throws IOException
    {
    	File io = new File(urlimage);
    	BufferedImage img = readImage(urlimage);
    	setOriginalImage(img);
    	
		writeImage(getOriginalImage().getSubimage(x, y, width, height), getFileExtension(io), urldestination+"crop_"+io.getName());		
    }
public static void main(String[] args) throws IOException {
		
		
		cropImage("/home/rudi/Images/horse-1401861_1280.jpg", "/home/rudi/Images/newImg/",0, 400, 400,400);
	}
}
