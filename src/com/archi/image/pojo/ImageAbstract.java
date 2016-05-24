/**
 * 
 */
package com.archi.image.pojo;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author rudi
 *
 */
public abstract class ImageAbstract {

	/**
	 * 
	 */
	private BufferedImage originalImage;
	private BufferedImage subImage;
	private BufferedImage outImage;
	private File folder;
    private File[] listOfFiles;// = folder.listFiles();
	public ImageAbstract() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the originalImage
	 */
	public BufferedImage getOriginalImage() {
		return originalImage;
	}
	/**
	 * @param originalImage the originalImage to set
	 */
	public void setOriginalImage(BufferedImage originalImage) {
		this.originalImage = originalImage;
	}
	public BufferedImage readImage(String urlimage) throws IOException
    {
    	return originalImage = ImageIO.read(new File(urlimage));    	
    }
	public BufferedImage cropImage(int x, int y, int width, int height) throws IOException
    {
		return originalImage.getSubimage(x, y, width, height);		
    }
	public void writeImage(BufferedImage b, String extension, String urlimage) throws IOException
    {
		File outputfile = new File(urlimage);
		ImageIO.write(b, extension, outputfile);    	    	
    }
	/**
	 * @return the subImage
	 */
	public BufferedImage getSubImage() {
		return subImage;
	}
	/**
	 * @param subImage the subImage to set
	 */
	public void setSubImage(BufferedImage subImage) {
		this.subImage = subImage;
	}
	/**
	 * @return the folder
	 */
	public File getFolder() {
		return folder;
	}
	/**
	 * @param folder the folder to set
	 */
	public void setFolder(File folder) {
		this.folder = folder;
	}
	/**
	 * @return the listOfFiles
	 */
	public File[] getListOfFiles() {
		return listOfFiles;
	}
	/**
	 * @param listOfFiles the listOfFiles to set
	 */
	public void setListOfFiles(File[] listOfFiles) {
		this.listOfFiles = listOfFiles;
	}
	public void handle(){
		 for (File files : listOfFiles) {
             if (files.isFile()) {
               System.out.println("File " + files.getName());
               
             }
       }
		
	}
	/**
	 * @return the outImage
	 */
	public BufferedImage getOutImage() {
		return outImage;
	}
	/**
	 * @param outImage the outImage to set
	 */
	public void setOutImage(BufferedImage outImage) {
		this.outImage = outImage;
	}
	public static BufferedImage resizeImage(final Image image, int width, int height) {
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        //below three lines are for RenderingHints for better image quality at cost of higher processing time
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
    }

}
