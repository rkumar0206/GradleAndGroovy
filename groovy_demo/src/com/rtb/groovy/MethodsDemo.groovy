package com.rtb.groovy

// ---------------------
int product(int x=3, int y) {
		
	return x* y
}

println product(10,5)

// the above can be written as 
def product(x,y) {
	x *y
}

result = product 10,5
println result
// ------------------------

// named parameters

void display(Map productDetails) {
	
	println productDetails.name
	println productDetails.price
}

display(price : 1000, name : "Iphone")  // with brackets
display price : 1000, name : "Iphone" // without brackets

// -------------------------










