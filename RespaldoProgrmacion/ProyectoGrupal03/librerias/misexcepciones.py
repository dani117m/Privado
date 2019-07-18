class Error(Exception):
	"""
	"""
	pass

class MarcaDeCelularError(Error):
	"""
	"""
	def __init__(self, expresion):
		self.expresion = expresion

class PaisError(Error):
	"""
	"""
	def __init__(self, expresion):
		self.expresion = expresion

class NumeroError(Error):
	"""
	"""
	def __init__(self, expresion):
		self.expresion = expresion
