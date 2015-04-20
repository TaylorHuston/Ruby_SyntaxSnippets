#loops.rb - Demonstration of the different loop structres in Ruby



i = 0
while i < 5 do
    puts "i " + i.to_s
    i = i + 1
end

gets

5.times do |y|
    puts "y " + y.to_s
end

gets

x = 0
until x > 5 do
  puts "x " + x.to_s
  x = x+1
end

gets

array = [1, 2, 3, 4, 5]

for i in array
  puts "array["+i.to_s+"] " + i.to_s
end

puts

array.each do |i|
  puts "array["+i.to_s+"] " + i.to_s
end
