package theOrderSheet;

import java.util.ArrayList;
import java.util.List;
public class Josephus {
    /**
     * 实现约瑟夫环算法
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

    public static void main(String[] args) {
          getJosephus(5,0,2);
    }
}
