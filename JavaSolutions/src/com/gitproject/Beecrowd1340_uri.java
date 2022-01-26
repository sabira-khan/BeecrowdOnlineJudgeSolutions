package com.gitproject;
import java.util.*;

public class Beecrowd1340_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean bq;
        boolean bs;
        boolean bp;

        while (s.hasNextInt()) {
            int t = s.nextInt();
            Queue<Integer> qu = new LinkedList<>();
            Stack<Integer> st = new Stack<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            bq = true;
            bs = true;
            bp = true;

            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();

                if (a == 1) {
                    if (bq)
                        qu.offer(b);
                    if (bs)
                        st.push(b);
                    if (bp)
                        pq.offer(-b);
                } else {
                    if (bq && (qu.isEmpty() || qu.poll() != b))
                        bq = false;
                    if (bs && (st.isEmpty() || st.pop() != b))
                        bs = false;
                    if (bp && (pq.isEmpty() || pq.poll() != -b))
                        bp = false;
                }
            }
            if(!bp && !bq && !bs)
                System.out.println("impossible");
            else if (bp && !bq && !bs)
                System.out.println("priority queue");
            else if (!bp && bq && !bs)
                System.out.println("queue");
            else if (!bp && !bq)  //bs true
                System.out.println("stack");
            else
                System.out.println("not sure");
        }
    }
}

