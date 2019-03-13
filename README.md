
Q A-1a : Can you implement the sing() method for the bird?

Answer:  Implemented a new method called sing() in bird class.

Q A-1b :How did you optimize the code for maintainability? 
Answer :
Have taken fly and sing methods from Bird class and make separate interfaces for fly() and sing() for better maintanance. So, only the birds that are supposed to fly will implement that interface.


Q A-4d)How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?

Answer : Using (Has-A relationship) with abstraction(implementing interfaces).
 Parrot has a relationship with cat,dog,duck and rooster.


Q D.Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?

Answer : caterpillar and butterfly are been modeled using Composition/Aggregation 