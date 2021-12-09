package programmer;

public class DFS_BFS {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] numbers = {1,1,1};

    }
}
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer += dfs(numbers[0], 1, target, numbers);
        answer += dfs(-numbers[0], 1, target, numbers);
        return answer;
    }

    public int dfs(int total, int idx, int target, int[] numbers){
        if (idx == numbers.length){
            if(total == target){
                return 1;
            }
            return 0;
        }
        int answer = 0;
        answer += dfs(total+numbers[idx], idx+1, target, numbers);
        answer += dfs(total-numbers[idx], idx+1, target, numbers);

        return answer;
    }
}
