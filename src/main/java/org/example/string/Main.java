package org.example.string;

public class Main {
    public static void main(String[] args) {
        String str1 = "India has won";
        String rev1 = "";
        String[] words = str1.split(" ");
        for(int i = words.length - 1; i >=0; i--){
            rev1 += words[i];
            if (i > 0) {
                rev1 += " ";
            }
        }
        if (rev1.length() > 0) {
            rev1 = rev1.substring(0, 1).toUpperCase() + rev1.substring(1).toLowerCase();
        }
        System.out.println(rev1);

        String rev2 = "";
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for(int j = words[i].length() - 1; j >=0; j--) {
                temp += words[i].charAt(j);
            }
            if(i != words.length -1){
                rev2+=temp + " ";
            }
            else{
                rev2+=temp;
            }

        }
        System.out.println(rev2);
    }
}
