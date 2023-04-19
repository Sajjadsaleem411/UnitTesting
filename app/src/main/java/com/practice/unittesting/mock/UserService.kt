package com.practice.unittesting.mock

class UserService(private val userRepository: UserRepository) {
    fun loginUser(email:String,password:String):String{
        return when(userRepository.loginUser(email,password)){
            LOGIN_STATUS.INVALID_USER->"User does not exist"
            LOGIN_STATUS.INVALID_PASSWORD->"password not correct"
            LOGIN_STATUS.UNKNOWN_ERROR->"Unknown error"
            LOGIN_STATUS.SUCCESS->"Logged successfully"
        }
    }
}