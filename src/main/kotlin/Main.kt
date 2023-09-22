import java.util.Scanner

fun displayUser(name: String, bloodGroup: String, phone: String, address: String, lastDonationDate: String) {
    println("Name: $name")
    println("Blood Group: $bloodGroup")
    println("Phone Number: $phone")
    println("Address: $address")
    println("Last Blood Donation Date: $lastDonationDate")
    println()
}

fun main() {
    val input = Scanner(System.`in`)
    var user_id: String
    var password: String
    var User_or_BG_or_name: String
    var count = 0
    println("****************************BLOOD GROUP MANAGEMENT*****************************")
    print("Input User ID: ")

    while (true) {
        user_id = input.nextLine()
        if (user_id == "Exit" || user_id == "exit" || user_id == "0") break
        if (user_id == "saifhossain") {
            println("Welcome in Blood Group Collection")
            print("Input Password: ")
            while (true) {
                password = input.nextLine()
                if (password == "Exit" || password == "exit" || password == "0") {
                    print("Input User ID: ")
                    break
                }
                if (password == "abc12345") {
                    println("Your Access Proved")
                    println("Input Blood Donor's User ID/Blood Group/Address:")
                    while (true) {
                        User_or_BG_or_name = input.nextLine()
                        println()

                        when (User_or_BG_or_name) {
                            "Abul", "O+", "Dhanmondi" -> {
                                count++
                                displayUser("Md. Abul", "(O+)Positive", "01756876357", "Dhanmondi, Dhaka", "17-07-2018")
                            }
                            "Sabur", "A+", "Uttara" -> {
                                count++
                                displayUser("Md. Sabur", "(A+)Positive", "01756876354", "Uttara, Dhaka", "23-07-2018")
                            }
                            "Md. Akhil", "B+", "Ajimpur" -> {
                                count++
                                displayUser("Md. Akhil", "(B+)Positive", "01756876355", "Ajimpur, Dhaka", "27-17-2018")
                            }
                            "Azhar Ali", "AB+", "Mohammadpur" -> {
                                count++
                                displayUser("Azhar Ali", "(AB+)Positive", "01756876358", "Mohammadpur, Dhaka", "14-02-2018")
                            }
                            "Md. Ridoy", "O+", "Dhanmondi" -> {
                                count++
                                displayUser("Md. Ridoy", "(O+)Positive", "01756870357", "Dhanmondi, Dhaka", "04-01-2018")
                            }
                            "Md. Hasib", "A+", "Dhanmondi" -> {
                                count++
                                displayUser("Md. Hasib", "(A+)Positive", "01756871357", "Mirpur, Dhaka", "09-07-2018")
                            }
                            "Md. Golam", "B+", "Bogra" -> {
                                count++
                                displayUser("Md. Hasib", "(B+)Positive", "01832347585", " Bogra, Dhaka", "01-04-2018")
                            }
                            "Sumon Ahmed", "O+", "Dhanmondi" -> {
                                count++
                                displayUser("Sumon Ahmed", "(O+)Positive", "01932353219", " Dhanmondi, Dhaka", "04-09-2018")
                            }
                            "Ranbir Kumar", "AB+", "Lakhnaw" -> {
                                count++
                                displayUser("Ranbir Kumar", "(AB+)Positive", "01732355435", "Lakhnaw , Mumbai", "04-05-2018")
                            }
                            "Katrina Kife", "B+", "Delhi" -> {
                                count++
                                displayUser("Katrina Kife", "(O+)Positive", "01932353219", " Delhi", "19-06-2018")
                            }
                            "Md.Zihad Sarker", "O-", "Mirpur" -> {
                                count++
                                displayUser("Md.Zihad Sarker", "(O-)Positive", "01932353219", "Mirpur, Dhaka", "11-07-2018")
                            }
                            "Samrat Khan", "A-", "Mohammadpur" -> {
                                count++
                                displayUser("Samrat Khan", "(A-)Positive", "01932353219", "Mohammadpur, Dhaka", "15-07-2018")
                            }
                            "Herok Kabiraz", "B-", "Shukrabad" -> {
                                count++
                                displayUser("Herok Kabiraz", "(B-)Positive", "01932353219", "Shukrabad, Dhaka", "16-07-2018")
                            }
                            "Rakibul Hasan", "AB-", "Mohammadpur, Dhaka" -> {
                                count++
                                displayUser("Rakibul Hasan", "(AB-)Positive", "01932353219", " Mohammadpur, Dhaka", "17-07-2018")
                            }
                            "Shahriyar Kabbo", "B-", "Kolabagan" -> {
                                count++
                                displayUser("Shahriyar Kabbo", "(B-)Positive", "01932353219", "Kolabagan, Dhaka", "16-07-2018")
                            }
                            "Sarwar Maruf Jebon", "A-", "Mohammadpur" -> {
                                count++
                                displayUser("Sarwar Maruf Jebon", "(A-)Positive", "01756876357", "Mohammadpur, Dhaka", "19-07-2018")
                            }
                            "Hasan Jamil Sany", "O-", "Mohammadpur" -> {
                                count++
                                displayUser("Hasan Jamil Sany", "(O-)Positive", "01756876354", "Mohammadpur, Dhaka", "16-07-2018")
                            }
                            "Palash Miah", "A-", "Mohammadpur" -> {
                                count++
                                displayUser("Palash Miah", "(A-)Positive", "01756876355", "Mohammadpur, Dhaka", "02-07-2018")
                            }
                            "Abdullah Al Mamun", "AB-", "Dhanmondi" -> {
                                count++
                                displayUser("Abdullah Al Mamun", "(AB-)Positive", "01756876358", "Dhanmondi, Dhaka", "05-07-2018")
                            }
                            "Nahid Hasan", "B-", "Mohammadpur" -> {
                                count++
                                displayUser("Nahid Hasan", "(B-)Positive", "01756870357", "Mohammadpur, Dhaka", "08-07-2018")
                            }
                            " Md. Shaon", "B+", "Shonirakhra" -> {
                                count++
                                displayUser(" Md. Shaon", "(B+)Positive", "01856506057", "Shonirakhra, Dhaka", "09-07-201801-07-2018")
                            }
                            "Mahamudur Rahman Munna", "A+", "Shukrabad" -> {
                                count++
                                displayUser("Mahamudur Rahman Munna", "(A+)Positive", "01832347585", "Shukrabad, Dhaka", " 02-07-2018")
                            }
                            " Md. Shohan", "O+", "Shukrabad" -> {
                                count++
                                displayUser(" Md. Shohan", "(O+)Positive", "01932353219", "Shukrabad, Dhaka", "03-07-2018")
                            }
                            "Md. Robin", "AB+", "Shukrabad" -> {
                                count++
                                displayUser("Md. Robin", "(AB+)Positive", "01732355435", "Shukrabad, Dhaka","04-07-2018")
                            }
                            "Md. Shafine", "B+", "Farmgate" -> {
                                count++
                                displayUser("Md. Shafin", "(B+)Positive", "01932353219", "Farmgate, Dhaka", "06-07-2018")
                            }
                            "Taufiqur Rahman Tamkin", "O+", "Malibag, Dhaka" -> {
                                count++
                                displayUser("Taufiqur Rahman Tamkin", "(O-)Positive", "01932353219", "Malibag, Dhaka", "07-07-2018")
                            }
                            "Golam Morshed", "A+", "Narayangaonj, Dhaka" -> {
                                count++
                                displayUser("Golam Morshed", "(A+)Positive", "01896006057", "Mohammadpur, Dhaka", "01-07-2018")
                            }
                            "Miraz", "O+", "Mohakhali" -> {
                                count++
                                displayUser("Miraz", "(O+)Positive", "01759506057", "Mohakhali, Dhaka", "20-07-2018")
                            }
                            "Md. Remon", "B+", "Mohammadpur" -> {
                                count++
                                displayUser("Md. Remon", "(B+)Positive", "01756586057", " Mohammadpur, Dhaka", "21-07-2018")
                            }
                            "Nusrat Jahan Meem", "B+", "Dhanmondi" -> {
                                count++
                                displayUser("Nusrat Jahan Meem", "(B+)Positive", "01657506077", "Dhanmondi, Dhaka", "23-07-2018")
                            }
                            "Mehenaz Mim", "AB-", "Rayerbag" -> {
                                count++
                                displayUser("Mehenaz Mim", "(AB-)Positive", "01659506057", "Rayerbag, Dhaka", "24-07-2018")
                            }
                            "Habib Ullah", "A-", "Rayerbag" -> {
                                count++
                                displayUser("Habib Ullah", "(A-)Positive", "01559506057", "Rayerbag, Dhaka", "25-07-2018")
                            }
                            "Juthy Akter", "B-", "Agargaon" -> {
                                count++
                                displayUser("Juthy Akter", "(B-)Positive", "01655506057", "Agargaon, Dhaka", "26-07-2018")
                            }
                            "Fahmida Prova", "O-", "Mohakhali, Dhaka" -> {
                                count++
                                displayUser("Fahmida Prova", "(O-)Positive", "01659556057", "Mohammadpur, Dhaka", "27-07-2018")
                            }
                            "Fahima Akter", "B-", "Mohammadpur" -> {
                                count++
                                displayUser("Fahima Akter", "(B-)Positive", "01959506057", "Mohammadpur, Dhaka", "28-07-2018")
                            }
                            "Mohema Abedin", "O-", "Savar" -> {
                                count++
                                displayUser("Mohema Abedin", "(O-)Positive", "01756876357", "Savar, Dhakaln", "29-07-2018")
                            }
                            "Tahmina Rimi", "A-", "Savar" -> {
                                count++
                                displayUser("Tahmina Rimi", "(A-)Positive", "01756876354", "Savar, Dhaka", "30-07-2018")
                            }
                            "MST. Khadija", "AB-", "Mohakhali" -> {
                                count++
                                displayUser("MST. Khadija", "(AB-)Negetive", "01756876355", "Mohakhali, Dhaka", "31-07-2018")
                            }
                            "Lubna Afroz", "O-", "Dhanmondi" -> {
                                count++
                                displayUser("Lubna Afroz", "(O-Negative)", "01756876358", "Dhanmondi, Dhaka", "19-07-2018")
                            }
                            "Beauty Banu", "A+", "Ajimpur" -> {
                                count++
                                displayUser("Beauty Banu", "(A+)Positive", "01652546057", "Mohammadpur, Dhaka", "18-07-2018")
                            }
                            "Noor A Maisha", "B+", "Gulisthan" -> {
                                count++
                                displayUser("Noor A Maisha", "(B+)Positive", "01856506057", "Gulisthan, Dhaka", "17-07-2018")
                            }
                            "Oyshi Tabassum", "O+", "olabagan" -> {
                                count++
                                displayUser("Oyshi Tabassum", "(O+)Positive", "01832347585", "Kolabagan, Dhaka", "16-07-2018")
                            }
                            "Purnata Mojumdar", "AB+", "Shukrabad" -> {
                                count++
                                displayUser("Purnata Mojumdar", "(AB+)Positive", "01932353219", "Shukrabad, Dhaka", "15-07-2018")
                            }
                            "Sarmishta Halder", "A+", "Kolabagan" -> {
                                count++
                                displayUser("Sarmishta Halder", "(A+)Positive", "01732355435", "Kolabagan, Dhaka","14-07-2018")
                            }
                            "Tabassum Islam", "O+", "Mohakhali" -> {
                                count++
                                displayUser("Tabassum Islam", "(B+)Positive", "01932353219", "Mohakhali, Dhaka", "13-07-2018")
                            }
                            "Tamannna Nusrat", "A+", "Uttara, Dhaka" -> {
                                count++
                                displayUser("Tamannna Nusrat", "(A+)Positive", "01932353219", "Uttara, Dhaka", "12-07-2018")
                            }
                            "Waqiah Noor", "AB+", "Savar" -> {
                                count++
                                displayUser("Waqiah Noor", "(AB+)Positive", "01896006057", "Savar, Dhaka", "11-07-2018")
                            }
                            "Musfiqur Sayed", "B+", "Jigatola" -> {
                                count++
                                displayUser("Musfiqur Sayed", "(B+)Positive", "01759506057", "Jigatola, Dhaka", "10-07-2018")
                            }
                            "Syed Saif Hossain", "B+", "Dhanmodi" -> {
                                count++
                                displayUser("Syed Saif Hossain", "(B+)Positive", "01953987595", "Dhanmondi, Dhaka", "21-10-2021")
                            }
                            "Sakib", "A+", "Muhammadpur" -> {
                                count++
                                displayUser("Sakib", "(A+)Positive", "01953987531", "Muhammadpur, Dhaka", "23-09-2019")
                            }
                            else -> println("No matching user found.")
                        }
                    }
                    println("$count People Matched!!")
                    count = 0
                } else {
                    println("Wrong Password")
                }
            }
        } else {
            println("Wrong User ID")
            println("Create New Id\nIf You Want to Create New Id\n Press 1")
            val isNew = input.nextInt()
            if (isNew == 1) {
                // Add logic to create a new user here if needed
            }
        }
    }
}

