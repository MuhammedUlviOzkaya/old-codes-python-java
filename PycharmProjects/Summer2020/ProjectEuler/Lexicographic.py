from math import factorial

liste = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
digits = 10
number = []
odd = 999999
n = odd // factorial(digits-1)

while digits != 0:

    number.append(liste[n])
    liste.remove(liste[n])
    odd = odd - n * factorial(digits-1)
    digits -= 1
    if digits == 0:
        break
    n = odd // factorial(digits-1)

for i in number:
    print(i, end= "")

















