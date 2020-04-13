public class Doctor {

    private Boolean worksAtHospital;

    public Doctor(Boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public void setWorksAtHospital(Boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public Boolean getWorksAtHospital() {
        return worksAtHospital;
    }

    public String treatPatient () {
        return "Gives Checkups";
    }

}
