package com.zph.takephotoprivace.util;

/**
 * Created
 *
 * @author zph
 * @version V1.0
 * @Title: ${enclosing_method}
 * @Description: ${todo}(这里用一句话描述这个方法的作用)
 */
public final class Constants {

    public static final String TIMER_CHANGE_ID = "TIMER_CHANGE_ID";
    //督查详情中（离线表主键）使用的id
    public static final String SUPERVISION_DETAIL_REGIS_BEAN = "SUPERVISION_DETAIL_REGIS_BEAN";
    public static final String DIALOG_PARAM = "DIALOG_PARAM";

    public static final String STAR = "***";
    public static final String COMMA = ",";
    public static final String COLON = ":";
    public static final String SINGLE_QUOTES = "'";
    public static final String BLANK = "";
    public static final String BLANK_JSON = "{}";
    public static final String UNDERLINE = "_";
    public static final String VERTICALLINE = "|";
    public static final String LINE = "-";
    public static final String POINT = ".";
    public static final String SPACE = " ";
    public static final String SLASH = "/";
    public static final String BACK_SLASH = "\\";
    public static final String SIGN_EQUAL = "=";

    public static final String FILE_PATH = "files/";
    // 照片文件的位置
    public static final String IAMGE_SUFFIX_JPG = ".jpg";
    // 照相机保存文件的位置
    public static final String CAMERA_PATH = "cameras/";
    // 保存头像文件的位置
    public static final String HEAD_PATH = "head/";

    public static final int CONSULT_ACTIVITY_REQUEST_CODE = 11;
    public static final int RESULT_FROM_CAMERA = 12;
    public static final int RESULT_FROM_GALLERY = 13;

    //请求标识
    public static final int REQUEST_TAG = 0;
    public static final int REQUEST_TO_LOGIN = 1;
    public static final int RESULT_FROM_LOGIN = 2;

    public static final String BUNDLE_DATA = "bundleData";
    public static final String BUNDLE_FLAG = "bundleFlag";
    public static final String BUNDLE_NAME = "bundleName";

    public static final String BUNDLE_DATA_APPEND = "bundleDataAppend";
    public static final String BUNDLE_DATA_APPEND_ADD = "bundleDataAppendAdd";

    public static final String BROADCAST_FORCE_OFFLINE = "com.ministryofwater.approvalapplyapplication.FORCE_OFFLINE";

    public static final String BROADCAST_OFFLINE_FLAG = "OFFLINE_BROADCAST";

    public static final String GAODE_PC_KEY="481d08235e1dc266e0f979db1d86162c";

    public static final String ROW = "allrows";
//    public static final String ROW = "rows";
    public static final String LIST = "list";
    public static final String ROLEINFOLIST = "roleInfoList";
    public static final String DATA = "data";
    public static final String TOKEN = "accessToken";
    public static final String MSG = "msg";
    public static final String SUCCESSSTR = "success";
    public static final String CODE = "code";
    public static final String SUCCESS = "0";

    public static final String DATA_CAPITAL = "DATA";


    //列表相关
    public static String LIST_ONE_ITEM_LIMIT = "10";
    public static String LIST_ITEM_LIMIT = "20";
    //    public static String LIST_PAGE_START = "0";//改从0开始
    public static String LIST_PAGE_START = "1";//改从1开始
    public static int LIST_ITEM_LIMIT_INT = 20;

    public static String LIST_ITEM_LIMIT_HOME = "5";
    public static int LIST_ITEM_LIMIT_HOME_INT = 5;



    //文件路径
    public static final String APP_HOME_PATH = "zph_take_photo/";
    public static final String TAKE_MEDIA_FILE_PATH = "Image";


}
