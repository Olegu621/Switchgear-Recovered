            package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

            import android.view.Menu;
            import android.widget.ProgressBar;
            import com.pichillilorenzo.flutter_inappwebview_android.C0608R;
            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.util.HashMap;
            import java.util.Map;
            import p000.AbstractC2165s1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 247 */   public class InAppBrowserSettings implements ISettings<InAppBrowserActivity> {
                public static final String LOG_TAG = "InAppBrowserSettings";
                public Boolean allowGoBackWithBackButton;
                public Boolean closeOnCannotGoBack;
                public Boolean hidden;
                public Boolean hideDefaultMenuItems;
                public Boolean hideProgressBar;
                public Boolean hideTitleBar;
                public Boolean hideToolbarTop;
                public Boolean hideUrlBar;
                public Boolean shouldCloseOnBackButtonPressed;
                public String toolbarTopBackgroundColor;
                public String toolbarTopFixedTitle;

                public InAppBrowserSettings() {
/* 4 */             Boolean bool = Boolean.FALSE;
/* 6 */             this.hidden = bool;
/* 8 */             this.hideToolbarTop = bool;
/* 10 */            this.hideUrlBar = bool;
/* 12 */            this.hideProgressBar = bool;
/* 14 */            this.hideTitleBar = bool;
/* 16 */            Boolean bool2 = Boolean.TRUE;
/* 18 */            this.closeOnCannotGoBack = bool2;
/* 20 */            this.allowGoBackWithBackButton = bool2;
/* 22 */            this.shouldCloseOnBackButtonPressed = bool;
/* 24 */            this.hideDefaultMenuItems = bool;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> getRealSettings(InAppBrowserActivity inAppBrowserActivity) {
/* 1 */             Map<String, Object> map = toMap();
/* 13 */            map.put("hidden", Boolean.valueOf(inAppBrowserActivity.isHidden));
/* 16 */            AbstractC2165s1 abstractC2165s1 = inAppBrowserActivity.actionBar;
/* 18 */            boolean z = true;
/* 38 */            map.put("hideToolbarTop", Boolean.valueOf(abstractC2165s1 == null || !abstractC2165s1.mo8348h()));
/* 41 */            Menu menu = inAppBrowserActivity.menu;
/* 67 */            map.put("hideUrlBar", Boolean.valueOf(menu == null || !menu.findItem(C0608R.id.menu_search).isVisible()));
/* 70 */            ProgressBar progressBar = inAppBrowserActivity.progressBar;
/* 72 */            if (progressBar != null && progressBar.getMax() != 0) {
/* 81 */                z = false;
                    }
/* 88 */            map.put("hideProgressBar", Boolean.valueOf(z));
/* 91 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<InAppBrowserActivity> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
                            switch (key) {
                                case "hideTitleBar":
/* 243 */                           this.hideTitleBar = (Boolean) value;
                                    break;
                                case "hidden":
/* 237 */                           this.hidden = (Boolean) value;
                                    break;
                                case "allowGoBackWithBackButton":
/* 231 */                           this.allowGoBackWithBackButton = (Boolean) value;
                                    break;
                                case "hideToolbarTop":
/* 225 */                           this.hideToolbarTop = (Boolean) value;
                                    break;
                                case "hideDefaultMenuItems":
/* 219 */                           this.hideDefaultMenuItems = (Boolean) value;
                                    break;
                                case "toolbarTopFixedTitle":
/* 213 */                           this.toolbarTopFixedTitle = (String) value;
                                    break;
                                case "hideProgressBar":
/* 207 */                           this.hideProgressBar = (Boolean) value;
                                    break;
                                case "closeOnCannotGoBack":
/* 201 */                           this.closeOnCannotGoBack = (Boolean) value;
                                    break;
                                case "hideUrlBar":
/* 195 */                           this.hideUrlBar = (Boolean) value;
                                    break;
                                case "toolbarTopBackgroundColor":
/* 189 */                           this.toolbarTopBackgroundColor = (String) value;
                                    break;
                                case "shouldCloseOnBackButtonPressed":
/* 183 */                           this.shouldCloseOnBackButtonPressed = (Boolean) value;
                                    break;
                            }
                        }
                    }
/* 247 */           return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("hidden", this.hidden);
/* 17 */            map.put("hideToolbarTop", this.hideToolbarTop);
/* 24 */            map.put("toolbarTopBackgroundColor", this.toolbarTopBackgroundColor);
/* 31 */            map.put("toolbarTopFixedTitle", this.toolbarTopFixedTitle);
/* 38 */            map.put("hideUrlBar", this.hideUrlBar);
/* 45 */            map.put("hideTitleBar", this.hideTitleBar);
/* 52 */            map.put("closeOnCannotGoBack", this.closeOnCannotGoBack);
/* 59 */            map.put("hideProgressBar", this.hideProgressBar);
/* 66 */            map.put("allowGoBackWithBackButton", this.allowGoBackWithBackButton);
/* 73 */            map.put("shouldCloseOnBackButtonPressed", this.shouldCloseOnBackButtonPressed);
/* 80 */            map.put("hideDefaultMenuItems", this.hideDefaultMenuItems);
/* 83 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 248 */       public /* bridge */ /* synthetic */ ISettings<InAppBrowserActivity> parse(Map map) {
/* 249 */           return parse2((Map<String, Object>) map);
                }
            }
