package brackets;

import java.util.Scanner;

public class BracketsMain {
    public static void main(String[] args) {
        //пример: {(2+5)*[(2+3)*4]+1}/7
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean correct = bracketsAreCorrect(s);
    }

    /**
     * Возвращает true, если скобки в выражении расставлены корректно.
     */
    public static boolean bracketsAreCorrect(String s) {
        Stack stack = new Stack(1000);
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return false;

                } else if (c == '}') {
                    if (stack.pop() != '{') {
//                        System.out.println("sddsds");

                        return false;
                    }
                } else if (c == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }

                } else if (c == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }

                }
//                stack.push(c);
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false; // вернет false если скобки расставлены не правильно
    }

}