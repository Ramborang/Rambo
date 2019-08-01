#!/usr/bin/env python

#creating a list
peopleihate = ["caleb","tom","dick","harry","larson"]

def find(x):
    for element in peopleihate:
        print("Element: {}".format(element))
        if x == element:
            found = element
            break
    peopleihate.remove(element)

if __name__ == "__main__":
    find("dick")

    print(peopleihate)

