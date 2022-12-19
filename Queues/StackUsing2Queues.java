import java.util.LinkedList;
import java.util.Queue;
public class Stack {

    private Queue<Integer> s1;
    private Queue<Integer> s2;


    public Stack() {
        //Implement the Constructor
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return this.s1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return this.s1.size()==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        this.s1.add(element);
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        while (this.s1.size() > 1) {
            this.s2.add(this.s1.poll());
        }
        int ans = this.s1.poll();
        Queue<Integer> temp = this.s1;
        this.s1 = this.s2;
        this.s2 = temp;
        return ans;
    }
    public int top() {
        if (this.isEmpty()) {
            return -1;
        }
        while (this.s1.size() > 1) {
            this.s2.add(this.s1.poll());
        }
        int ans = s1.poll();
        s2.add(ans);
        Queue<Integer> temp = this.s1;
        this.s1 = this.s2;
        this.s2 = temp;
        return ans;
    }
}
