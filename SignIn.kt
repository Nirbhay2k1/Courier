import java.io.IOException
import java.util.*

class SignIn {
    var UId: String? = null
    var pass_key: String? = null
    var sc = Scanner(System.`in`)
    var prd = Product()
    @Throws(IOException::class)
    fun getdata(uid: String, pass: String) {
        println("Enter User ID:")
        UId = sc.next()
        println("Enter Password:")
        pass_key = sc.next()
        println(uid)
        println(UId)
        println(pass)
        println(pass_key)
        if (UId === uid && pass_key === pass) {
            println("Correct Password")
        } else {
            throw IOException("Wrong password")
        }
    }
}
