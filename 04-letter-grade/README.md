# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * Get grade and % 10 to get ones digit. If ones digit is greater than or equal to 7, add "+". If ones digit is less than or equal to 2, add "-".


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * I put a boolean in my if statement that puts "-" if the grade is also greater than 60 so it wouldn't misinterpet it by the ones digit


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * I put a boolean in each of the if statements managing the "+" and "-" if the grade is greater than 60
