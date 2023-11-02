package ir.afraapps.widget.listview;


public interface ScrollViewHeaderCallbacks {

  void onScrollChanged(int scrollY, ScrollState state);

  void onOffsetChanged(int offset);

  void onShowToolbar();

  void onHideToolbar();

}
