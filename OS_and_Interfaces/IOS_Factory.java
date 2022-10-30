package OS_and_Interfaces;

public class IOS_Factory extends Factory_OS{
    @Override
    public OS getOs(String version){
        if (version.equals("1")){
            return  new IOS_1();

        }
        else if (version.equals("2")){
            return  new IOS_2();
        }
        else if (version.equals("3")){
            return  new IOS_3();

        }
        else if (version.equals("4")){
            return  new IOS_4();

        }
        else {
            return  new IOS_5();

        }
    }
}
