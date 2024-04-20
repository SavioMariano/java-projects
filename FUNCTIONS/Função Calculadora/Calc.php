<?php
echo("Bem vindo a calculadora do PP\n");
echo("digite um número: ");
$num1 = intval(fgets(STDIN));  //Lê o valor
echo("Digite outro número: ");
$num2 = intval(fgets(STDIN));  //Lê outro valor
function Soma($x,$y){
    return ($x + $y);
}
function  Subtracao($x, $y) {
    return ($x - $y);
}
function Multiplicacao($x, $y) {
    return ($x * $y);
}
function Divisao($x, $y) {
    if($y == 0){
        echo "Erro! Não é possível dividir por zero.\n";
    }else{
        return ($x / $y);
    }   
}
echo("Escolha:\n 1-Soma 2-Subtração 3-Multiplicação 4-Divisão\n");
$escolha = intval(fgets(STDIN));
if ($escolha == 1){
    echo Soma( $num1 , $num2 );
}elseif ($escolha == 2){
    echo Subtracao( $num1 , $num2 );
}elseif ($escolha == 3){
    echo Multiplicacao( $num1 , $num2 );
}elseif ($escolha ==4){
    echo Divisao( $num1 , $num2 );
}else {
    echo("Não achamos o operador");
}

?>