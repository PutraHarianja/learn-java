public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

//        konversi primitif ke bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

//        konversi prim -> non primitive tapi tidak competible
        short shortAge = iniInteger2.shortValue();
        long iniLong2 = iniInteger2.longValue();
        float iniFLoat = iniInteger.floatValue();
    }
}
