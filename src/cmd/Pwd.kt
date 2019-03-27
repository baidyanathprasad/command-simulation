package cmd

import directory.Directory

class Pwd : Command() {
    var path = ""
    override fun run(directory: Directory, name: String) {
        TODO("not implemented")
    }
    /*override fun run(directory: Directory, name: String) {
        if (getPath(directory, name)) print(path)
        else println()
    }

    private fun getPath(directory: Directory, name: String): Boolean {
        if (directory.name == name) {
            path.plus(name)
            return true
        } else {
            directory.directories.forEach {
                return if (getPath(it, name)) {
                    path.plus(it.name)
                    true
                } else {
                    false
                }
            }
        }
    }*/
}