package ui.test.kovalchuk.collection.list;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Dima");
        stack.push("Sveta");
        stack.push("Katya");
        stack.push("Zoya");
        System.out.println(stack);


        System.out.println(stack.peek());/*показ верхнього елемнта*/
        System.out.println(stack.pop());/*показ верхнього елемнта + видалення*/

        while(!stack.isEmpty()){     /* цикл повного видалення*/
            System.out.println(stack.pop());
            System.out.println(stack);
        }

        System.out.println(stack);

    }

}
