package lachancevi.Enrichissement_Jour1.Jeu_Cool;
import java.util.Scanner;

public class At01Ex01 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int x;
        int y;
        boolean bFin = false;
        int[][] map1 = 
        {
            {1,0,2,0,0,0,0,0,2,0},
            {2,0,0,0,2,2,2,0,2,0},
            {0,0,2,0,0,0,2,0,0,0},
            {0,2,2,2,0,2,2,0,2,0},
            {0,2,0,2,2,0,2,0,2,2},
            {0,0,0,2,0,0,0,0,0,0},
            {0,0,2,2,0,0,2,2,2,0},
            {0,2,0,0,2,0,0,0,0,2},
            {0,0,0,0,0,2,2,0,2,2},
            {0,0,2,2,0,0,2,0,0,3}
        };
        refresh(map1);
        System.out.println("W,A,S,D");
        while(!bFin)
        {
            x = playerX(map1);
            y = playerY(map1);
            char action = lecteur.nextLine().charAt(0);
            if(action == 'd' && x < 9 && map1[y][x + 1] != 2)
            {
                if(map1[y][x + 1] == 3)
                {
                    bFin = true;
                }
                map1[y][x] = 0;
                map1[y][x + 1] = 1;
            }
            else if(action == 's' && y < 9 && map1[y + 1][x] != 2)
            {
                if(map1[y + 1][x] == 3)
                {
                    bFin = true;
                }
                map1[y][x] = 0;
                map1[y + 1][x] = 1;
            }
            else if(action == 'a' && x > 0 && map1[y][x - 1] != 2)
            {
                if(map1[y][x - 1] == 3)
                {
                    bFin = true;
                }
                map1[y][x] = 0;
                map1[y][x - 1] = 1;
            }
            else if(action == 'w' && y > 0 && map1[y - 1][x] != 2)
            {
                if(map1[y - 1][x] == 3)
                {
                    bFin = true;
                }
                map1[y][x] = 0;
                map1[y - 1][x] = 1;
            }
            refresh(map1);
            System.out.println("W,A,S,D");
        }
        lecteur.close();
    }
    public static void refresh(int[][] map)
    {
        for(int y = 0;y < 10;y++)
        {
            for(int x = 0;x < 10;x++)
            {
                if(map[y][x] == 0)
                {
                    System.out.print("\u001B[40m" + "  ");
                }
                if(map[y][x] == 1)
                {
                    System.out.print("\u001B[43m" + "  ");
                }
                else if(map[y][x] == 2)
                {
                    System.out.print("\u001B[41m" + "  ");
                }
                else if(map[y][x] == 3)
                {
                    System.out.print("\u001B[42m" + "  ");
                }
                else if(map[y][x] == 4)
                {
                    System.out.print("\u001B[44m" + "  ");
                }
            }
            System.out.print("\u001B[40m" + "\n");
        }
    }
    public static int playerX(int[][] map)
    {
        for(int y = 0;y < 10;y++)
        {
            for(int x = 0;x < 10;x++)
            {
                if(map[y][x] == 1)
                {
                    return x;
                }
            }
        }
        return 10;
    }
    public static int playerY(int[][] map)
    {
        for(int y = 0;y < 10;y++)
        {
            for(int x = 0;x < 10;x++)
            {
                if(map[y][x] == 1)
                {
                    return y;
                }
            }
        }
        return 10;
    }
}
