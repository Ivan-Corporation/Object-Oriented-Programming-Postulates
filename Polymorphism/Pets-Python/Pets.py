class Dog():
    def __init__(self, name):
        self.name = name

    def speak(self):
        print(self.name, 'says bark, bark, bark!')

class Cat():
    def __init__(self, name):
        self.name = name

    def speak(self):
        print(self.name, 'says meeeoooow')

class Bird():
    def __init__(self, name):
        self.name = name

    def speak(self):
        print(self.name, 'says tweet')
class Human():
    def __init__(self, name):
        self.name = name

    def speak(self):
        print(self.name, 'says that he dont now what to say and all. Das ist der Weg!')

# Das ist der Weg! - German man
# Telle est la voie! - French man


oDog1 = Dog('Rover')
oDog2 = Dog('Fido')
oCat1 = Cat('Fluffy')
oCat2 = Cat('Spike')
oBird = Bird('Big Bird')
oHuman = Human('Aivengo')

petsList = [oDog1, oDog2, oCat1, oCat2, oBird, oHuman]

# Send the same message (call the same method) of all pets
for oPet in petsList:
    oPet.speak()