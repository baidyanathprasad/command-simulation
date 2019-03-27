import cmd.Ls
import cmd.Mkdir
import directory.Directory

fun main() {
    //initial file directory
    val directories = Directory("/", mutableListOf())

    val mkdir = Mkdir()
    mkdir.run(
        directory = directories,
        name = "ram"
    )

    directories.directories.forEach {
        println("Available Directory: ${it.name}")
    }

    val ls = Ls()

    ls.run(directories, "")
}