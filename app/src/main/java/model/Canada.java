package model;

import java.util.List;

/**
 * Created by yan_zhe on 2017/6/27.
 */

public class Canada {

    /**
     * title : About Canada
     * rows : [{"title":"Beavers","description":"Beavers are second only to humans in their ability to manipulate and change their environment. They can measure up to 1.3 metres long. A group of beavers is called a colony","imageHref":"http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg"},{"title":"Flag","description":null,"imageHref":"http://www.donegalhimalayans.com/images/bryce_1.jpg"},{"title":"Transportation","description":"It is a well known fact that polar bears are the main mode of transportation in Canada. They consume far less gas and have the added benefit of being difficult to steal.","imageHref":"http://www.donegalhimalayans.com/KittensPlaced/meryl.jpg"},{"title":"Hockey Night in Canada","description":"These Saturday night CBC broadcasts originally aired on radio in 1931. In 1952 they debuted on television and continue to unite (and divide) the nation each week.","imageHref":"http://www.donegalhimalayans.com/kittens_avail/placido2.jpg"},{"title":"Eh","description":"A chiefly Canadian interrogative utterance, usually expressing surprise or doubt or seeking confirmation.","imageHref":null},{"title":"Housing","description":"Warmer than you might think.","imageHref":"http://icons.iconarchive.com/icons/iconshock/alaska/256/Igloo-icon.png"},{"title":"Public Shame","description":" Sadly it's true.","imageHref":"http://static.guim.co.uk/sys-images/Music/Pix/site_furniture/2007/04/19/avril_lavigne.jpg"},{"title":null,"description":null,"imageHref":null},{"title":"Space Program","description":"Canada hopes to soon launch a man to the moon.","imageHref":"http://www.donegalhimalayans.com/kittens_avail/jose2.jpg"},{"title":"Meese","description":"A moose is a common sight in Canada. Tall and majestic, they represent many of the values which Canadians imagine that they possess. They grow up to 2.7 metres long and can weigh over 700 kg. They swim at 10 km/h. Moose antlers weigh roughly 20 kg. The plural of moose is actually 'meese', despite what most dictionaries, encyclopedias, and experts will tell you.","imageHref":"http://caroldeckerwildlifeartstudio.net/wp-content/uploads/2011/04/IMG_2418%20majestic%20moose%201%20copy%20(Small)-96x96.jpg"},{"title":"Geography","description":"It's really big.","imageHref":null},{"title":"Kittens...","description":"蒩re illegal. Cats are fine.","imageHref":"http://www.donegalhimalayans.com/images/That%20fish%20was%20this%20big.jpg"},{"title":"Mounties","description":"They are the law. They are also Canada's foreign espionage service. Subtle.","imageHref":"http://www.donegalhimalayans.com/kittens_avail/joker1.jpg"},{"title":"Language","description":"Nous parlons tous les langues importants.","imageHref":null}]
     */

    private String title;
    private List<RowsBean> rows;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * title : Beavers
         * description : Beavers are second only to humans in their ability to manipulate and change their environment. They can measure up to 1.3 metres long. A group of beavers is called a colony
         * imageHref : http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg
         */

        private String title;
        private String description;
        private String imageHref;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImageHref() {
            return imageHref;
        }

        public void setImageHref(String imageHref) {
            this.imageHref = imageHref;
        }
    }
}
