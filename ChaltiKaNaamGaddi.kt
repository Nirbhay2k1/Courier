import java.io.IOException
import java.util.*

object ChaltiKaNaamGaddi {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var i: Int

        val su = SignUp()
        //val si = SignIn()
        val prd = Product()
        val cal = CalculateBill()
        val sc = Scanner(System.`in`)
        println("----- Chalti Ka Naam Gaddi -----")
        println("1. Sign Up.")
        //println("2. Sign In.")
        i = sc.nextInt()
        if (i == 1) {
            su.get()
        }
        /* else if (i == 2) {
            si.getdata(su.uid, su.pass)
        }*/
        println("Select the Task")
        println("1. Buy the Product")
        println("2. Return the Product")
        i = sc.nextInt()
        if (i == 1) {
            prd.prodlist(su.uid.toString(), su.name.toString())
            prd.placeord()
            cal.paybill(prd.amt, su.typ_cust, su.name.toString(), su.add.toString(), su.ph)
        }
        else if (i == 2) {
            prd.prodlist(su.uid.toString(), su.name.toString())
            prd.placeord()
            cal.paybill(prd.amt, su.typ_cust, su.name.toString(), su.add.toString(), su.ph)
        }

        //si.getdata(su.uid, su.pass);
    }
}
