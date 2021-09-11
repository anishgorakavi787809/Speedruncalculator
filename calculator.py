import os

ans = 0

while True:
  os.system("clear")
  print("plus or + is addition\n")
  print("- or minus is subtraction\n")
  print("* or  multiply is multiplication\n")
  print("/ or divide is division\n")
  print("% or modulo is modulo\n")
  print("ans is ans followed by operator then number\n")
  userrequest = input("So what do you want to do\n")

  
  if(userrequest == "plus" or userrequest == "+"):
    os.system("clear")
    while True:
      try:
        x = int(input("What's the first number"))
        y = int(input("What's the second input"))
        z = x+y
        print(str(x) + "+" + str(y) + "= " + str(z))
        input("press enter to continue!")
        ans = z
        break
      except:
        print("Wrong numbers!")
      

  if(userrequest == "minus" or userrequest == "-"):
    os.system("clear")
    while True:
      try:
        x = int(input("What's the first number"))
        y = int(input("What's the second input"))
        z = x - y
        print(str(x) + "-" + str(y) + "= " + str(z))
        input("press enter to continue!")
        ans = z
        break
      except:
        print("Wrong numbers!")
    

  if(userrequest == "multiply" or userrequest == "*"):
    os.system("clear")
    while True:
      try:
        x = int(input("What's the first number"))
        y = int(input("What's the second input"))
      except:
        print("Wrong numbers!")
      z = x*y
      print(str(x) + "*" + str(y) + "= " + str(z))
      input("press enter to continue!")
      ans = z
      break
   
  if(userrequest == "divide" or userrequest == "/"):
    os.system("clear")
    
    while True:
      try:
        x = int(input("What's the first number"))
        y = int(input("What's the second input"))
      except:
        print("Wrong numbers!")
      z = x/y
      ans = z
      print(str(x) + "/" + str(y) + "= " + str(z))
      input("press enter to continue!")
      break

  if(userrequest == "modulo" or userrequest == "%"):
    os.system("clear")
    
    while True:
      try:
        x = int(input("What's the first number"))
        y = int(input("What's the second input"))
      except:
        print("Wrong numbers!")
      z = x%y
      ans = z
      print(str(x) + "%" + str(y) + "= " + str(z))
      input("press enter to continue!")
      break
 
  if(userrequest == "ans" and ans > 0):
    os.system("clear")
    print("type add if you want to add ans + number you choose\n")

    print("type subtract if you want to add ans - number you choose\n")

    print("type multiply if you want to add ans * number you choose\n")

    print("type divide if you want to add ans / number you choose\n")
    print("type modulo if you want to add ans % number you choose\n")
    ansinput = input("Which one do you want to do with ans?")

    if ansinput == "add":

      while True:
        try:
          y = int(input("What's the second number you will add on top of ans"))
        except:
          print("wrong number!")
        z = ans + y
        ans = z
        print(str(ans) + "+"+ str(y) + " = " + str(z))
        break

    if ansinput == "subtract":

      while True:
        try:
          y = int(input("What's the second number you will subtract on top of ans"))
        except:
          print("wrong number!")
        z = ans - y
        ans = z
        print(str(ans) + "-"+ str(y) + " = " + str(z))
        break

    if ansinput == "multiply":

      while True:
        try:
          y = int(input("What's the second number you will multiply on top of ans"))
        except:
          print("wrong number!")
        z = ans * y
        ans = z
        print(str(ans) + "*"+ str(y) + " = " + str(z))
        break

    if ansinput == "divide":

      while True:
        try:
          y = int(input("What's the second number you will divide on top of ans"))
        except:
          print("wrong number!")
        z = ans / y
        ans = z
        print(str(ans) + "/"+ str(y) + " = " + str(z))
        break

    if ansinput == "modulo":

      while True:
        try:
          y = int(input("What's the second number you will do modulo on top of ans"))
        except:
          print("wrong number!")
        z = ans % y
        ans = z
        print(str(ans) + "%"+ str(y) + " = " + str(z))
        break
    input("press enter to continue!")
    os.system("clear")

  elif ans == 0:
    print("you need to fill up ans")    

  else:
    print("wrong values!")
