# Interfaces, Classe Abstrata, Agregação e Composição

## Interfaces

- **Interface**: É um contrato que quando assumido por uma classe deve ser implementado.

*Interface*
- Caneta {+ escrever(texto : String) : void + getCor() : String}
    - CanetaEsferografica {- cor : String}
    - Giz {- cor : String}
    - Lapiz {- cor : String}

## Classe Abstrata

- **Classe Abstrata**: Uma classe abstrata é uma classe que serve de modelo para outras classes. Ela sempre será uma superclasse genérica, e suas subclasses serão mais especificas. Além disso, ela não pode ser instanciada e pode conter ou não métodos abstratos, podendo ser implementados nas classes descendentes.

- **Herança**: A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes, aproveitando-se das caracteristicas existentes na classe a ser estendida. A linguagem Java permite o uso de hernça simples, mas não permite a implementação de herança múltipla.

## Agregação

- **Agregação**: É quando um objeto necessita de outro objeto já criado para existir.

## Composição

- **Composição**: È quando o objeto não depende de outro, mas quando um objeto morre ou é excluído, ele excluui todos os seus relacionamentos.