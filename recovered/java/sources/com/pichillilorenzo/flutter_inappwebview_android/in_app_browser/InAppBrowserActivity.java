            package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

            import android.app.Activity;
            import android.content.Intent;
            import android.graphics.Color;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Bundle;
            import android.os.Message;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            import android.webkit.WebView;
            import android.widget.ProgressBar;
            import android.widget.RelativeLayout;
            import android.widget.SearchView;
            import androidx.appcompat.app.AppCompatActivity;
            import com.pichillilorenzo.flutter_inappwebview_android.C0608R;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.AbstractC2165s1;
            import p000.jg1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppBrowserActivity extends AppCompatActivity implements InAppBrowserDelegate, Disposable {
                protected static final String LOG_TAG = "InAppBrowserActivity";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
                public AbstractC2165s1 actionBar;
                public InAppBrowserChannelDelegate channelDelegate;
                public String fromActivity;

                /* JADX INFO: renamed from: id */
                public String f5324id;
                public InAppBrowserManager manager;
                public Menu menu;
                public ProgressBar progressBar;
                public PullToRefreshLayout pullToRefreshLayout;
                public SearchView searchView;
                public InAppWebView webView;
                public Integer windowId;
                public InAppBrowserSettings customSettings = new InAppBrowserSettings();
                public boolean isHidden = false;
                private List<ActivityResultListener> activityResultListeners = new ArrayList();
                public List<InAppBrowserMenuItem> menuItems = new ArrayList();

                private void prepareView() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView != null) {
/* 5 */                 inAppWebView.prepare();
                    }
/* 16 */            if (this.customSettings.hidden.booleanValue()) {
/* 18 */                hide();
                    } else {
/* 22 */                show();
                    }
/* 31 */            ProgressBar progressBar = (ProgressBar) findViewById(C0608R.id.progressBar);
/* 33 */            this.progressBar = progressBar;
/* 35 */            if (progressBar != null) {
/* 41 */                boolean zBooleanValue = this.customSettings.hideProgressBar.booleanValue();
/* 45 */                ProgressBar progressBar2 = this.progressBar;
/* 47 */                if (zBooleanValue) {
/* 50 */                    progressBar2.setMax(0);
                        } else {
/* 56 */                    progressBar2.setMax(100);
                        }
                    }
/* 59 */            AbstractC2165s1 abstractC2165s1 = this.actionBar;
/* 61 */            if (abstractC2165s1 != null) {
/* 73 */                abstractC2165s1.mo8356p(!this.customSettings.hideTitleBar.booleanValue());
/* 84 */                if (this.customSettings.hideToolbarTop.booleanValue()) {
/* 88 */                    this.actionBar.mo8346f();
                        }
/* 93 */                String str = this.customSettings.toolbarTopBackgroundColor;
/* 95 */                if (str != null && !str.isEmpty()) {
/* 118 */                   this.actionBar.mo8354n(new ColorDrawable(Color.parseColor(this.customSettings.toolbarTopBackgroundColor)));
                        }
/* 123 */               String str2 = this.customSettings.toolbarTopFixedTitle;
/* 125 */               if (str2 == null || str2.isEmpty()) {
/* 142 */                   return;
                        }
/* 139 */               this.actionBar.mo8358r(this.customSettings.toolbarTopFixedTitle);
                    }
                }

                public boolean canGoBack() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView != null) {
/* 5 */                 return inAppWebView.canGoBack();
                    }
/* 10 */            return false;
                }

                public boolean canGoForward() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView != null) {
/* 5 */                 return inAppWebView.canGoForward();
                    }
