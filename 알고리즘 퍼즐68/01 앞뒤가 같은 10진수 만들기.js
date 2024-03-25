//  자바스크립트는 reverse() 함수가 없으므로 아래와 같이 메서드 만들어줌
String.prototype.reverse = function () {
    return this.split("").reverse().join("");
}

// 11부터 탐색 개시
var num = 11;
while (true) {
    if((num.toString() == num.toString().reverse()) &&
       (num.toString(8) == num.toString(8).reverse()) &&
       (num.toString(2) == num.toString(2).reverse())) {
       console.log(num);
       break;
    }
    // 홀수만 탐색하므로 +2
    num += 2;
}