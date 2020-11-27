class car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has been moving")
    def stop(self):
        print(self.manufacturer + " " + self.model + " has been Stopped")

car1 = car("Honda","Accord","2011","Auto","Red")
car2 = car("Toyota","decond","2012","Manual","Black")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()