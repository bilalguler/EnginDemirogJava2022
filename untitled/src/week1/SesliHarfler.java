package week1;

public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'İ';
        char[] sesliHarf = {'A', 'E', 'I', 'İ', 'U', 'Ü', 'O', 'Ö'};
        boolean sesliHarfMi = true;

        for (int i = 0; i < sesliHarf.length; i++ ) {
            if (harf == sesliHarf[i]) {
                sesliHarfMi = true;
                break;
            } else {
                sesliHarfMi = false;
            }
        }
        if (sesliHarfMi) {
            switch (harf) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(harf + " bir kalın sesli harftir.");
                default:
                    System.out.println(harf + " bir ince sesli harftir.");
            }
        } else {
            System.out.println(harf + " bir sesli harf değildir.");
        }
    }
}
