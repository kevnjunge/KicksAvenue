package kev.njunge.kicksavenue

data class Sneaker(var imageId: Int, var name: String, var description: String, val i: Int)

object SneakerImages {

    val images = arrayListOf(
        R.drawable.bata_ngoma,
        R.drawable.nike_react_presto,
        R.drawable.converse,
        R.drawable.crocs,
        R.drawable.new_balance_rugged,
        R.drawable.nike_air_jordan11_cool_gray,
        R.drawable.nike_airmax_evolution,
        R.drawable.nike_cortez_earth_day,
        R.drawable.nike_react_presto,
        R.drawable.reebok_question_low,
        R.drawable.vans_floral
    )

    private val shoeNames = arrayListOf(
        "Bata Ngoma",
        "Some Pink Shoe",
        "Converse",
        "Crocs",
        "New Balance Rugged",
        "Nike Air Jordan 11",
        "Nike Air Max Evolution",
        "Nike Cortez Earth Day",
        "Nike Presto",
        "Rebook Question Low",
        "Vans"
    )

    private val shoeDescription: String =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo eget dui et interdum. Aenean ut metus vel arcu maximus aliquam. Fusce convallis cursus turpis quis hendrerit. In aliquet nisi ligula, a euismod risus finibus in. Aliquam eleifend quis quam ac ultrices. Nunc a faucibus urna, id convallis libero. Proin aliquam ex ac feugiat consectetur. Praesent non vulputate mi. Pellentesque consectetur magna neque. Proin consectetur commodo quam. Phasellus sit amet volutpat justo, vel faucibus nunc. Sed quis orci aliquam, suscipit leo a, lobortis eros. Nulla id mauris condimentum, interdum mi a, interdum metus. Sed non lorem in libero luctus tincidunt. Mauris sed rhoncus augue, sed sodales orci."


    var sneakerList: ArrayList<Sneaker>? = null
        get() {
            if (field != null)
                return field

            field = ArrayList()
            for (i in images.indices) {
                val imageId = images[i]
                val shoeName = shoeNames[i]
                val description = shoeDescription
                val shoe = Sneaker(imageId, shoeName, description, i)
                field!!.add(shoe)

            }
            return field
        }
}