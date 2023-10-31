import java.io.File
import java.time.LocalDate
import java.time.LocalTime

class CalculateBill : SignUp() {

    var bill = 0
    fun paybill(amt: Int, typ_cust: String?, name: String, add: String, ph: Int) {

        val fileName = "Bill.txt"
        var file = File(fileName)
        file.writeText("Hello $name\n")




        val date = LocalDate.now()
        val time = LocalTime.now()
        file.appendText("---------------Bill-------------\n")
        file.appendText("       Chalti Ka Naam gaddi     \n")
        file.appendText("Date: $date  Time: $time\n")
        //System.out.println("Add."+ res.add +"  Ph."+ res.ph);
        file.appendText("--------------------------------\n")
        file.appendText("         Delivery Detail        \n")
        file.appendText("Customer Name: $name\n")
        file.appendText("Delivery Address: $add\n")
        file.appendText("Customer Ph. $ph\n")
        file.appendText("--------------------------------\n")
        file.appendText("Amount: " + amt + "Rs\n")
        when (typ_cust) {
            "Guest" -> {
                bill = (amt * 0.7).toInt()
                if(bill==0){file.appendText("Status: Failed (Due to insufficient Stock)\n")}
                else{
                file.appendText("Status: In Progress\n")}
                file.appendText("Guest\n")
                file.appendText("Bill: $bill Rs (After 30% discount)\n")
            }

            "Prime" -> {
                bill = (amt * 0.65).toInt()
                if(bill==0){file.appendText("Status: Failed (Due to insufficient Stock)\n")}
                else{
                    file.appendText("Status: In Progress\n")}
                file.appendText("Prime Member\n")
                file.appendText("Bill: $bill Rs (After 35% discount)\n")
            }

            else -> file.writeText("Wrong Input\n")
        }
        println("PLEASE check bill")

        //System.out.println("Logout");
    }
}
