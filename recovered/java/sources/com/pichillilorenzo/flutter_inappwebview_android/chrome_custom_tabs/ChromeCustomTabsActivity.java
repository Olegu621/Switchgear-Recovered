            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.app.Activity;
            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.widget.RemoteViews;
            import com.pichillilorenzo.flutter_inappwebview_android.C0608R;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.fe0;
            import p000.i30;
            import p000.j30;
            import p000.n30;
            import p000.o30;
            import p000.w20;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChromeCustomTabsActivity extends Activity implements Disposable {
                public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
                protected static final String LOG_TAG = "CustomTabsActivity";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
                public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
                public CustomTabsActionButton actionButton;
                public i30 builder;
                public ChromeCustomTabsChannelDelegate channelDelegate;
                public o30 customTabsSession;

                /* JADX INFO: renamed from: id */
                public String f5319id;
                public Map<String, String> initialHeaders;
                public List<String> initialOtherLikelyURLs;
                public String initialReferrer;
                public String initialUrl;
                public ChromeSafariBrowserManager manager;
                public CustomTabsSecondaryToolbar secondaryToolbar;
                public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
                public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
                protected boolean onOpened = false;
                protected boolean onCompletedInitialLoad = false;
                protected boolean isBindSuccess = false;
                public List<CustomTabsMenuItem> menuItems = new ArrayList();

                private PendingIntent createPendingIntent(int i) {
/* 5 */             Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
/* 10 */            Bundle bundle = new Bundle();
/* 15 */            bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i);
/* 22 */            bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f5319id);
/* 25 */            ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
/* 35 */            bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f5320id : null);
/* 38 */            intent.putExtras(bundle);
                    return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, i, intent, 167772160) : PendingIntent.getBroadcast(this, i, intent, 134217728);
                }

                private void prepareCustomTabs() {
/* 1 */             i30 i30Var = this.builder;
/* 3 */             if (i30Var == null) {
/* 589 */               return;
                    }
/* 7 */             ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
/* 9 */             Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
/* 13 */            if (bool != null) {
/* 24 */                i30Var.m4452b(bool.booleanValue() ? 1 : 2);
                    } else {
/* 34 */                i30Var.m4452b(chromeCustomTabsSettings.shareState.intValue());
                    }
/* 39 */            String str = this.customSettings.toolbarBackgroundColor;
/* 43 */            Integer numValueOf = null;
/* 66 */            Integer numValueOf2 = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
/* 69 */            String str2 = this.customSettings.navigationBarColor;
/* 93 */            Integer numValueOf3 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
/* 96 */            String str3 = this.customSettings.navigationBarDividerColor;
/* 119 */           Integer numValueOf4 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
/* 122 */           String str4 = this.customSettings.secondaryToolbarColor;
/* 124 */           if (str4 != null && !str4.isEmpty()) {
/* 140 */               numValueOf = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
                    }
/* 144 */           i30 i30Var2 = this.builder;
/* 146 */           i30Var2.getClass();
/* 151 */           Bundle bundle = new Bundle();
/* 154 */           if (numValueOf2 != null) {
/* 162 */               bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", numValueOf2.intValue());
                    }
/* 165 */           if (numValueOf != null) {
/* 173 */               bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", numValueOf.intValue());
                    }
/* 176 */           if (numValueOf3 != null) {
/* 184 */               bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", numValueOf3.intValue());
                    }
/* 187 */           if (numValueOf4 != null) {
/* 195 */               bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", numValueOf4.intValue());
                    }
/* 198 */           i30Var2.f9436e = bundle;
/* 214 */           this.builder.f9432a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", this.customSettings.showTitle.booleanValue() ? 1 : 0);
/* 231 */           this.builder.f9432a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", this.customSettings.enableUrlBarHiding.booleanValue());
/* 244 */           this.builder.f9438g = this.customSettings.instantAppsEnabled.booleanValue();
/* 255 */           if (this.customSettings.startAnimations.size() == 2) {
/* 257 */               i30 i30Var3 = this.builder;
/* 269 */               int identifier = this.customSettings.startAnimations.get(0).getIdentifier(this);
/* 283 */               int identifier2 = this.customSettings.startAnimations.get(1).getIdentifier(this);
/* 287 */               i30Var3.getClass();
/* 294 */               i30Var3.f9435d = ActivityOptions.makeCustomAnimation(this, identifier, identifier2);
                    }
/* 304 */           if (this.customSettings.exitAnimations.size() == 2) {
/* 306 */               i30 i30Var4 = this.builder;
/* 318 */               int identifier3 = this.customSettings.exitAnimations.get(0).getIdentifier(this);
/* 332 */               int identifier4 = this.customSettings.exitAnimations.get(1).getIdentifier(this);
/* 336 */               i30Var4.getClass();
/* 351 */               i30Var4.f9432a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, identifier3, identifier4).toBundle());
                    }
