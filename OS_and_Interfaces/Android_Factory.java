package OS_and_Interfaces;

public class Android_Factory extends Factory_OS {


    @Override
    public OS getOs(String version) {
        if (version.equals("1")){
            return  new Android_1();

        }
        else if (version.equals("2")){
            return  new Android_2();
        }


        else {
            return  new Android_3();

        }
    }
}
