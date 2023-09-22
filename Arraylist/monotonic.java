import java.util.ArrayList;

public class monotonic {

    public static boolean check(ArrayList<Integer> list) {
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)<=list.get(j)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(56);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(check(list));

    }
}