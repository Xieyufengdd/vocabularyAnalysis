import java.util.Scanner;

public class Lexer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNextLine()){
            str = scanner.nextLine();
            char[] ch = str.toCharArray();
            int len = str.length();
            for (int i=0; i<len; i++){
                switch (ch[i]) {
                    case ' ':
                    case '\t':
                        continue;
                    case '=':
                        if (i < len - 1) {
                            if (ch[i + 1] == '=') {
                                System.out.println("Eq");
                                i++;
                            } else {
                                System.out.println("Assign");
                            }
                        } else {
                            System.out.println("Assign");
                        }
                        break;
                    case ';':
                        System.out.println("Semicolon");
                        break;
                    case '(':
                        System.out.println("LPar");
                        break;
                    case ')':
                        System.out.println("RPar");
                        break;
                    case '{':
                        System.out.println("LBrace");
                        break;
                    case '}':
                        System.out.println("RBrace");
                        break;
                    case '+':
                        System.out.println("Plus");
                        break;
                    case '*':
                        System.out.println("Mult");
                        break;
                    case '/':
                        System.out.println("Div");
                        break;
                    case '<':
                        System.out.println("Lt");
                        break;
                    case '>':
                        System.out.println("Gt");
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(ch[i]);
//                        int digt = ch[i] - '0';
                        while (i < len-1 && (ch[i+1]>='0' && ch[i+1]<='9')) {
                            i++;
                            stringBuilder.append(ch[i]);
//                            digt *= 10;
//                            digt += ch[i] - '0';
                        }
                        System.out.println("Number("+stringBuilder+")");
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                        StringBuilder sb = new StringBuilder();
                        sb.append(ch[i]);
                        while (i<len-1&&((ch[i+1]>='0' && ch[i+1]<='9')||(ch[i+1]>='a' && ch[i+1]<='z')||(ch[i+1]>='A' && ch[i+1]<='Z')||ch[i+1]=='_')){
                            i++;
                            sb.append(ch[i]);
                        }
                        String string = sb.toString();
                        switch (string) {
                            case "if" -> System.out.println("If");
                            case "else" -> System.out.println("Else");
                            case "while" -> System.out.println("While");
                            case "break" -> System.out.println("Break");
                            case "continue" -> System.out.println("Continue");
                            case "return" -> System.out.println("Return");
                            default -> System.out.println("Ident(" + string + ")");
                        }
                        break;
                    default:
                        System.out.println("Err");
                        return;
                }
            }
        }
    }
}
