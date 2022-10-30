package OS_and_Interfaces;

public class Get_OS_Facctory {
    public static Factory_OS get_os(String OS_name){
        if (OS_name == "IOS"){
            return new IOS_Factory();
        }
        else {
            return new Android_Factory();
        }
    }
}
