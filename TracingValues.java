
/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class TracingValues
{
    public static void main(String[] args) 
    {
        int x;
        int y; 
        int z;
        x = 10;
        y = x - 4;
        z = x - y + 1;
        x *= 3;
        y = ++z;
        x /= y;
        z %= 4;
        x = (x + y) % 5;
        x = z++;
        y = --z;
        y -= -4;
        y = 4 + 5 * z;
        x = 8 * 7 + 6 / 2;
        y += x - 7;
        z = -x;
        x = x + z + y++;
        x++;
        y -= x;
        z = x - y;
        x -= z;
    }
}
