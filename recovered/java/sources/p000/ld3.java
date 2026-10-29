            package p000;

            import android.app.PendingIntent;
            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.common.ConnectionResult;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ld3 {

                /* JADX INFO: renamed from: a */
                public static final Uri f13201a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

                /* JADX INFO: renamed from: a */
                public static Intent m6420a(Context context, fn3 fn3Var) {
                    Bundle bundleCall;
/* 3 */             String str = fn3Var.f8292a;
/* 5 */             Intent intent = null;
/* 6 */             if (str == null) {
/* 13 */                return new Intent().setComponent(null);
                    }
/* 20 */            if (fn3Var.f8294c) {
/* 24 */                Bundle bundle = new Bundle();
/* 29 */                bundle.putString("serviceActionBundleKey", str);
                        try {
/* 38 */                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f13201a);
/* 42 */                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
/* 70 */                        throw new RemoteException("Failed to acquire ContentProviderClient");
                            }
                            try {
/* 46 */                        bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
/* 50 */                        contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
/* 59 */                        contentProviderClientAcquireUnstableContentProviderClient.release();
/* 62 */                        throw th;
                            }
                        } catch (RemoteException e) {
/* 56 */                    e = e;
/* 81 */                    AbstractC1245n0.m4889q("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
/* 84 */                    bundleCall = null;
                        } catch (IllegalArgumentException e2) {
/* 54 */                    e = e2;
/* 81 */                    AbstractC1245n0.m4889q("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
/* 84 */                    bundleCall = null;
                        }
/* 85 */                if (bundleCall != null) {
/* 94 */                    Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
/* 96 */                    if (intent2 != null) {
/* 98 */                        intent = intent2;
                            } else {
/* 106 */                       PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
/* 108 */                       if (pendingIntent != null) {
/* 130 */                           StringBuilder sb = new StringBuilder(str.length() + 72);
/* 135 */                           sb.append("Dynamic lookup for intent failed for action ");
/* 138 */                           sb.append(str);
/* 143 */                           sb.append(" but has possible resolution");
/* 150 */                           AbstractC1245n0.m4889q("ServiceBindIntentUtils", sb.toString());
/* 165 */                           throw new id3(new ConnectionResult(25, null, pendingIntent));
                                }
                            }
                        }
/* 110 */               if (intent == null) {
/* 118 */                   AbstractC1245n0.m4889q("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                        }
                    }
                    return intent == null ? new Intent(str).setPackage(fn3Var.f8293b) : intent;
                }
            }
