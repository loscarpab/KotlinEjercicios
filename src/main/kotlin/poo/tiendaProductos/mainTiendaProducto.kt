package poo.tiendaProductos

fun main(){
    var samsung = TV(1000.0,1, "Samsung", 30)
    var sony = TV(2000.0,0, "Sony", 50)
    var mp3 = MP3Player(250.0,21, "apple", "blue")
    var libro1 = Book("sun press",10, 1992, 34.0)
    var libro2 = Book("korea press", 4,1986, 15.0)


    println(samsung.numProduct)
    println(mp3.numProduct)
    println(libro2.numProduct)
}