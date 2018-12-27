package com.javarush.games.game2048;

import com.javarush.engine.cell.*;


public class Game2048 extends Game{
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {}

    private void drawScene() {
        setCellColor(0, 0, Color.RED);
        setCellColor(0, 1, Color.RED);
        setCellColor(0, 2, Color.RED);
        setCellColor(0, 3, Color.RED);

        setCellColor(1, 0, Color.RED);
        setCellColor(1, 1, Color.RED);
        setCellColor(1, 2, Color.RED);
        setCellColor(1, 3, Color.RED);

        setCellColor(2, 0, Color.RED);
        setCellColor(2, 1, Color.RED);
        setCellColor(2, 2, Color.RED);
        setCellColor(2, 3, Color.RED);

        setCellColor(3, 0, Color.RED);
        setCellColor(3, 1, Color.RED);
        setCellColor(3, 2, Color.RED);
        setCellColor(3, 3, Color.RED);


    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        super.setCellColor(x, y, color);
    }
}