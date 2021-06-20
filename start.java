


public class start {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("ssh -D 8181 phili@192.168.1.62");

        }catch(Exception e){
        }
        SetPassword frame1 = new SetPassword();
        frame1.setSize(300, 80);
        frame1.setLocation(500, 300);
        frame1.setVisible(true);
    }
}
