database=[
          ["Harshit","123",0],
          ["Aaksh","abc",0],
          ["batman","xyz",0]
          ]
def login(username,password):
    for user_detail in database:
        if username==user_detail[0] and password==user_detail[1]:
            user_detail[2]=1
            print("login successful")
            return user_detail
def logout(username):
    for user_detail in database:
        if user_detail[0]==username:
             user_detail[2]=0
             print("logged out")
             return user_detail
       
        
user=login("Harshit","123")
print("Status : ",user[2])

user1=logout("Harshit")
print("Status : ",user1[2])
