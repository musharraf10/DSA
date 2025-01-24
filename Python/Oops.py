class PrivateM:
    __name = "Musharaf"
    
    def name(self):
        print(self.__name)

obj = PrivateM()
obj.name()
print(obj._PrivateM__name)