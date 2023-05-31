public class SalePerson implements Comparable<SalePerson>{
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName,String lastName,int totalSales){
		this.firstName=firstName;
		this.lastName=lastName;
		this.totalSales=totalSales;		
	}
	
	public String toString() {
		return lastName+" , " + firstName + " : " + totalSales;
	}
	public boolean equals(Object o) {

        SalePerson salePerson = (SalePerson)o;

        return (firstName == salePerson.firstName || (firstName != null && firstName.equals(salePerson.firstName))) &&
               (lastName == salePerson.lastName || (lastName != null && lastName.equals(salePerson.lastName)));
	}
	public int compareTo(SalePerson o) {
        int result;
        result = Integer.compare(totalSales, o.totalSales);
        if (result == 0) {
            if (lastName.compareTo(o.lastName) < 0)
                result++;
            else
                result--;
        }

        return result;
		
	}
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }
}