/* 366 */           for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
/* 374 */               i30 i30Var5 = this.builder;
/* 376 */               String label = customTabsMenuItem.getLabel();
/* 384 */               PendingIntent pendingIntentCreatePendingIntent = createPendingIntent(customTabsMenuItem.getId());
/* 390 */               if (i30Var5.f9434c == null) {
/* 397 */                   i30Var5.f9434c = new ArrayList();
                        }
/* 401 */               Bundle bundle2 = new Bundle();
/* 406 */               bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", label);
/* 409 */               bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntentCreatePendingIntent);
/* 414 */               i30Var5.f9434c.add(bundle2);
                    }
/* 418 */           CustomTabsActionButton customTabsActionButton = this.actionButton;
/* 420 */           if (customTabsActionButton != null) {
/* 422 */               byte[] icon = customTabsActionButton.getIcon();
/* 428 */               BitmapFactory.Options options = new BitmapFactory.Options();
/* 431 */               options.inMutable = true;
/* 434 */               Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options);
/* 438 */               i30 i30Var6 = this.builder;
/* 442 */               String description = this.actionButton.getDescription();
/* 452 */               PendingIntent pendingIntentCreatePendingIntent2 = createPendingIntent(this.actionButton.getId());
/* 458 */               boolean zIsShouldTint = this.actionButton.isShouldTint();
/* 462 */               i30Var6.getClass();
/* 467 */               Bundle bundle3 = new Bundle();
/* 472 */               bundle3.putInt("android.support.customtabs.customaction.ID", 0);
/* 477 */               bundle3.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeByteArray);
/* 482 */               bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", description);
/* 485 */               bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntentCreatePendingIntent2);
/* 488 */               Intent intent = i30Var6.f9432a;
/* 492 */               intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
/* 497 */               intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", zIsShouldTint);
                    }
/* 500 */           CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
/* 502 */           if (customTabsSecondaryToolbar != null) {
/* 504 */               AndroidResource layout = customTabsSecondaryToolbar.getLayout();
/* 518 */               RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
/* 531 */               int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
/* 539 */               int size = this.secondaryToolbar.getClickableIDs().size();
/* 543 */               for (int i = 0; i < size; i++) {
/* 561 */                   iArr[i] = this.secondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
                        }
/* 566 */               i30 i30Var7 = this.builder;
/* 568 */               PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
/* 572 */               Intent intent2 = i30Var7.f9432a;
/* 576 */               intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
/* 581 */               intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
/* 586 */               intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
                    }
                }

                private void prepareCustomTabsIntent(j30 j30Var) {
/* 3 */             String str = this.customSettings.packageName;
/* 5 */             if (str != null) {
/* 9 */                 j30Var.f12036a.setPackage(str);
                    } else {
/* 19 */                j30Var.f12036a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
                    }
/* 30 */            if (this.customSettings.keepAliveEnabled.booleanValue()) {
/* 34 */                CustomTabsHelper.addKeepAliveExtra(this, j30Var.f12036a);
                    }
/* 45 */            if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
/* 47 */                Intent intent = j30Var.f12036a;
/* 49 */                if (intent == null) {
/* 55 */                    intent = new Intent("android.intent.action.VIEW");
                        }
/* 60 */                intent.addFlags(268435456);
/* 66 */                intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    }
                }

                public void close() {
/* 1 */             onStop();
/* 4 */             onDestroy();
/* 8 */             this.customTabsSession = null;
/* 10 */            finish();
/* 13 */            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
/* 15 */            if (chromeCustomTabsChannelDelegate != null) {
/* 17 */                chromeCustomTabsChannelDelegate.onClosed();
                    }
                }

                public void customTabsConnected() {
                    String str;
/* 5 */             o30 session = this.customTabActivityHelper.getSession();
/* 9 */             this.customTabsSession = session;
/* 11 */            if (session != null) {
                        try {
/* 15 */                    Bundle bundle = new Bundle();
/* 18 */                    o30 o30Var = this.customTabsSession;
                            try {
/* 32 */                        if (o30Var.f14600b.isEngagementSignalsApiAvailable(o30Var.f14601c, o30Var.m7093a(bundle))) {
/* 34 */                            o30 o30Var2 = this.customTabsSession;
                                    try {
/* 58 */                                o30Var2.f14600b.setEngagementSignalsCallback(o30Var2.f14601c, new n30(new fe0() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
                                            @Override // p000.fe0
                                            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle2) {
/* 3 */                                         ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                                         if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                                             chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i);
                                                }
                                            }

                                            @Override // p000.fe0
                                            public void onSessionEnded(boolean z, Bundle bundle2) {
/* 3 */                                         ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                                         if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                                             chromeCustomTabsChannelDelegate.onSessionEnded(z);
                                                }
                                            }

                                            @Override // p000.fe0
                                            public void onVerticalScrollEvent(boolean z, Bundle bundle2) {
/* 3 */                                         ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                                         if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                                             chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z);
                                                }
                                            }
                                        }).asBinder(), o30Var2.m7093a(bundle));
                                    } catch (SecurityException e) {
/* 68 */                                throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
                                    }
                                }
                            } catch (SecurityException e2) {
/* 75 */                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
/* 78 */            if (!this.isBindSuccess || (str = this.initialUrl) == null) {
/* 93 */                return;
                    }
/* 90 */            launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             onStop();
/* 4 */             onDestroy();
/* 7 */             ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
/* 10 */            if (chromeCustomTabsChannelDelegate != null) {
/* 12 */                chromeCustomTabsChannelDelegate.dispose();
/* 15 */                this.channelDelegate = null;
                    }
/* 17 */            ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
/* 19 */            if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.f5319id)) {
/* 37 */                this.manager.browsers.put(this.f5319id, null);
                    }
