package lachancevi.Enrichissement_Jour1.Jeu_Cool;
import java.util.Scanner;

public class jeu_cool {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int x;
        int y;
        int level = 0;
        boolean bFin = false;
        int[][][] map ={
            {
                {0,2,2,2,2,2,0,0,2,2,2,2,0,0,2,0,0,0,2,0},
                {0,0,0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,0,2,0},
                {0,0,0,2,0,0,0,0,2,2,2,0,0,0,2,0,0,0,2,0},
                {0,2,0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,0,2,0},
                {0,0,2,2,0,0,0,0,2,2,2,2,0,0,0,2,2,2,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,2,2,2,0,0,2,2,0,0,0,0,2,2,0,0,2,0,0,0},
                {2,0,0,0,0,2,0,0,2,0,0,2,0,0,2,0,2,0,0,0},
                {2,0,0,0,0,2,0,0,2,0,0,2,0,0,2,0,2,0,0,0},
                {2,0,0,0,0,2,0,0,2,0,0,2,0,0,2,0,2,0,0,0},
                {0,2,2,2,0,0,2,2,0,0,0,0,2,2,0,0,2,2,2,2},
            },
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
            },
            {
                {0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0},
                {0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0},
                {0,2,0,2,0,0,2,2,2,2,2,2,2,2,0,0,0,2,0,0},
                {0,0,2,0,0,2,2,0,0,0,0,0,0,2,2,0,0,0,2,0},
                {0,2,2,0,2,0,2,0,2,2,0,2,0,0,0,2,0,2,3,0},
                {0,0,0,0,2,0,0,0,2,1,0,2,0,2,0,0,0,2,0,0},
                {0,0,2,2,2,0,2,0,2,2,2,2,0,2,2,0,2,2,2,2},
                {0,2,2,0,0,2,2,0,0,0,0,0,0,0,2,0,0,0,0,2},
                {0,0,2,0,2,2,2,0,2,0,2,2,2,0,0,2,0,2,0,2},
                {2,2,0,0,0,0,0,0,2,0,0,0,0,2,0,0,0,2,0,2}
            }
        };
        refresh(map[level]);
        System.out.println("Tape un truc pour jouer");
        lecteur.nextLine();
        level++;
        refresh(map[level]);
        System.out.println("W,A,S,D");
        while(!bFin)
        {
            x = playerX(map[level]);
            y = playerY(map[level]);
            char action;
            try 
            {
                action = lecteur.nextLine().charAt(0);
            }
            catch (IndexOutOfBoundsException e)
            {
                action = ' ';
            }
            
            if(action == 'd' && x < map[level][0].length - 1 && map[level][y][x + 1] != 2)
            {
                if(map[level][y][x + 1] == 3)
                {
                    level ++;
                    if(level == map.length)
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    map[level][y][x] = 0;
                    map[level][y][x + 1] = 1;
                }
            }
            else if(action == 's' && y < map[level].length - 1 && map[level][y + 1][x] != 2)
            {
                if(map[level][y + 1][x] == 3)
                {
                    level ++;
                    if(level == map.length)
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    map[level][y][x] = 0;
                    map[level][y + 1][x] = 1;
                } 
            }
            else if(action == 'a' && x > 0 && map[level][y][x - 1] != 2)
            {
                if(map[level][y][x - 1] == 3)
                {
                    level ++;
                    if(level == map.length)
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    map[level][y][x] = 0;
                    map[level][y][x - 1] = 1;
                }
            }
            else if(action == 'w' && y > 0 && map[level][y - 1][x] != 2)
            {
                if(map[level][y - 1][x] == 3)
                {
                    level ++;
                    if(level == map.length)
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    map[level][y][x] = 0;
                    map[level][y - 1][x] = 1;
                }
            }
            refresh(map[level]);
            System.out.println("W,A,S,D");
        }
        lecteur.close();
    }
    public static void refresh(int[][] map)
    {
        for(int y = 0;y < map.length;y++)
        {
            for(int x = 0;x < map[y].length;x++)
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
        for(int y = 0;y < map.length;y++)
        {
            for(int x = 0;x < map[y].length;x++)
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
        for(int y = 0;y < map.length;y++)
        {
            for(int x = 0;x < map[y].length;x++)
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
