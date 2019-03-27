package cmd

import directory.Directory

class Ls : Command() {
    override fun run(directory: Directory, name: String) {
        println("Available Directories: ")
        println(directory.name)
        directory.directories.forEach {
            println(it.name)
        }
    }
}