Feature:  Amazon.com


  @appleProduct
  Scenario: Amazon.com adding product to basket
    Given User goes to amazon home page
    When Click accept cookies
    When Click Search box
    When Write product name
    When Click Search button
    When Filter for Shipped by Amazon
    When Filter by Apple
    When Click first product on the page
    When Add to cart
    Then Check the cart page












