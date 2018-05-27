package com.gdx.game.experts;

import com.gdx.game.model.GameElement;
import com.gdx.game.model.World;

public class MazeCOR extends AbstractCOR {
    private static MazeCOR instance = new MazeCOR();

    private AbstractCOR cor;

    private MazeCOR(){
        cor = new BlockCOR(
                new PelletCOR(null)
        );
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