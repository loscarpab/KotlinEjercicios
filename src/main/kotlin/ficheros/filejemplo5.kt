package ficheros
import java.io.File

fun main(args: Array<String>) {
    val fileName = "dataBytes.txt"
    var file = File(fileName)

    val dataArray = ByteArray(10)
    dataArray[0]=33
    dataArray[1]=32
    dataArray[2]=3
    dataArray[3]=14
    dataArray[4]=2
    dataArray[5]=23
    dataArray[6]=101
    dataArray[7]=102
    file.writeBytes(dataArray)
}
