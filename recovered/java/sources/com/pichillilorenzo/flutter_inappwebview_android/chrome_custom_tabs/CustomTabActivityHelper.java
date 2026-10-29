            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.app.Activity;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.support.customtabs.ICustomTabsService;
            import android.text.TextUtils;
            import java.util.List;
            import java.util.Map;
            import p000.cs2;
            import p000.d30;
            import p000.e30;
            import p000.j30;
            import p000.l30;
            import p000.o30;
            import p000.w20;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 61 */    public class CustomTabActivityHelper implements ServiceConnectionCallback {
                private e30 mClient;
                private l30 mConnection;
                private ConnectionCallback mConnectionCallback;
                private w20 mCustomTabsCallback;
                private o30 mCustomTabsSession;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ConnectionCallback {
                    void onCustomTabsConnected();

                    void onCustomTabsDisconnected();
                }

                public static boolean isAvailable(Activity activity) {
                    return CustomTabsHelper.getPackageNameToUse(activity) != null;
                }

                public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i) {
/* 1 */             intent.setData(uri);
/* 4 */             if (map != null) {
/* 8 */                 Bundle bundle = new Bundle();
/* 23 */                for (Map.Entry<String, String> entry : map.entrySet()) {
/* 43 */                    bundle.putString(entry.getKey(), entry.getValue());
                        }
/* 49 */                intent.putExtra("com.android.browser.headers", bundle);
                    }
/* 52 */            if (uri2 != null) {
/* 56 */                intent.putExtra("android.intent.extra.REFERRER", uri2);
                    }
/* 59 */            activity.startActivityForResult(intent, i);
                }

                public static void openTrustedWebActivity(Activity activity, cs2 cs2Var, Uri uri, Map<String, String> map, Uri uri2, int i) {
/* 3 */             openCustomTab(activity, cs2Var.f6899a, uri, map, uri2, i);
                }

                public boolean bindCustomTabsService(Activity activity) {
/* 3 */             if (this.mClient != null) {
/* 5 */                 return true;
                    }
/* 7 */             String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
/* 11 */            if (packageNameToUse == null) {
/* 13 */                return false;
                    }
/* 17 */            ServiceConnection serviceConnection = new ServiceConnection(this);
/* 20 */            this.mConnection = serviceConnection;
/* 26 */            serviceConnection.setApplicationContext(activity.getApplicationContext());
/* 33 */            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
/* 40 */            if (!TextUtils.isEmpty(packageNameToUse)) {
/* 42 */                intent.setPackage(packageNameToUse);
                    }
/* 47 */            return activity.bindService(intent, serviceConnection, 33);
                }

                public o30 getSession() {
/* 1 */             e30 e30Var = this.mClient;
/* 3 */             o30 o30Var = null;
/* 4 */             if (e30Var == null) {
/* 6 */                 this.mCustomTabsSession = null;
                    } else if (this.mCustomTabsSession == null) {
/* 13 */                w20 w20Var = this.mCustomTabsCallback;
/* 15 */                ICustomTabsService iCustomTabsService = e30Var.f7492a;
/* 19 */                d30 d30Var = new d30(w20Var);
                        try {
/* 26 */                    if (iCustomTabsService.newSession(d30Var)) {
/* 33 */                        o30Var = new o30(iCustomTabsService, d30Var, e30Var.f7493b);
                            }
                        } catch (RemoteException unused) {
                        }
/* 36 */                this.mCustomTabsSession = o30Var;
                    }
/* 38 */            return this.mCustomTabsSession;
                }

                public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
                    o30 session;
/* 3 */             if (this.mClient == null || (session = getSession()) == null) {
/* 26 */                return false;
                    }
                    try {
/* 21 */                return session.f14600b.mayLaunchUrl(session.f14601c, uri, session.m7093a(bundle), list);
                    } catch (RemoteException unused) {
/* 26 */                return false;
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
                public void onServiceConnected(e30 e30Var) {
/* 1 */             this.mClient = e30Var;
/* 3 */             e30Var.getClass();
                    try {
/* 10 */                e30Var.f7492a.warmup(0L);
                    } catch (RemoteException unused) {
                    }
/* 13 */            ConnectionCallback connectionCallback = this.mConnectionCallback;
/* 15 */            if (connectionCallback != null) {
/* 17 */                connectionCallback.onCustomTabsConnected();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
                public void onServiceDisconnected() {
/* 2 */             this.mClient = null;
/* 4 */             this.mCustomTabsSession = null;
/* 6 */             ConnectionCallback connectionCallback = this.mConnectionCallback;
/* 8 */             if (connectionCallback != null) {
/* 10 */                connectionCallback.onCustomTabsDisconnected();
                    }
                }

                public void setConnectionCallback(ConnectionCallback connectionCallback) {
/* 1 */             this.mConnectionCallback = connectionCallback;
                }

                public void setCustomTabsCallback(w20 w20Var) {
/* 1 */             this.mCustomTabsCallback = w20Var;
                }

                public void unbindCustomTabsService(Activity activity) {
/* 1 */             l30 l30Var = this.mConnection;
/* 3 */             if (l30Var == null) {
/* 5 */                 return;
                    }
/* 6 */             activity.unbindService(l30Var);
/* 10 */            this.mClient = null;
/* 12 */            this.mCustomTabsSession = null;
/* 14 */            this.mConnection = null;
                }

/* 62 */        public static void openCustomTab(Activity activity, j30 j30Var, Uri uri, Map<String, String> map, Uri uri2, int i) {
/* 63 */            openCustomTab(activity, j30Var.f12036a, uri, map, uri2, i);
                }
            }
