

fun main() {
    for (i in 0..1000000) {
        hazAlgoo {
            print(i + 2)
        }

        hazAlgoConAlgoConAlgo(
            {    },
            {   },
            {   },
            { return@hazAlgoConAlgoConAlgo }
        )
    }
}