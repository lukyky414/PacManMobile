package com.gdx.game.experts;

public class MazeCOR {
    private static MazeCOR instance = new MazeCOR();

    private abstractCOR cor;

    private MazeCOR(){
        cor = new blockCOR(
                new pelletCOR(null)
        );
    }

    public static abstractCOR getCOR(){
        return instance.cor;
    }
}