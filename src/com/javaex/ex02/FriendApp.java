package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    		System.out.println("친구를 3명 등록해주세요");
    		
    		List<Friend> fList = new ArrayList<Friend>();
    		
    		//문자열받고 공백으로 나누고 값을 넣어주기
    		
    		//1
    		String content = sc.nextLine(); //받고
    		String[] finfo = content.split(" "); //나누고
    		Friend f01 = new Friend(finfo[0],finfo[1], finfo[2]); //값
    		fList.add(f01);
    		
    		//2
    		String content2 = sc.nextLine();
    		String[] finfo2 = content2.split(" ");
    		Friend f02 = new Friend(finfo2[0],finfo2[1], finfo2[2]); 
    		fList.add(f02);
    		
    		//3
    		String content3 = sc.nextLine();
    		String[] finfo3 = content3.split(" ");
    		Friend f03 = new Friend(finfo3[0],finfo3[1], finfo3[2]); 
    		fList.add(f03);
    		
    		for( Friend f : fList ) {
    			f.showinfo();
    		}
    		
    	
    	sc.close();
    	
    }

}
