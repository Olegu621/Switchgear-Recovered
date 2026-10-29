            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.app.Activity;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.support.customtabs.ICustomTabsService;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import p000.d30;
            import p000.o30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
                private ChromeCustomTabsActivity chromeCustomTabsActivity;

                public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.chromeCustomTabsActivity = chromeCustomTabsActivity;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.chromeCustomTabsActivity = null;
                }

                public void onClosed() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onClosed", new HashMap());
                }

                public void onCompletedInitialLoad() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onCompletedInitialLoad", new HashMap());
                }

                public void onGreatestScrollPercentageIncreased(int i) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("scrollPercentage", Integer.valueOf(i));
/* 24 */            channel.invokeMethod("onGreatestScrollPercentageIncreased", map);
                }

                public void onItemActionPerform(int i, String str, String str2) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("id", Integer.valueOf(i));
/* 24 */            map.put("url", str);
/* 29 */            map.put("title", str2);
/* 34 */            channel.invokeMethod("onItemActionPerform", map);
                }

                public void onMessageChannelReady() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onMessageChannelReady", new HashMap());
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    o30 o30Var;
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
                    Activity activity;
                    int iPostMessage;
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            boolean zValidateRelationship = false;
/* 13 */            byte b = -1;
                    switch (str.hashCode()) {
                        case -1526944655:
/* 116 */                   if (str.equals("isEngagementSignalsApiAvailable")) {
/* 119 */                       b = 0;
                            }
                            break;
                        case -675108676:
/* 105 */                   if (str.equals("launchUrl")) {
/* 108 */                       b = 1;
                            }
                            break;
                        case -334843312:
/* 94 */                    if (str.equals("updateSecondaryToolbar")) {
/* 97 */                        b = 2;
                            }
                            break;
                        case 50870385:
/* 83 */                    if (str.equals("updateActionButton")) {
/* 86 */                        b = 3;
                            }
                            break;
                        case 94756344:
/* 72 */                    if (str.equals("close")) {
/* 75 */                        b = 4;
                            }
                            break;
                        case 1256059502:
/* 61 */                    if (str.equals("validateRelationship")) {
/* 64 */                        b = 5;
                            }
                            break;
                        case 1392239787:
/* 50 */                    if (str.equals("requestPostMessageChannel")) {
/* 53 */                        b = 6;
                            }
                            break;
                        case 1490029383:
/* 39 */                    if (str.equals("postMessage")) {
/* 42 */                        b = 7;
                            }
                            break;
                        case 2000053463:
/* 25 */                    if (str.equals("mayLaunchUrl")) {
/* 29 */                        b = 8;
                            }
                            break;
                    }
/* 120 */           Bundle bundle = null;
                    switch (b) {
                        case 0:
/* 601 */                   ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
/* 603 */                   if (chromeCustomTabsActivity == null || (o30Var = chromeCustomTabsActivity.customTabsSession) == null) {
/* 651 */                       result.success(Boolean.FALSE);
/* 654 */                       return;
                            }
                            try {
                                try {
/* 630 */                           result.success(Boolean.valueOf(o30Var.f14600b.isEngagementSignalsApiAvailable(o30Var.f14601c, o30Var.m7093a(new Bundle()))));
/* 633 */                           return;
                                } catch (SecurityException e) {
/* 642 */                           throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
                                }
                            } catch (Throwable unused) {
/* 645 */                       result.success(Boolean.FALSE);
/* 648 */                       return;
                            }
                        case 1:
/* 542 */                   if (this.chromeCustomTabsActivity == null) {
/* 597 */                       result.success(Boolean.FALSE);
/* 600 */                       return;
                            }
/* 550 */                   String str2 = (String) methodCall.argument("url");
/* 552 */                   if (str2 == null) {
/* 591 */                       result.success(Boolean.FALSE);
/* 594 */                       return;
                            } else {
/* 580 */                       this.chromeCustomTabsActivity.launchUrl(str2, (Map) methodCall.argument("headers"), (String) methodCall.argument("referrer"), (List) methodCall.argument("otherLikelyURLs"));
/* 585 */                       result.success(Boolean.TRUE);
/* 588 */                       return;
                            }
                        case 2:
/* 509 */                   if (this.chromeCustomTabsActivity == null) {
/* 536 */                       result.success(Boolean.FALSE);
/* 539 */                       return;
                            } else {
/* 525 */                       this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) methodCall.argument("secondaryToolbar")));
/* 530 */                       result.success(Boolean.TRUE);
/* 533 */                       return;
                            }
                        case 3:
/* 472 */                   if (this.chromeCustomTabsActivity == null) {
/* 503 */                       result.success(Boolean.FALSE);
/* 506 */                       return;
                            } else {
/* 492 */                       this.chromeCustomTabsActivity.updateActionButton((byte[]) methodCall.argument("icon"), (String) methodCall.argument("description"));
/* 497 */                       result.success(Boolean.TRUE);
/* 500 */                       return;
                            }
                        case 4:
/* 400 */                   ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
/* 402 */                   if (chromeCustomTabsActivity2 == null) {
/* 466 */                       result.success(Boolean.FALSE);
/* 469 */                       return;
                            }
/* 404 */                   chromeCustomTabsActivity2.onStop();
/* 409 */                   this.chromeCustomTabsActivity.onDestroy();
/* 414 */                   this.chromeCustomTabsActivity.close();
/* 419 */                   ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
/* 421 */                   if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
/* 437 */                       Intent intent = new Intent(activity, activity.getClass());
/* 442 */                       intent.addFlags(67108864);
/* 447 */                       intent.addFlags(536870912);
/* 450 */                       activity.startActivity(intent);
                            }
