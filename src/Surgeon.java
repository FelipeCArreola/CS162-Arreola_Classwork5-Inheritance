public class Surgeon extends Doctor{

    public Surgeon (boolean worksAtHospital) {
        super (worksAtHospital);
    }

    @Override
    public String treatPatient () {
        return "Performing Surgery";
    }


    public String makeIncision () {
        return "Makes incisions";
    }
}

