public class SwitchTest{
    static String vmPm;
    static String approach;

    public static void main(String[] args){
        vmPm = "50/50";
        approach = "IqrMc";
        
        switch(vmPm){
            case "50/50":
                switch(approach){
                    case "Gpa":
                        System.out.println("Gpa 50 50");
                        break;
                    case "IqrMc":
                    System.out.println("Iqrmc 50 50");
                    break;
                }
                break;
            case "100/80":
                System.out.println("100vm");
                break;
        }
    }
}