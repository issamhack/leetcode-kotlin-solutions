class CountAndSay{
    fun countAndSay(n: Int): String {
         return rec(n)
    }
    fun rec(n : Int): String{
        if( n==1){
            return "1"
        }
        val word = rec(n-1)
        
        var newWord = ""
        var pointer1 = 0
        var pointer2 = 0
        var count = 0
        while(pointer1 < word.length){
            count = 0
            while (pointer2 < word.length && word[pointer2] == word[pointer1]){
                count++
                pointer2++
            }
            newWord = newWord+count+word[pointer1]
            pointer1 = pointer2 //so the pointer jumps right to the different digit
        }
        return newWord
        
    }
}