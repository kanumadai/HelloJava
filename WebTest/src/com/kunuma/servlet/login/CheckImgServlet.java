package com.kunuma.servlet.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckImgServlet
 */
@WebServlet("/CheckImgServlet")
public class CheckImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int width= 120;
		int height=30;

		//paint a img in the ram
		BufferedImage bufImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		//background color 
		Graphics graphics = bufImage.getGraphics();
		//graphics.setColor(getRandColor(200,250));
		graphics.fillRect(0, 0, width, height);

		//border
		graphics.setColor(Color.WHITE);
		graphics.drawRect(0,0,width-1,height-1);
		//generate 4 charactor
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.setFont(new Font("Arial",Font.BOLD,18));
		
		String words="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
		Random random = new Random();
		//save the code
		StringBuffer strBuff = new StringBuffer();
		int x=10;
		for(int i=0;i<4;i++) {
			graphics2d.setColor(new Color(20 + random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
			int jiaodu = random.nextInt(60)-30;
			double theta = jiaodu*Math.PI/180;
			int index =random.nextInt(words.length());
			char c = words.charAt(index);
			
			strBuff.append(c);
			
			graphics2d.rotate(theta,x,20);
			graphics2d.drawString(String.valueOf(c), x, 20);
			graphics2d.rotate(-theta,x,20);
			x+=30;
		}
		
		//save the checkcode
		request.getSession().setAttribute("checkcode", strBuff.toString());
		
		graphics.dispose();
		ImageIO.write(bufImage, "jpg", response.getOutputStream());
		
			
	}

	private Color getRandColor(int i, int j) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		Color cl = new Color(j-i, random.nextInt(i), random.nextInt(j));
		return cl;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
