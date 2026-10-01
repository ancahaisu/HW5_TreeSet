package ro.ScoalaInformala.Anca;

import java.util.List;
import java.util.Objects;

public class Hobby {
    private HobbyType hobbyType;
    private int frequency;
    private List<Address> addressList;

    public Hobby(HobbyType hobbyType, int frequency, List<Address> addressList) {
        this.hobbyType = hobbyType;
        this.frequency = frequency;
        this.addressList = addressList;
    }

    public HobbyType getHobbyType() {
        return hobbyType;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

}
