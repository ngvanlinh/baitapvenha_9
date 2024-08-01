package com_2.baitapvenha_3;

import java.util.HashMap;
//link tham khảo;
//https://www.youtube.com/watch?v=INhjSeIWQz4&t=6s
public class baitap_3 {
    public static void main(String[] args) {
        String str = "Lớp HashMap trong java là một lớp kế thừa lớp AbstractMap";
        String [] arrSTR = str.split(" ");
        HashMap<String,Integer> map = new HashMap();
        for (String s : arrSTR) {
            // tim trong str có kí tự "s" hay chưa. nếu có value ++, rồi đặt lại giá trị cho map
            if(map.containsKey(s)){

                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            }// nếu chưa có thì map sẽ put "s" với giá trị khởi tạo ban đầu = 1
            else{
                map.put(s,1);
            }

        }
        System.out.println("=====================");
        System.out.println(map.toString());

    }
}
