package ccom.lucas.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    private Integer index;
    private String firstName;
    private String lastName;


    public Person(Integer index, String firstName, String lastName) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // recover data of writeToParcel
    public Person(Parcel p){
        this.index = p.readInt();
        this.firstName = p.readString();
        this.lastName = p.readString();
    }

    @Override
    public int describeContents() {
        // responsible by indentify this class
        // 0 is your index
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // Here is where, go to occur the serializable
        dest.writeInt(index);
        dest.writeString(firstName);
        dest.writeString(lastName);
    }

    // responsible by serialize at information this class
    // DataInputStream and DataOutputStream
    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>(){
        @Override
        public Person createFromParcel(Parcel source) {
            // Responsible by pass data of writeToParcel to constructor this class
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
