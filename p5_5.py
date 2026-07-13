movies = {
    "War": [3, 5],
    "Bourne": [18, 5],
    "Gully boy": [15, 5],
    "Uri": [12, 5]
}

movie_name = input("Enter the movie name: ")
age = int(input("Enter your age: "))

if movie_name in movies:
    min_age, seats = movies[movie_name]
    
    if age >= min_age:
        
        if seats > 0:
            print("You are eligible to watch the movie.")
            print("Seats available. Booking confirmed!")
            movies[movie_name][1] -= 1 
        else:
            print("Sorry, tickets are sold out.")
    else:
        print("You are not eligible to watch this movie (Age restriction).")
else:
    print("Sorry, this movie is not available in the cinema.")
