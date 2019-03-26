/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex2.book;

/**
 *
 * @author Vitor Eduardo
 */
public class BookDemo {
    public static Book info;
    
    public static void main(String[] args){
    
    info.titulo = new char[]{'o','l','a'};
    info.editor = new char[]{'G','S','I'};
    info.ano = 2019;
    info.paginas = 541;
    info.cotacao[0] = 8;
    info.cotacao[1] = 1;
    info.cotacao[2] = 3;
    
    System.out.print("TITULO: ");
    System.out.println(info.titulo );
    System.out.print("EDITOR: ");
    System.out.println(info.editor);
    System.out.print("ANO: ");
    System.out.println(info.ano);
    System.out.print("NUMERO DE PAGINAS: ");
    System.out.println(info.paginas);
    System.out.print("COTACAO1: ");
    System.out.println(info.cotacao[0]);
    System.out.print("COTACAO2: ");
    System.out.println(info.cotacao[1]);
    System.out.print("COTACAO3: ");
    System.out.println(info.cotacao[2]);
    
    info.author1.Acronimo = new char[]{'a','b','c'};
    info.author1.Nome = new char[]{'r','u','i'};
    info.author1.Nacionalidade = new char[]{'c','h','i','n','e','s'};
    
    System.out.print("ACRONIMO AUTOR 1: ");
    System.out.println(info.author1.Acronimo);
    System.out.print("NOME AUTOR 1: ");
    System.out.println(info.author1.Nome);
    System.out.print("NACIONALIDADE AUTOR 1: ");
    System.out.println(info.author1.Nacionalidade);
    
    info.author2.Acronimo = new char[]{'c','b','a'};
    info.author2.Nome = new char[]{'z','e'};
    info.author2.Nacionalidade = new char[]{'m','a','r','r','o','q','u','i',
        'n','o'};
    System.out.print("ACRONIMO AUTOR 2: ");
    System.out.println(info.author2.Acronimo);
    System.out.print("NOME AUTOR 2: ");
    System.out.println(info.author2.Nome);
    System.out.print("NACIONALIDADE AUTOR 2: ");
    System.out.println(info.author2.Nacionalidade);
    
}
}