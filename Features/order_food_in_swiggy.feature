Feature: Order Food

Scenario: A user must be able to order food on Swiggy
Given a user is on the landing page of Swiggy
When he enters Hyderabad in the delivery location
And he selects the 1st option from the auto-complete box
And he clicks on the first restaurant shown under Top restaurants chain in Hyderabad
And he clicks on Add button corresponds to first listed dish
And he hovers over the Cart on the top right corner
And he clicks on Checkout button in the sub-menu
Then he verify the text - "To place your order now, log in to your existing account or sign up." is displayed
