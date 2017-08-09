public class Quine { 
    public static void main(String[] args) { 
        char quote = 34; 
        char bs = 92;
        char n = 110;
        char t = 116;
        String s = "public class Quine {\n\tpublic static void main(String[] args) {\n\t\tchar quote = 34;\n\t\tchar bs = 92;\n\t\tchar n = 110;\n\t\tchar t = 116;\n\t\tString s = ;\n\t\tSystem.out.println(s.substring(0, 143) + quote + s.substring(0, 20) + bs + n + bs + t + s.substring(22, 62) + bs + n + bs + t + bs + t + s.substring(65, 81) + bs + n + bs + t + bs + t + s.substring(84, 97) + bs + n + bs + t + bs + t + s.substring(100, 113) + bs + n + bs + t + bs + t + s.substring(116, 129) + bs + n + bs + t + bs + t + s.substring(132, 144) + bs + n + bs + t + bs + t + s.substring(147, 672) + bs + n + bs + t + s.substring(674, 675) + bs + n + s.substring(676, 677) + quote + s.substring(143, s.length()));\n\t}\n}";
        System.out.println(s.substring(0, 143) + quote + s.substring(0, 20) + bs + n + bs + t + s.substring(22, 62) + bs + n + bs + t + bs + t + s.substring(65, 81) + bs + n + bs + t + bs + t + s.substring(84, 97) + bs + n + bs + t + bs + t + s.substring(100, 113) + bs + n + bs + t + bs + t + s.substring(116, 129) + bs + n + bs + t + bs + t + s.substring(132, 144) + bs + n + bs + t + bs + t + s.substring(147, 672) + bs + n + bs + t + s.substring(674, 675) + bs + n + s.substring(676, 677) + quote + s.substring(143, s.length()));
    }
}
