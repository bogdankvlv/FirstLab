#The main point of this program is to calculate the 
gravitational potential energy. This program accomplishes that by
taking the user's input of the planets name, planets mass, and planets
distance from the sun. The benfit of this program is that the user can 
enter as much information and they want until they write "STOP" when 
they are prompted to do so. The information that they entered is then 
sent to a seperate file where the gravitational potential energy was 
calculated for them.The techniques that was used for this program is
first that the Scanner class was imported and the PrintStream class was 
also imported.The scanner was used to save the user inputs of the
planet name, planet mass, and the plant distance from the sun. In the
main class the variables were declared with the universal gravitational 
constant and the sun's mass declared as final so that the user doesn't
have to keep entering it.The print stream class was used to send all
the results to a seperate text file called (results.txt). Another
technique that was used in this program was making a method for the 
prompts that would come up for the planet name. The method was put 
before the main class and was called in the main class.The use of a 
loop would keep taking input from the user until the user wants to stop
where they write STOP in the prompt for the planet name. The use of  
the printf class is very important in the output statement because it 
manages how many decimal points are printed in the answer and let's you
customize your text to make it look professional which the print class 
doesn't provide.I had multiple difficulties with this program where even 
some I had to go outside because I just couldn't find the fix. One
difficulty was that in the printf statement I had to add a %.3e so that 
there would be decimal point since the answer was being seen as a very 
large number and not in exponential format.Another difficulty was that
when creating the method I didn't write the signature correct and my
whole code was going crazy.
 
