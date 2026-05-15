package library.model;

public class ElectronicResource
        extends LibraryItem {

    private String url;

    public ElectronicResource(
            String title,
            String url
    ) {

        super(title);
        this.url = url;
    }

    @Override
    public void getItemInfo() {

        System.out.println(
                "ElectronicResource.getItemInfo(): "
                        + title
                        + ", url="
                        + url
        );
    }
}
