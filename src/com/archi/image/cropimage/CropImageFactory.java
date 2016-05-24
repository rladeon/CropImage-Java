/**
 * 
 */
package com.archi.image.cropimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.archi.image.pojo.ImageAbstract;
import com.archi.image.services.Image;
/**
 * @author rudi
 *
 */
public class CropImageFactory extends ImageAbstract implements Image{

	/**
	 * 
	 */
	
	public CropImageFactory() {
		// TODO Auto-generated constructor stub
	}
    
    @Override
	public float getOriginalWidth()
	{
		return getOriginalImage().getWidth();		
	}
    @Override
	public float getOriginalHeight()
	{
		return getOriginalImage().getHeight();		
	}
}
