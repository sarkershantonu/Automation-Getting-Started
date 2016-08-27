package org.automation.customtype;



/**
 * Created by shantonu on 7/16/16.
 */

public class MyDataType {
    public MyDataType() {

    }

    @Override
    public String toString() {
        return "MyDataType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    public MyDataType(Long id, String name, String mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    private Long id;
    private String name;
    private String mobileNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
