// data classlar veri taşımak amacı ile kullanılırlar Data class, equals(), hashCode(), toString(), copy(), ve
// componentN() fonksiyonlarını otomatik olarak oluşturur.
//data classların mutlaka primary constructor u olmalıdır. ve en az 1 tane parametre içermelidir. parametreler val ya da
//var ile başlamalıdır çünkü veri taşıyacakları için arka planda get ve set fonksiyonları oluşturulması gerekiyor.
// data classların içerisinde değişken ve fonksiyon tanımlanabilir ama yazmamak daha doğrudur çünkü data classlar
// yalnızca veri tutmak için kullanılmalıdırlar data classlar miras alabilirler
// fakat başka bir class tarafından miras alınamazlar bunun için başlarına open gelemez. varsayılan olarak final dir.
// inner ve sealed yapılamaz ama nested olabilir.


data class Pokemon(val name: String= "Balbazar",val age:Int,val type:String){
    val fightcount:Int = 5 // data class içinde değişken tanımlanabilir.

    fun attack(){           // data class içinde fonksiyon tanımlanabilir.
    }


    // componentN fonksiyonu mantığı: constructor içinde tanımlanan parametlere sırasını gözeterek erişir.
    // name = person1.component1()  age = person1.component2() ve type = person1.component3() ile eşdeğerdir.

    val pokemon1 = Pokemon("Charizard",12,"Fire")
    val pokemon2 = pokemon1.copy(name="Charmander",age=7)
    val pokemon1name = pokemon1.component1()
    val pokemon1age = pokemon1.component2()
    val pokemon1type = pokemon1.component3()



}
