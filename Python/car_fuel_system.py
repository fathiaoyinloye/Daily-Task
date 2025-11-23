class CarFuelSystem:
    def __init__(self):
        self.levelOfFuel = 0
        self.isStarted = False
        self.fuelEfficiency = 16

    def start_car(self):
        if self.isStarted == True:
            raise ValueError("Car is already started")
        else:
            self.isStarted = True

    def stop_car(self):
        if self.isStarted == False:
            raise ValueError("Car is already stopped")
        else:
            self.isStarted = False

    def get_level_of_fuel(self):
        return self.levelOfFuel

    def get_car_starting_status(self):
        return self.isStarted

    def refuel(self, litre):
        if litre <= 0:
            raise ValueError("Litres efficiency cannot be less than or equal to 0")
        elif litre + self.levelOfFuel > 50:
            raise ValueError("Highest fuel level is 50")
        else:
            self.levelOfFuel += litre


    def calcuate_fuel_consumed(self, distance):
        fuel_consumed = distance / self.fuelEfficiency
        result = f"{fuel_consumed:.2f} "
        return int(result)

    def drive_car(self, distance):
        if self.isStarted == False:
            raise ValueError("Car cannot be driven when it is not started")
        elif distance <= 0:
            raise ValueError("Distance is cannot be less than or equal to 0")
        else:
            fuel_consumed = self.calcuate_fuel_consumed(distance)
            self.levelOfFuel -= fuel_consumed
