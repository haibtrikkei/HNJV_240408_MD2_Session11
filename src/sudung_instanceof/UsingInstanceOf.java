package sudung_instanceof;

public class UsingInstanceOf {
    public static void main(String[] args) {
        Integer a  = 10;
        Float b = 3.14F;
        Double c = 2.34;
        String d = "Chuoi ky tu";
        Long e = 2334234L;

        Object o1,o2,o3,o4;

        o1 = a;
        o2 = b;
        o3 = c;
        o4 = d;


        if(o1 instanceof Long){
            System.out.println("o1 la the hien cua kieu Long");
            Long e1 = Long.valueOf(o1.toString());
            System.out.println("Gia tri cua so long: "+e1);
        }else if(o1 instanceof Integer){
            Integer value = Integer.valueOf(o1.toString());
            System.out.println("Gia tri cua so nguyen: "+value);
        }
    }
}
