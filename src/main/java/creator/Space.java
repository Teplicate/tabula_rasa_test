package creator;

import java.util.Random;

public class Space
{

    private int [][] space;
    private int length;
    private int width;
    private int counter;

    public Space(int length, int width)
    {
        this.length = length;
        this.width = width;
        space = new int[length][width];
    }

    public void intializeSpace()
    {
        Random random = new Random();
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < width; j++)
            {
                space[i][j] = (random.nextBoolean()) ? 1 : 0;
            }
        }
    }

    public void showSpace()
    {
        System.out.println("-------------Original space-------------");
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print(space[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getSpace()
    {
        return space;
    }
}
