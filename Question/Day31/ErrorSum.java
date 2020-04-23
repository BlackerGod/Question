package Day31;


import java.util.*;

public class ErrorSum {
    static class error{
       public String allName;
       public String name;
       public int place;
       public int count = 1;

        @Override
        public boolean equals(Object obj) {
            error o = (error)obj;
            return this.name.equals(o.name) && this.place == o.place && this.allName.equals(o.allName);
        }
    }
    static List<error> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (index < 3){
            String Info = sc.nextLine();
            error errorInfo = Init(Info);
            if(result.size() == 0){
                result.add(errorInfo);
                continue;
            }
            boolean flag = false;
            for (int i=0; i< result.size();i++){
                if(result.get(i).equals(errorInfo)){
                    result.get(i).count++;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(errorInfo);
            }
            index++;
        }
        Sort();
        int length = result.size() > 8 ? 8:result.size();
        for (int i=0; i<length; i++){
            System.out.println(result.get(i).name+" "+result.get(i).place+" "+result.get(i).count);
        }
    }

    private static void Sort() {
        for (int i=0; i<result.size()-1; i++){
            for (int j=i+1; j>0; j--){
                if(result.get(j).count > result.get(j-1).count){
                    error tmp = result.get(j);
                    result.set(j,result.get(j-1));
                    result.set(j-1,tmp);
                }else {
                    break;
                }
            }
        }
    }

    // E:\V1R2\product\fpgadrive.c 2325
    // E:\V1R2\product\fpgadsdarsdive.c 1325
    // E:\V1R2\product\asd\gadsdarsdive.c 1325
    // E:\V1R2\product\fpgadrive.c 1325
    private static error Init(String info){
        String[] tmp1 = info.split(" ");
        error newError = new error();
        newError.place = Integer.parseInt(tmp1[1]);

        int start = tmp1[0].lastIndexOf("\\");
        if((tmp1[0].length() - start) > 16){
            newError.allName = tmp1[0].substring(start+1);
            newError.name = tmp1[0].substring(tmp1[0].length()-16);
            return newError;
        }
        newError.allName = tmp1[0].substring(start+1);
        newError.name = tmp1[0].substring(start+1);

        return newError;
    }
}
