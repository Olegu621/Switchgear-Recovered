            package p000;

            import android.app.Activity;
            import android.os.Build;
            import android.text.TextUtils;
            import androidx.fragment.app.FragmentActivity;
            import java.util.Arrays;
            import java.util.HashSet;
            
            /* JADX INFO: renamed from: x2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2353x2 extends v00 {
                /* JADX INFO: renamed from: a */
                public static void m9683a(Activity activity, String[] strArr, int i) {
/* 3 */             HashSet hashSet = new HashSet();
/* 9 */             for (int i2 = 0; i2 < strArr.length; i2++) {
/* 17 */                if (TextUtils.isEmpty(strArr[i2])) {
/* 62 */                    C1951n4.m6859j(fm0.m3789o(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
/* 65 */                    return;
                        }
/* 23 */                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
/* 39 */                    hashSet.add(Integer.valueOf(i2));
                        }
                    }
/* 66 */            int size = hashSet.size();
/* 77 */            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
/* 78 */            if (size > 0) {
/* 81 */                if (size == strArr.length) {
/* 83 */                    return;
                        }
/* 84 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < strArr.length; i4++) {
/* 96 */                    if (!hashSet.contains(Integer.valueOf(i4))) {
/* 102 */                       strArr2[i3] = strArr[i4];
/* 98 */                        i3++;
                            }
                        }
                    }
/* 110 */           if (activity instanceof FragmentActivity) {
/* 115 */               ((FragmentActivity) activity).validateRequestPermissionsRequestCode(i);
                    }
/* 118 */           AbstractC2240u2.m8940b(activity, strArr, i);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m9684b(Activity activity, String str) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
/* 15 */                return false;
                    }
/* 19 */            if (i >= 32) {
/* 21 */                return AbstractC2316w2.m9457a(activity, str);
                    }
                    return i == 31 ? AbstractC2278v2.m9191b(activity, str) : AbstractC2240u2.m8941c(activity, str);
                }
            }
