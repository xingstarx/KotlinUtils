fun main(args: Array<String>) {
    var user: User? = null
    var banner: Banner? = null

    user = User()
    banner = Banner()

    ifAllNotNull(user, banner) {
        user, banner ->
        println("user not empty, banner not empty")
    }
}

class User {

}

class Banner {

}