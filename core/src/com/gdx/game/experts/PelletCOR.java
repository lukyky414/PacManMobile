package com.gdx.game.experts;

import com.gdx.game.model.GameElement;
import com.gdx.game.model.World;

public class PelletCOR extends AbstractCOR {
    private static PelletCOR instance = new PelletCOR();

    private AbstractCOR cor;

    public static AbstractCOR getCOR(){
        return instance.cor;
    }

    @Override
    public boolean canBuild(int elementType) {
        return false;
    }

    @Override
    public GameElement construct(World world, int x, int y) {
        return null;
    }
}