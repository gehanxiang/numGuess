package com.numGuess;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class NumGuess {

    public static void menu() {
        System.out.println("*****************");
        System.out.println("**** 1.Play  ****");
        System.out.println("**** 0.Exit  ****");
        System.out.println("*****************");
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toGuess = random.nextInt(100);
        AtomicInteger times = new AtomicInteger(1);
        while (true) {
            System.out.println("请输入你所猜的数字");
            int guess = scanner.nextInt();
            if (guess < toGuess) {
                System.out.println("猜小了");
                times.addAndGet(1);
            } else if (guess > toGuess) {
                System.out.println("猜大了");
                times.addAndGet(1);
            } else {
                System.out.println("猜对了，共计尝试 " + times + " 次！");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            menu();
            System.out.println("请选择：");
            input = scanner.nextInt();
            switch (input) {
                case 1: {
                    game();
                    break;
                }
                case 0: {
                    System.out.println("退出游戏");
                    break;
                }
                default: {
                    System.out.println("输入错误，请重新输入");
                    break;
                }
            }
        } while (input > 0);
    }
}
