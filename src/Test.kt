fun main() {

    // 기본타입
    // 코틀린은 모든 것이 객체
    // 모든 것에 멤버 함수나 프로퍼티를 호출 가능하다는 의미

    //숫자형
    // 자바의 숫자형과 비슷
    // number 클래스임
    // primitive type에 직접 접근할수 없음
    // char가 숫자가 아닌 문자형

    // 리터럴
    // int short
    // long 123L
    // double 123.4
    // float 123.4f
    // 2진수 0b0101010
    // 8진수 안됨
    // 16진수 0x0f

    // underscore
    //1_000_000

    // representation
    // JVM에서 사용시 primitive, boxing 등이 되는 경우가 있음
    // nullble, 제네릭의 경우 박싱됨
    // 박싱된 경우 identity 유지하지 않음음
    val intA: Int = 10000
    val intB: Int? = 10000
    println("intA === intB : ${intA === intB}")
    println("intA == intB : ${intA == intB}")

    // EXPLICIT CONVERSION
    // 작은 타입은 큰 타입의 하위타입이 아니라서 대입이 안됨

    // 문자
    // char는 숫자가 아님

    // 배열 Array 클래스
    // get set([]연산자 오버로딩됨) overroading size
    // 생성 Array(size, {}), arrayOf
    var arrayD: Array<String> = arrayOf("나리","지아","주아")
    println("arrayD.get(2) : ${arrayD.get(2)}")
    println("arrayD.size : ${arrayD.size}")
    val arrayA = arrayOf("0", "1", "2", "3", "4")
    val arrayB = Array(5, {i -> i.toString()})

    for(arrayC in arrayA){
        print(arrayC)
    }
    println()
    for(arrayC in arrayB){
        print(arrayC)
    }
    println()

    val x:IntArray = intArrayOf(1,2,3)
    x[0] = 7
    println(x.get(0))
    println(x[0])
    println(x.size)

    //String
    //escaped string
    val strTest = "Hello.world!\n"
    print(strTest)
    // raw string("""Kotlin""")
    val strTestRaw = """
       ""이것은 코틀린의,
        raw String
        입니다.""
    """
    print(strTestRaw)
}