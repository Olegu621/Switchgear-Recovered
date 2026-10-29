            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.content.Intent;
            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import p000.as2;
            import p000.bs2;
            import p000.p62;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 549 */   public class ChromeCustomTabsSettings implements ISettings<ChromeCustomTabsActivity> {
                static final String LOG_TAG = "ChromeCustomTabsSettings";

                @Deprecated
                public Boolean addDefaultShareMenuItem;
                public List<String> additionalTrustedOrigins;
                public Boolean alwaysUseBrowserUI;
                public bs2 displayMode;
                public Boolean enableUrlBarHiding;
                public List<AndroidResource> exitAnimations;
                public Boolean instantAppsEnabled;
                public Boolean isSingleInstance;
                public Boolean isTrustedWebActivity;
                public Boolean keepAliveEnabled;
                public String navigationBarColor;
                public String navigationBarDividerColor;
                public Boolean noHistory;
                public String packageName;
                public Integer screenOrientation;
                public String secondaryToolbarColor;
                public Integer shareState = 0;
                public Boolean showTitle = Boolean.TRUE;
                public List<AndroidResource> startAnimations;
                public String toolbarBackgroundColor;

                public ChromeCustomTabsSettings() {
/* 15 */            Boolean bool = Boolean.FALSE;
/* 17 */            this.enableUrlBarHiding = bool;
/* 19 */            this.instantAppsEnabled = bool;
/* 21 */            this.keepAliveEnabled = bool;
/* 23 */            this.isSingleInstance = bool;
/* 25 */            this.noHistory = bool;
/* 27 */            this.isTrustedWebActivity = bool;
/* 34 */            this.additionalTrustedOrigins = new ArrayList();
/* 37 */            this.displayMode = null;
/* 39 */            this.screenOrientation = 0;
/* 46 */            this.startAnimations = new ArrayList();
/* 53 */            this.exitAnimations = new ArrayList();
/* 55 */            this.alwaysUseBrowserUI = bool;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> getRealSettings(ChromeCustomTabsActivity chromeCustomTabsActivity) {
                    Intent intent;
/* 1 */             Map<String, Object> map = toMap();
/* 5 */             if (chromeCustomTabsActivity != null && (intent = chromeCustomTabsActivity.getIntent()) != null) {
/* 19 */                map.put("packageName", intent.getPackage());
/* 34 */                map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra("android.support.customtabs.extra.KEEP_ALIVE")));
                    }
/* 37 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<ChromeCustomTabsActivity> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
/* 41 */                    int i = 6;
                            switch (key) {
                                case "addDefaultShareMenuItem":
/* 546 */                           this.addDefaultShareMenuItem = (Boolean) value;
                                    break;
                                case "startAnimations":
/* 520 */                           for (Map map2 : (List) value) {
/* 532 */                               if (AndroidResource.fromMap(map2) != null) {
/* 540 */                                   this.startAnimations.add(AndroidResource.fromMap(map2));
                                        }
                                    }
                                    break;
                                case "showTitle":
/* 506 */                           this.showTitle = (Boolean) value;
                                    break;
                                case "shareState":
/* 500 */                           this.shareState = (Integer) value;
                                    break;
                                case "isSingleInstance":
/* 494 */                           this.isSingleInstance = (Boolean) value;
                                    break;
                                case "navigationBarColor":
/* 488 */                           this.navigationBarColor = (String) value;
                                    break;
                                case "navigationBarDividerColor":
/* 482 */                           this.navigationBarDividerColor = (String) value;
                                    break;
                                case "toolbarBackgroundColor":
/* 476 */                           this.toolbarBackgroundColor = (String) value;
                                    break;
                                case "enableUrlBarHiding":
/* 470 */                           this.enableUrlBarHiding = (Boolean) value;
                                    break;
                                case "screenOrientation":
/* 464 */                           this.screenOrientation = (Integer) value;
                                    break;
                                case "exitAnimations":
/* 438 */                           for (Map map3 : (List) value) {
/* 450 */                               if (AndroidResource.fromMap(map3) != null) {
/* 458 */                                   this.exitAnimations.add(AndroidResource.fromMap(map3));
                                        }
                                    }
                                    break;
                                case "secondaryToolbarColor":
/* 424 */                           this.secondaryToolbarColor = (String) value;
                                    break;
                                case "isTrustedWebActivity":
/* 418 */                           this.isTrustedWebActivity = (Boolean) value;
                                    break;
                                case "instantAppsEnabled":
/* 412 */                           this.instantAppsEnabled = (Boolean) value;
                                    break;
                                case "packageName":
/* 406 */                           this.packageName = (String) value;
                                    break;
                                case "noHistory":
/* 400 */                           this.noHistory = (Boolean) value;
                                    break;
                                case "additionalTrustedOrigins":
/* 394 */                           this.additionalTrustedOrigins = (List) value;
                                    break;
                                case "alwaysUseBrowserUI":
/* 388 */                           this.alwaysUseBrowserUI = (Boolean) value;
                                    break;
                                case "displayMode":
/* 314 */                           Map map4 = (Map) value;
/* 322 */                           String str = (String) map4.get("type");
/* 324 */                           if (str != null) {
/* 332 */                               if (str.equals("IMMERSIVE_MODE")) {
/* 382 */                                   this.displayMode = new as2(((Boolean) map4.get("isSticky")).booleanValue(), ((Integer) map4.get("displayCutoutMode")).intValue());
                                        } else if (str.equals("DEFAULT_MODE")) {
/* 349 */                                   this.displayMode = new p62(i);
                                        }
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                                case "keepAliveEnabled":
/* 310 */                           this.keepAliveEnabled = (Boolean) value;
                                    break;
                            }
                        }
                    }
/* 550 */           return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
/* 17 */            map.put("showTitle", this.showTitle);
/* 24 */            map.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
/* 31 */            map.put("navigationBarColor", this.navigationBarColor);
/* 38 */            map.put("navigationBarDividerColor", this.navigationBarDividerColor);
/* 45 */            map.put("secondaryToolbarColor", this.secondaryToolbarColor);
/* 52 */            map.put("enableUrlBarHiding", this.enableUrlBarHiding);
/* 59 */            map.put("instantAppsEnabled", this.instantAppsEnabled);
/* 66 */            map.put("packageName", this.packageName);
/* 73 */            map.put("keepAliveEnabled", this.keepAliveEnabled);
/* 80 */            map.put("isSingleInstance", this.isSingleInstance);
/* 87 */            map.put("noHistory", this.noHistory);
/* 94 */            map.put("isTrustedWebActivity", this.isTrustedWebActivity);
/* 101 */           map.put("additionalTrustedOrigins", this.additionalTrustedOrigins);
/* 108 */           map.put("screenOrientation", this.screenOrientation);
/* 115 */           map.put("alwaysUseBrowserUI", this.alwaysUseBrowserUI);
/* 118 */           return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 550 */       public /* bridge */ /* synthetic */ ISettings<ChromeCustomTabsActivity> parse(Map map) {
/* 551 */           return parse2((Map<String, Object>) map);
                }
            }