/* 40 */            this.manager = null;
                }

                public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
/* 5 */             Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
/* 10 */            Bundle bundle = new Bundle();
/* 17 */            bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f5319id);
/* 20 */            ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
/* 30 */            bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f5320id : null);
/* 33 */            intent.putExtras(bundle);
                    return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, 0, intent, 167772160) : PendingIntent.getBroadcast(this, 0, intent, 134217728);
                }

                public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
/* 8 */             launchUrlWithSession(this.customTabsSession, str, map, str2, list);
                }

                public void launchUrlWithSession(o30 o30Var, String str, Map<String, String> map, String str2, List<String> list) {
/* 1 */             mayLaunchUrl(str, list);
/* 9 */             this.builder = new i30(o30Var);
/* 11 */            prepareCustomTabs();
/* 16 */            j30 j30VarM4451a = this.builder.m4451a();
/* 20 */            prepareCustomTabsIntent(j30VarM4451a);
/* 41 */            CustomTabActivityHelper.openCustomTab(this, j30VarM4451a, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
                }

                public boolean mayLaunchUrl(String str, List<String> list) {
/* 9 */             Uri uri = str != null ? Uri.parse(str) : null;
/* 12 */            ArrayList arrayList = new ArrayList();
/* 15 */            if (list != null) {
/* 19 */                Bundle bundle = new Bundle();
/* 22 */                Iterator<String> it = list.iterator();
/* 30 */                while (it.hasNext()) {
/* 40 */                    bundle.putString("android.support.customtabs.otherurls.URL", it.next());
                        }
                    }
/* 46 */            return this.customTabActivityHelper.mayLaunchUrl(uri, null, arrayList);
                }

                @Override // android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 3 */             if (i == 100) {
/* 5 */                 close();
/* 8 */                 dispose();
                    }
                }

                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
                    NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
/* 1 */             super.onCreate(bundle);
/* 6 */             setContentView(C0608R.layout.chrome_custom_tabs_layout);
/* 13 */            Bundle extras = getIntent().getExtras();
/* 17 */            if (extras == null) {
/* 257 */               return;
                    }
/* 27 */            this.f5319id = extras.getString("id");
/* 37 */            ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
/* 43 */            this.manager = chromeSafariBrowserManager;
/* 45 */            if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
/* 257 */               return;
                    }
/* 61 */            chromeSafariBrowserManager.browsers.put(this.f5319id, this);
/* 96 */            this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new MethodChannel(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.f5319id));
/* 104 */           this.initialUrl = extras.getString("url");
/* 114 */           this.initialHeaders = (Map) extras.getSerializable("headers");
/* 122 */           this.initialReferrer = extras.getString("referrer");
/* 130 */           this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
/* 134 */           ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
/* 137 */           this.customSettings = chromeCustomTabsSettings;
/* 147 */           chromeCustomTabsSettings.parse2((Map<String, Object>) extras.getSerializable("settings"));
/* 162 */           this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
/* 176 */           this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
/* 186 */           Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
/* 194 */           while (it.hasNext()) {
/* 208 */               this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
                    }
/* 220 */           if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
/* 230 */               Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
/* 232 */               String str = this.f5319id;
/* 234 */               map.put(str, str);
                    }
/* 244 */           this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
                        public void onCustomTabsConnected() {
/* 3 */                     ChromeCustomTabsActivity.this.customTabsConnected();
/* 8 */                     ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 10 */                    if (chromeCustomTabsChannelDelegate != null) {
/* 12 */                        chromeCustomTabsChannelDelegate.onServiceConnected();
                            }
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
                        public void onCustomTabsDisconnected() {
/* 3 */                     this.close();
/* 8 */                     ChromeCustomTabsActivity.this.dispose();
                        }
                    });
