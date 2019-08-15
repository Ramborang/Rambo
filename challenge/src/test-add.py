#!/usr/bin/env python3

import unittest
import sys
from add import sumArray

maximum = sys.maxsize
minimum = -sys.maxsize -1

class TestAdd (unittest.TestCase):
    def testAddZeroPos(self):
        expected = 5
        result = sumArray([5,0])
        self.assertEqual(expected, result, "5 + 0 should equal 5 but was {}".format(result))

        result = sumArray([0,5])
        self.assertEqual(expected, result, "0 + 5 should equal 5 but was {}".format(result))

    def testAddZeroNeg(self):
        expected = -5
        result = sumArray([-5,0])
        self.assertEqual(expected, result, "-5 + 0 should equal -5 but was {}".format(result))

        result = sumArray([0,-5])
        self.assertEqual(expected, result, "0 + -5 should equal -5 but was {}".format(result))

    def testAddPosPos(self):
        expected = 5
        result = sumArray([2,3])
        self.assertEqual(expected, result, "2 + 3 should equal 5 but was {}".format(result))

        result = sumArray([1,4])
        self.assertEqual(expected, result, "1 + 4 should equal 5 but was {}".format(result))

    def testAddNegNeg(self):
        expected = -5
        result = sumArray([-2,-3])
        self.assertEqual(expected, result, "-2 + -3 should equal -5 but was {}".format(result))

        result = sumArray([-1,-4])
        self.assertEqual(expected, result, "-1 + -4 should equal -5 but was {}".format(result))

    def testAddPosInf(self):
        result = sumArray([1, maximum])
        self.assertEqual(maximum, result, "Maxint + 1 should be MaxInt but was {}".format(result))
        self.assertIsInstance(result, int, "Should have returned an integer")

        result = sumArray([0, maximum])
        self.assertEqual(maximum, result, "Maxint + 0 should be MaxInt but was {}".format(result))

    def testAddNegInf(self):
        result = sumArray([-1, minimum])
        self.assertEqual(minimum, result, "Minint + -1 should be Minint but was {}".format(result))
        self.assertIsInstance(result, int, "Should have returned an integer")

        result = sumArray([0, minimum])
        self.assertEqual(minimum, result, "Minint + 0 should be Minint but was {}".format(result))

# Unit test runner
if __name__ == '__main__':
    unittest.main(verbosity=1)