import java.util.*

class Product {
    var item_id = 0
    var qty = 0
    var name: String? = null
    var price = 0
    var stock: Int =0
    var descrip: String? = null
    var amt = 0
    var more_item = 0.toChar()
    var sc = Scanner(System.`in`)
    var cal = CalculateBill()

    //SignUp su = new SignUp(); 
    fun prodlist(uid: String, name: String) {
        println("----------------------------------------------------")
        println("User Id: $uid")
        println("Name: $name")
        println("------------------- Product List -------------------")
        println("Item I.D.   Item Name   Price    Stock   Description")
        println("    1.           A     Rs.100      10      abcdefg  ")
        println("    2.           B     Rs.200      13      abcdefg  ")
        println("    3.           C     Rs.300       0      abcdefg  ")
        println("    4.           D     Rs.400       4      abcdefg  ")
        println("    5.           E     Rs.500      11      abcdefg  ")
        println("----------------------------------------------------")
    }

    fun placeord() {
        println("Enter Item no. ")
        item_id = sc.nextInt()
        when (item_id ) {
            1 -> {
                name = "A"
                price = 100
                stock = 10
                descrip = "abcdefg"
            }

            2 -> {
                name = "B"
                price = 200
                stock = 13
                descrip = "abcdefg"
            }

            3 -> {
                name = "C"
                price = 300
                stock = 0
                descrip = "abcdefg"
            }

            4 -> {
                name = "D"
                price = 400
                stock = 4
                descrip = "abcdefg"
            }

            5 -> {
                name = "E"
                price = 500
                stock = 11
                descrip = "abcdefg"
            }

            else -> println("Error")
        }
        if(stock >0){
        println("Enter Quantity: ")
        qty = sc.nextInt()
        amt += price * qty}
        else
            println("Not in Stock")
        /*System.out.println("Want to place more item in the Cart(y/n):");
		more_item =sc.next().charAt(0);
		if(more_item == 'y') {
			placeord();
		}*/
        //else if(more_item == 'n') {}
    }
}
