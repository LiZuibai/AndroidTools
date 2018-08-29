package com.lizuibai.androidtool;

import android.view.ViewGroup;

public interface Params {

    int PAGE_SIZE = 10;

    int STATE_TODO = 1;
    int STATE_DONE = 2;


    int LP_WRAP = ViewGroup.LayoutParams.WRAP_CONTENT;
    int LP_MATCH = ViewGroup.LayoutParams.MATCH_PARENT;

    String KEY_account = "account";
    String KEY_secureKey = "secureKey";
    String KEY_name = "name";
    String KEY_pwd = "pwd";
    String KEY_type = "type";
    String KEY_kind = "kind";
    String KEY_key = "key";
    String KEY_index = "index";
    String KEY_business = "business";
    String KEY_editable = "editable";
    String KEY_customer = "customer";
    String KEY_dealer = "dealer";
    String KEY_save = "save";
    String KEY_text = "text";
    String KEY_title = "title";
    String KEY_id = "id";
    String KEY_logo = "logo";
    String KEY_project = "project";
    String KEY_byCamera = "byCamera";

    String KEY_model = "model";

    String KEY_comment = "comment";
    String KEY_result = "result";

    String KEY_attachment = "attachment";
    String KEY_attachment_tab_1 = "attachment_model_1";
    String KEY_attachment_tab_2 = "attachment_model_2";

    String ACTION_MODIFY_PWD = "ACTION_MODIFY_PWD";
    String ACTION_LOGOUT = "ACTION_LOGOUT";
    String ACTION_SHOW_PROGRESS_DIALOG = "ACTION_SHOW_PROGRESS_DIALOG";

    String ACTION_BUTTON_CLICK = "ACTION_BUTTON_CLICK";
    String ACTION_BUTTON_CLICK_BUSINESS_START = "ACTION_BUTTON_CLICK_BUSINESS_START";
    String ACTION_BUTTON_CLICK_ADD_RELATION = "ACTION_BUTTON_CLICK_ADD_RELATION";
    String ACTION_BUTTON_CLICK_SAVE_EXECUTE = "ACTION_BUTTON_CLICK_SAVE_EXECUTE";
    String ACTION_BUTTON_CLICK_SUBMIT_EXECUTE = "ACTION_BUTTON_CLICK_SUBMIT_EXECUTE";
    String ACTION_BUSINESS_LIST_ITEM_CLICK = "ACTION_BUSINESS_LIST_ITEM_CLICK";
    String ACTION_CUSTOMER_LIST_ITEM_CLICK = "ACTION_CUSTOMER_LIST_ITEM_CLICK";
    String ACTION_SAVE = "ACTION_SAVE";

    String ACTION_SELECT_ONE = "ACTION_SELECT_ONE";
    String ACTION_TRIGGER_SELECT_ONE = "ACTION_TRIGGER_SELECT_ONE";

    String ACTION_ADD_PARTNER_CLICK = "ACTION_ADD_PARTNER_CLICK";
    String ACTION_ADD_GUARANTOR_CLICK = "ACTION_ADD_GUARANTOR_CLICK";
    String ACTION_TAKE_PHOTO = "ACTION_TAKE_PHOTO";
    String ACTION_ADD_ONE_MORE_RELATION = "ACTION_ADD_ONE_MORE_RELATION";

    String ACTION_SELECT_CUSTOMER = "ACTION_SELECT_CUSTOMER";
    String ACTION_SELECT_PARTNER = "ACTION_SELECT_PARTNER";
    String ACTION_SELECT_GUARANTOR = "ACTION_SELECT_GUARANTOR";

    String ACTION_SUBMIT_SUC = "ACTION_SUBMIT_SUC";

    String ACTION_ADD_ATTACHMENT_TRIGGER = "ACTION_ADD_ATTACHMENT_TRIGGER";
    String ACTION_DELETE_ATTACHMENT_TRIGGER = "ACTION_DELETE_ATTACHMENT_TRIGGER";
    String ACTION_DELETE_ATTACH = "ACTION_DELETE_ATTACH";
    String ACTION_ADD_ATTACH = "ACTION_ADD_ATTACH";

    int BUTTON_TYPE_SUBMIT = 1;
    int BUTTON_TYPE_SAVE = 2;

    int ACTIVITY_REQ_SELECT_CUSTOMER = 1;
    int ACTIVITY_REQ_SELECT_PARTNER = 2;
    int ACTIVITY_REQ_SELECT_GUARANTOR = 3;
    int ACTIVITY_REQ_SELECT_PHOTO = 4;
    int ACTIVITY_REQ_MODIFY_PWD = 5;
    int ACTIVITY_REQ_ADD_CUSTOMER = 7;
}
