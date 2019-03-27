package cmd

import directory.Directory

class Rm : Command() {
    override fun run(directory: Directory, name: String) {
        var flag = false
        directory.directories.forEach {
            if (it.name == name) {
                directory.directories.remove(it)
                flag = true
            }
        }
        if (flag) println("DIRECTORY REMOVED: $name")
        else println("DIRECTORY DOESN'T EXIST!")
    }
}