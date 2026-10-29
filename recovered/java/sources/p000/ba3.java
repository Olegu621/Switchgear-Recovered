            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.os.Build;
            import android.util.Base64;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ba3 {

                /* JADX INFO: renamed from: a */
                public static final qa3 f2340a = new qa3("PhoneskyVerificationUtils");

                /* JADX INFO: renamed from: a */
                public static int m1310a(Context context) {
                    try {
/* 9 */                 PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
/* 13 */                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
/* 15 */                if (applicationInfo != null && applicationInfo.enabled && m1311b(packageInfo.signatures)) {
/* 30 */                    return packageInfo.versionCode;
                        }
/* 33 */                return 0;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 33 */                return 0;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static boolean m1311b(Signature[] signatureArr) {
                    String strEncodeToString;
/* 1 */             qa3 qa3Var = f2340a;
/* 4 */             if (signatureArr == null || (signatureArr.length) == 0) {
/* 147 */               qa3Var.m7757c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
/* 3 */                 return false;
                    }
/* 13 */            ArrayList arrayList = new ArrayList();
/* 17 */            for (Signature signature : signatureArr) {
/* 21 */                byte[] byteArray = signature.toByteArray();
                        try {
/* 27 */                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 31 */                    messageDigest.update(byteArray);
/* 40 */                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
/* 45 */                    strEncodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 47 */                arrayList.add(strEncodeToString);
/* 56 */                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
/* 87 */                    return true;
                        }
/* 58 */                String str = Build.TAGS;
/* 66 */                if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
/* 87 */                    return true;
                        }
                    }
/* 91 */            StringBuilder sb = new StringBuilder();
/* 94 */            Iterator it = arrayList.iterator();
/* 102 */           if (it.hasNext()) {
                        while (true) {
/* 110 */                   sb.append((CharSequence) it.next());
/* 117 */                   if (!it.hasNext()) {
                                break;
                            }
/* 121 */                   sb.append((CharSequence) ", ");
                        }
                    }
/* 139 */           qa3Var.m7757c(fm0.m3784j("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
/* 3 */             return false;
                }
            }
