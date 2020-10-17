package acgn.player

object HelloJni {

    init {
        System.loadLibrary("native-lib")
    }

    @JvmStatic
    external fun helloworld(): String

    @JvmStatic
    external fun openCVVersion(): String
}