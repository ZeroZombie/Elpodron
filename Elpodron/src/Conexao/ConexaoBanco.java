// situa em qual package ou “pacote” está a classe

package Conexao;

// faz as importações de classes necessárias para o funcionamento do programa

import java.sql.Connection; // conexão SQL para Java

import java.sql.DriverManager; // driver de conexão SQL para Java

import java.sql.SQLException; // classe para tratamento de exceções

public class ConexaoBanco {

public Connection getConnection() {

try {

return DriverManager.getConnection("jdbc:mysql://localhost/elpodron","root","");

}

catch(SQLException excecao) {
    
throw new RuntimeException(excecao);
}

}

}