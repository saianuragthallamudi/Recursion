package Recursion_Basics;

public class TowerOfHanoi {

    public static void Move(char src,char dest, char help, int disks)
    {
        String str = "Move disk "+disks+" from "+src+" to "+dest;
        if(disks == 1)
        {
            System.out.println(str);
            return;
        }
        Move(src,help,dest,disks-1);
        System.out.println(str);
        Move(help,dest,src,disks-1);
    }

    public static void main(String[] args) {
        int disks = 3;
        char src = 'A';
        char dest = 'C';
        char help = 'B';

        Move(src,dest,help,disks);
    }
}
