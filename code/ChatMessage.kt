class ChatMessage(val text:String,
                  val timestamp: Long,
                  val senderId: Int) {
    val moment: String
    get() {
        val sdf = SimpleDateFormat("HH:mm")
        return sdf.format(timestamp)
    }
}