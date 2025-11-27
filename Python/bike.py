class Bike:
    def __init__(self):
        self.speed = 0
        self.isStarted = False

    def on_bike(self):
            self.isStarted = True

    def off_bike(self):
        if self.isStarted == False:
            raise ValueError("Bike is not On")
        else:
            self.isStarted = False

    def get_bike_status(self):
        return self.isStarted

    def set_accelerate_to_gear_one(self):
        self.speed += 1


    def set_accelerate_to_gear_two(self):
        self.speed += 2

    def set_accelerate_to_gear_three(self):
        self.speed += 3

    def set_accelerate_to_gear_four(self):
        self.speed += 4

    def get_speed(self):
        return self.speed

    def accelerateBike(self):
        if self.isStarted == False:
            raise ValueError("Bike is not On")
        elif self.speed >= 40:
            self.set_accelerate_to_gear_four()
        elif self.speed >= 30:
            self.set_accelerate_to_gear_three()
        elif self.speed >= 20:
            self.set_accelerate_to_gear_two()
        else:
            self.set_accelerate_to_gear_one()
    def set_decelerate_to_gear_one(self):
        self.speed -= 1


    def set_decelerate_to_gear_two(self):
        self.speed -= 2

    def set_decelerate_to_gear_three(self):
        self.speed -= 3

    def set_decelerate_to_gear_four(self):
        self.speed -= 4


    def decelerateBike(self):
        if self.isStarted == False:
            raise ValueError("Bike is not On")
        elif self.speed >= 40:
            self.set_decelerate_to_gear_four()
        elif self.speed >= 30:
            self.set_decelerate_to_gear_three()
        elif self.speed >= 20:
            self.set_decelerate_to_gear_two()
        elif self.speed >= 1:
            self.set_decelerate_to_gear_one()