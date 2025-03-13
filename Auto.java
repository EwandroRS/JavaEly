public class Auto {
    String mark;
    String model;
    String plate;
    int year;
    double value;
    double valorIpva;

    private static final int CURRENT_YEAR = 2025; 


    public Auto (String mark, String model, String plate, int year, double value) {
        this.mark = mark;
        this.model = model;
        this.plate = plate;
        this.year = year;
        this.value = value;
    }


    public int getYear ()  {     
        return year;
    }

    public String getModel () {
        return model;
    }

    public String getMark () {
        return mark;
    }

    public String getPlate () {
        return plate;
    }

    public double getValue () {
        return value;
    }
    
    public void setValue (double value) {
        this.value = value;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setMark (String mark) {
        this.mark = mark;
    }

    public void setPlate (String plate) {
        this.plate = plate;
    }

    public void setYear (int year) {
        this.year = year;
    }
    
    public double calculateInsurance () {
        double insurance = 0;
        if (year < 2000) {
            insurance = value * 0.05;
        } else if (year >= 2000 && year <= 2009) {
            insurance = value * 0.03;
        } else if (year >= 2010 && year <= 2019) {
            insurance = value * 0.02;
        } else {
            insurance = value * 0.01;
        }
        return insurance;
    }
    
    public int calculateIpva () {
        if (year < 2000) {
            valorIpva = 0;
        } else if (year >= 2000 && year <= 2009) {
            valorIpva = value * 0.02;
        } else if (year >= 2010 && year <= 2019) {
            valorIpva = value * 0.03;
        } else {
            valorIpva = value * 0.04;
        }
        return year;
    }
    
    public int calculateYears () {
        return CURRENT_YEAR - year;
    }

    public void showIpva () {
        System.out.printf("IPVA: %.2f%n", valorIpva);
    }
    
    public void showYears () {
        System.out.printf("Years: %d%n", calculateYears());
    }



}
