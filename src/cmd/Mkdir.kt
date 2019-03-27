package cmd

import directory.Directory

class Mkdir : Command() {
    override fun run(directory: Directory, name: String) {
        val tempDirectory = Directory(name, mutableListOf())
        if (directory.name != name) {
            directory.directories.add(tempDirectory)
            println("SUCCESS: CREATED")
        } else {
            println("DIRECTORY: ALREADY EXISTS")
        }
    }
}