/* 455 */                   this.chromeCustomTabsActivity.dispose();
/* 460 */                   result.success(Boolean.TRUE);
/* 463 */                   return;
                        case 5:
/* 330 */                   ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
/* 332 */                   if (chromeCustomTabsActivity3 == null || chromeCustomTabsActivity3.customTabsSession == null) {
/* 396 */                       result.success(Boolean.FALSE);
/* 399 */                       return;
                            }
/* 344 */                   Integer num = (Integer) methodCall.argument("relation");
/* 352 */                   String str3 = (String) methodCall.argument(FirebaseAnalytics.Param.ORIGIN);
/* 356 */                   o30 o30Var2 = this.chromeCustomTabsActivity.customTabsSession;
/* 358 */                   int iIntValue = num.intValue();
/* 362 */                   Uri uri = Uri.parse(str3);
/* 366 */                   o30Var2.getClass();
/* 369 */                   if (iIntValue >= 1 && iIntValue <= 2) {
                                try {
/* 382 */                           zValidateRelationship = o30Var2.f14600b.validateRelationship(o30Var2.f14601c, iIntValue, uri, o30Var2.m7093a(null));
                                    break;
                                } catch (RemoteException unused2) {
                                }
                            }
/* 390 */                   result.success(Boolean.valueOf(zValidateRelationship));
/* 393 */                   return;
                        case 6:
/* 233 */                   ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
/* 235 */                   if (chromeCustomTabsActivity4 == null || chromeCustomTabsActivity4.customTabsSession == null) {
/* 326 */                       result.success(Boolean.FALSE);
/* 329 */                       return;
                            }
/* 247 */                   String str4 = (String) methodCall.argument("sourceOrigin");
/* 255 */                   String str5 = (String) methodCall.argument("targetOrigin");
/* 259 */                   o30 o30Var3 = this.chromeCustomTabsActivity.customTabsSession;
/* 261 */                   Uri uri2 = Uri.parse(str4);
/* 272 */                   Uri uri3 = str5 != null ? Uri.parse(str5) : null;
/* 275 */                   Bundle bundle2 = new Bundle();
/* 278 */                   d30 d30Var = o30Var3.f14601c;
/* 280 */                   ICustomTabsService iCustomTabsService = o30Var3.f14600b;
                            try {
/* 284 */                       Bundle bundle3 = new Bundle();
/* 287 */                       if (uri3 != null) {
/* 291 */                           bundle3.putParcelable("target_origin", uri3);
                                }
/* 298 */                       if (!bundle3.isEmpty()) {
/* 301 */                           bundle = bundle3;
                                }
/* 302 */                       if (bundle != null) {
/* 304 */                           bundle2.putAll(bundle);
/* 307 */                           zValidateRelationship = iCustomTabsService.requestPostMessageChannelWithExtras(d30Var, uri2, bundle2);
                                } else {
/* 312 */                           zValidateRelationship = iCustomTabsService.requestPostMessageChannel(d30Var, uri2);
                                }
                            } catch (RemoteException unused3) {
                            }
/* 320 */                   result.success(Boolean.valueOf(zValidateRelationship));
/* 323 */                   return;
                        case 7:
/* 168 */                   ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
/* 170 */                   if (chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) {
/* 229 */                       result.success(-3);
/* 232 */                       return;
                            }
/* 182 */                   String str6 = (String) methodCall.argument("message");
/* 186 */                   o30 o30Var4 = this.chromeCustomTabsActivity.customTabsSession;
/* 193 */                   Bundle bundleM7093a = o30Var4.m7093a(new Bundle());
                            synchronized (o30Var4.f14599a) {
                                try {
                                    try {
/* 204 */                               iPostMessage = o30Var4.f14600b.postMessage(o30Var4.f14601c, str6, bundleM7093a);
                                    } catch (Throwable th) {
/* 223 */                               throw th;
                                    }
                                } catch (RemoteException unused4) {
/* 213 */                           iPostMessage = -2;
                                }
                            }
/* 218 */                   result.success(Integer.valueOf(iPostMessage));
/* 221 */                   return;
                        case 8:
/* 130 */                   if (this.chromeCustomTabsActivity != null) {
/* 158 */                       result.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) methodCall.argument("url"), (List) methodCall.argument("otherLikelyURLs"))));
/* 161 */                       return;
                            } else {
/* 164 */                       result.success(Boolean.FALSE);
/* 167 */                       return;
                            }
                        default:
/* 124 */                   result.notImplemented();
/* 127 */                   return;
                    }
                }

                public void onNavigationEvent(int i) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("navigationEvent", Integer.valueOf(i));
/* 24 */            channel.invokeMethod("onNavigationEvent", map);
                }

                public void onOpened() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onOpened", new HashMap());
                }

                public void onPostMessage(String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("message", str);
/* 20 */            channel.invokeMethod("onPostMessage", map);
                }

                public void onRelationshipValidationResult(int i, Uri uri, boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("relation", Integer.valueOf(i));
/* 28 */            map.put("requestedOrigin", uri.toString());
/* 37 */            map.put("result", Boolean.valueOf(z));
/* 42 */            channel.invokeMethod("onRelationshipValidationResult", map);
                }

                public void onSecondaryItemActionPerform(String str, String str2) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("name", str);
/* 20 */            map.put("url", str2);
/* 25 */            channel.invokeMethod("onSecondaryItemActionPerform", map);
                }

                public void onServiceConnected() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onServiceConnected", new HashMap());
                }

                public void onSessionEnded(boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("didUserInteract", Boolean.valueOf(z));
/* 24 */            channel.invokeMethod("onSessionEnded", map);
                }

                public void onVerticalScrollEvent(boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("isDirectionUp", Boolean.valueOf(z));
/* 24 */            channel.invokeMethod("onVerticalScrollEvent", map);
                }
            }
