package com.gdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PacManGdx extends ApplicationAdapter {
	SpriteBatch batch;
	Texture block;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		block = new Texture("bloc.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(block, 0, 0, 16, 16, 0, 0, 48, 48, false, false);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		block.dispose();
	}
}
