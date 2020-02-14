package com.tets;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)

    {
        int i = 1;
        int j = ++i;
        if (j++ > 2) {
            ++j;
        } else {
            i++;
        }
        int k = ++j > 3 ? i++ : j++;
        System.out.println(k);
        System.out.println(i);
        System.out.println(j);
    }
}
