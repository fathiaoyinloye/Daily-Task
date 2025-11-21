import unittest
from filter_string import *
class TestFilterString(unittest.TestCase):
	def testThatFilterStringWillREturnAlist(self):
		my_list = []
		actual = type(getWordsWithFourLetters(my_list))
		expected = list
		self.assertEqual(actual,expected)

	def testThatFilterStringWillREturnWordsWithFourLetters(self):
		words = ["Fathia", "Temmy", "Tolu", "Babe"];	
		actual = getWordsWithFourLetters(words)
		expected = ["Tolu", "Babe"]
		self.assertEqual(actual,expected)