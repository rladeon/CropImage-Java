/**
 * 
 */
package com.archi.image.resize;

import com.archi.image.pojo.ImageAbstract;
import com.archi.image.services.Image;

/**
 * @author rudi
 *
 */
public class ResizeImageFactory extends ImageAbstract implements Image{

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

}
