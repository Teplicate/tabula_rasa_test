package finder;
/*
Методы класса  реализуют копирование исходного массива в целях сохранения первичного состояния
и подсчет количества островов в массиве
 */

public class Finder {

    private int counter;
    private int[][] copiedSpace;

    public Finder(int[][] copiedSpace) {
        makeCopyOf(copiedSpace);
    }

    public boolean findIsland(int x, int y)
    {
        boolean isIsland = false;
        if (x < 0 || y < 0 || y >= copiedSpace[0].length || x >= copiedSpace.length) return false;
        if (copiedSpace[x][y] == 1)
        {
            isIsland = true;
            copiedSpace[x][y] = 0;
            findIsland(x, y + 1);
            findIsland(x, y - 1);
            findIsland(x + 1, y);
            findIsland(x - 1, y);
        }
        return isIsland;
    }

    public void countIsland()
    {
        for (int i = 0; i < copiedSpace.length; i++)
        {
            for (int j = 0; j < copiedSpace[0].length; j++)
            {
                if (findIsland(i, j))
                {
                    counter++;
                }
            }
        }

        System.out.println("counted " + counter + " islands.");
    }

    public void makeCopyOf(int[][] original)
    {
        copiedSpace = new int[original.length][original[0].length];
        for (int i = 0; i < original.length; i++)
        {
            for (int j = 0; j < original[0].length; j++)
            {
                copiedSpace[i][j] = original[i][j];
            }
        }
    }

    public void showCopy()
    {
        System.out.println("-------------Copied space-------------");
        for (int i = 0; i < copiedSpace.length; i++)
        {
            for (int j = 0; j < copiedSpace[0].length; j++)
            {
                System.out.print(copiedSpace[i][j] + " ");
            }
            System.out.println();
        }
    }
}
