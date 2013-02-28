package com.example.mygame;

import org.lwjgl.LWJGLUtil;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Barebones extends BasicGame {
	
	private static AppGameContainer app;
	private int mScreenWidth;
	private int mScreenHeight;
	
	public Barebones() {
		super("Make It Rain");
		
		// --SLICK STUFF--
		
		System.setProperty("org.lwjgl.librarypath", System.getProperty("user.dir") + "/lib/native/" + LWJGLUtil.getPlatformName());
		System.setProperty("net.java.games.input.librarypath", System.getProperty("org.lwjgl.librarypath"));
		
		mScreenWidth = 1280;
		mScreenHeight = 720;
		
		try {
			app = new AppGameContainer(this);
			app.setDisplayMode(mScreenWidth, mScreenHeight, false);
			app.setVSync(true);
			app.setTargetFrameRate(60);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	// -- SLICK GAME METHOD OVERRIDES --
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		gc.setShowFPS(true);
		
		// TODO: Add initialization instructions
	}
	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.clear();
		
		// TODO: Add render instructions
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO: Add update instructions
	}
	
	@Override
	public void keyPressed(int key, char c) {
		if (key == Input.KEY_ESCAPE)
			app.exit();
		
		// TODO: Add input instructions
	}
	
}
