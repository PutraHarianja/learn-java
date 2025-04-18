public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInteger = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        float iniFloat = 10.24F;
        double iniDouble = 10.24;

        int decimalInt = 25;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println(amount);
    }
}
