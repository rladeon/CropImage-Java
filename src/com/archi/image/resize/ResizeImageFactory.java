/**
 * 
 */
package com.archi.image.resize;

import java.io.IOException;

import com.archi.image.pojo.ImageAbstract;
import com.archi.image.services.Image;

/**
 * @author rudi
 *
 */
public class ResizeImageFactory extends ImageAbstract implements Image{

	private static final String String = null;
	/**
	 * 
	 */
	public ResizeImageFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getOriginalWidth() {
		// TODO Auto-generated method stub
		return getOriginalImage().getWidth();
	}

	@Override
	public float getOriginalHeight() {
		// TODO Auto-generated method stub
		return getOriginalImage().getHeight();
	}
	public static void main(String[] args) throws IOException {
		
		
		handleResize("/home/rudi/Images/", "/home/rudi/Images/newImg/",640,640);
	}
	

}
