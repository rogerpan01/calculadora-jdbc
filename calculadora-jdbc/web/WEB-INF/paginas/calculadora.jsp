<%-- 
    Document   : calculadora
    Created on : 12/12/2018, 00:36:16
    Author     : Roger
--%>

<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Caululadora</title>
        <link rel="stylesheet" type="text/css" href="css_1.css">
        <style>
            body{
            width: 500px;
            margin: 0 auto;
            }
        h1 {
	transition: 1s;
	background-color: aqua;
	border-radius: 30px;
	text-align: center;
	font-size: 70px;
	text-shadow: 2px 2px 5px rgb(189, 115, 18);
        }
        h1:hover{
	transition: 1s;
	font-size: 90px;
	text-shadow: 5px 6px 9px rgb(189, 115, 18);
	background-position-y: 30px;
        }
        .caixa-numero{
	margin: 10px;
        }
        label{
	font-size: 18px;
        font-family: calibra, cursive;
        }
        .button{
	transition: 0.5s;
	font-family: "Arial black", cursive;
	font-size: 12px;
	border-radius: 2px; 
	background: #3a07c7;
	background-color: aqua;
	border-radius: 2mm;
	padding: 7px;
	box-shadow: 2px 2px 5px rgb(189, 115, 18);
        }
        button:hover{
	transition: 0.5s;
	font-size: 18px;
	color: aliceblue;
        }
        input{
            font-size: 14px;
            width: 100px;
            height: 20px;
            border-radius: 20px;
            border: solid 2px #3a07c7;
        }
        </style>
    </head>
    <body>
        <h1> Calculadora</h1>
            <form method="get" action="Calcula">
                
                <div class="caixa-numero"><label for="n1">Número 1:</label>
                    <input id="n1" class="caixa-numero" type="text" name="n1"><br/>
		</div>
		<div class="caixa-numero">	
                    <label for="n2">Número 2:</label>
                    <input id="n2" class="caixa-numero" type="text" name="n2">
                </div><br>
                <select class="button" name="opcao">
                    <option value="0">( Somar )</option>
                    <option value="1">( Subtrair )</option>
                    <option value="2">( Multiplicar )</option>
                    <option value="3">( Dividir )</option>
                </select>
		<div>
                    <button class="button" id="calcular" type="submit">Calcular</button>
		</div>
            </form>
            <div class="caixa-numero resultado">
                        
			
            </div>
            
</body>

</html>
