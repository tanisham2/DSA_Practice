class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') x--;
            else if (c == 'R') x++;
            else if (c == 'U') y++;
            else if (c == 'D') y--;
        }
        return x == 0 && y == 0;
    }
}

//using Switch
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L': x--; 
                    break;
                case 'R': x++;
                    break;
                case 'U': y++;
                    break;
                case 'D': y--; 
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
