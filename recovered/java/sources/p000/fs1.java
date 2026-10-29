            package p000;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.os.Build;
            import android.os.Environment;
            import android.os.Looper;
            import android.os.StatFs;
            import android.telephony.TelephonyManager;
            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import java.util.Arrays;
            import java.util.Locale;
            import java.util.MissingResourceException;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fs1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8340a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gs1 f8341b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ fs1(gs1 gs1Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f8340a = i;
/* 3 */             this.f8341b = gs1Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ActivityManager activityManager;
/* 1 */             int i = this.f8340a;
/* 10 */            gs1 gs1Var = this.f8341b;
                    switch (i) {
                        case 0:
/* 440 */                   dc0 dc0Var = gs1Var.f8795c;
/* 442 */                   Context context = gs1Var.f8798f;
/* 444 */                   dc0Var.getClass();
/* 447 */                   context.getClass();
/* 450 */                   Object systemService = context.getSystemService("activity");
/* 459 */                   activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
/* 463 */                   ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 466 */                   if (activityManager != null) {
/* 468 */                       activityManager.getMemoryInfo(memoryInfo);
                            }
/* 473 */                   return Long.valueOf(memoryInfo.availMem);
                        case 1:
/* 415 */                   gs1Var.f8795c.getClass();
/* 435 */                   return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes());
                        case 2:
/* 385 */                   dc0 dc0Var2 = gs1Var.f8795c;
/* 387 */                   Context context2 = gs1Var.f8798f;
/* 389 */                   dc0Var2.getClass();
/* 392 */                   context2.getClass();
/* 408 */                   return Boolean.valueOf(context2.getResources().getConfiguration().orientation == 1);
                        case 3:
/* 373 */                   gs1Var.f8795c.getClass();
                            try {
/* 380 */                       return Locale.getDefault().getISO3Language();
                            } catch (MissingResourceException unused) {
/* 9 */                         return null;
                            }
                        case 4:
/* 237 */                   dc0 dc0Var3 = gs1Var.f8795c;
/* 239 */                   Context context3 = gs1Var.f8798f;
/* 241 */                   dc0Var3.getClass();
/* 244 */                   context3.getClass();
/* 259 */                   if (!Intrinsics.m6216a(Looper.myLooper(), Looper.getMainLooper())) {
                                try {
/* 262 */                           int i2 = dc0.f7102d;
/* 278 */                           Object[] objArrCopyOf = Arrays.copyOf(new Object[]{context3}, 1);
/* 297 */                           Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
/* 314 */                           Object objM2985b = objInvoke != null ? dc0.m2985b(objInvoke, "isLimitAdTrackingEnabled", new Object[0]) : null;
/* 329 */                           if (Intrinsics.m6216a(objM2985b instanceof Boolean ? (Boolean) objM2985b : null, Boolean.TRUE)) {
/* 5 */                                 return HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 343 */                           Object objM2985b2 = objInvoke != null ? dc0.m2985b(objInvoke, "getId", new Object[0]) : null;
/* 346 */                           if (objM2985b2 instanceof String) {
/* 349 */                               return (String) objM2985b2;
                                    }
                                } catch (Exception e) {
/* 366 */                           k50.m5980q("vq2", "Exception getting the Advertising ID: %s", e.toString());
                                }
                            }
/* 9 */                     return null;
                        case 5:
/* 231 */                   gs1Var.f8795c.getClass();
/* 234 */                   return "android";
                        case 6:
/* 220 */                   gs1Var.f8795c.getClass();
/* 223 */                   String str = Build.VERSION.RELEASE;
/* 225 */                   str.getClass();
/* 228 */                   return str;
                        case 7:
/* 209 */                   gs1Var.f8795c.getClass();
/* 212 */                   String str2 = Build.MODEL;
/* 214 */                   str2.getClass();
/* 217 */                   return str2;
                        case 8:
/* 198 */                   gs1Var.f8795c.getClass();
/* 201 */                   String str3 = Build.MANUFACTURER;
/* 203 */                   str3.getClass();
/* 206 */                   return str3;
                        case 9:
/* 156 */                   dc0 dc0Var4 = gs1Var.f8795c;
/* 158 */                   Context context4 = gs1Var.f8798f;
/* 160 */                   dc0Var4.getClass();
/* 163 */                   context4.getClass();
/* 168 */                   Object systemService2 = context4.getSystemService("phone");
/* 179 */                   TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
/* 187 */                   String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
/* 192 */                   if (Intrinsics.m6216a(networkOperatorName, HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 9 */                         return null;
                            }
/* 194 */                   return networkOperatorName;
                        case 10:
/* 118 */                   dc0 dc0Var5 = gs1Var.f8795c;
/* 120 */                   Context context5 = gs1Var.f8798f;
/* 122 */                   dc0Var5.getClass();
/* 125 */                   context5.getClass();
/* 128 */                   Object systemService3 = context5.getSystemService("activity");
/* 137 */                   activityManager = systemService3 instanceof ActivityManager ? (ActivityManager) systemService3 : null;
/* 141 */                   ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
/* 144 */                   if (activityManager != null) {
/* 146 */                       activityManager.getMemoryInfo(memoryInfo2);
                            }
/* 151 */                   return Long.valueOf(memoryInfo2.totalMem);
                        case 11:
/* 93 */                    gs1Var.f8795c.getClass();
/* 113 */                   return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
                        case 12:
/* 40 */                    dc0 dc0Var6 = gs1Var.f8795c;
/* 42 */                    Context context6 = gs1Var.f8798f;
/* 44 */                    dc0Var6.getClass();
/* 47 */                    context6.getClass();
/* 58 */                    int i3 = context6.getResources().getDisplayMetrics().widthPixels;
/* 68 */                    int i4 = context6.getResources().getDisplayMetrics().heightPixels;
/* 72 */                    StringBuilder sb = new StringBuilder();
/* 75 */                    sb.append(i3);
/* 80 */                    sb.append('x');
/* 83 */                    sb.append(i4);
/* 86 */                    return sb.toString();
                        default:
/* 15 */                    dc0 dc0Var7 = gs1Var.f8795c;
/* 17 */                    Context context7 = gs1Var.f8798f;
/* 19 */                    dc0Var7.getClass();
/* 22 */                    context7.getClass();
/* 35 */                    return Float.valueOf(context7.getResources().getDisplayMetrics().density);
                    }
                }
            }
