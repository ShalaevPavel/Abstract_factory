package OS_and_Interfaces;

public class IOS_1 implements OS{

    @Override
    public void action() {
        System.out.println("action for IOS1");
    }

    @Override
    public void option() {
        System.out.println("option for IOS1");

    }

    @Override
    public void super_action() {
        System.out.println("super_action for IOS1");

    }
}
