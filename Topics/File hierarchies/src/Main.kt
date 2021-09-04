import Main.Companion.curentLevel
import Main.Companion.deepestFileName
import Main.Companion.list
import Main.Companion.maxFiles
import Main.Companion.maxFilesDir
import Main.Companion.maxLevel
import java.io.File
import java.lang.Integer.max

class Main {
    companion object {
        var deepestFileName = ""
        var curentLevel = 0
        var maxLevel = 0
        val list = mutableListOf<String>()
        var maxFiles = 0
        var maxFilesDir = ""
    }

    fun maxDepth(dir: File) {
        if (curentLevel > maxLevel) {
            deepestFileName = dir.name
        }
        if (dir.isDirectory) {
            if (dir.listFiles().isNotEmpty()) {
                ++curentLevel
                for (subDir in dir.listFiles()) {
                    maxDepth(subDir)
                }
                maxLevel = max(maxLevel, curentLevel)
                --curentLevel
            } else {
                list.add(dir.name)
            }
        } else {
            return
        }
    }

    fun emptyDirs(dir: File) {
        System.err.println("${dir.name} ${dir.isDirectory} ${dir.listFiles()?.size}")
        if (dir.isDirectory) {
            val files = dir.listFiles()!!
            if (files.isEmpty()) {
                list.add(dir.name)
            } else {
                for (file in files) {
                    emptyDirs(file)
                }
            }
        }
    }

    fun dirWithMaxFiles(dir: File) {
        if (dir.isDirectory) {
            val files = dir.listFiles()!!
            if (files.isNotEmpty()) {
                if (files.filter { it -> it.isFile }.size > maxFiles) {
                    maxFiles = files.size
                    maxFilesDir = dir.name
                }
                for (file in files) {
                    dirWithMaxFiles(file)
                }
            }
        }
    }
}

fun main() {
    val dir = File("w:/temp/basedir")
    val main = Main()
//    main.emptyDirs(dir)
//    println(deepestFileName)
//    println(curentLevel)
//    println(maxLevel)
//    println(list)

//    val mainDirectory = File("w:/temp/Programming")
//    mainDirectory.mkdir()
//    val labDirectory = mainDirectory.resolve("Project1")
//    labDirectory.mkdir()
//    val reportFile = mainDirectory.resolve("Report.pdf")
//    reportFile.createNewFile()
//    println(list.joinToString(" "))
    main.dirWithMaxFiles(dir)
    println("$maxFilesDir $maxFiles")
}
