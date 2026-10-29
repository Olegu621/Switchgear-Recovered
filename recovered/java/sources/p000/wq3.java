            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.os.Build;
            import android.os.Bundle;
            import android.util.Base64;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wq3 {

                /* JADX INFO: renamed from: e */
                public static final C0204c5 f18751e = new C0204c5("AppUpdateService");

                /* JADX INFO: renamed from: f */
                public static final Intent f18752f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

                /* JADX INFO: renamed from: a */
                public final yr3 f18753a;

                /* JADX INFO: renamed from: b */
                public final String f18754b;

                /* JADX INFO: renamed from: c */
                public final Context f18755c;

                /* JADX INFO: renamed from: d */
                public final lr3 f18756d;

                public wq3(Context context, lr3 lr3Var) {
                    String strEncodeToString;
/* 8 */             this.f18754b = context.getPackageName();
/* 10 */            this.f18755c = context;
/* 12 */            this.f18756d = lr3Var;
/* 14 */            C0204c5 c0204c5 = ed3.f7652a;
                    try {
/* 29 */                if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
/* 41 */                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
/* 43 */                    if (signatureArr == null || (signatureArr.length) == 0) {
/* 135 */                       C0204c5 c0204c6 = ed3.f7652a;
/* 137 */                       Object[] objArr = new Object[0];
/* 146 */                       if (Log.isLoggable("PlayCore", 5)) {
/* 156 */                           AbstractC1245n0.m4889q("PlayCore", C0204c5.m1527d(c0204c6.f2720b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
/* 159 */                           return;
                                } else {
/* 160 */                           c0204c6.getClass();
/* 163 */                           return;
                                }
                            }
/* 49 */                    for (Signature signature : signatureArr) {
/* 53 */                        byte[] byteArray = signature.toByteArray();
                                try {
/* 59 */                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 63 */                            messageDigest.update(byteArray);
/* 72 */                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                                } catch (NoSuchAlgorithmException unused) {
/* 77 */                            strEncodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 85 */                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
/* 87 */                            String str = Build.TAGS;
/* 95 */                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                    }
                                }
/* 118 */                       Context applicationContext = context.getApplicationContext();
/* 132 */                       this.f18753a = new yr3(applicationContext != null ? applicationContext : context, f18751e, f18752f);
/* 134 */                       return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }

                /* JADX INFO: renamed from: a */
                public static Bundle m9603a(wq3 wq3Var, String str) {
                    Integer numValueOf;
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putAll(m9604b());
/* 15 */            bundle.putString("package.name", str);
                    try {
/* 37 */                numValueOf = Integer.valueOf(wq3Var.f18755c.getPackageManager().getPackageInfo(wq3Var.f18755c.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 42 */                Object[] objArr = new Object[0];
/* 47 */                boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
/* 51 */                C0204c5 c0204c5 = f18751e;
/* 53 */                if (zIsLoggable) {
/* 63 */                    AbstractC1245n0.m4876d("PlayCore", C0204c5.m1527d(c0204c5.f2720b, "The current version of the app could not be retrieved", objArr));
                        } else {
/* 67 */                    c0204c5.getClass();
                        }
/* 70 */                numValueOf = null;
                    }
/* 71 */            if (numValueOf != null) {
/* 79 */                bundle.putInt("app.version.code", numValueOf.intValue());
                    }
/* 82 */            return bundle;
                }

                /* JADX INFO: renamed from: b */
                public static Bundle m9604b() {
                    Map map;
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             Bundle bundle2 = new Bundle();
/* 11 */            HashMap map2 = dj3.f7274a;
                    synchronized (dj3.class) {
                        try {
/* 16 */                    HashMap map3 = dj3.f7274a;
/* 26 */                    if (!map3.containsKey("app_update")) {
/* 30 */                        HashMap map4 = new HashMap();
/* 39 */                        map4.put("java", 11004);
/* 42 */                        map3.put("app_update", map4);
                            }
/* 52 */                    map = (Map) map3.get("app_update");
                        } catch (Throwable th) {
/* 132 */                   throw th;
                        }
                    }
/* 69 */            bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
/* 78 */            if (map.containsKey("native")) {
/* 94 */                bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
/* 103 */           if (map.containsKey("unity")) {
/* 119 */               bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
/* 122 */           bundle.putAll(bundle2);
/* 127 */           bundle.putInt("playcore.version.code", 11004);
/* 130 */           return bundle;
                }
            }
