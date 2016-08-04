// Not a script to be compiles first and then run

// package tests

object Adler32CheckSum{
    val MOD_ADLER = 65521

    def main(args: Array[String]){
        val sum = adler32sum("Wikipedia")
        printf("Checksum (int) %d\n", sum)
        printf("Checksum (hex) %d\n", sum.toHexString)
    }

    def adler32sum(s: String): Int = {
        var a = 1
        var b = 0
        s.getBytes.foreach{char =>
            a = (char + a)%MOD_ADLER
            b = (a+b)%MOD_ADLER
        }
        b * 65536 + a
    }
}