fun main()
{
    println("Введи число:")
    val s = readLine()?.toIntOrNull()

    if (s == null || s < 0)
    {
        println("Введи натуральное неотрицательное число")
    }

    else
    {
        val b = Integer.toBinaryString(s)
        println(b)
    }
}