/* 10 */            return false;
                }

                public void close(MethodChannel.Result result) {
/* 1 */             InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
/* 3 */             if (inAppBrowserChannelDelegate != null) {
/* 5 */                 inAppBrowserChannelDelegate.onExit();
                    }
/* 8 */             dispose();
/* 11 */            if (result != null) {
/* 15 */                result.success(Boolean.TRUE);
                    }
                }

                public void closeButtonClicked(MenuItem menuItem) {
/* 2 */             close(null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didChangeProgress(int i) {
/* 1 */             ProgressBar progressBar = this.progressBar;
/* 3 */             if (progressBar != null) {
/* 6 */                 progressBar.setVisibility(0);
/* 12 */                this.progressBar.setProgress(i, true);
/* 17 */                if (i == 100) {
/* 23 */                    this.progressBar.setVisibility(8);
                        }
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didChangeTitle(String str) {
/* 3 */             if (this.actionBar != null) {
/* 7 */                 String str2 = this.customSettings.toolbarTopFixedTitle;
/* 9 */                 if (str2 == null || str2.isEmpty()) {
/* 19 */                    this.actionBar.mo8358r(str);
                        }
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didFailNavigation(String str, int i, String str2) {
/* 1 */             ProgressBar progressBar = this.progressBar;
/* 3 */             if (progressBar != null) {
/* 6 */                 progressBar.setProgress(0);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didFinishNavigation(String str) {
/* 1 */             SearchView searchView = this.searchView;
/* 4 */             if (searchView != null) {
/* 6 */                 searchView.setQuery(str, false);
                    }
/* 9 */             ProgressBar progressBar = this.progressBar;
/* 11 */            if (progressBar != null) {
/* 13 */                progressBar.setProgress(0);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didStartNavigation(String str) {
/* 1 */             ProgressBar progressBar = this.progressBar;
/* 4 */             if (progressBar != null) {
/* 6 */                 progressBar.setProgress(0);
                    }
/* 9 */             SearchView searchView = this.searchView;
/* 11 */            if (searchView != null) {
/* 13 */                searchView.setQuery(str, false);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public void didUpdateVisitedHistory(String str) {
/* 1 */             SearchView searchView = this.searchView;
/* 3 */             if (searchView != null) {
/* 6 */                 searchView.setQuery(str, false);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
                    ActivityPluginBinding activityPluginBinding;
                    InAppWebViewChromeClient inAppWebViewChromeClient;
/* 1 */             InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
/* 4 */             if (inAppBrowserChannelDelegate != null) {
/* 6 */                 inAppBrowserChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 13 */            this.activityResultListeners.clear();
/* 16 */            InAppWebView inAppWebView = this.webView;
/* 18 */            if (inAppWebView != null) {
/* 20 */                InAppBrowserManager inAppBrowserManager = this.manager;
/* 22 */                if (inAppBrowserManager != null && (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) != null && (activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding) != null && (inAppWebViewChromeClient = inAppWebView.inAppWebViewChromeClient) != null) {
/* 36 */                    activityPluginBinding.removeActivityResultListener(inAppWebViewChromeClient);
                        }
/* 45 */                RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0608R.id.container);
/* 47 */                if (relativeLayout != null) {
/* 49 */                    relativeLayout.removeAllViews();
                        }
/* 54 */                this.webView.dispose();
/* 57 */                this.webView = null;
/* 59 */                finish();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public Activity getActivity() {
/* 1 */             return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
                public List<ActivityResultListener> getActivityResultListeners() {
/* 1 */             return this.activityResultListeners;
                }

                public Map<String, Object> getCustomSettings() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 11 */            Map<String, Object> customSettings = inAppWebView != null ? inAppWebView.getCustomSettings() : null;
/* 12 */            InAppBrowserSettings inAppBrowserSettings = this.customSettings;
/* 14 */            if (inAppBrowserSettings == null || customSettings == null) {
/* 3 */                 return null;
                    }
/* 19 */            Map<String, Object> realSettings = inAppBrowserSettings.getRealSettings(this);
/* 23 */            realSettings.putAll(customSettings);
/* 26 */            return realSettings;
                }

                public void goBack() {
/* 3 */             if (this.webView == null || !canGoBack()) {
/* 16 */                return;
                    }
/* 13 */            this.webView.goBack();
                }

                public void goBackButtonClicked(MenuItem menuItem) {
/* 1 */             goBack();
                }

                public void goForward() {
/* 3 */             if (this.webView == null || !canGoForward()) {
/* 16 */                return;
                    }
/* 13 */            this.webView.goForward();
                }

                public void goForwardButtonClicked(MenuItem menuItem) {
/* 1 */             goForward();
                }

                public void hide() {
/* 3 */             if (this.fromActivity != null) {
                        try {
/* 6 */                     this.isHidden = true;
/* 16 */                    Intent intent = new Intent(this, Class.forName(this.fromActivity));
/* 21 */                    intent.setFlags(131072);
/* 25 */                    startActivityIfNeeded(intent, 0);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 3 */             Iterator<ActivityResultListener> it = this.activityResultListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                if (it.next().onActivityResult(i, i2, intent)) {
/* 25 */                    return;
                        }
                    }
/* 26 */            super.onActivityResult(i, i2, intent);
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public void onCreate(Bundle bundle) {
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
                    URLRequest uRLRequestFromMap;
                    InAppWebViewManager inAppWebViewManager;
                    Message message;
/* 1 */             super.onCreate(bundle);
/* 8 */             Bundle extras = getIntent().getExtras();
/* 12 */            if (extras == null) {
/* 475 */               return;
                    }
/* 22 */            this.f5324id = extras.getString("id");
/* 32 */            InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
/* 38 */            this.manager = inAppBrowserManager;
/* 40 */            if (inAppBrowserManager == null || (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
/* 475 */               return;
                    }
/* 58 */            Map<String, Object> map = (Map) extras.getSerializable("settings");
/* 62 */            this.customSettings.parse2(map);
/* 75 */            this.windowId = Integer.valueOf(extras.getInt("windowId"));
/* 79 */            setContentView(C0608R.layout.activity_web_view);
/* 88 */            Map<String, Object> map2 = (Map) extras.getSerializable("pullToRefreshInitialSettings");
/* 114 */           MethodChannel methodChannel = new MethodChannel(this.manager.plugin.messenger, PullToRefreshLayout.METHOD_CHANNEL_NAME_PREFIX + this.f5324id);
/* 119 */           PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
/* 122 */           pullToRefreshSettings.parse2(map2);
/* 131 */           PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) findViewById(C0608R.id.pullToRefresh);
/* 133 */           this.pullToRefreshLayout = pullToRefreshLayout;
/* 140 */           pullToRefreshLayout.channelDelegate = new PullToRefreshChannelDelegate(pullToRefreshLayout, methodChannel);
/* 142 */           PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
/* 144 */           pullToRefreshLayout2.settings = pullToRefreshSettings;
/* 146 */           pullToRefreshLayout2.prepare();
/* 155 */           InAppWebView inAppWebView = (InAppWebView) findViewById(C0608R.id.webView);
/* 157 */           this.webView = inAppWebView;
/* 159 */           String str = this.f5324id;
/* 161 */           inAppWebView.f5338id = str;
/* 165 */           inAppWebView.windowId = this.windowId;
/* 167 */           inAppWebView.inAppBrowserDelegate = this;
/* 171 */           InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.manager.plugin;
/* 173 */           inAppWebView.plugin = inAppWebViewFlutterPlugin2;
/* 178 */           FindInteractionController findInteractionController = new FindInteractionController(inAppWebView, inAppWebViewFlutterPlugin2, str, null);
/* 183 */           this.webView.findInteractionController = findInteractionController;
/* 185 */           findInteractionController.prepare();
/* 212 */           MethodChannel methodChannel2 = new MethodChannel(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.f5324id);
/* 220 */           this.channelDelegate = new InAppBrowserChannelDelegate(methodChannel2);
/* 222 */           InAppWebView inAppWebView2 = this.webView;
/* 229 */           inAppWebView2.channelDelegate = new WebViewChannelDelegate(inAppWebView2, methodChannel2);
/* 237 */           this.fromActivity = extras.getString("fromActivity");
/* 245 */           Map<String, Object> map3 = (Map) extras.getSerializable("contextMenu");
/* 253 */           List list = (List) extras.getSerializable("initialUserScripts");
/* 263 */           Iterator it = ((List) extras.getSerializable("menuItems")).iterator();
/* 271 */           while (it.hasNext()) {
/* 285 */               this.menuItems.add(InAppBrowserMenuItem.fromMap((Map) it.next()));
                    }
/* 291 */           InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
/* 294 */           inAppWebViewSettings.parse2(map);
/* 297 */           InAppWebView inAppWebView3 = this.webView;
/* 299 */           inAppWebView3.customSettings = inAppWebViewSettings;
/* 301 */           inAppWebView3.contextMenu = map3;
/* 305 */           ArrayList arrayList = new ArrayList();
/* 308 */           if (list != null) {
/* 310 */               Iterator it2 = list.iterator();
/* 318 */               while (it2.hasNext()) {
/* 330 */                   arrayList.add(UserScript.fromMap((Map) it2.next()));
                        }
                    }
/* 338 */           this.webView.userContentController.addUserOnlyScripts(arrayList);
/* 345 */           this.actionBar = getSupportActionBar();
/* 347 */           prepareView();
/* 357 */           if (this.windowId.intValue() != -1) {
/* 361 */               InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.webView.plugin;
/* 363 */               if (inAppWebViewFlutterPlugin3 != null && (inAppWebViewManager = inAppWebViewFlutterPlugin3.inAppWebViewManager) != null && (message = inAppWebViewManager.windowWebViewMessages.get(this.windowId)) != null) {
/* 387 */                   ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
/* 390 */                   message.sendToTarget();
                        }
                    } else {
/* 396 */               String string = extras.getString("initialFile");
/* 406 */               Map map4 = (Map) extras.getSerializable("initialUrlRequest");
/* 410 */               String string2 = extras.getString("initialData");
/* 414 */               if (string != null) {
                            try {
/* 418 */                       this.webView.loadFile(string);
                            } catch (IOException unused) {
/* 422 */                       return;
                            }
                        } else if (string2 != null) {
/* 451 */                   this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, extras.getString("initialMimeType"), extras.getString("initialEncoding"), extras.getString("initialHistoryUrl"));
                        } else if (map4 != null && (uRLRequestFromMap = URLRequest.fromMap(map4)) != null) {
/* 465 */                   this.webView.loadUrl(uRLRequestFromMap);
                        }
                    }
/* 468 */           InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
/* 470 */           if (inAppBrowserChannelDelegate != null) {
/* 472 */               inAppBrowserChannelDelegate.onBrowserCreated();
                    }
                }

                @Override // android.app.Activity
                public boolean onCreateOptionsMenu(Menu menu) {
                    String str;
/* 1 */             this.menu = menu;
/* 3 */             AbstractC2165s1 abstractC2165s1 = this.actionBar;
/* 5 */             String url = HttpUrl.FRAGMENT_ENCODE_SET;
/* 7 */             if (abstractC2165s1 != null && ((str = this.customSettings.toolbarTopFixedTitle) == null || str.isEmpty())) {
/* 21 */                AbstractC2165s1 abstractC2165s2 = this.actionBar;
/* 23 */                InAppWebView inAppWebView = this.webView;
/* 33 */                abstractC2165s2.mo8358r(inAppWebView != null ? inAppWebView.getTitle() : HttpUrl.FRAGMENT_ENCODE_SET);
                    }
/* 36 */            Menu menu2 = this.menu;
/* 38 */            if (menu2 == null) {
/* 40 */                return super.onCreateOptionsMenu(menu);
                    }
/* 48 */            if (menu2 instanceof jg1) {
/* 52 */                ((jg1) menu2).f12274s = true;
                    }
/* 62 */            getMenuInflater().inflate(C0608R.menu.menu_main, this.menu);
/* 69 */            MenuItem menuItemFindItem = this.menu.findItem(C0608R.id.menu_search);
/* 74 */            if (menuItemFindItem != null) {
/* 84 */                if (this.customSettings.hideUrlBar.booleanValue()) {
/* 86 */                    menuItemFindItem.setVisible(false);
                        }
/* 93 */                SearchView searchView = (SearchView) menuItemFindItem.getActionView();
/* 95 */                this.searchView = searchView;
/* 97 */                if (searchView != null) {
/* 99 */                    searchView.setFocusable(true);
/* 102 */                   SearchView searchView2 = this.searchView;
/* 104 */                   InAppWebView inAppWebView2 = this.webView;
/* 106 */                   if (inAppWebView2 != null) {
/* 108 */                       url = inAppWebView2.getUrl();
                            }
/* 112 */                   searchView2.setQuery(url, false);
/* 122 */                   this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.1
                                @Override // android.widget.SearchView.OnQueryTextListener
                                public boolean onQueryTextChange(String str2) {
/* 1 */                             return false;
                                }

                                @Override // android.widget.SearchView.OnQueryTextListener
                                public boolean onQueryTextSubmit(String str2) {
/* 6 */                             if (str2.isEmpty()) {
/* 5 */                                 return false;
                                    }
/* 10 */                            InAppWebView inAppWebView3 = InAppBrowserActivity.this.webView;
/* 12 */                            if (inAppWebView3 != null) {
/* 14 */                                inAppWebView3.loadUrl(str2);
                                    }
/* 19 */                            SearchView searchView3 = InAppBrowserActivity.this.searchView;
/* 22 */                            if (searchView3 != null) {
/* 26 */                                searchView3.setQuery(HttpUrl.FRAGMENT_ENCODE_SET, false);
/* 33 */                                InAppBrowserActivity.this.searchView.setIconified(true);
                                    }
/* 21 */                            return true;
                                }
                            });
/* 132 */                   this.searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.2
                                @Override // android.widget.SearchView.OnCloseListener
                                public boolean onClose() {
/* 3 */                             SearchView searchView3 = InAppBrowserActivity.this.searchView;
/* 6 */                             if (searchView3 != null && searchView3.getQuery().toString().isEmpty()) {
/* 22 */                                InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
/* 24 */                                SearchView searchView4 = inAppBrowserActivity.searchView;
/* 26 */                                InAppWebView inAppWebView3 = inAppBrowserActivity.webView;
/* 37 */                                searchView4.setQuery(inAppWebView3 != null ? inAppWebView3.getUrl() : HttpUrl.FRAGMENT_ENCODE_SET, false);
                                    }
/* 5 */                             return false;
                                }
                            });
/* 142 */                   this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.3
                                @Override // android.view.View.OnFocusChangeListener
                                public void onFocusChange(View view, boolean z) {
                                    SearchView searchView3;
/* 1 */                             if (z || (searchView3 = InAppBrowserActivity.this.searchView) == null) {
/* 23 */                                return;
                                    }
/* 12 */                            searchView3.setQuery(HttpUrl.FRAGMENT_ENCODE_SET, false);
/* 20 */                            InAppBrowserActivity.this.searchView.setIconified(true);
                                }
                            });
                        }
                    }
/* 153 */           if (this.customSettings.hideDefaultMenuItems.booleanValue()) {
/* 159 */               MenuItem menuItemFindItem2 = this.menu.findItem(C0608R.id.action_close);
/* 163 */               if (menuItemFindItem2 != null) {
/* 165 */                   menuItemFindItem2.setVisible(false);
                        }
/* 172 */               MenuItem menuItemFindItem3 = this.menu.findItem(C0608R.id.action_go_back);
/* 176 */               if (menuItemFindItem3 != null) {
/* 178 */                   menuItemFindItem3.setVisible(false);
                        }
/* 185 */               MenuItem menuItemFindItem4 = this.menu.findItem(C0608R.id.action_reload);
/* 189 */               if (menuItemFindItem4 != null) {
/* 191 */                   menuItemFindItem4.setVisible(false);
                        }
/* 198 */               MenuItem menuItemFindItem5 = this.menu.findItem(C0608R.id.action_go_forward);
/* 202 */               if (menuItemFindItem5 != null) {
/* 204 */                   menuItemFindItem5.setVisible(false);
                        }
/* 211 */               MenuItem menuItemFindItem6 = this.menu.findItem(C0608R.id.action_share);
/* 215 */               if (menuItemFindItem6 != null) {
/* 217 */                   menuItemFindItem6.setVisible(false);
                        }
                    }
/* 230 */           for (final InAppBrowserMenuItem inAppBrowserMenuItem : this.menuItems) {
/* 264 */               MenuItem menuItemAdd = this.menu.add(0, inAppBrowserMenuItem.getId(), inAppBrowserMenuItem.getOrder() != null ? inAppBrowserMenuItem.getOrder().intValue() : 0, inAppBrowserMenuItem.getTitle());
/* 272 */               if (inAppBrowserMenuItem.isShowAsAction()) {
/* 275 */                   menuItemAdd.setShowAsAction(2);
                        }
/* 278 */               Object icon = inAppBrowserMenuItem.getIcon();
/* 282 */               if (icon != null) {
/* 286 */                   if (icon instanceof AndroidResource) {
/* 294 */                       menuItemAdd.setIcon(((AndroidResource) icon).getIdentifier(this));
                            } else {
/* 304 */                       menuItemAdd.setIcon(Util.drawableFromBytes(this, (byte[]) icon));
                            }
/* 307 */                   String iconColor = inAppBrowserMenuItem.getIconColor();
/* 311 */                   if (iconColor != null && !iconColor.isEmpty()) {
/* 327 */                       menuItemAdd.getIcon().setTint(Color.parseColor(iconColor));
                            }
                        }
/* 335 */               menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.4
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public boolean onMenuItemClick(MenuItem menuItem) {
/* 3 */                         InAppBrowserChannelDelegate inAppBrowserChannelDelegate = InAppBrowserActivity.this.channelDelegate;
/* 5 */                         if (inAppBrowserChannelDelegate == null) {
/* 12 */                            return true;
                                }
/* 9 */                         inAppBrowserChannelDelegate.onMenuItemClicked(inAppBrowserMenuItem);
/* 12 */                        return true;
                            }
                        });
                    }
/* 47 */            return true;
                }

                @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onDestroy() {
/* 1 */             dispose();
/* 4 */             super.onDestroy();
                }

                @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 2 */             if (i == 4) {
/* 14 */                if (this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
/* 16 */                    close(null);
/* 13 */                    return true;
                        }
/* 28 */                if (this.customSettings.allowGoBackWithBackButton.booleanValue()) {
/* 34 */                    if (canGoBack()) {
/* 36 */                        goBack();
                            } else if (this.customSettings.closeOnCannotGoBack.booleanValue()) {
/* 50 */                        close(null);
                            }
/* 13 */                    return true;
                        }
/* 62 */                if (!this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
/* 13 */                    return true;
                        }
                    }
/* 65 */            return super.onKeyDown(i, keyEvent);
                }

                public void reload() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView != null) {
/* 5 */                 inAppWebView.reload();
                    }
                }

                public void reloadButtonClicked(MenuItem menuItem) {
/* 1 */             reload();
                }

                public void setSettings(InAppBrowserSettings inAppBrowserSettings, HashMap<String, Object> map) {
                    MenuItem menuItemFindItem;
                    String str;
                    String str2;
/* 3 */             InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
/* 6 */             inAppWebViewSettings.parse2((Map<String, Object>) map);
/* 9 */             InAppWebView inAppWebView = this.webView;
/* 11 */            if (inAppWebView != null) {
/* 13 */                inAppWebView.setSettings(inAppWebViewSettings, map);
                    }
/* 22 */            if (map.get("hidden") != null) {
/* 26 */                Boolean bool = this.customSettings.hidden;
/* 28 */                Boolean bool2 = inAppBrowserSettings.hidden;
/* 30 */                if (bool != bool2) {
/* 36 */                    if (bool2.booleanValue()) {
/* 38 */                        hide();
                            } else {
/* 42 */                        show();
                            }
                        }
                    }
/* 51 */            if (map.get("hideProgressBar") != null) {
/* 55 */                Boolean bool3 = this.customSettings.hideProgressBar;
/* 57 */                Boolean bool4 = inAppBrowserSettings.hideProgressBar;
/* 59 */                if (bool3 != bool4 && this.progressBar != null) {
/* 65 */                    boolean zBooleanValue = bool4.booleanValue();
/* 69 */                    ProgressBar progressBar = this.progressBar;
/* 71 */                    if (zBooleanValue) {
/* 74 */                        progressBar.setMax(0);
                            } else {
/* 80 */                        progressBar.setMax(100);
                            }
                        }
                    }
/* 85 */            if (this.actionBar != null && map.get("hideTitleBar") != null) {
/* 97 */                Boolean bool5 = this.customSettings.hideTitleBar;
/* 99 */                Boolean bool6 = inAppBrowserSettings.hideTitleBar;
/* 101 */               if (bool5 != bool6) {
/* 111 */                   this.actionBar.mo8356p(!bool6.booleanValue());
                        }
                    }
/* 116 */           if (this.actionBar != null && map.get("hideToolbarTop") != null) {
/* 128 */               Boolean bool7 = this.customSettings.hideToolbarTop;
/* 130 */               Boolean bool8 = inAppBrowserSettings.hideToolbarTop;
/* 132 */               if (bool7 != bool8) {
/* 134 */                   boolean zBooleanValue2 = bool8.booleanValue();
/* 138 */                   AbstractC2165s1 abstractC2165s1 = this.actionBar;
/* 140 */                   if (zBooleanValue2) {
/* 142 */                       abstractC2165s1.mo8346f();
                            } else {
/* 146 */                       abstractC2165s1.mo8360t();
                            }
                        }
                    }
/* 151 */           if (this.actionBar != null && map.get("toolbarTopBackgroundColor") != null && !Util.objEquals(this.customSettings.toolbarTopBackgroundColor, inAppBrowserSettings.toolbarTopBackgroundColor) && (str2 = inAppBrowserSettings.toolbarTopBackgroundColor) != null && !str2.isEmpty()) {
/* 196 */               this.actionBar.mo8354n(new ColorDrawable(Color.parseColor(inAppBrowserSettings.toolbarTopBackgroundColor)));
                    }
/* 201 */           if (this.actionBar != null && map.get("toolbarTopFixedTitle") != null && !Util.objEquals(this.customSettings.toolbarTopFixedTitle, inAppBrowserSettings.toolbarTopFixedTitle) && (str = inAppBrowserSettings.toolbarTopFixedTitle) != null && !str.isEmpty()) {
/* 237 */               this.actionBar.mo8358r(inAppBrowserSettings.toolbarTopFixedTitle);
                    }
/* 242 */           if (this.menu != null && map.get("hideUrlBar") != null && this.customSettings.hideUrlBar != inAppBrowserSettings.hideUrlBar && (menuItemFindItem = this.menu.findItem(C0608R.id.menu_search)) != null) {
/* 278 */               menuItemFindItem.setVisible(!inAppBrowserSettings.hideUrlBar.booleanValue());
                    }
/* 283 */           if (this.menu != null && map.get("hideDefaultMenuItems") != null && this.customSettings.hideDefaultMenuItems != inAppBrowserSettings.hideDefaultMenuItems) {
/* 305 */               MenuItem menuItemFindItem2 = this.menu.findItem(C0608R.id.action_close);
/* 309 */               if (menuItemFindItem2 != null) {
/* 319 */                   menuItemFindItem2.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
                        }
/* 326 */               MenuItem menuItemFindItem3 = this.menu.findItem(C0608R.id.action_go_back);
/* 330 */               if (menuItemFindItem3 != null) {
/* 340 */                   menuItemFindItem3.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
                        }
/* 347 */               MenuItem menuItemFindItem4 = this.menu.findItem(C0608R.id.action_reload);
/* 351 */               if (menuItemFindItem4 != null) {
/* 361 */                   menuItemFindItem4.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
                        }
/* 368 */               MenuItem menuItemFindItem5 = this.menu.findItem(C0608R.id.action_go_forward);
/* 372 */               if (menuItemFindItem5 != null) {
/* 382 */                   menuItemFindItem5.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
                        }
/* 389 */               MenuItem menuItemFindItem6 = this.menu.findItem(C0608R.id.action_share);
/* 393 */               if (menuItemFindItem6 != null) {
/* 403 */                   menuItemFindItem6.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
                        }
                    }
/* 406 */           this.customSettings = inAppBrowserSettings;
                }

                public void shareButtonClicked(MenuItem menuItem) {
/* 5 */             Intent intent = new Intent("android.intent.action.SEND");
/* 10 */            intent.setType("text/plain");
/* 13 */            InAppWebView inAppWebView = this.webView;
/* 26 */            intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : HttpUrl.FRAGMENT_ENCODE_SET);
/* 35 */            startActivity(Intent.createChooser(intent, "Share"));
                }

                public void show() {
/* 2 */             this.isHidden = false;
/* 8 */             Intent intent = new Intent(this, (Class<?>) InAppBrowserActivity.class);
/* 13 */            intent.setFlags(131072);
/* 16 */            startActivityIfNeeded(intent, 0);
                }
            }
