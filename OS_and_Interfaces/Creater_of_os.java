package OS_and_Interfaces;

public class Creater_of_os {
    public static void main(String[] args) {
        Factory_OS os_fact= Get_OS_Facctory.get_os("IOS");
        OS andr_1 = os_fact.getOs("3");
        andr_1.action();
    }
}
