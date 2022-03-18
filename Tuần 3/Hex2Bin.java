import java.util.Scanner;

public class Hex2Bin {
    public static void IsHex(String inString) {
        int inStrLen = inString.length();
        boolean isHexStr = false;
        String Binary = "";

        for ( int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inString.toUpperCase().charAt(charIdx);
            if (inChar >= 'A' && inChar <= 'F') {
                switch (inChar) {
                    case 'A':
                        Binary += " 1010";
                        break;

                    case 'B':
                        Binary += " 1011";
                        break;  
                        
                    case 'C':
                        Binary += " 1100";
                        break;

                    case 'D':
                        Binary += " 11101";
                        break;

                    case 'E':
                        Binary += " 1110";
                        break;

                    case 'F':
                        Binary += " 1111";
                        break;
                
                    default:
                        Binary = "Not a hex";
                        break;
                }
                isHexStr = true;
            } else if (inChar >= '0' && inChar <= '9') {
                switch (inChar) {
                    case '0':
                        Binary += " 0000";
                        break;
                    
                    case '1':
                        Binary += " 0001";
                        break;
                    
                    case '2':
                        Binary += " 0010";
                        break;    

                    case '3':
                        Binary += " 0011";
                        break;
                        
                    case '4':
                        Binary += " 0100";
                        break;  
                        
                    case '5':
                        Binary += " 0101";
                        break;
                        
                    case '6':
                        Binary += " 0110";
                        break;         

                    case '7':
                        Binary += " 0111";
                        break;
                        
                    case '8':
                        Binary += " 1000";
                        break;
                        
                    case '9':
                        Binary += " 1001";
                        break;

                    default:
                        Binary = "Not a hex";
                        break;
                }
                isHexStr = true;
            } else {
                isHexStr = false;
                break;
            }
        }
        
        if (!isHexStr) {
            System.out.println("error: invalid hexadecimal string"); 
        } else {
            System.out.println("The equivalent binary for hexadecimal " + inString + " is:" + Binary);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String inStr = scanner.next();

        scanner.close();
        
        IsHex(inStr);
    }
}
