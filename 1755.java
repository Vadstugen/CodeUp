import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = "";
        for(int i=0; i<input.length(); i++){
            if(input.substring(i,i+1).equals(".")){
                str = input.substring(i);
            }
        }
        if(str.equals(".dib")){
            System.out.println("Paint.Picture");
        }else if(str.equals(".doc")){
            System.out.println("Word.Document.8");
        }else if(str.equals(".docx")){
            System.out.println("Word.Document.12");
        }else if(str.equals(".htm")){
            System.out.println("htmfile");
        }else if(str.equals(".html")){
            System.out.println("htmlfile");
        }else if(str.equals(".hwp")){
            System.out.println("Hwp.Document.96");
        }else if(str.equals(".hwpx")){
            System.out.println("Hwp.Document.hwpx.96");
        }else if(str.equals(".hwt")){
            System.out.println("Hwp.Document.hwt.96");
        }else if(str.equals(".jpe") || str.equals(".jpeg") || str.equals(".jpg")){
            System.out.println("jpegfile");
        }else if(str.equals(".ppt")){
            System.out.println("PowerPoint.Show.8");
        }else if(str.equals(".pptxml")){
            System.out.println("powerpointxmlfile");
        }else if(str.equals(".pptx")){
            System.out.println("PowerPoint.Show.12");
        }
    }
}
