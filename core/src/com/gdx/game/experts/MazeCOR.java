package com.gdx.game.experts;

import com.badlogic.gdx.math.Vector2;
import com.gdx.game.model.GameElement;
import com.gdx.game.model.Gom;
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
        // TODO : Vérifier si c'est la bonne façon de faire
        //return next.canBuild(elementType);
        return (elementType == this._VIDE);
    }

    @Override
    public GameElement construct(World world, int x, int y) {
        //return next.construct(world, x, y);
        return new Gom(new Vector2(x, y), world);
    }
}