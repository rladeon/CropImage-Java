/**
 * 
 */
package com.archi.image.resize;

import java.io.IOException;

import com.archi.image.pojo.ImageAbstract;

/**
 * @author rudi
 *
 */
public class ResizeImageFactory extends ImageAbstract{

	
	/**
	 * 
	 */
	public ResizeImageFactory() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) throws IOException {
		
		
		handleResize("/home/rudi/Images/", "/home/rudi/Images/newImg/",640,640);
	}
	

}
