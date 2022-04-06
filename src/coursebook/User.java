/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursebook;

/**
 *
 * @author alesl
 */
public class User {
            private int id;
            private String bname;
            private String author;
            private String price;
            private String year;
            private String izdatel;
            private String numstr;
            private String status;

            public User(int Id, String Bname, String Author, String Price, String Year, String Izdatel, String Numstr, String Status){
                this.id = Id;
                this.bname = Bname;
                this.author = Author;
                this.price = Price;
                this.year = Year;
                this.izdatel = Izdatel;
                this.numstr = Numstr;
                this.status = Status;
            }
            
            public int getId(){ return id; }
            public String getBname(){ return bname; }
            public String getAuthor(){ return author; }
            public String getPrice(){ return price; }
            public String getYear(){ return year; }
            public String getIzdatel(){ return izdatel; }
            public String getNumstr(){ return numstr; }
            public String getStatus(){ return status; }
            
}  

            class User1{
             private int idk;
            private String fname;
            private String lname;
            private String sname;
            private String born;
            private String phone;
            private String adress;
            private String login;  
            private String password; 
                  
            public User1(int Idk, String Fname, String Lname, String Sname, String Born, String Phone, String Adress, String Login, String Password){
                this.idk = Idk;
                this.fname = Fname;
                this.lname = Lname;
                this.sname = Sname;
                this.born = Born;
                this.phone = Phone;
                this.adress = Adress;
                this.login = Login;
                this.password = Password;
            }
            
            public int getIdk(){ return idk; }
            public String getFname(){ return fname; }
            public String getLname(){ return lname; }
            public String getSname(){ return sname; }
            public String getBorn(){ return born; }
            public String getPhone(){ return phone; }
            public String getAdress(){ return adress; }
            public String getLogin(){ return login; }
            public String getPassword(){ return password; }
}
