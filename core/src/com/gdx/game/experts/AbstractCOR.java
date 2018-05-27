package com.gdx.game.experts;
import com.gdx.game.model.GameElement;
import com.gdx.game.model.World;

public abstract class AbstractCOR {
    public AbstractCOR next;

    public AbstractCOR(AbstractCOR next){
        this.next = next;
    }

    public abstract boolean canBuild(int elementType);
    public abstract GameElement construct(World world, int x, int y);


    public GameElement build(World world, int elementType, int x, int y){
        if(canBuild(elementType))
            return construct(world, x, y);

        if(next == null)
            return null;

        return next.build(world, elementType, x, y);
    }
}