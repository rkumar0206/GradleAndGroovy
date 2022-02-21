package com.rtb.groovy


// lambda in java
c ={ n = 10 -> // we can also use default value
	
	println(n%2 ==0?"even":"odd");
	
}

c.call()  // execute the closure

4.times { n ->  print n}  // 0123
println ""
4.times { print it }  // it can be used when no name is defined

