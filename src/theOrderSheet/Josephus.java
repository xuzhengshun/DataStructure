package theOrderSheet;

import java.util.ArrayList;
import java.util.List;
public class Josephus {
    /**
     * 实现约瑟夫环算法  已知number个人，从start个人开始 数到distance时此人出列依次循环
     */
    public static void getJosephus(Integer number,Integer start,Integer distance){

        List<String> list = new ArrayList<String>();

        for(int i = 0;i < number; i++){
            list.add((char)('A'+i)+"");
        }
        System.out.println("约瑟夫环("+number+","+start+","+distance+"),");
        System.out.println(list.toString());
        int i = start;
        while(list.size()>1){
            i = (i+distance-1) % list.size();
            System.out.println("删除"+list.remove(i).toString()+",");
            System.out.println(list.toString());
        }
        System.out.println("被赦免者是"+list.toString());
    }

    /**
     * 队列解决约瑟夫环问题
     * @param personNumber 人数
     * @param number          数的数
     */
    public static void countQueue(int personNumber,int number){
        //1.把人放到队列中
        List<String> list = new ArrayList<String>();

        for(int i = 0;i < personNumber; i++){
            list.add((char)('A'+i)+"");
        }

        //2.算法
        int counts = 0;//计数器
        while (!list.isEmpty()) {
            //1.出队列
            String person = list.remove(0);
            //2.计数器++
            counts++;
            //3.判断
            if (counts % number == 0) {
                //是,打印
                System.out.println(person);
            } else {
                //不是,继续入队列
                list.add(person);
            }

        }
    }
    public static void myJosephus(Integer number,Integer start,Integer distance){

        List<String> list = new ArrayList<String>();
        for(int i = 0; i < number;i++){
            list.add((char)('A'+i)+"");
        }
        System.out.println("约瑟夫环("+number+","+start+","+distance+"),");
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
         getJosephus(5,0,2);
        //countQueue(5,2);
    }
}
