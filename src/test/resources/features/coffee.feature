@snacks
Feature: Drinks Rate
@split[flat-white:off]
# @tea
Scenario: Display available drinks
Given the machine is not empty
Then the following drinks should be available:
| name          | price |
| espresso      |  1.90 |
| caffe latte   |  2.30 |

@split[flat-white:on]
#  @cof
Scenario: Display available drinks (including the new experimental flat white)
Given the machine is not empty
Then the following drinks should be available:
| name          | price |
| espresso      |  1.90 |
| flat white    |  2.10 |
| caffe latte   |  2.30 |