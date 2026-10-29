            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.content.pm.Signature;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.os.ext.SdkExtensions;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.math.BigInteger;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.SecureRandom;
            import java.security.cert.CertificateException;
            import java.security.cert.CertificateFactory;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.Random;
            import java.util.TreeSet;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicLong;
            import javax.security.auth.x500.X500Principal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class up3 extends hk3 {

                /* JADX INFO: renamed from: c */
                public SecureRandom f17625c;

                /* JADX INFO: renamed from: d */
                public final AtomicLong f17626d;

                /* JADX INFO: renamed from: e */
                public int f17627e;

                /* JADX INFO: renamed from: f */
                public pd1 f17628f;

                /* JADX INFO: renamed from: i */
                public Boolean f17629i;

                /* JADX INFO: renamed from: v */
                public Integer f17630v;

                /* JADX INFO: renamed from: w */
                public static final String[] f17624w = {"firebase_", "google_", "ga_"};

                /* JADX INFO: renamed from: U */
                public static final String[] f17623U = {"_err"};

                public up3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 5 */             this.f17630v = null;
/* 14 */            this.f17626d = new AtomicLong(0L);
                }

                /* JADX INFO: renamed from: E */
                public static String m9060E(int i, String str, boolean z) {
/* 1 */             if (str == null) {
/* 32 */                return null;
                    }
/* 13 */            if (str.codePointCount(0, str.length()) <= i) {
/* 34 */                return str;
                    }
/* 15 */            if (z) {
/* 27 */                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
                    }
/* 32 */            return null;
                }

                /* JADX INFO: renamed from: H0 */
                public static boolean m9061H0(Object obj) {
                    return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
                }

                /* JADX INFO: renamed from: P */
                public static void m9062P(ac3 ac3Var, String str, int i, String str2, String str3, int i2) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             m9073s0(i, bundle);
/* 13 */            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
/* 21 */                bundle.putString(str2, str3);
                    }
/* 25 */            if (i == 6 || i == 7 || i == 2) {
/* 36 */                bundle.putLong("_el", i2);
                    }
/* 41 */            ac3Var.m200e(str, "_err", bundle);
                }

                /* JADX INFO: renamed from: Q */
                public static MessageDigest m9063Q() {
/* 3 */             for (int i = 0; i < 2; i++) {
                        try {
/* 7 */                     MessageDigest messageDigest = MessageDigest.getInstance("MD5");
/* 11 */                    if (messageDigest != null) {
/* 14 */                        return messageDigest;
                            }
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
/* 18 */            return null;
                }

                /* JADX INFO: renamed from: R */
                public static long m9064R(byte[] bArr) {
/* 1 */             kb1.m6061n(bArr);
/* 4 */             int length = bArr.length;
/* 5 */             int i = 0;
/* 11 */            kb1.m6065r(length > 0);
/* 16 */            long j = 0;
/* 18 */            for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
/* 32 */                j += (((long) bArr[i2]) & 255) << i;
/* 33 */                i += 8;
                    }
/* 38 */            return j;
                }

                /* JADX INFO: renamed from: S */
                public static boolean m9065S(Context context) {
                    ServiceInfo serviceInfo;
                    try {
/* 4 */                 PackageManager packageManager = context.getPackageManager();
                        return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }

                /* JADX INFO: renamed from: V */
                public static boolean m9066V(String str) {
/* 8 */             String str2 = (String) vg3.f18160r0.m9011a(null);
                    return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
                }

                /* JADX INFO: renamed from: X */
                public static boolean m9067X(String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith("_");
                }

                /* JADX INFO: renamed from: Y */
                public static boolean m9068Y(String str, String[] strArr) {
/* 1 */             kb1.m6061n(strArr);
/* 7 */             for (String str2 : strArr) {
/* 15 */                if (Objects.equals(str, str2)) {
/* 17 */                    return true;
                        }
                    }
/* 4 */             return false;
                }

                /* JADX INFO: renamed from: d0 */
                public static byte[] m9069d0(Parcelable parcelable) {
/* 1 */             if (parcelable == null) {
/* 3 */                 return null;
                    }
/* 5 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 10 */                parcelable.writeToParcel(parcelObtain, 0);
/* 13 */                return parcelObtain.marshall();
                    } finally {
/* 22 */                parcelObtain.recycle();
                    }
                }

                /* JADX INFO: renamed from: o0 */
                public static ArrayList m9070o0(List list) {
/* 1 */             if (list == null) {
/* 6 */                 return new ArrayList(0);
                    }
/* 16 */            ArrayList arrayList = new ArrayList(list.size());
/* 19 */            Iterator it = list.iterator();
/* 27 */            while (it.hasNext()) {
/* 33 */                zzah zzahVar = (zzah) it.next();
/* 37 */                Bundle bundle = new Bundle();
/* 44 */                bundle.putString("app_id", zzahVar.f4197a);
/* 51 */                bundle.putString(FirebaseAnalytics.Param.ORIGIN, zzahVar.f4198b);
/* 58 */                bundle.putLong("creation_timestamp", zzahVar.f4200d);
/* 67 */                bundle.putString("name", zzahVar.f4199c.f4228b);
/* 72 */                Object objM2197D1 = zzahVar.f4199c.m2197D1();
/* 76 */                kb1.m6061n(objM2197D1);
/* 79 */                he3.m4203z(bundle, objM2197D1);
/* 86 */                bundle.putBoolean("active", zzahVar.f4201e);
/* 89 */                String str = zzahVar.f4202f;
/* 91 */                if (str != null) {
/* 95 */                    bundle.putString("trigger_event_name", str);
                        }
/* 98 */                zzbg zzbgVar = zzahVar.f4203i;
/* 100 */               if (zzbgVar != null) {
/* 106 */                   bundle.putString("timed_out_event_name", zzbgVar.f4208a);
/* 109 */                   zzbe zzbeVar = zzbgVar.f4209b;
/* 111 */                   if (zzbeVar != null) {
/* 119 */                       bundle.putBundle("timed_out_event_params", zzbeVar.m2167G1());
                            }
                        }
/* 126 */               bundle.putLong("trigger_timeout", zzahVar.f4204v);
/* 129 */               zzbg zzbgVar2 = zzahVar.f4205w;
/* 131 */               if (zzbgVar2 != null) {
/* 137 */                   bundle.putString("triggered_event_name", zzbgVar2.f4208a);
/* 140 */                   zzbe zzbeVar2 = zzbgVar2.f4209b;
/* 142 */                   if (zzbeVar2 != null) {
/* 150 */                       bundle.putBundle("triggered_event_params", zzbeVar2.m2167G1());
                            }
                        }
/* 159 */               bundle.putLong("triggered_timestamp", zzahVar.f4199c.f4229c);
/* 166 */               bundle.putLong("time_to_live", zzahVar.f4195U);
/* 169 */               zzbg zzbgVar3 = zzahVar.f4196V;
/* 171 */               if (zzbgVar3 != null) {
/* 177 */                   bundle.putString("expired_event_name", zzbgVar3.f4208a);
/* 180 */                   zzbe zzbeVar3 = zzbgVar3.f4209b;
/* 182 */                   if (zzbeVar3 != null) {
/* 190 */                       bundle.putBundle("expired_event_params", zzbeVar3.m2167G1());
                            }
                        }
/* 193 */               arrayList.add(bundle);
                    }
/* 198 */           return arrayList;
                }

                /* JADX INFO: renamed from: p0 */
                public static boolean m9071p0(Context context) {
                    ActivityInfo receiverInfo;
/* 1 */             kb1.m6061n(context);
                    try {
/* 5 */                 PackageManager packageManager = context.getPackageManager();
                        return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }

                /* JADX INFO: renamed from: q0 */
                public static void m9072q0(bm3 bm3Var, Bundle bundle, boolean z) {
/* 7 */             if (bundle != null && bm3Var != null) {
/* 15 */                if (!bundle.containsKey("_sc") || z) {
/* 22 */                    String str = bm3Var.f2538a;
/* 24 */                    if (str != null) {
/* 26 */                        bundle.putString("_sn", str);
                            } else {
/* 30 */                        bundle.remove("_sn");
                            }
/* 33 */                    String str2 = bm3Var.f2539b;
/* 35 */                    if (str2 != null) {
/* 37 */                        bundle.putString("_sc", str2);
                            } else {
/* 41 */                        bundle.remove("_sc");
                            }
/* 46 */                    bundle.putLong("_si", bm3Var.f2540c);
/* 49 */                    return;
                        }
/* 20 */                z = false;
                    }
/* 50 */            if (bundle != null && bm3Var == null && z) {
/* 56 */                bundle.remove("_sn");
/* 59 */                bundle.remove("_sc");
/* 62 */                bundle.remove("_si");
                    }
                }

                /* JADX INFO: renamed from: s0 */
                public static final boolean m9073s0(int i, Bundle bundle) {
/* 1 */             if (bundle == null || bundle.getLong("_err") != 0) {
/* 22 */                return false;
                    }
/* 17 */            bundle.putLong("_err", i);
/* 20 */            return true;
                }

                /* JADX INFO: renamed from: x0 */
                public static boolean m9074x0(String str) {
/* 1 */             kb1.m6058k(str);
                    return str.charAt(0) != '_' || str.equals("_ep");
                }

                @Override // p000.hk3
                /* JADX INFO: renamed from: A */
                public final boolean mo1364A() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: A0 */
                public final boolean m9075A0(String str, String str2) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             if (str2 == null) {
/* 8 */                 uh3 uh3Var = ij3Var.f9655f;
/* 10 */                ij3.m4555l(uh3Var);
/* 17 */                uh3Var.f17540v.m8511b(str, "Name is required and can't be null. Type");
/* 5 */                 return false;
                    }
/* 25 */            if (str2.length() == 0) {
/* 27 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 29 */                ij3.m4555l(uh3Var2);
/* 36 */                uh3Var2.f17540v.m8511b(str, "Name is required and can't be empty. Type");
/* 5 */                 return false;
                    }
/* 40 */            int iCodePointAt = str2.codePointAt(0);
/* 50 */            if (!Character.isLetter(iCodePointAt)) {
/* 52 */                if (iCodePointAt != 95) {
/* 56 */                    uh3 uh3Var3 = ij3Var.f9655f;
/* 58 */                    ij3.m4555l(uh3Var3);
/* 65 */                    uh3Var3.f17540v.m8512c(str, "Name must start with a letter or _ (underscore). Type, name", str2);
/* 5 */                     return false;
                        }
/* 54 */                iCodePointAt = 95;
                    }
/* 69 */            int length = str2.length();
/* 73 */            int iCharCount = Character.charCount(iCodePointAt);
/* 77 */            while (iCharCount < length) {
/* 79 */                int iCodePointAt2 = str2.codePointAt(iCharCount);
/* 83 */                if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
/* 92 */                    uh3 uh3Var4 = ij3Var.f9655f;
/* 94 */                    ij3.m4555l(uh3Var4);
/* 101 */                   uh3Var4.f17540v.m8512c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
/* 5 */                     return false;
                        }
/* 109 */               iCharCount += Character.charCount(iCodePointAt2);
                    }
/* 111 */           return true;
                }

                /* JADX INFO: renamed from: B0 */
                public final boolean m9076B0(String str, String[] strArr, String[] strArr2, String str2) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             if (str2 == null) {
/* 8 */                 uh3 uh3Var = ij3Var.f9655f;
/* 10 */                ij3.m4555l(uh3Var);
/* 17 */                uh3Var.f17540v.m8511b(str, "Name is required and can't be null. Type");
/* 5 */                 return false;
                    }
