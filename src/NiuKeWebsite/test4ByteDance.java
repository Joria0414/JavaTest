package NiuKeWebsite;

import java.util.ArrayList;
import java.util.Scanner;

public class test4ByteDance {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<node> FileList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String x = sc.next();
            String y = sc.next();
            node ThisNode = new node();
            ThisNode.client = x;
            ThisNode.file = y;
            int exist = 0;
            for(node filetype:FileList){
                if(ThisNode.file.equals(filetype.file)){
                    exist = 1;
                    node findPlace = filetype.next;
                    node prenode = filetype;
                    while((findPlace != null) && ThisNode.client.compareTo(findPlace.client) > 0){
                        prenode = findPlace;
                        findPlace = findPlace.next;
                    }
                    prenode.next = ThisNode;
                    if(findPlace != null)
                        ThisNode.next = findPlace;
                    break;
                }
            }
            if(exist == 0){
                node headnode = new node();
                headnode.file = ThisNode.file;
                FileList.add(headnode);
                headnode.next = ThisNode;
            }
        }
        int count = 0;
        for(node filetype: FileList){
            count++;
            System.out.print(filetype.file);
            node probeNull = filetype.next;
            while(true) {
                System.out.print(" "+probeNull.client);
                if(probeNull.next != null)
                    probeNull = probeNull.next;
                else
                    break;
            }
            if(count != FileList.size())
                System.out.println();
        }

    }

}


class node{
    String client;
    String file;
    node next = null;
}

