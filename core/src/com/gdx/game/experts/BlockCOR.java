package com.gdx.game.experts;

import com.gdx.game.model.GameElement;
import com.gdx.game.model.World;

public class BlockCOR extends AbstractCOR {

    public BlockCOR(AbstractCOR next) {
        super(next);
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