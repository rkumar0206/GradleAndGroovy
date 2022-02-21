package com.rtb.groovy

float a = 10.25f

println a;
println a.class   // we can also use a.getClass()

s = 'hello'
println s

name = "Rohit"
s = "hello ${name}"  // it is called groovy string 

println s

s = '''
All the power is within in you,
You can do anything and everything
'''

println(s)

// regular expressions
emailPattern = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/
print "test@gmail.com"==~ emailPattern