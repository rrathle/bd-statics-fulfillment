### Box Rules

You're working in an Amazon fulfillment center and you cannot ship any boxes where either the height, width, or 
length of the box exceeds 72 inches. You need to implement the class, `Box`, so that it ensures no boxes are 
created that cannot be shipped. 

The `Box` class should contain the following variables:
- `height`
- `width`
- `length`

The `Box` class should expose the following methods:
 - getters for `height`, `width`, and `length`
 - `validateBoxDimensions(double height, double width, double length)` which allows a user to check if 
   the provided dimensions are legal. If they are all legal, return `true`, otherwise `false`.

Update the `Box` class constructor to throw a `DimensionValueException` if the values provided are not legal.
