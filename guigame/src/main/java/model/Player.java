package model;

import utils.Direction;

public class Player {
    private int x;
    private int y;
    private static final int GRID_SIZE = 20;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        switch (direction) {
            case UP:
                if (y >= 1) {
                    y--;
                }
                break;
            case DOWN:
                if (y < GRID_SIZE - 1) {
                    y++;
                }
                break;
            case LEFT:
                if (x >= 1) {
                    x--;
                }
                break;
            case RIGHT:
                if (x < GRID_SIZE - 1) {
                    x++;
                }
                break;
        }
        System.out.println("Player moved to (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getGridSize() {
        return GRID_SIZE;
    }
}