/* 23 */            for (int i = 0; i < 3; i++) {
/* 33 */                if (str2.startsWith(f17624w[i])) {
/* 35 */                    uh3 uh3Var2 = ij3Var.f9655f;
/* 37 */                    ij3.m4555l(uh3Var2);
/* 44 */                    uh3Var2.f17540v.m8512c(str, "Name starts with reserved prefix. Type, name", str2);
/* 5 */                     return false;
                        }
                    }
/* 51 */            if (strArr == null || !m9068Y(str2, strArr)) {
/* 80 */                return true;
                    }
/* 59 */            if (strArr2 != null && m9068Y(str2, strArr2)) {
/* 80 */                return true;
                    }
/* 67 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 69 */            ij3.m4555l(uh3Var3);
/* 76 */            uh3Var3.f17540v.m8512c(str, "Name is reserved. Type, name", str2);
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: C0 */
                public final boolean m9077C0(int i, String str, String str2) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             if (str2 == null) {
/* 8 */                 uh3 uh3Var = ij3Var.f9655f;
/* 10 */                ij3.m4555l(uh3Var);
/* 17 */                uh3Var.f17540v.m8511b(str, "Name is required and can't be null. Type");
/* 5 */                 return false;
                    }
/* 29 */            if (str2.codePointCount(0, str2.length()) <= i) {
/* 48 */                return true;
                    }
/* 31 */            uh3 uh3Var2 = ij3Var.f9655f;
/* 33 */            ij3.m4555l(uh3Var2);
/* 44 */            uh3Var2.f17540v.m8513d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final boolean m9078D(String str) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 10 */            if (TextUtils.isEmpty(str)) {
/* 42 */                uh3 uh3Var = ij3Var.f9655f;
/* 44 */                ij3.m4555l(uh3Var);
/* 51 */                uh3Var.f17540v.m8510a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
/* 9 */                 return false;
                    }
/* 12 */            kb1.m6061n(str);
/* 21 */            if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
/* 40 */                return true;
                    }
