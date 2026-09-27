package me.carlossanchez.instagramclone.data

import me.carlossanchez.instagramclone.model.Post
import me.carlossanchez.instagramclone.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(

        Post(
            id = 1,
            username = "Juan_Becerra",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1_204,
            caption = "Un recuerdito de Santa Marta"
        ),

        Post(
            id = 2,
            username = "Santhi_Rey",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Ando perdido we",
            isLiked = true
        ),

        Post(
            id = 3,
            username = "kykeejr",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3_456,
            caption = "Que bonitas vistas tiene mi rancho"
        ),

        Post(
            id = 4,
            username = "JGarcia",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 12_891,
            caption = "Parchadito en la playa papajhones"
        ),

        Post(
            id = 5,
            username = "shirleylorennnn",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/800/800",
            likes = 629,
            caption = "Estos hongos se ven sabrosos 🤔"
        ),

        Post(
            id = 6,
            username = "angelrammmmm_",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/800/800",
            likes = 2_103,
            caption = "Casi me ahogo jajaja, que locura",
            isLiked = true
        ),

        Post(
            id = 7,
            username = "Jhon_asterio",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/800/800",
            likes = 445,
            caption = "Contemplando el prado conectando con mi espiritu animal"
        ),

        Post(
            id = 8,
            username = "luisito",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/800/800",
            likes = 10_532,
            caption = "Por aqui en el everesttttt #everest"
        ),

        Post(
            id = 9,
            username = "cesanchez_q",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/800/800",
            likes = 978,
            caption = "Un nuevo proyecto comienza hoy mi cycling"
        ),

        Post(
            id = 10,
            username = "juliana",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/800/800",
            likes = 2_754,
            caption = "Ay amo la naturaleza xd"
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(
            1,
            "Tu historia",
            "https://picsum.photos/seed/s1/200/200",
            hasSeen = false
        ),
        Story(
            2,
            "pepito",
            "https://picsum.photos/seed/s2/200/200"
        ),
        Story(
            3,
            "angelrammmmmm",
            "https://picsum.photos/seed/s3/200/200"
        ),
        Story(
            4,
            "therealgangsta",
            "https://picsum.photos/seed/s4/200/200",
            hasSeen = true
        ),
        Story(
            5,
            "jgarcia",
            "https://picsum.photos/seed/s5/200/200"
        ),
        Story(
            6,
            "juanbecerra",
            "https://picsum.photos/seed/s6/200/200",
            hasSeen = true
        ),
        Story(
            7,
            "santhimasx",
            "https://picsum.photos/seed/s7/200/200"
        )
    )
}