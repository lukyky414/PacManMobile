package com.gdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gdx.game.view.TextureFactory;

public class Maze {
	Texture block=TextureFactory.getInstance().getTextureBloc();
	Texture pacGomme=TextureFactory.getInstance().getTexturePacGom();
	Texture pacPower=TextureFactory.getInstance().getTexturePacPower();
	Texture dark=TextureFactory.getInstance().getTextureDark();
	Texture pacman = TextureFactory.getInstance().getTexturePacman();
	
	int openMaze[][] = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0},
			{0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
			{0,3,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,3,0},
			{0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
			{0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0},
			{0,2,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,2,0},
			{0,2,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,2,0},
			{0,2,2,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,2,2,0},
			{0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,2,2,2,2,2,2,2,2,2,2,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,2,0,0,0,1,1,0,0,0,2,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,2,0,1,1,1,1,1,1,0,2,0,0,2,0,0,0,0,0,0},
			{2,2,2,2,2,2,2,2,2,2,0,1,1,1,1,1,1,0,2,2,2,2,2,2,2,2,2,2},
			{0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,2,2,2,2,2,4,2,2,2,2,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0},
			{0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0},
			{0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0},
			{0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
			{0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
			{0,3,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,3,0},
			{0,0,0,2,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,2,0,0,0},
			{0,0,0,2,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,2,0,0,0},
			{0,2,2,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,2,2,0},
			{0,2,0,0,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,0,0,2,0},
			{0,2,0,0,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,0,0,2,0},
			{0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};

	public Maze() {}
	
	/*public Maze(Texture Block, Texture PacGomme, Texture PacPower, Texture Dark, Texture pacman) {
		block = Block;
		pacGomme = PacGomme;
		pacPower = PacPower;
		dark = Dark;
		this.pacman = pacman;
	}*/

	public void drawMaze(SpriteBatch batch){
		//murs
		drawResize(batch, block, 0);
		draw(batch, dark, 1);
		draw(batch, pacGomme, 2);
		draw(batch, pacPower, 3);
		draw(batch, pacman, 4);
		
	}
	
	private void draw(SpriteBatch batch, Texture text, int what) {
		batch.begin();
		for(int i = 0; i < 28; i ++) {
			for(int j = 0; j < 31; j++) {
				if(openMaze[j][i] == what)
					batch.draw(text, i * 16, (30-j) * 16);
			}
		}
		batch.end();
	}
	
	private void drawResize(SpriteBatch batch, Texture text, int what) {
		batch.begin();
		for(int i = 0; i < 28; i ++) {
			for(int j = 0; j < 31; j++) {
				if(openMaze[j][i] == what)
					batch.draw(text, i * 16, (30-j) * 16, 16, 16, 0, 0, 48, 48, false, false);
			}
		}
		batch.end();
	}
}
