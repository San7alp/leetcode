class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < asteroids.length; i++) {
            int x = asteroids[i];
            boolean alive=true;
            
                while (!stack.isEmpty() && stack.peek() > 0 && x < 0) {
                    int y = stack.peek();
                    if (Math.abs(x) > Math.abs(y)) {
                        stack.pop();
                    } else if (Math.abs(x) == Math.abs(y)) {
                        stack.pop();
                        alive=false;
                        break;
                    } else {
                        alive=false;
                        break;
                    }
                }
                if (alive) {
                stack.push(x);
            }

            

        }
        int res[] = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;

    }
}