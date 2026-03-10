package oop_00000110698_MuhammadIrsalGinanjar.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}