/* 254 */           this.customTabActivityHelper.setCustomTabsCallback(new w20() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
                        @Override // p000.w20
                        public void extraCallback(String str2, Bundle bundle2) {
                        }

                        @Override // p000.w20
                        public void onMessageChannelReady(Bundle bundle2) {
/* 3 */                     ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                     if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                         chromeCustomTabsChannelDelegate.onMessageChannelReady();
                            }
                        }

                        @Override // p000.w20
                        public void onNavigationEvent(int i, Bundle bundle2) {
/* 3 */                     if (i == 5) {
/* 5 */                         ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
/* 9 */                         if (!chromeCustomTabsActivity.onOpened) {
/* 11 */                            chromeCustomTabsActivity.onOpened = true;
/* 13 */                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
/* 15 */                            if (chromeCustomTabsChannelDelegate != null) {
/* 17 */                                chromeCustomTabsChannelDelegate.onOpened();
                                    }
                                }
                            }
/* 21 */                    if (i == 2) {
/* 23 */                        ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
/* 27 */                        if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
/* 29 */                            chromeCustomTabsActivity2.onCompletedInitialLoad = true;
/* 31 */                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
/* 33 */                            if (chromeCustomTabsChannelDelegate2 != null) {
/* 35 */                                chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                                    }
                                }
                            }
/* 40 */                    ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
/* 42 */                    if (chromeCustomTabsChannelDelegate3 != null) {
/* 44 */                        chromeCustomTabsChannelDelegate3.onNavigationEvent(i);
                            }
                        }

                        @Override // p000.w20
                        public void onPostMessage(String str2, Bundle bundle2) {
/* 3 */                     ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                     if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                         chromeCustomTabsChannelDelegate.onPostMessage(str2);
                            }
                        }

                        @Override // p000.w20
                        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle2) {
/* 3 */                     ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
/* 5 */                     if (chromeCustomTabsChannelDelegate != null) {
/* 7 */                         chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i, uri, z);
                            }
                        }
                    });
                }

                @Override // android.app.Activity
                public void onDestroy() {
/* 1 */             super.onDestroy();
                }

                @Override // android.app.Activity
                public void onStart() {
                    String str;
/* 1 */             super.onStart();
/* 6 */             boolean zBindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
/* 10 */            this.isBindSuccess = zBindCustomTabsService;
/* 12 */            if (zBindCustomTabsService || (str = this.initialUrl) == null) {
/* 29 */                return;
                    }
/* 26 */            launchUrlWithSession(null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
                }

                @Override // android.app.Activity
                public void onStop() {
/* 1 */             super.onStop();
/* 6 */             this.customTabActivityHelper.unbindCustomTabsService(this);
/* 10 */            this.isBindSuccess = false;
                }

                public void updateActionButton(byte[] bArr, String str) {
/* 3 */             if (this.customTabsSession == null || this.actionButton == null) {
/* 71 */                return;
                    }
/* 12 */            BitmapFactory.Options options = new BitmapFactory.Options();
/* 16 */            options.inMutable = true;
/* 20 */            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
/* 24 */            o30 o30Var = this.customTabsSession;
/* 26 */            o30Var.getClass();
/* 31 */            Bundle bundle = new Bundle();
/* 36 */            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeByteArray);
/* 41 */            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
/* 46 */            Bundle bundle2 = new Bundle();
/* 51 */            bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
                    try {
/* 58 */                o30Var.f14600b.updateVisuals(o30Var.f14601c, bundle2);
                    } catch (RemoteException unused) {
                    }
/* 63 */            this.actionButton.setIcon(bArr);
/* 68 */            this.actionButton.setDescription(str);
                }

                public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
/* 3 */             if (this.customTabsSession == null) {
/* 5 */                 return;
                    }
/* 6 */             AndroidResource layout = customTabsSecondaryToolbar.getLayout();
/* 20 */            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
/* 31 */            int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
/* 37 */            int size = customTabsSecondaryToolbar.getClickableIDs().size();
/* 42 */            for (int i = 0; i < size; i++) {
/* 58 */                iArr[i] = customTabsSecondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
                    }
/* 63 */            o30 o30Var = this.customTabsSession;
/* 65 */            PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
/* 69 */            o30Var.getClass();
/* 74 */            Bundle bundle = new Bundle();
/* 79 */            bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
/* 84 */            bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
/* 89 */            bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
                    try {
/* 96 */                o30Var.f14600b.updateVisuals(o30Var.f14601c, bundle);
                    } catch (RemoteException unused) {
                    }
/* 99 */            this.secondaryToolbar = customTabsSecondaryToolbar;
                }
            }
