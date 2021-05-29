import java.util.ArrayDeque;
import java.util.Scanner;

// codeforces.com/problemset/problem/1352/D

public class AliceBobAndCandies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int turns = 0, alice = 0, bob = 0, alice_last = 0, bob_last = 0;
            boolean turn = true;
            ArrayDeque<Integer> que = new ArrayDeque<>();
            for(int i = 0; i < n; i++) que.add(s.nextInt());
            while(!que.isEmpty()) {
                if(turn) { // alice's turn
                    alice_last = 0;
                    while(!que.isEmpty() && alice_last <= bob_last) {
                        int temp = que.pollFirst();
                        alice_last += temp;
                        alice += temp;
                    }
                }
                else { // bob's turn
                    bob_last = 0;
                    while(!que.isEmpty() && bob_last <= alice_last) {
                        int temp = que.pollLast();
                        bob_last += temp;
                        bob += temp;
                    }
                }
                turn = !turn;
                turns++;
            }
            System.out.println(turns + " " + alice + " " + bob);
        }
    }
}
