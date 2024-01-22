//The date is 22/01/2024

public class Patient
{
    private int idNumber;
    private int age;

    private BloodData bloodData3;

    Patient()
    {
        idNumber = 0;
        age = 0;
        bloodData3 = new BloodData();
    }

    Patient(int idNumber, int age, String bType, String rhFact)
    {
        this.idNumber = idNumber;
        this.age = age;
        bloodData3 = new BloodData(bType, rhFact);
    }

    public BloodData getBloodData3()
    {
        return bloodData3;
    }

    public int getAge()
    {
        return age;
    }

    public int getIdNumber()
    {
        return idNumber;
    }
}