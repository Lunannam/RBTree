package Rbtree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        final Rbtree tree = new Rbtree();
        try(BufferedReader reader = new BufferedReader(InputStreamReader(System.in))){
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (Exception ignored){

                }
            }
        } catch (Error e) {
            throw new RuntimeErrorException(e);
        }
        
    } {
        
    }
}
