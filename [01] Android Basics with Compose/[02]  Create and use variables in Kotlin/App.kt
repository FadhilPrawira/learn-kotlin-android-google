fun main() {
    val count: Int = 2
    println(count)
    println("You have count unread messages.")
    
    println("You have $count unread messages.")
    
    val count2 = 2 // we can use without declare variable type
    
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.") // if we forget {} it will return different

    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

    val cartTotal = 0
    // cartTotal = 20 // Val cannot be reassigned
    println("Total: $cartTotal")

    var cartTotal2 = 0
    println("Total: $cartTotal2")
    cartTotal2 = 20
    println("Total: $cartTotal2")

    var count3: Int = 10
    println("You have $count3 unread messages.")
    count3 = count3 + 1
    println("You have $count3 unread messages.")
    count3++
    println("You have $count3 unread messages.")
    count3--
    println("You have $count3 unread messages.")

    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    val nextMeeting = "Next meeting:"
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    println("Say \"hello\"")
    
    val notificationsEnabled: Boolean = true
    println("Are notifications enabled? " + notificationsEnabled)

    // This is a comment.
    var height = 1 // Assume the height is 1 to start with
    
    /*
     * This is a very long comment that can
     * take up multiple lines.
     */

    
}
