package part1

def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'

roman[8] = 'VIII'
assert roman.size() == 9

def http = [
        100: 'CONTINUE',
        200: 'OK',
        400: 'BAD REQUEST',
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4
