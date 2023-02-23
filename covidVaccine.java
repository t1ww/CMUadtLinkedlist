public class covidVaccine {
    private int id;
    private String firstName;
    private String[] vaccines = new String[10];
    private int pointer = 0;
    covidVaccine(){
        this.id = (int) Math.random();
        this.firstName = "";
    }
    covidVaccine(int id, String fname, String[] vac){
        this.id = id;
        this.firstName = fname;
        this.pointer = vac.length;
        for (int i = 0; i < vac.length; i++) {
            this.vaccines[i] = vac[i];
        }
    }
    //
    public void setId(int p){
        this.id = p;
    }
    public int getId(){
        return this.id;
    }
    //
    public void addVaccine(String v){
        vaccines[pointer] = v;
        pointer++;
    }
    public String vtoString(){
        String str = vaccines[0];
        for (int i = 1; i < vaccines.length; i++) {
            if(vaccines[i]==null)break;
            str += ", " + vaccines[i];
        }
        return str;
    }
    public String toStrings(){
        return "id : " + id +
             "\nFirst name : " + firstName +
             "\nVaccines : " + vtoString();
    }
}
