package com.evalab.core.cli.option

import com.evalab.core.cli.exception.IllegalOptionValueException
import java.text.ParseException

public class DoubleOption : Option<Double> {
    constructor(longForm: String, shortForm: Char? = null, helpDesc: String? = null) : super(longForm, true, shortForm, helpDesc)

    throws(javaClass<IllegalOptionValueException>())
    override fun parse(arg: String): Double {
        try {
            return arg.toDouble()
        } catch (e: ParseException) {
            throw IllegalOptionValueException(this, arg)
        }
    }
}