package bpos.common.model;

import java.util.Objects;

public class BloodTest extends Entity<Integer> {

    private String name;
    private String path;
    private Integer medicalInfo;

    @Override
    public String toString() {
        return "BloodTest{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", medicalInfo=" + medicalInfo +
                ", id=" + id +
                "} " + super.toString();
    }

    public BloodTest(String name, String path, Integer medicalInfo) {
        this.name = name;
        this.path = path;
        this.medicalInfo = medicalInfo;
    }

    public BloodTest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BloodTest)) return false;
        BloodTest bloodTest = (BloodTest) o;
        return Objects.equals(name, bloodTest.name) &&
                Objects.equals(path, bloodTest.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, path);
    }

    public Integer getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(Integer medicalInfo) {
        this.medicalInfo = medicalInfo;
    }
}

