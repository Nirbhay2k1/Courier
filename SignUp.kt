import java.util.*

open class SignUp {
    var uid: String? = null
    var pass: String? = null
    var name: String? = null
    var ph = 0
    var emid: String? = null
    var add: String? = null
    var typ_cust: String? = null
    var tc = 0

    //Name name;
    var sc = Scanner(System.`in`)

        //Product prd = new Product();
        fun get(): Unit{
            println("------Sign Up---------")
            println("Type of Customer")
            println("1. Prime")
            println("2. Guest")
            println("Enter type of customer")
            tc = sc.nextInt()
            if (tc == 1) {
                typ_cust = "Prime"
                println("Enter User ID: ")
                uid = "P" + sc.next()
            } else if (tc == 2) {
                typ_cust = "Guest"
                println("Enter User ID: ")
                uid = "G" + sc.next()
            }
            println("Enter Name:")
            name = sc.next()
            println("Enter Password")
            pass = sc.next()
            println("Enter address")
            add = sc.next()
            println("Enter phone number")
            ph = sc.nextInt()
            println("Enter email id")
            emid = sc.next()
            //prd.prodlist();
        }
}
