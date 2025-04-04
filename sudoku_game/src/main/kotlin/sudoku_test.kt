fun main(){
    
    var puzzle1 = listOf(listOf('1','4','7'), listOf('2','5','8'), listOf('3','6','9'))
    testSudokuPuzzle(name = "handle simple valid puzzle",
        isValidPuzzle(puzzle1),
        correctResult = true
    )
    var puzzle2 = listOf(listOf('-','4','7'), listOf('2','-','8'), listOf('3','6','9'))
    // i think we need to change the datatype of this list
    testSudokuPuzzle(name = "handle empty area puzzle with valid puzzle should return true",
        result = isValidPuzzle(puzzle2),
        correctResult = true
    )
    var puzzle3_1 = listOf(listOf('-','4','7','-'), listOf('2','-','8','-'), listOf('3','6','9','6'))

    testSudokuPuzzle(name = "handle invalid number of columns(4 columns) should return false",
        result = isValidPuzzle(puzzle3_1),
        correctResult = false
    )
    var puzzle3_2 = listOf(listOf('-','4'), listOf('2','-'), listOf('3','6'))

    testSudokuPuzzle(name = "handle invalid number of columns (two columns) should return false",
        result = isValidPuzzle(puzzle3_2),
        correctResult = false
    )
    var puzzle3_3 = listOf(listOf('-','4','7'), listOf('2','-','8'), listOf('3','6','9'), listOf('-','-','-'))

    testSudokuPuzzle(name = "handle invalid number of rows (4 rows) should return false",
        result = isValidPuzzle(puzzle3_3),
        correctResult = false
    )
    var puzzle3_4 = listOf(listOf('-','4','7'), listOf('2','-','8'))

    testSudokuPuzzle(name = "handle invalid number of rows (2 rows) should return false",
        result = isValidPuzzle(puzzle3_4),
        correctResult = false
    )
    var puzzle4 = listOf(listOf('-','4','4'), listOf('2','-','8'), listOf('3','6','9'))

    testSudokuPuzzle(name = "handle invalid row number (duplicate number) should return false",
        result = isValidPuzzle(puzzle4),
        correctResult = false
    )
    var puzzle5 = listOf(listOf('-','4','7'), listOf('2','-','7'), listOf('3','6','9'))

    testSudokuPuzzle(name = "handle invalid column numbers (duplicate number) should return false",
        result = isValidPuzzle(puzzle5),
        correctResult = false
    )

    var puzzle6 = listOf<List<Any>>()

    testSudokuPuzzle(name = "handle empty puzzle should return false",
        result = isValidPuzzle(puzzle6),
        correctResult = false
    )
    var puzzle7 = listOf(listOf('-','4','7'), listOf('2','9','6'), listOf('3','6','9'))

    testSudokuPuzzle(name = "handle invalid subgrid puzzle should return false",
        result = isValidPuzzle(puzzle7),
        correctResult = false
    )

    var puzzle8 = listOf(listOf('1','4',"10"), listOf('2','5','8'), listOf('3','6','9'))

    testSudokuPuzzle(name = "handle element not within 1-9 range puzzle should return false",
        result = isValidPuzzle(puzzle8),
        correctResult = false
    )
    var puzzle9 = listOf(listOf(' ','4',"10"), listOf('2','5','8'), listOf('3','6','9'))
    // valid empty element must be -
    testSudokuPuzzle(name = "handle invalid empty element return false",
        result = isValidPuzzle(puzzle9),
        correctResult = false
    )
    var puzzle10 = listOf(listOf('*','4',"10"), listOf('2','5','8'), listOf('3','6','9'))
    testSudokuPuzzle(name = "handle invalid element (character) should return false",
        result = isValidPuzzle(puzzle10),
        correctResult = false
    )

    var puzzle11 = listOf(listOf(1,4,7), listOf(2,5,8), listOf(3,6,9))
    testSudokuPuzzle(name = "handle valid puzzle of Integer type return true",
        result = isValidPuzzle(puzzle11),
        correctResult = true
    )

    var puzzle12 = listOf(listOf("1",4,7), listOf(1,5,8), listOf(3,6,9))
    testSudokuPuzzle(name = "handle valid puzzle column (duplicate of different type) return true",
        result = isValidPuzzle(puzzle12),
        correctResult = false
    )
    var puzzle13 = listOf(listOf("1",4,7), listOf(1,5,8), listOf(3,6,9))
    testSudokuPuzzle(name = "handle valid puzzle column (duplicate of different type) return true",
        result = isValidPuzzle(puzzle13),
        correctResult = false
    )




}
fun testSudokuPuzzle(name:String, result:Boolean, correctResult:Boolean){


    if (result == correctResult){
        println("success $name")
    }else{
        println("failed $name")
    }
}
