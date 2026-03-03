<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML & CSS Combined Example</title>
    
    <!-- Internal CSS -->
    <style>
        /* Reset some default styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            padding: 20px;
        }

        .card {
            background-color: white;
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            text-align: center;
        }

        .card img {
            width: 100%;
            border-radius: 10px;
        }

        .card h2 {
            margin: 15px 0;
            color: #007BFF;
        }

        .card p {
            font-size: 16px;
            line-height: 1.5;
        }

        .btn {
            display: inline-block;
            margin-top: 15px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="card">
        <img src="https://via.placeholder.com/400x200" alt="Sample Image">
        <h2>HTML & CSS Combined</h2>
        <p>This is an example of combining HTML and CSS in one file using internal CSS. You can style elements directly inside the HTML document.</p>
        <a href="#" class="btn">Learn More</a>
    </div>

</body>
</html>
    public static void main(String[] args) {

        int num =1234567789;
        int count =0 ;
        while(num!=0){
            num =num/10;
            count++;
        }
        System.out.println(count);
        
    }    

    