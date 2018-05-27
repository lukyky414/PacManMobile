package com.gdx.game.experts;

import com.gdx.game.model.GameElement;
import com.gdx.game.model.World;

public class BlockCOR extends AbstractCOR {
    private static BlockCOR instance = new BlockCOR();

    private AbstractCOR cor;

    private BlockCOR(){
        cor = new PelletCOR(null);
    }

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