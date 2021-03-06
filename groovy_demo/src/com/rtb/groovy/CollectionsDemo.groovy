package com.rtb.groovy

l = [1,2,3]
LinkedList ll = [1,3,5]

println l
println l.class
println ll
println ll.class

l << 4  // append element

println l

l += [5,6,7]  // append list

println l

println l-[3,5]  // remove elements

l.each { 
	
	print it
}
println ""
l.reverseEach { 
	
	print it
}
println ""
//l.eachPermutation { println it }

// ---------------------------------------------------

// Set
s=['java', 'js', 'python', 'js'] as Set
println s
println s.getClass()

// Map
m = [courseName : 'Gradle', rating : 5, price : 20.5]
println m
m.each {k,v -> 
	
	println k
	println v
}

println m.courseName
println m['courseName']
println m.get('courseName')

m.review="It's awesome"
m['review']="It's awesome"

println m['review']






