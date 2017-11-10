package main;

import security.utils.MD5Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(MD5Util.getHashedPassword(MD5Util.getStringForPassword()));
    }
}
