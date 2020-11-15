package Parameter_Names;

public class Karyawan {

    String name;
    double salary;

    public Karyawan(String aName, double salary){
        name = aName;   //contoh penamaan parameter yang umum dipakai programmer, memakai 'a'
        this.salary = salary; /*contoh yang sering dipakai lainnya adalah
                                memberi nama sama untuk parameter dan field, namun
                                untuk membedakannya, field ditambahkan 'this'*/
    }

    public void show(){
        System.out.println(this.name+ " mendapat gaji sebesar " +this.salary);
    }
}
