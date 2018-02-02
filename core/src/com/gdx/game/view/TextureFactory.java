package com.gdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.gdx.game.model.GameElement;

import java.util.HashMap;

public class TextureFactory
{
    private Texture pacman, bloc;

    private TextureFactory()
    {
        pacman = new Texture(Gdx.files.internal("data/pacmanRight.png"));
        bloc = new Texture(Gdx.files.internal("data/bloc.png"));
    }

    private static TextureFactory instance = null;

    static public void reset()
    {
        instance = null;
    }

    public static TextureFactory getInstance()
    {
        if(instance == null)
            instance = new TextureFactory();
        return instance;
    }
    public Texture getTexturePacman()
    {
        return pacman;
    }
    public Texture getTextureBloc()
    {
        return bloc;
    }

    public Texture getTexture(Class<? extends GameElement> aClass) {
        return null;
    }
}


