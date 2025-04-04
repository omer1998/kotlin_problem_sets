fun isValidPuzzle(puzzle: List<List<Any>>): Boolean{
    // to be a valid puzzle
    //the row/column line must not contain repeated element
    // the subgrid 3 x 3 should contain unique element only 1-9
    if (puzzle.isEmpty()) return false

    return isValidRows(puzzle)  && isValidColumns(puzzle)  && isValidSubgrid(puzzle)

}

fun isValidRows(puzzle: List<List<Any>>): Boolean{
    //println("the whole puzzle: ")
    for (row in puzzle){
        // if row size (which indicate number of columns also) not equal to the number or rows (which the size of puzzle)
        // should return false
        if (row.size != puzzle.size){
            // println("row size is ${row.size} puzzle size is ${puzzle.size}")
            return false
        }
        if ( row.toSet().size != row.size  ){
            return false
        }

    }
    return true
}
fun isValidColumns(puzzle: List<List<Any>>): Boolean{
    // as we know the puzzle must have equal number of rows and column
    // then from the number of rows we know the number of columns which is the same
    for (i in puzzle.indices){
        // if there is differance between column size (row size) and the number of rows (puzzle size)
        // then this indicates we have different number of rows and columns
        if (puzzle[i].size != puzzle.size){
            println("number of columns is ${puzzle[i].size} number of rows is ${puzzle.size}")
            return false
        }
        var col = puzzle.map{
                row -> row[i]
        }
        // check if the column size not equal to number of rows
        if ( col.size != puzzle.size){
            println("invalid column length ${col.size}")
            return false
        }
        if (col.toSet().size != col.size  ){
            return false
        }
    }
    return true

}
fun isValidSubgrid(puzzle: List<List<Any>>): Boolean{
    var seen = mutableSetOf<Int>()
    var isValid = true
    for (i in puzzle.indices){
        for (j in puzzle.indices){

            var e = puzzle[i][j]
            // casting element to num


            if (e !='-'){
                val num: Int? = when (e){
                    is Int -> e
                    is Char -> e.digitToIntOrNull()
                    is String -> e.toIntOrNull()
                    else -> null
                }
                if (num == null){
                    //println("entered false value $e")
                    return false
                }
                if (num !in 1..9 ){
                    //println("entered false value $num")

                    return false
                }
                if (num in seen){
                    isValid = false
                }else{
                    seen.add(num)
                }
            }

        }
    }
    //println("the whole puzzle elements 'seen': $seen")
    return isValid
}
