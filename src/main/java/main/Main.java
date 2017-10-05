package main;

import creator.Space;
import finder.Finder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and width of array");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println("Creating " + length + " x " + width + " space");
        Space space = new Space(length, width);
        space.intializeSpace();
        space.showSpace();
        Finder finder = new Finder(space.getSpace());
        finder.showCopy();
        finder.countIsland();
    }

}
