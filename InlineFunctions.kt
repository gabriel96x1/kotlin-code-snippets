
inline fun hazAlgoo(action: () -> Unit) {
    action()
}

inline fun hazAlgoConAlgoConAlgo(
    noinline action1: () -> Unit,
    noinline action2: (() -> Unit) -> Unit,
    noinline action3: ((() -> Unit) -> Unit) -> Unit,
    crossinline action4: (((() -> Unit) -> Unit) -> Unit) -> Unit
) {
    action4 { action3 { action2 { action1() } } }
}

fun bailandooo(action: () -> Unit) {
    print("Bailo Chido")
    action()
}