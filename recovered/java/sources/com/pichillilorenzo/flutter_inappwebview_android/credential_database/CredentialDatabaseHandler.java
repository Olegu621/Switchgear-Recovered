            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.content.Context;
            import android.webkit.WebViewDatabase;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CredentialDatabaseHandler extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "CredentialDatabaseHandler";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
                public static CredentialDatabase credentialDatabase;
                public InAppWebViewFlutterPlugin plugin;

                public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 3 */             if (credentialDatabase == null) {
/* 11 */                credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
/* 7 */             credentialDatabase = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Context context;
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 3 */             if (inAppWebViewFlutterPlugin != null) {
/* 5 */                 init(inAppWebViewFlutterPlugin);
                    }
/* 8 */             String str = methodCall.method;
/* 10 */            str.getClass();
                    switch (str) {
                        case "clearAllAuthCredentials":
/* 443 */                   CredentialDatabase credentialDatabase2 = credentialDatabase;
/* 445 */                   if (credentialDatabase2 != null) {
/* 447 */                       credentialDatabase2.clearAllAuthCredentials();
/* 450 */                       InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
/* 452 */                       if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
/* 462 */                           WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                                }
/* 467 */                       result.success(Boolean.TRUE);
                                break;
                            } else {
/* 473 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "getHttpAuthCredentials":
/* 378 */                   ArrayList arrayList = new ArrayList();
/* 383 */                   if (credentialDatabase != null) {
/* 415 */                       Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).iterator();
/* 423 */                       while (it.hasNext()) {
/* 435 */                           arrayList.add(it.next().toMap());
                                }
                            }
/* 439 */                   result.success(arrayList);
                            break;
                        case "removeHttpAuthCredential":
/* 315 */                   if (credentialDatabase != null) {
/* 361 */                       credentialDatabase.removeHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
/* 366 */                       result.success(Boolean.TRUE);
                                break;
                            } else {
/* 372 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "setHttpAuthCredential":
/* 252 */                   if (credentialDatabase != null) {
/* 298 */                       credentialDatabase.setHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
/* 303 */                       result.success(Boolean.TRUE);
                                break;
                            } else {
/* 309 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "removeHttpAuthCredentials":
/* 207 */                   if (credentialDatabase != null) {
/* 235 */                       credentialDatabase.removeHttpAuthCredentials((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
/* 240 */                       result.success(Boolean.TRUE);
                                break;
                            } else {
/* 246 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "getAllAuthCredentials":
/* 108 */                   ArrayList arrayList2 = new ArrayList();
/* 111 */                   CredentialDatabase credentialDatabase3 = credentialDatabase;
/* 113 */                   if (credentialDatabase3 != null) {
/* 129 */                       for (URLProtectionSpace uRLProtectionSpace : credentialDatabase3.protectionSpaceDao.getAll()) {
/* 139 */                           ArrayList arrayList3 = new ArrayList();
/* 154 */                           Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
/* 162 */                           while (it2.hasNext()) {
/* 174 */                               arrayList3.add(it2.next().toMap());
                                    }
/* 180 */                           HashMap map = new HashMap();
/* 189 */                           map.put("protectionSpace", uRLProtectionSpace.toMap());
/* 194 */                           map.put("credentials", arrayList3);
/* 197 */                           arrayList2.add(map);
                                }
                            }
/* 201 */                   result.success(arrayList2);
                            break;
                        default:
/* 102 */                   result.notImplemented();
                            break;
                    }
                }
            }
