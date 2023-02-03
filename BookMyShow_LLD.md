# LLD of BookMyShow

## Gathering Requirements
- City has Theatres
- Theaters are multiscreen
- Screen have Type(2D,Dolby,3d,4d etc)
- Screen have Seats
- Seats have properties like row and column,seat Id,Seat Type ,Seat status(Available,Damaged) etc.
- Following are the Seat Types(Gold,Silver,Premium)
- Movie has list of actors, genre, name, movie Type
- Movies have shows assigned to it
- Movie show has Ticket price.
- Booking can be done for the show(Multiple seats)
- Payment can be made partial
- There can be a list of payments
- Booking ticket has seatNo,QR code,Screen Name etc.
- Transaction has transaction id, payment made, payment status
- Booking show has seat status(Available,booked,blocked etc)
- After booking notifications are sent by different types, etc.(by email, push notification etc)
- Person has a profile(it can be of multiple types – Normal user, Admin, Guest User)
- People can do activities based on their role(logged in user can search, book tickets. Guest User can only search, Admin can create shows etc)
- User should be able to search all the shows of a particular movie in a city

## Clarifying Requirements
- Do BookMyShow has its own DB or is it calling external API for it?
  Lets suppose we are using our own API.

## API to implement
- Book Tickets
- Search movie shows in a City

## Class Diagram
### City
- Id
- Name

### Theatre
- Id
- Name
- City
- List<Screen>

### Screen
- Id
- Screen_name
- List<Seats>
- Screen Type(Dolby,2d,3d,4d etc)

### Seat
- Id
- Seat Type (Gold,Silver,premium)
- Seat Status → (Available,Damaged)
- Row Id
- Column Id

### Movie
- Id
- Name
- List<Actors>
- List<Genre>

### Movie_show
- Id
- Movie
- Screen
- Start Time
- End Time
- List<Seat ShowPrice>
- List<Movie_show_seat_status>

### Seat ShowPrice
- Id
- Movie_show
- SeatType
- Price

### Movie_show_seat_status
- Id
- Movie Show
- Seat
- Booking Status – (Booked,Available,Blocked)

### User
- Id
- Name
- UserType

### Payment
- Id
- Payment Mode(cash,UPI,card)
- TransactionId
- Amount
- Payment Status(Success,Failure)

### Booking
- Id
- User
- List<Movie_show_seat_status>
- List<Payments>
- Amount
- Booking status(Booked,Confirmed,Cancelled)

## <<Send Notification>>
### Booking

### SendByEmail
### SendByWhatsapp

## <<Search for shows>>
By Movie Name and City name, By Theatre Name etc.