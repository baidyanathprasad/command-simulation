package directory

data class Directory(
    val name: String,
    val directories: MutableList<Directory>
)