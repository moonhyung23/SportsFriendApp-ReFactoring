package com.example.sportsfriendrefac.data.model

import com.example.sportsfriendrefac.domain.model.UserEntity

/*회원정보 데이터 */
data class User(
    var idx: String,
    var createdDate: String,
    var profile_ImgUrl: String,
    var nickname: String,
    var email: String,
    var password: String,
    var address: String, //관심지역, 거주이역
    var birth_date: String, //상태메세지
    var content: String, //상태메세지
)
