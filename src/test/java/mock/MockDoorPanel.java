package mock;

public class MockDoorPanel extends DoorPanel {

    boolean isOn =false;
    @Override
    public void close() {
       isOn =true;
    }

    public boolean isOn() {
        return isOn;
    }

}
