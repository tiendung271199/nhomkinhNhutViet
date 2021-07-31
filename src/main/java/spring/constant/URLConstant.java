package spring.constant;

public class URLConstant {

	public static final String URL_INDEX = "";
	public static final String URL_NEWS = "tin-tuc.html";
	public static final String URL_NEWS_DETAIL = "chi-tiet-tin-tuc.html";
	public static final String URL_PRODUCT = "san-pham.html";
	public static final String URL_PRODUCT_DETAIL = "chi-tiet-san-pham.html";
	public static final String URL_CONTACT = "lien-he.html";
	public static final String URL_ABOUT = "doanh-nghiep.html";
	
	public static final String URL_ADMIN = "admin";
	public static final String URL_ADMIN_INDEX = "trang-chu.html";
	
	public static final String URL_ADMIN_CAT_PRODUCT_INDEX = "danh-muc-san-pham.html";
	public static final String URL_ADMIN_CAT_PRODUCT_INDEX_PAGINATION = "danh-muc-san-pham/trang-{page}.html";
	public static final String URL_ADMIN_CAT_PRODUCT_SEARCH = "danh-muc-san-pham/tim-kiem/{keywordURL}.html";
	public static final String URL_ADMIN_CAT_PRODUCT_SEARCH_PAGINATION = "danh-muc-san-pham/tim-kiem/{keywordURL}/trang-{page}.html";
	public static final String URL_ADMIN_CAT_PRODUCT_ADD = "danh-muc-san-pham/them-danh-muc.html";
	public static final String URL_ADMIN_CAT_PRODUCT_UPDATE = "danh-muc-san-pham/cap-nhat-danh-muc/{name}-{id}.html";
	public static final String URL_ADMIN_CAT_PRODUCT_DEL = "danh-muc-san-pham/xoa-danh-muc/{name}-{id}.html";
	
	// use for redirect
	public static final String URL_ADMIN_CAT_PRODUCT_INDEX_REDIRECT = "admin/danh-muc-san-pham.html";

	public static final String URL_ERROR = "error";
	public static final String URL_ERROR_404 = "404";
	public static final String URL_ERROR_403 = "403";
	public static final String URL_ERROR_400 = "400";

}