/* 23 */            uh3 uh3Var2 = ij3Var.f9655f;
/* 25 */            ij3.m4555l(uh3Var2);
/* 36 */            uh3Var2.f17540v.m8511b(uh3.m9013H(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: D0 */
                public final int m9079D0(String str) {
/* 8 */             if (!m9075A0(NotificationCompat.CATEGORY_EVENT, str)) {
/* 7 */                 return 2;
                    }
/* 19 */            if (!m9076B0(NotificationCompat.CATEGORY_EVENT, i13.f9403f, i13.f9404g, str)) {
/* 21 */                return 13;
                    }
/* 28 */            ((ij3) this.f16749a).getClass();
                    return !m9077C0(40, NotificationCompat.CATEGORY_EVENT, str) ? 2 : 0;
                }

                /* JADX INFO: renamed from: E0 */
                public final int m9080E0(String str) {
/* 8 */             if (!m9075A0("user property", str)) {
/* 7 */                 return 6;
                    }
/* 18 */            if (!m9076B0("user property", mn0.f13873h, null, str)) {
/* 20 */                return 15;
                    }
/* 27 */            ((ij3) this.f16749a).getClass();
                    return !m9077C0(24, "user property", str) ? 6 : 0;
                }

                /* JADX WARN: Code duplicated, block: B:34:0x009c  */
                /* JADX INFO: renamed from: F */
                public final int m9081F(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
                    int i;
                    int size;
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             mo1375y();
/* 17 */            int i2 = 0;
/* 18 */            if (!m9061H0(obj)) {
/* 157 */               i = 0;
                    } else {
/* 20 */                if (!z2) {
/* 159 */                   return 21;
                        }
/* 28 */                if (!m9068Y(str2, j13.f12008r)) {
/* 30 */                    return 20;
                        }
/* 33 */                pn3 pn3VarM4567o = ij3Var.m4567o();
/* 37 */                pn3VarM4567o.mo1375y();
/* 40 */                pn3VarM4567o.m9576A();
/* 47 */                if (pn3VarM4567o.m7511G()) {
/* 54 */                    up3 up3Var = ((ij3) pn3VarM4567o.f16749a).f9668w;
/* 56 */                    ij3.m4553j(up3Var);
/* 66 */                    if (up3Var.m9103f0() < 200900) {
/* 68 */                        return 25;
                            }
                        }
/* 71 */                boolean z3 = obj instanceof Parcelable[];
/* 73 */                if (z3) {
/* 78 */                    size = ((Parcelable[]) obj).length;
                        } else if (obj instanceof ArrayList) {
/* 87 */                    size = ((ArrayList) obj).size();
                        } else {
/* 157 */                   i = 0;
                        }
/* 93 */                if (size > 200) {
/* 95 */                    uh3 uh3Var = ij3Var.f9655f;
/* 97 */                    ij3.m4555l(uh3Var);
/* 108 */                   uh3Var.f17531V.m8513d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
/* 111 */                   i = 17;
/* 113 */                   if (z3) {
/* 116 */                       Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 119 */                       if (parcelableArr.length > 200) {
/* 127 */                           bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                                }
                            } else if (obj instanceof ArrayList) {
/* 136 */                       ArrayList arrayList = (ArrayList) obj;
/* 142 */                       if (arrayList.size() > 200) {
/* 153 */                           bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                                }
                            }
                        } else {
/* 157 */                   i = 0;
                        }
                    }
/* 166 */           int iMax = 500;
/* 168 */           if (m9067X(str) || m9067X(str2)) {
/* 185 */               ij3Var.f9651d.getClass();
/* 190 */               iMax = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
                    } else {
/* 179 */               ij3Var.f9651d.getClass();
                    }
/* 198 */           if (!m9087I0("param", str2, iMax, obj)) {
/* 202 */               if (!z2) {
/* 331 */                   return 4;
                        }
/* 206 */               if (obj instanceof Bundle) {
/* 218 */                   m9089J0(str, str2, (Bundle) obj, list, z);
/* 221 */                   return i;
                        }
/* 224 */               if (obj instanceof Parcelable[]) {
/* 227 */                   Parcelable[] parcelableArr2 = (Parcelable[]) obj;
/* 229 */                   int length = parcelableArr2.length;
/* 230 */                   while (i2 < length) {
/* 232 */                       Parcelable parcelable = parcelableArr2[i2];
/* 236 */                       if (!(parcelable instanceof Bundle)) {
/* 238 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 240 */                           ij3.m4555l(uh3Var2);
/* 251 */                           uh3Var2.f17531V.m8512c(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", str2);
/* 331 */                           return 4;
                                }
/* 265 */                       m9089J0(str, str2, (Bundle) parcelable, list, z);
/* 268 */                       i2++;
                            }
                        } else {
/* 273 */                   if (!(obj instanceof ArrayList)) {
/* 331 */                       return 4;
                            }
/* 276 */                   ArrayList arrayList2 = (ArrayList) obj;
/* 278 */                   int size2 = arrayList2.size();
/* 282 */                   while (i2 < size2) {
/* 284 */                       Object obj2 = arrayList2.get(i2);
/* 290 */                       if (!(obj2 instanceof Bundle)) {
/* 292 */                           uh3 uh3Var3 = ij3Var.f9655f;
/* 294 */                           ij3.m4555l(uh3Var3);
/* 310 */                           uh3Var3.f17531V.m8512c(obj2 != null ? obj2.getClass() : "null", "All ArrayList elements must be of type Bundle. Value type, name", str2);
/* 331 */                           return 4;
                                }
/* 324 */                       m9089J0(str, str2, (Bundle) obj2, list, z);
/* 327 */                       i2++;
                            }
                        }
                    }
/* 330 */           return i;
                }

                /* JADX INFO: renamed from: F0 */
                public final int m9082F0(String str) {
/* 8 */             if (!m9118z0("event param", str)) {
/* 7 */                 return 3;
                    }
/* 16 */            if (!m9076B0("event param", null, null, str)) {
/* 18 */                return 14;
                    }
/* 25 */            ((ij3) this.f16749a).getClass();
                    return !m9077C0(40, "event param", str) ? 3 : 0;
                }

                /* JADX INFO: renamed from: G */
                public final Object m9083G(Object obj, String str) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 14 */            int iMax = 500;
/* 16 */            if ("_ev".equals(str)) {
/* 20 */                ij3Var.f9651d.getClass();
/* 27 */                return m9113t0(Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY), obj, true, true);
                    }
/* 36 */            if (m9067X(str)) {
/* 40 */                ij3Var.f9651d.getClass();
/* 43 */                iMax = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
                    } else {
/* 50 */                ij3Var.f9651d.getClass();
                    }
/* 54 */            return m9113t0(iMax, obj, false, true);
                }

                /* JADX INFO: renamed from: G0 */
                public final int m9084G0(String str) {
/* 8 */             if (!m9075A0("event param", str)) {
/* 7 */                 return 3;
                    }
/* 16 */            if (!m9076B0("event param", null, null, str)) {
/* 18 */                return 14;
                    }
/* 25 */            ((ij3) this.f16749a).getClass();
                    return !m9077C0(40, "event param", str) ? 3 : 0;
                }

                /* JADX INFO: renamed from: H */
                public final Bundle m9085H(String str, Bundle bundle, List list, boolean z) {
                    int iM9082F0;
/* 7 */             list = list;
/* 11 */            boolean zM9068Y = m9068Y(str, i13.f9406i);
/* 15 */            String str2 = null;
/* 16 */            if (bundle == null) {
/* 15 */                return null;
                    }
/* 20 */            Bundle bundle2 = new Bundle(bundle);
/* 26 */            ij3 ij3Var = (ij3) this.f16749a;
/* 28 */            pd3 pd3Var = ij3Var.f9651d;
/* 30 */            mh3 mh3Var = ij3Var.f9639U;
/* 36 */            up3 up3Var = ((ij3) pd3Var.f16749a).f9668w;
/* 38 */            ij3.m4553j(up3Var);
/* 54 */            int i = up3Var.m9102e0(201500000) ? 100 : 25;
/* 71 */            int i2 = 0;
/* 72 */            boolean z2 = false;
/* 78 */            for (String str3 : new TreeSet(bundle.keySet())) {
/* 86 */                if (list == null || !list.contains(str3)) {
/* 104 */                   iM9082F0 = !z ? m9082F0(str3) : 0;
/* 105 */                   if (iM9082F0 == 0) {
/* 107 */                       iM9082F0 = m9084G0(str3);
                            }
                        } else {
/* 95 */                    iM9082F0 = 0;
                        }
/* 111 */               if (iM9082F0 != 0) {
/* 119 */                   m9091L(bundle2, iM9082F0, str3, iM9082F0 == 3 ? str3 : str2);
/* 122 */                   bundle2.remove(str3);
                        } else {
/* 135 */                   int iM9081F = m9081F(str, str3, bundle.get(str3), bundle2, list, z, zM9068Y);
/* 141 */                   if (iM9081F == 17) {
/* 145 */                       m9091L(bundle2, 17, str3, Boolean.FALSE);
                            } else if (iM9081F != 0 && !"_ev".equals(str3)) {
/* 170 */                       m9091L(bundle2, iM9081F, iM9081F == 21 ? str : str3, bundle.get(str3));
/* 173 */                       bundle2.remove(str3);
                            }
/* 181 */                   if (m9074x0(str3)) {
/* 183 */                       i2++;
/* 185 */                       if (i2 > i) {
/* 195 */                           if (!ij3Var.f9651d.m7406J(str2, vg3.f18132f1) || !z2) {
/* 215 */                               StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
/* 220 */                               sb.append("Event can't contain more than ");
/* 223 */                               sb.append(i);
/* 228 */                               sb.append(" params");
/* 231 */                               String string = sb.toString();
/* 235 */                               uh3 uh3Var = ij3Var.f9655f;
/* 237 */                               ij3.m4555l(uh3Var);
/* 252 */                               uh3Var.f17540v.m8512c(mh3Var.m6656a(str), string, mh3Var.m6660e(bundle));
                                    }
/* 256 */                           m9073s0(5, bundle2);
/* 259 */                           bundle2.remove(str3);
/* 262 */                           z2 = true;
/* 266 */                           str2 = str2;
                                }
                            }
                        }
/* 125 */               str2 = str2;
/* 266 */               str2 = str2;
                    }
/* 274 */           return bundle2;
                }

                /* JADX INFO: renamed from: I */
                public final void m9086I(wh3 wh3Var, int i) {
/* 5 */             Bundle bundle = (Bundle) wh3Var.f18636e;
/* 18 */            int i2 = 0;
/* 19 */            boolean z = false;
/* 24 */            for (String str : new TreeSet(bundle.keySet())) {
/* 36 */                if (m9074x0(str) && (i2 = i2 + 1) > i) {
/* 44 */                    ij3 ij3Var = (ij3) this.f16749a;
/* 46 */                    pd3 pd3Var = ij3Var.f9651d;
/* 48 */                    mh3 mh3Var = ij3Var.f9639U;
/* 57 */                    if (!pd3Var.m7406J(null, vg3.f18132f1) || !z) {
/* 73 */                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
/* 78 */                        sb.append("Event can't contain more than ");
/* 81 */                        sb.append(i);
/* 86 */                        sb.append(" params");
/* 89 */                        String string = sb.toString();
/* 93 */                        uh3 uh3Var = ij3Var.f9655f;
/* 95 */                        ij3.m4555l(uh3Var);
/* 112 */                       uh3Var.f17540v.m8512c(mh3Var.m6656a((String) wh3Var.f18634c), string, mh3Var.m6660e(bundle));
/* 116 */                       m9073s0(5, bundle);
                            }
/* 119 */                   bundle.remove(str);
/* 122 */                   z = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: I0 */
                public final boolean m9087I0(String str, String str2, int i, Object obj) {
/* 1 */             if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
/* 87 */                return true;
                    }
/* 36 */            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
/* 35 */                return false;
                    }
/* 48 */            String string = obj.toString();
/* 60 */            if (string.codePointCount(0, string.length()) <= i) {
/* 87 */                return true;
                    }
/* 66 */            uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 68 */            ij3.m4555l(uh3Var);
/* 83 */            uh3Var.f17531V.m8513d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
/* 35 */            return false;
                }

                /* JADX INFO: renamed from: J */
                public final void m9088J(Parcelable[] parcelableArr, int i) {
/* 1 */             kb1.m6061n(parcelableArr);
/* 7 */             for (Parcelable parcelable : parcelableArr) {
/* 11 */                Bundle bundle = (Bundle) parcelable;
/* 26 */                int i2 = 0;
/* 27 */                boolean z = false;
/* 32 */                for (String str : new TreeSet(bundle.keySet())) {
/* 44 */                    if (m9074x0(str) && !m9068Y(str, j13.f12009s) && (i2 = i2 + 1) > i) {
/* 60 */                        ij3 ij3Var = (ij3) this.f16749a;
/* 62 */                        pd3 pd3Var = ij3Var.f9651d;
/* 64 */                        mh3 mh3Var = ij3Var.f9639U;
/* 73 */                        if (!pd3Var.m7406J(null, vg3.f18132f1) || !z) {
/* 77 */                            uh3 uh3Var = ij3Var.f9655f;
/* 79 */                            ij3.m4555l(uh3Var);
/* 82 */                            sh3 sh3Var = uh3Var.f17540v;
/* 96 */                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
/* 101 */                           sb.append("Param can't contain more than ");
/* 104 */                           sb.append(i);
/* 109 */                           sb.append(" item-scoped custom parameters");
/* 124 */                           sh3Var.m8512c(mh3Var.m6657b(str), sb.toString(), mh3Var.m6660e(bundle));
                                }
/* 129 */                       m9073s0(28, bundle);
/* 132 */                       bundle.remove(str);
/* 135 */                       z = true;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: J0 */
                public final void m9089J0(String str, String str2, Bundle bundle, List list, boolean z) {
                    int iM9082F0;
                    int iM9081F;
/* 7 */             list = list;
/* 9 */             if (bundle == null) {
/* 319 */               return;
                    }
/* 16 */            ij3 ij3Var = (ij3) this.f16749a;
/* 18 */            pd3 pd3Var = ij3Var.f9651d;
/* 20 */            uh3 uh3Var = ij3Var.f9655f;
/* 22 */            mh3 mh3Var = ij3Var.f9639U;
/* 28 */            up3 up3Var = ((ij3) pd3Var.f16749a).f9668w;
/* 30 */            ij3.m4553j(up3Var);
/* 47 */            int i = true != up3Var.m9102e0(231100000) ? 0 : 35;
/* 61 */            int i2 = 0;
/* 63 */            boolean z2 = false;
/* 69 */            for (String str3 : new TreeSet(bundle.keySet())) {
/* 77 */                if (list == null || !list.contains(str3)) {
/* 95 */                    iM9082F0 = !z ? m9082F0(str3) : 0;
/* 96 */                    if (iM9082F0 == 0) {
/* 98 */                        iM9082F0 = m9084G0(str3);
                            }
                        } else {
/* 86 */                    iM9082F0 = 0;
                        }
/* 103 */               if (iM9082F0 != 0) {
/* 109 */                   m9091L(bundle, iM9082F0, str3, iM9082F0 == 3 ? str3 : null);
/* 112 */                   bundle.remove(str3);
                        } else {
/* 127 */                   if (m9061H0(bundle.get(str3))) {
/* 129 */                       ij3.m4555l(uh3Var);
/* 138 */                       uh3Var.f17531V.m8513d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
/* 141 */                       iM9081F = 22;
                            } else {
/* 155 */                       iM9081F = m9081F(str, str3, bundle.get(str3), bundle, list, z, false);
                            }
/* 159 */                   if (iM9081F != 0 && !"_ev".equals(str3)) {
/* 173 */                       m9091L(bundle, iM9081F, str3, bundle.get(str3));
/* 176 */                       bundle.remove(str3);
                            } else if (m9074x0(str3) && !m9068Y(str3, j13.f12009s)) {
/* 195 */                       int i3 = i2 + 1;
/* 201 */                       if (!m9102e0(231100000)) {
/* 203 */                           ij3.m4555l(uh3Var);
/* 218 */                           uh3Var.f17540v.m8512c(mh3Var.m6656a(str), "Item array not supported on client's version of Google Play Services (Android Only)", mh3Var.m6660e(bundle));
/* 223 */                           m9073s0(23, bundle);
/* 226 */                           bundle.remove(str3);
                                } else if (i3 > i) {
/* 240 */                           if (!ij3Var.f9651d.m7406J(null, vg3.f18132f1) || !z2) {
/* 244 */                               ij3.m4555l(uh3Var);
/* 247 */                               sh3 sh3Var = uh3Var.f17540v;
/* 261 */                               StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
/* 266 */                               sb.append("Item can't contain more than ");
/* 269 */                               sb.append(i);
/* 274 */                               sb.append(" item-scoped custom params");
/* 289 */                               sh3Var.m8512c(mh3Var.m6656a(str), sb.toString(), mh3Var.m6660e(bundle));
                                    }
/* 294 */                           m9073s0(28, bundle);
/* 297 */                           bundle.remove(str3);
/* 300 */                           list = list;
/* 302 */                           i2 = i3;
/* 305 */                           z2 = true;
                                }
/* 311 */                       i2 = i3;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: K */
                public final void m9090K(Bundle bundle, Bundle bundle2) {
/* 1 */             if (bundle2 == null) {
/* 47 */                return;
                    }
/* 16 */            for (String str : bundle2.keySet()) {
/* 28 */                if (!bundle.containsKey(str)) {
/* 34 */                    up3 up3Var = ((ij3) this.f16749a).f9668w;
/* 36 */                    ij3.m4553j(up3Var);
/* 43 */                    up3Var.m9094O(bundle2.get(str), str, bundle);
                        }
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m9091L(Bundle bundle, int i, String str, Object obj) {
/* 5 */             if (m9073s0(i, bundle)) {
/* 11 */                ((ij3) this.f16749a).getClass();
/* 23 */                bundle.putString("_ev", m9060E(40, str, true));
/* 26 */                if (obj != null) {
/* 30 */                    if ((obj instanceof String) || (obj instanceof CharSequence)) {
/* 47 */                        bundle.putLong("_el", obj.toString().length());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: M */
                public final int m9092M(Object obj, String str) {
                    return "_ldl".equals(str) ? m9087I0("user property referrer", str, m9114u0(str), obj) : m9087I0("user property", str, m9114u0(str), obj) ? 0 : 7;
                }

                /* JADX INFO: renamed from: N */
                public final Object m9093N(Object obj, String str) {
                    return "_ldl".equals(str) ? m9113t0(m9114u0(str), obj, true, false) : m9113t0(m9114u0(str), obj, false, false);
                }

                /* JADX INFO: renamed from: O */
                public final void m9094O(Object obj, String str, Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 90 */                return;
                    }
/* 6 */             if (obj instanceof Long) {
/* 14 */                bundle.putLong(str, ((Long) obj).longValue());
/* 17 */                return;
                    }
/* 20 */            if (obj instanceof String) {
/* 26 */                bundle.putString(str, String.valueOf(obj));
/* 29 */                return;
                    }
/* 32 */            if (obj instanceof Double) {
/* 40 */                bundle.putDouble(str, ((Double) obj).doubleValue());
/* 43 */                return;
                    }
/* 46 */            if (obj instanceof Bundle[]) {
/* 50 */                bundle.putParcelableArray(str, (Bundle[]) obj);
/* 53 */                return;
                    }
/* 54 */            if (str != null) {
/* 67 */                String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
/* 70 */                ij3 ij3Var = (ij3) this.f16749a;
/* 72 */                uh3 uh3Var = ij3Var.f9655f;
/* 74 */                ij3.m4555l(uh3Var);
/* 87 */                uh3Var.f17531V.m8512c(ij3Var.f9639U.m6657b(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
                    }
                }

                /* JADX INFO: renamed from: T */
                public final pd1 m9095T() {
                    rd1 od1Var;
                    Object objInvoke;
/* 3 */             if (this.f17628f == null) {
/* 9 */                 Context context = ((ij3) this.f16749a).f9645a;
/* 11 */                context.getClass();
/* 14 */                int i = Build.VERSION.SDK_INT;
/* 16 */                C1950n3 c1950n3 = C1950n3.f14107a;
/* 20 */                if (i >= 33) {
/* 22 */                    c1950n3.m6853a();
                        }
/* 25 */                int i2 = 0;
/* 36 */                if ((i >= 33 ? c1950n3.m6853a() : 0) >= 5) {
/* 44 */                    Object systemService = context.getSystemService((Class<Object>) AbstractC0954gh.m3935k());
/* 48 */                    systemService.getClass();
/* 55 */                    od1Var = new od1(AbstractC0954gh.m3928d(systemService));
                        } else {
/* 59 */                    C1913m3 c1913m3 = C1913m3.f13549a;
/* 78 */                    if (((i == 31 || i == 32) ? c1913m3.m6593a() : 0) >= 9) {
                                try {
/* 85 */                            objInvoke = new nd1(context, i2).invoke(context);
                                } catch (NoClassDefFoundError unused) {
/* 90 */                            int i3 = Build.VERSION.SDK_INT;
/* 92 */                            if (i3 == 31 || i3 == 32) {
/* 96 */                                c1913m3.m6593a();
                                    }
/* 99 */                            objInvoke = null;
                                }
/* 101 */                       od1Var = (rd1) objInvoke;
                            } else {
/* 104 */                       od1Var = null;
                            }
                        }
/* 112 */               this.f17628f = od1Var != null ? new pd1(od1Var) : null;
                    }
/* 114 */           return this.f17628f;
                }

                /* JADX INFO: renamed from: U */
                public final long m9096U() {
                    long j;
                    Object e;
                    Integer num;
/* 1 */             mo1375y();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             ih3 ih3VarM4569q = ij3Var.m4569q();
/* 12 */            uh3 uh3Var = ij3Var.f9655f;
/* 24 */            if (!m9066V(ih3VarM4569q.m4534F())) {
/* 22 */                return 0L;
                    }
/* 27 */            int i = Build.VERSION.SDK_INT;
/* 29 */            boolean zBooleanValue = false;
/* 30 */            Integer num2 = null;
/* 33 */            if (i < 30) {
/* 35 */                j = 4;
                    } else if (SdkExtensions.getExtensionVersion(30) < 4) {
/* 45 */                j = 8;
                    } else {
/* 80 */                j = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) vg3.f18148l0.m9011a(null)).intValue() ? 16L : 0L;
                    }
/* 87 */            if (!m9097W("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
/* 91 */                j |= 2;
                    }
/* 94 */            if (j == 0) {
/* 98 */                if (this.f17629i != null) {
/* 185 */                   zBooleanValue = this.f17629i.booleanValue();
                        } else {
/* 100 */                   pd1 pd1VarM9095T = m9095T();
/* 104 */                   if (pd1VarM9095T != null) {
                                try {
/* 119 */                           num = (Integer) pd1VarM9095T.m7391b().get(10000L, TimeUnit.MILLISECONDS);
/* 121 */                           if (num != null) {
                                        try {
/* 128 */                                   if (num.intValue() == 1) {
/* 130 */                                       zBooleanValue = true;
                                            }
                                        } catch (InterruptedException e2) {
/* 134 */                                   e = e2;
/* 147 */                                   num2 = num;
/* 158 */                                   ij3.m4555l(uh3Var);
/* 165 */                                   uh3Var.f17541w.m8511b(e, "Measurement manager api exception");
/* 170 */                                   this.f17629i = Boolean.FALSE;
/* 172 */                                   num = num2;
                                        } catch (CancellationException e3) {
/* 138 */                                   e = e3;
/* 147 */                                   num2 = num;
/* 158 */                                   ij3.m4555l(uh3Var);
/* 165 */                                   uh3Var.f17541w.m8511b(e, "Measurement manager api exception");
/* 170 */                                   this.f17629i = Boolean.FALSE;
/* 172 */                                   num = num2;
                                        } catch (ExecutionException e4) {
/* 136 */                                   e = e4;
/* 147 */                                   num2 = num;
/* 158 */                                   ij3.m4555l(uh3Var);
/* 165 */                                   uh3Var.f17541w.m8511b(e, "Measurement manager api exception");
/* 170 */                                   this.f17629i = Boolean.FALSE;
/* 172 */                                   num = num2;
                                        } catch (TimeoutException e5) {
/* 132 */                                   e = e5;
/* 147 */                                   num2 = num;
/* 158 */                                   ij3.m4555l(uh3Var);
/* 165 */                                   uh3Var.f17541w.m8511b(e, "Measurement manager api exception");
/* 170 */                                   this.f17629i = Boolean.FALSE;
/* 172 */                                   num = num2;
                                        }
                                    }
/* 144 */                           this.f17629i = Boolean.valueOf(zBooleanValue);
                                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
/* 150 */                           e = e6;
                                }
/* 173 */                       ij3.m4555l(uh3Var);
/* 180 */                       uh3Var.f17534Y.m8511b(num, "Measurement manager api status result");
/* 185 */                       zBooleanValue = this.f17629i.booleanValue();
                            }
                        }
/* 189 */               if (!zBooleanValue) {
/* 191 */                   j = 64;
                        }
                    }
/* 195 */           if (j == 0) {
/* 197 */               return 1L;
                    }
/* 200 */           return j;
                }

                /* JADX INFO: renamed from: W */
                public final boolean m9097W(String str) {
/* 1 */             mo1375y();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 20 */            if (g93.m3898a(ij3Var.f9645a).f17850a.checkCallingOrSelfPermission(str) == 0) {
/* 22 */                return true;
                    }
/* 24 */            uh3 uh3Var = ij3Var.f9655f;
/* 26 */            ij3.m4555l(uh3Var);
/* 33 */            uh3Var.f17533X.m8511b(str, "Permission not granted");
/* 36 */            return false;
                }

                /* JADX INFO: renamed from: Z */
                public final boolean m9098Z(String str, String str2) {
/* 5 */             if (!TextUtils.isEmpty(str2)) {
/* 7 */                 return true;
                    }
/* 13 */            if (TextUtils.isEmpty(str)) {
/* 15 */                return false;
                    }
/* 29 */            return ((ij3) this.f16749a).f9651d.m7400D("debug.firebase.analytics.app").equals(str);
                }

                /* JADX INFO: renamed from: a0 */
                public final Bundle m9099a0(Bundle bundle) {
/* 3 */             Bundle bundle2 = new Bundle();
/* 6 */             if (bundle != null) {
/* 20 */                for (String str : bundle.keySet()) {
/* 32 */                    Object objM9083G = m9083G(bundle.get(str), str);
/* 36 */                    if (objM9083G == null) {
/* 40 */                        ij3 ij3Var = (ij3) this.f16749a;
/* 42 */                        uh3 uh3Var = ij3Var.f9655f;
/* 44 */                        ij3.m4555l(uh3Var);
/* 57 */                        uh3Var.f17531V.m8511b(ij3Var.f9639U.m6657b(str), "Param value can't be null");
                            } else {
/* 61 */                        m9094O(objM9083G, str, bundle2);
                            }
                        }
                    }
/* 65 */            return bundle2;
                }

                /* JADX INFO: renamed from: b0 */
                public final zzbg m9100b0(String str, Bundle bundle, String str2, long j, boolean z) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 13 */            if (m9079D0(str) != 0) {
/* 67 */                ij3 ij3Var = (ij3) this.f16749a;
/* 69 */                uh3 uh3Var = ij3Var.f9655f;
/* 71 */                ij3.m4555l(uh3Var);
/* 84 */                uh3Var.f17538f.m8511b(ij3Var.f9639U.m6658c(str), "Invalid conditional property event name");
/* 87 */                f42.m3649e();
/* 5 */                 return null;
                    }
/* 25 */            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 30 */            bundle2.putString("_o", str2);
/* 38 */            Bundle bundleM9085H = m9085H(str, bundle2, Collections.singletonList("_o"), true);
/* 42 */            if (z) {
/* 44 */                bundleM9085H = m9099a0(bundleM9085H);
                    }
/* 48 */            kb1.m6061n(bundleM9085H);
/* 61 */            return new zzbg(str, new zzbe(bundleM9085H), str2, j);
                }

                /* JADX INFO: renamed from: c0 */
                public final boolean m9101c0(Context context, String str) {
                    Signature[] signatureArr;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 9 */             X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
                    try {
/* 18 */                PackageInfo packageInfoM9214c = g93.m3898a(context).m9214c(64, str);
/* 22 */                if (packageInfoM9214c == null || (signatureArr = packageInfoM9214c.signatures) == null || signatureArr.length <= 0) {
/* 93 */                    return true;
                        }
/* 59 */                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                    } catch (PackageManager.NameNotFoundException e) {
/* 68 */                uh3 uh3Var = ij3Var.f9655f;
/* 70 */                ij3.m4555l(uh3Var);
/* 77 */                uh3Var.f17538f.m8511b(e, "Package name not found");
/* 93 */                return true;
                    } catch (CertificateException e2) {
/* 81 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 83 */                ij3.m4555l(uh3Var2);
/* 90 */                uh3Var2.f17538f.m8511b(e2, "Error obtaining certificate");
/* 93 */                return true;
                    }
                }

                /* JADX INFO: renamed from: e0 */
                public final boolean m9102e0(int i) {
/* 9 */             Boolean bool = ((ij3) this.f16749a).m4567o().f15189e;
/* 17 */            if (m9103f0() < i / 1000) {
                        return (bool == null || bool.booleanValue()) ? false : true;
                    }
/* 30 */            return true;
                }

                /* JADX INFO: renamed from: f0 */
                public final int m9103f0() {
/* 3 */             if (this.f17630v == null) {
/* 7 */                 ij3 ij3Var = (ij3) this.f16749a;
/* 9 */                 qr0 qr0Var = qr0.f15712b;
/* 11 */                Context context = ij3Var.f9645a;
/* 13 */                qr0Var.getClass();
/* 16 */                int i = wr0.f18787e;
/* 18 */                int i2 = 0;
                        try {
/* 29 */                    i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
/* 36 */                    AbstractC1245n0.m4889q("GooglePlayServicesUtil", "Google Play services is missing.");
                        }
/* 45 */                this.f17630v = Integer.valueOf(i2 / 1000);
                    }
/* 49 */            return this.f17630v.intValue();
                }

                /* JADX INFO: renamed from: g0 */
                public final void m9104g0(Bundle bundle, long j) {
/* 3 */             long j2 = bundle.getLong("_et");
/* 11 */            if (j2 != 0) {
/* 17 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 19 */                ij3.m4555l(uh3Var);
/* 30 */                uh3Var.f17541w.m8511b(Long.valueOf(j2), "Params already contained engagement");
                    } else {
/* 34 */                j2 = 0;
                    }
/* 36 */            bundle.putLong("_et", j + j2);
                }

                /* JADX INFO: renamed from: h0 */
                public final void m9105h0(String str, zzcu zzcuVar) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putString("r", str);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning string value to wrapper");
                    }
                }

                /* JADX INFO: renamed from: i0 */
                public final void m9106i0(zzcu zzcuVar, long j) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putLong("r", j);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning long value to wrapper");
                    }
                }

                /* JADX INFO: renamed from: j0 */
                public final void m9107j0(zzcu zzcuVar, int i) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putInt("r", i);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning int value to wrapper");
                    }
                }

                /* JADX INFO: renamed from: k0 */
                public final void m9108k0(zzcu zzcuVar, byte[] bArr) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putByteArray("r", bArr);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning byte array to wrapper");
                    }
                }

                /* JADX INFO: renamed from: l0 */
                public final void m9109l0(zzcu zzcuVar, boolean z) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putBoolean("r", z);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning boolean value to wrapper");
                    }
                }

                /* JADX INFO: renamed from: m0 */
                public final void m9110m0(zzcu zzcuVar, Bundle bundle) {
                    try {
/* 1 */                 zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 10 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 12 */                ij3.m4555l(uh3Var);
/* 19 */                uh3Var.f17541w.m8511b(e, "Error returning bundle value to wrapper");
                    }
                }

                /* JADX INFO: renamed from: n0 */
                public final void m9111n0(zzcu zzcuVar, ArrayList arrayList) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putParcelableArrayList("r", arrayList);
                    try {
/* 11 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17541w.m8511b(e, "Error returning bundle list to wrapper");
                    }
                }

                /* JADX INFO: renamed from: r0 */
                public final String m9112r0() {
/* 3 */             byte[] bArr = new byte[16];
/* 9 */             m9116w0().nextBytes(bArr);
/* 26 */            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
                }

                /* JADX INFO: renamed from: t0 */
                public final Object m9113t0(int i, Object obj, boolean z, boolean z2) {
/* 1 */             if (obj == null) {
/* 169 */               return null;
                    }
/* 7 */             if ((obj instanceof Long) || (obj instanceof Double)) {
/* 13 */                return obj;
                    }
/* 16 */            if (obj instanceof Integer) {
/* 25 */                return Long.valueOf(((Integer) obj).intValue());
                    }
/* 32 */            if (obj instanceof Byte) {
/* 41 */                return Long.valueOf(((Byte) obj).byteValue());
                    }
/* 48 */            if (obj instanceof Short) {
/* 57 */                return Long.valueOf(((Short) obj).shortValue());
                    }
/* 64 */            if (obj instanceof Boolean) {
/* 80 */                return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                    }
/* 87 */            if (obj instanceof Float) {
/* 95 */                return Double.valueOf(((Float) obj).doubleValue());
                    }
/* 102 */           if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
/* 175 */               return m9060E(i, obj.toString(), z);
                    }
/* 113 */           if (!z2) {
/* 169 */               return null;
                    }
/* 117 */           if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
/* 169 */               return null;
                    }
/* 125 */           ArrayList arrayList = new ArrayList();
/* 132 */           for (Parcelable parcelable : (Parcelable[]) obj) {
/* 138 */               if (parcelable instanceof Bundle) {
/* 142 */                   Bundle bundleM9099a0 = m9099a0((Bundle) parcelable);
/* 150 */                   if (!bundleM9099a0.isEmpty()) {
/* 152 */                       arrayList.add(bundleM9099a0);
                            }
                        }
                    }
/* 164 */           return arrayList.toArray(new Bundle[arrayList.size()]);
                }

                /* JADX INFO: renamed from: u0 */
                public final int m9114u0(String str) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 11 */            if ("_ldl".equals(str)) {
/* 13 */                ij3Var.getClass();
/* 16 */                return 2048;
                    }
/* 25 */            if ("_id".equals(str)) {
/* 27 */                ij3Var.getClass();
/* 30 */                return NotificationCompat.FLAG_LOCAL_ONLY;
                    }
/* 39 */            if ("_lgclid".equals(str)) {
/* 41 */                ij3Var.getClass();
/* 44 */                return 100;
                    }
/* 47 */            ij3Var.getClass();
/* 50 */            return 36;
                }

                /* JADX INFO: renamed from: v0 */
                public final long m9115v0() {
                    long andIncrement;
                    long j;
/* 1 */             AtomicLong atomicLong = this.f17626d;
/* 11 */            if (atomicLong.get() != 0) {
/* 54 */                AtomicLong atomicLong2 = this.f17626d;
                        synchronized (atomicLong2) {
/* 61 */                    atomicLong2.compareAndSet(-1L, 1L);
/* 64 */                    andIncrement = atomicLong2.getAndIncrement();
                        }
/* 69 */                return andIncrement;
                    }
                    synchronized (atomicLong) {
/* 16 */                long jNanoTime = System.nanoTime();
/* 26 */                ((ij3) this.f16749a).f9640V.getClass();
/* 37 */                long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
/* 43 */                int i = this.f17627e + 1;
/* 45 */                this.f17627e = i;
/* 48 */                j = jNextLong + ((long) i);
                    }
/* 50 */            return j;
                }

                /* JADX INFO: renamed from: w0 */
                public final SecureRandom m9116w0() {
/* 1 */             mo1375y();
/* 6 */             if (this.f17625c == null) {
/* 13 */                this.f17625c = new SecureRandom();
                    }
/* 15 */            return this.f17625c;
                }

                /* JADX INFO: renamed from: y0 */
                public final Bundle m9117y0(Uri uri) {
                    String queryParameter;
                    String queryParameter2;
                    String queryParameter3;
                    String queryParameter4;
                    String queryParameter5;
                    String queryParameter6;
                    String queryParameter7;
                    String queryParameter8;
                    String queryParameter9;
/* 4 */             if (uri != null) {
                        try {
/* 20 */                    if (uri.isHierarchical()) {
/* 24 */                        queryParameter = uri.getQueryParameter("utm_campaign");
/* 30 */                        queryParameter2 = uri.getQueryParameter("utm_source");
/* 36 */                        queryParameter3 = uri.getQueryParameter("utm_medium");
/* 40 */                        queryParameter4 = uri.getQueryParameter("gclid");
/* 44 */                        queryParameter5 = uri.getQueryParameter("gbraid");
/* 50 */                        queryParameter6 = uri.getQueryParameter("utm_id");
/* 54 */                        queryParameter7 = uri.getQueryParameter("dclid");
/* 58 */                        queryParameter8 = uri.getQueryParameter("srsltid");
/* 62 */                        queryParameter9 = uri.getQueryParameter("sfmc_id");
                            } else {
/* 72 */                        queryParameter = null;
/* 73 */                        queryParameter2 = null;
/* 74 */                        queryParameter3 = null;
/* 75 */                        queryParameter4 = null;
/* 76 */                        queryParameter5 = null;
/* 77 */                        queryParameter6 = null;
/* 78 */                        queryParameter7 = null;
/* 79 */                        queryParameter8 = null;
/* 80 */                        queryParameter9 = null;
                            }
/* 85 */                    if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
/* 3 */                         return null;
                            }
/* 139 */                   Bundle bundle = new Bundle();
/* 146 */                   if (!TextUtils.isEmpty(queryParameter)) {
/* 152 */                       bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, queryParameter);
                            }
/* 162 */                   if (!TextUtils.isEmpty(queryParameter2)) {
/* 166 */                       bundle.putString(FirebaseAnalytics.Param.SOURCE, queryParameter2);
                            }
/* 173 */                   if (!TextUtils.isEmpty(queryParameter3)) {
/* 177 */                       bundle.putString(FirebaseAnalytics.Param.MEDIUM, queryParameter3);
                            }
/* 184 */                   if (!TextUtils.isEmpty(queryParameter4)) {
/* 186 */                       bundle.putString("gclid", queryParameter4);
                            }
/* 193 */                   if (!TextUtils.isEmpty(queryParameter5)) {
/* 195 */                       bundle.putString("gbraid", queryParameter5);
                            }
/* 200 */                   String queryParameter10 = uri.getQueryParameter("gad_source");
/* 208 */                   if (!TextUtils.isEmpty(queryParameter10)) {
/* 210 */                       bundle.putString("gad_source", queryParameter10);
                            }
/* 215 */                   String queryParameter11 = uri.getQueryParameter("utm_term");
/* 223 */                   if (!TextUtils.isEmpty(queryParameter11)) {
/* 227 */                       bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
                            }
/* 232 */                   String queryParameter12 = uri.getQueryParameter("utm_content");
/* 240 */                   if (!TextUtils.isEmpty(queryParameter12)) {
/* 244 */                       bundle.putString("content", queryParameter12);
                            }
/* 249 */                   String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
/* 257 */                   if (!TextUtils.isEmpty(queryParameter13)) {
/* 259 */                       bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
                            }
/* 264 */                   String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
/* 272 */                   if (!TextUtils.isEmpty(queryParameter14)) {
/* 274 */                       bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
                            }
/* 279 */                   String queryParameter15 = uri.getQueryParameter("anid");
/* 287 */                   if (!TextUtils.isEmpty(queryParameter15)) {
/* 289 */                       bundle.putString("anid", queryParameter15);
                            }
/* 296 */                   if (!TextUtils.isEmpty(queryParameter6)) {
/* 300 */                       bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
                            }
/* 307 */                   if (!TextUtils.isEmpty(queryParameter7)) {
/* 309 */                       bundle.putString("dclid", queryParameter7);
                            }
/* 314 */                   String queryParameter16 = uri.getQueryParameter("utm_source_platform");
/* 322 */                   if (!TextUtils.isEmpty(queryParameter16)) {
/* 326 */                       bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
                            }
/* 331 */                   String queryParameter17 = uri.getQueryParameter("utm_creative_format");
/* 339 */                   if (!TextUtils.isEmpty(queryParameter17)) {
/* 343 */                       bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
                            }
/* 348 */                   String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
/* 356 */                   if (!TextUtils.isEmpty(queryParameter18)) {
/* 360 */                       bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
                            }
/* 367 */                   if (!TextUtils.isEmpty(queryParameter8)) {
/* 369 */                       bundle.putString("srsltid", queryParameter8);
                            }
/* 376 */                   if (!TextUtils.isEmpty(queryParameter9)) {
/* 380 */                       bundle.putString("sfmc_id", queryParameter9);
                            }
/* 395 */                   for (String str : uri.getQueryParameterNames()) {
/* 409 */                       if (str.startsWith("gad_")) {
/* 411 */                           String queryParameter19 = uri.getQueryParameter(str);
/* 419 */                           if (!TextUtils.isEmpty(queryParameter19)) {
/* 421 */                               bundle.putString(str, queryParameter19);
                                    }
                                }
                            }
/* 425 */                   return bundle;
                        } catch (UnsupportedOperationException e) {
/* 430 */                   uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 432 */                   ij3.m4555l(uh3Var);
/* 439 */                   uh3Var.f17541w.m8511b(e, "Install referrer url isn't a hierarchical URI");
                        }
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: z0 */
                public final boolean m9118z0(String str, String str2) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             if (str2 == null) {
/* 8 */                 uh3 uh3Var = ij3Var.f9655f;
/* 10 */                ij3.m4555l(uh3Var);
/* 17 */                uh3Var.f17540v.m8511b(str, "Name is required and can't be null. Type");
/* 5 */                 return false;
                    }
/* 25 */            if (str2.length() == 0) {
/* 27 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 29 */                ij3.m4555l(uh3Var2);
/* 36 */                uh3Var2.f17540v.m8511b(str, "Name is required and can't be empty. Type");
/* 5 */                 return false;
                    }
/* 40 */            int iCodePointAt = str2.codePointAt(0);
/* 48 */            if (!Character.isLetter(iCodePointAt)) {
/* 50 */                uh3 uh3Var3 = ij3Var.f9655f;
/* 52 */                ij3.m4555l(uh3Var3);
/* 59 */                uh3Var3.f17540v.m8512c(str, "Name must start with a letter. Type, name", str2);
/* 5 */                 return false;
                    }
/* 63 */            int length = str2.length();
/* 67 */            int iCharCount = Character.charCount(iCodePointAt);
/* 71 */            while (iCharCount < length) {
/* 73 */                int iCodePointAt2 = str2.codePointAt(iCharCount);
/* 79 */                if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
/* 88 */                    uh3 uh3Var4 = ij3Var.f9655f;
/* 90 */                    ij3.m4555l(uh3Var4);
/* 97 */                    uh3Var4.f17540v.m8512c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
/* 5 */                     return false;
                        }
/* 105 */               iCharCount += Character.charCount(iCodePointAt2);
                    }
/* 107 */           return true;
                }
            }
