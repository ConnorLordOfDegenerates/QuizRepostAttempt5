fun toDouble (value: RationalNumber): Double {
    return value.Numerator.toDouble() / value.Denominator.toDouble()
}

fun add (value1:RationalNumber, value2:RationalNumber):RationalNumber{

    var value3Numerator =  value1.Numerator * value2.Denominator + value2.Numerator * value1.Denominator
    var value3Denominator = value1.Denominator * value2.Denominator
    return RationalNumber(value3Numerator, value3Denominator)
}