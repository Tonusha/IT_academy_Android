
package android.databinding;
import by.nca.it_academy.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 18;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case by.nca.it_academy.R.layout.item_user:
                    return by.nca.it_academy.databinding.ItemUserBinding.bind(view, bindingComponent);
                case by.nca.it_academy.R.layout.activity_classwork9:
                    return by.nca.it_academy.databinding.ActivityClasswork9Binding.bind(view, bindingComponent);
                case by.nca.it_academy.R.layout.activity_homework9:
                    return by.nca.it_academy.databinding.ActivityHomework9Binding.bind(view, bindingComponent);
                case by.nca.it_academy.R.layout.activity_classwork12:
                    return by.nca.it_academy.databinding.ActivityClasswork12Binding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -1243181053: {
                if(tag.equals("layout/item_user_0")) {
                    return by.nca.it_academy.R.layout.item_user;
                }
                break;
            }
            case -776929652: {
                if(tag.equals("layout/activity_classwork9_0")) {
                    return by.nca.it_academy.R.layout.activity_classwork9;
                }
                break;
            }
            case -409411633: {
                if(tag.equals("layout/activity_homework9_0")) {
                    return by.nca.it_academy.R.layout.activity_homework9;
                }
                break;
            }
            case 1684704496: {
                if(tag.equals("layout/activity_classwork12_0")) {
                    return by.nca.it_academy.R.layout.activity_classwork12;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"myEntity"
            ,"user"
            ,"viewModel"};
    }
}