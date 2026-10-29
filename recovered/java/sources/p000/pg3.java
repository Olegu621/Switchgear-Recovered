            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.content.pm.ResolveInfo;
            import android.content.pm.Signature;
            import android.graphics.Path;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Log;
            import com.google.android.gms.common.Feature;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1636q5;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.TreeMap;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class pg3 {

                /* JADX INFO: renamed from: a */
                public static final ec0 f15114a = new ec0(6);

                /* JADX INFO: renamed from: b */
                public static final byte[] f15115b = {112, 114, 111, 0};

                /* JADX INFO: renamed from: c */
                public static final byte[] f15116c = {112, 114, 109, 0};

                /* JADX INFO: renamed from: d */
                public static final Feature f15117d;

                /* JADX INFO: renamed from: e */
                public static final Feature f15118e;

                /* JADX INFO: renamed from: f */
                public static final Feature[] f15119f;

                static {
/* 30 */            Feature feature = new Feature("EXECUTE", 1L);
/* 33 */            f15117d = feature;
/* 39 */            Feature feature2 = new Feature("INIT", 1L);
/* 42 */            f15118e = feature2;
/* 48 */            f15119f = new Feature[]{feature, feature2};
                }

                public pg3(ec0 ec0Var) {
                }

                /* JADX INFO: renamed from: A */
                public static final void m7417A(Object obj) {
/* 3 */             if (obj instanceof n42) {
/* 10 */                throw ((n42) obj).f14120a;
                    }
                }

                /* JADX INFO: renamed from: B */
                public static boolean m7418B(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, h80[] h80VarArr) throws IOException {
                    int length;
/* 7 */             byte[] bArr2 = qj3.f15585f;
/* 9 */             byte[] bArr3 = qj3.f15584e;
/* 11 */            byte[] bArr4 = qj3.f15581b;
/* 18 */            int i = 0;
/* 20 */            if (Arrays.equals(bArr, bArr4)) {
/* 25 */                ArrayList arrayList = new ArrayList(3);
/* 30 */                ArrayList arrayList2 = new ArrayList(3);
/* 35 */                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
/* 39 */                    jb1.m5741G(byteArrayOutputStream2, h80VarArr.length);
/* 42 */                    int i2 = 2;
/* 44 */                    int i3 = 2;
/* 46 */                    for (h80 h80Var : h80VarArr) {
/* 52 */                        jb1.m5740F(byteArrayOutputStream2, h80Var.f8954c, 4);
/* 57 */                        jb1.m5740F(byteArrayOutputStream2, h80Var.f8955d, 4);
/* 63 */                        jb1.m5740F(byteArrayOutputStream2, h80Var.f8958g, 4);
/* 70 */                        String strM7431j = m7431j(bArr4, h80Var.f8952a, h80Var.f8953b);
/* 76 */                        Charset charset = StandardCharsets.UTF_8;
/* 82 */                        int length2 = strM7431j.getBytes(charset).length;
/* 83 */                        jb1.m5741G(byteArrayOutputStream2, length2);
/* 86 */                        i3 = i3 + 14 + length2;
/* 91 */                        byteArrayOutputStream2.write(strM7431j.getBytes(charset));
                            }
/* 102 */                   byte[] byteArray = byteArrayOutputStream2.toByteArray();
/* 111 */                   if (i3 != byteArray.length) {
/* 565 */                       throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                            }
/* 115 */                   h93 h93Var = new h93(1, byteArray, false);
/* 118 */                   byteArrayOutputStream2.close();
/* 121 */                   arrayList.add(h93Var);
/* 126 */                   ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
/* 129 */                   int i4 = 0;
/* 130 */                   int i5 = 0;
/* 132 */                   while (i4 < h80VarArr.length) {
                                try {
/* 134 */                           h80 h80Var2 = h80VarArr[i4];
/* 136 */                           jb1.m5741G(byteArrayOutputStream3, i4);
/* 143 */                           jb1.m5741G(byteArrayOutputStream3, h80Var2.f8956e);
/* 149 */                           i5 = i5 + 4 + (h80Var2.f8956e * i2);
/* 150 */                           int[] iArr = h80Var2.f8959h;
/* 152 */                           int length3 = iArr.length;
/* 153 */                           int i6 = i;
/* 155 */                           int i7 = i2;
/* 157 */                           int i8 = i6;
/* 159 */                           while (i8 < length3) {
/* 161 */                               int i9 = iArr[i8];
/* 165 */                               jb1.m5741G(byteArrayOutputStream3, i9 - i6);
/* 168 */                               i8++;
/* 170 */                               i6 = i9;
                                    }
/* 174 */                           i4++;
/* 176 */                           i2 = i7;
/* 178 */                           i = 0;
                                } catch (Throwable th) {
                                    try {
/* 529 */                               byteArrayOutputStream3.close();
/* 537 */                               throw th;
                                    } catch (Throwable th2) {
/* 534 */                               th.addSuppressed(th2);
/* 537 */                               throw th;
                                    }
                                }
                            }
/* 187 */                   byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
/* 192 */                   if (i5 != byteArray2.length) {
/* 528 */                       throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                            }
/* 196 */                   h93 h93Var2 = new h93(3, byteArray2, true);
/* 199 */                   byteArrayOutputStream3.close();
/* 202 */                   arrayList.add(h93Var2);
/* 207 */                   ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
/* 210 */                   int i10 = 0;
/* 211 */                   int i11 = 0;
/* 213 */                   while (i10 < h80VarArr.length) {
                                try {
/* 215 */                           h80 h80Var3 = h80VarArr[i10];
/* 223 */                           Iterator it = h80Var3.f8960i.entrySet().iterator();
/* 227 */                           int iIntValue = 0;
/* 232 */                           while (it.hasNext()) {
/* 250 */                               iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                    }
/* 254 */                           ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                    try {
/* 257 */                               m7420D(byteArrayOutputStream5, h80Var3);
/* 260 */                               byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
/* 264 */                               byteArrayOutputStream5.close();
/* 269 */                               ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                                        try {
/* 272 */                                   m7421E(byteArrayOutputStream6, h80Var3);
/* 275 */                                   byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
/* 279 */                                   byteArrayOutputStream6.close();
/* 282 */                                   jb1.m5741G(byteArrayOutputStream4, i10);
/* 289 */                                   int length4 = byteArray3.length + 2 + byteArray4.length;
/* 290 */                                   int i12 = i11 + 6;
/* 292 */                                   int i13 = i10;
/* 296 */                                   jb1.m5740F(byteArrayOutputStream4, length4, 4);
/* 299 */                                   jb1.m5741G(byteArrayOutputStream4, iIntValue);
/* 302 */                                   byteArrayOutputStream4.write(byteArray3);
/* 305 */                                   byteArrayOutputStream4.write(byteArray4);
/* 308 */                                   i11 = i12 + length4;
/* 310 */                                   i10 = i13 + 1;
                                        } catch (Throwable th3) {
                                            try {
/* 319 */                                       byteArrayOutputStream6.close();
/* 327 */                                       throw th3;
                                            } catch (Throwable th4) {
/* 324 */                                       th3.addSuppressed(th4);
/* 327 */                                       throw th3;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        try {
/* 330 */                                   byteArrayOutputStream5.close();
/* 338 */                                   throw th5;
                                        } catch (Throwable th6) {
/* 335 */                                   th5.addSuppressed(th6);
/* 338 */                                   throw th5;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    try {
/* 492 */                               byteArrayOutputStream4.close();
/* 500 */                               throw th7;
                                    } catch (Throwable th8) {
/* 497 */                               th7.addSuppressed(th8);
/* 500 */                               throw th7;
                                    }
                                }
                            }
/* 339 */                   byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
/* 344 */                   if (i11 != byteArray5.length) {
/* 491 */                       throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                            }
/* 348 */                   h93 h93Var3 = new h93(4, byteArray5, true);
/* 351 */                   byteArrayOutputStream4.close();
/* 354 */                   arrayList.add(h93Var3);
/* 366 */                   long size = 12 + ((long) (arrayList.size() * 16));
/* 372 */                   jb1.m5740F(byteArrayOutputStream, arrayList.size(), 4);
/* 380 */                   for (int i14 = 0; i14 < arrayList.size(); i14++) {
/* 386 */                       h93 h93Var4 = (h93) arrayList.get(i14);
/* 388 */                       int i15 = h93Var4.f8975a;
/* 390 */                       byte[] bArr5 = h93Var4.f8976b;
/* 396 */                       jb1.m5740F(byteArrayOutputStream, AbstractC0886en.m3501e(i15), 4);
/* 399 */                       jb1.m5740F(byteArrayOutputStream, size, 4);
/* 404 */                       if (h93Var4.f8977c) {
/* 406 */                           long length5 = bArr5.length;
/* 408 */                           byte[] bArrM5755o = jb1.m5755o(bArr5);
/* 412 */                           arrayList2.add(bArrM5755o);
/* 417 */                           jb1.m5740F(byteArrayOutputStream, bArrM5755o.length, 4);
/* 420 */                           jb1.m5740F(byteArrayOutputStream, length5, 4);
/* 423 */                           length = bArrM5755o.length;
                                } else {
/* 427 */                           arrayList2.add(bArr5);
/* 432 */                           jb1.m5740F(byteArrayOutputStream, bArr5.length, 4);
/* 437 */                           jb1.m5740F(byteArrayOutputStream, 0L, 4);
/* 440 */                           length = bArr5.length;
                                }
/* 425 */                       size += (long) length;
                            }
/* 450 */                   for (int i16 = 0; i16 < arrayList2.size(); i16++) {
/* 458 */                       byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                            }
                        } catch (Throwable th9) {
                            try {
/* 566 */                       byteArrayOutputStream2.close();
/* 574 */                       throw th9;
                            } catch (Throwable th10) {
/* 571 */                       th9.addSuppressed(th10);
/* 574 */                       throw th9;
                            }
                        }
                    } else {
/* 575 */               byte[] bArr6 = qj3.f15582c;
/* 581 */               if (Arrays.equals(bArr, bArr6)) {
/* 583 */                   byte[] bArrM7425d = m7425d(h80VarArr, bArr6);
/* 589 */                   jb1.m5740F(byteArrayOutputStream, h80VarArr.length, 1);
/* 594 */                   jb1.m5740F(byteArrayOutputStream, bArrM7425d.length, 4);
/* 597 */                   byte[] bArrM5755o2 = jb1.m5755o(bArrM7425d);
/* 603 */                   jb1.m5740F(byteArrayOutputStream, bArrM5755o2.length, 4);
/* 606 */                   byteArrayOutputStream.write(bArrM5755o2);
/* 19 */                    return true;
                        }
/* 614 */               if (Arrays.equals(bArr, bArr3)) {
/* 618 */                   jb1.m5740F(byteArrayOutputStream, h80VarArr.length, 1);
/* 623 */                   for (h80 h80Var4 : h80VarArr) {
/* 633 */                       int size2 = h80Var4.f8960i.size() * 4;
/* 638 */                       String strM7431j2 = m7431j(bArr3, h80Var4.f8952a, h80Var4.f8953b);
/* 642 */                       Charset charset2 = StandardCharsets.UTF_8;
/* 649 */                       jb1.m5741G(byteArrayOutputStream, strM7431j2.getBytes(charset2).length);
/* 655 */                       jb1.m5741G(byteArrayOutputStream, h80Var4.f8959h.length);
/* 659 */                       jb1.m5740F(byteArrayOutputStream, size2, 4);
/* 664 */                       jb1.m5740F(byteArrayOutputStream, h80Var4.f8954c, 4);
/* 671 */                       byteArrayOutputStream.write(strM7431j2.getBytes(charset2));
/* 680 */                       Iterator it2 = h80Var4.f8960i.keySet().iterator();
/* 688 */                       while (it2.hasNext()) {
/* 700 */                           jb1.m5741G(byteArrayOutputStream, ((Integer) it2.next()).intValue());
/* 704 */                           jb1.m5741G(byteArrayOutputStream, 0);
                                }
/* 712 */                       for (int i17 : h80Var4.f8959h) {
/* 716 */                           jb1.m5741G(byteArrayOutputStream, i17);
                                }
                            }
                        } else {
/* 725 */                   byte[] bArr7 = qj3.f15583d;
/* 731 */                   if (Arrays.equals(bArr, bArr7)) {
/* 733 */                       byte[] bArrM7425d2 = m7425d(h80VarArr, bArr7);
/* 739 */                       jb1.m5740F(byteArrayOutputStream, h80VarArr.length, 1);
/* 744 */                       jb1.m5740F(byteArrayOutputStream, bArrM7425d2.length, 4);
/* 747 */                       byte[] bArrM5755o3 = jb1.m5755o(bArrM7425d2);
/* 753 */                       jb1.m5740F(byteArrayOutputStream, bArrM5755o3.length, 4);
/* 756 */                       byteArrayOutputStream.write(bArrM5755o3);
/* 19 */                        return true;
                            }
/* 764 */                   if (!Arrays.equals(bArr, bArr2)) {
/* 867 */                       return false;
                            }
/* 767 */                   jb1.m5741G(byteArrayOutputStream, h80VarArr.length);
/* 772 */                   for (h80 h80Var5 : h80VarArr) {
/* 776 */                       String str = h80Var5.f8952a;
/* 778 */                       TreeMap treeMap = h80Var5.f8960i;
/* 782 */                       String strM7431j3 = m7431j(bArr2, str, h80Var5.f8953b);
/* 786 */                       Charset charset3 = StandardCharsets.UTF_8;
/* 793 */                       jb1.m5741G(byteArrayOutputStream, strM7431j3.getBytes(charset3).length);
/* 800 */                       jb1.m5741G(byteArrayOutputStream, treeMap.size());
/* 806 */                       jb1.m5741G(byteArrayOutputStream, h80Var5.f8959h.length);
/* 811 */                       jb1.m5740F(byteArrayOutputStream, h80Var5.f8954c, 4);
/* 818 */                       byteArrayOutputStream.write(strM7431j3.getBytes(charset3));
/* 825 */                       Iterator it3 = treeMap.keySet().iterator();
/* 833 */                       while (it3.hasNext()) {
/* 845 */                           jb1.m5741G(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                                }
/* 853 */                       for (int i18 : h80Var5.f8959h) {
/* 857 */                           jb1.m5741G(byteArrayOutputStream, i18);
                                }
                            }
                        }
                    }
/* 19 */            return true;
                }

                /* JADX INFO: renamed from: C */
                public static void m7419C(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var, String str) throws IOException {
/* 1 */             Charset charset = StandardCharsets.UTF_8;
/* 8 */             jb1.m5741G(byteArrayOutputStream, str.getBytes(charset).length);
/* 13 */            jb1.m5741G(byteArrayOutputStream, h80Var.f8956e);
/* 20 */            jb1.m5740F(byteArrayOutputStream, h80Var.f8957f, 4);
/* 25 */            jb1.m5740F(byteArrayOutputStream, h80Var.f8954c, 4);
/* 31 */            jb1.m5740F(byteArrayOutputStream, h80Var.f8958g, 4);
/* 38 */            byteArrayOutputStream.write(str.getBytes(charset));
                }

                /* JADX INFO: renamed from: D */
                public static void m7420D(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) throws IOException {
/* 11 */            byte[] bArr = new byte[(((h80Var.f8958g * 2) + 7) & (-8)) / 8];
/* 27 */            for (Map.Entry entry : h80Var.f8960i.entrySet()) {
/* 41 */                int iIntValue = ((Integer) entry.getKey()).intValue();
/* 51 */                int iIntValue2 = ((Integer) entry.getValue()).intValue();
/* 58 */                if ((iIntValue2 & 2) != 0) {
/* 60 */                    int i = iIntValue / 8;
/* 70 */                    bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
                        }
/* 74 */                if ((iIntValue2 & 4) != 0) {
/* 78 */                    int i2 = iIntValue + h80Var.f8958g;
/* 79 */                    int i3 = i2 / 8;
/* 89 */                    bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
                        }
                    }
/* 92 */            byteArrayOutputStream.write(bArr);
                }

                /* JADX INFO: renamed from: E */
                public static void m7421E(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) {
/* 12 */            int i = 0;
/* 17 */            for (Map.Entry entry : h80Var.f8960i.entrySet()) {
/* 31 */                int iIntValue = ((Integer) entry.getKey()).intValue();
/* 47 */                if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
/* 52 */                    jb1.m5741G(byteArrayOutputStream, iIntValue - i);
/* 55 */                    jb1.m5741G(byteArrayOutputStream, 0);
/* 58 */                    i = iIntValue;
                        }
                    }
                }

                /* JADX INFO: renamed from: F */
                public static void m7422F(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 10 */            C1951n4.m6868s(str.concat(" must not be null"));
                }

                /* JADX INFO: renamed from: a */
                public static void m7423a() {
/* 20 */            de3.m3028j("Not in application's main thread", Looper.getMainLooper().getThread() == Thread.currentThread());
                }

                /* JADX INFO: renamed from: c */
                public static ml0 m7424c(Context context) {
                    ProviderInfo providerInfo;
                    C0168b5 c0168b5;
                    ApplicationInfo applicationInfo;
/* 5 */             int i = 27;
/* 17 */            xt0 v50Var = Build.VERSION.SDK_INT >= 28 ? new v50(i) : new xt0(i);
/* 20 */            PackageManager packageManager = context.getPackageManager();
/* 26 */            de3.m3027i(packageManager, "Package manager required to locate emoji font provider");
/* 41 */            Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
                    while (true) {
/* 50 */                if (!it.hasNext()) {
/* 73 */                    providerInfo = null;
                            break;
                        }
/* 58 */                providerInfo = it.next().providerInfo;
/* 60 */                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                            break;
                        }
                    }
/* 74 */            if (providerInfo == null) {
/* 76 */                c0168b5 = null;
                    } else {
                        try {
/* 78 */                    String str = providerInfo.authority;
/* 80 */                    String str2 = providerInfo.packageName;
/* 82 */                    Signature[] signatureArrMo9224b = v50Var.mo9224b(packageManager, str2);
/* 88 */                    ArrayList arrayList = new ArrayList();
/* 92 */                    for (Signature signature : signatureArrMo9224b) {
/* 100 */                       arrayList.add(signature.toByteArray());
                            }
/* 114 */                   c0168b5 = new C0168b5(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
                        } catch (PackageManager.NameNotFoundException e) {
/* 123 */                   AbstractC1245n0.m4873a("emoji2.text.DefaultEmojiConfig", EnumC1553m5.ERROR, null, e);
/* 128 */                   AbstractC1245n0.m4874b(EnumC1636q5.FATAL, null, e);
/* 131 */                   Log.wtf("emoji2.text.DefaultEmojiConfig", e);
/* 76 */                    c0168b5 = null;
                        }
                    }
/* 135 */           if (c0168b5 == null) {
/* 49 */                return null;
                    }
/* 145 */           return new ml0(new ll0(c0168b5, context));
                }

                /* JADX INFO: renamed from: d */
                public static byte[] m7425d(h80[] h80VarArr, byte[] bArr) throws IOException {
/* 4 */             int length = 0;
/* 5 */             for (h80 h80Var : h80VarArr) {
/* 45 */                length += ((((h80Var.f8958g * 2) + 7) & (-8)) / 8) + (h80Var.f8956e * 2) + m7431j(bArr, h80Var.f8952a, h80Var.f8953b).getBytes(StandardCharsets.UTF_8).length + 16 + h80Var.f8957f;
                    }
/* 51 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
/* 60 */            if (Arrays.equals(bArr, qj3.f15583d)) {
/* 64 */                for (h80 h80Var2 : h80VarArr) {
/* 76 */                    m7419C(byteArrayOutputStream, h80Var2, m7431j(bArr, h80Var2.f8952a, h80Var2.f8953b));
/* 79 */                    m7421E(byteArrayOutputStream, h80Var2);
/* 82 */                    int[] iArr = h80Var2.f8959h;
/* 84 */                    int length2 = iArr.length;
/* 85 */                    int i = 0;
/* 86 */                    int i2 = 0;
/* 87 */                    while (i < length2) {
/* 89 */                        int i3 = iArr[i];
/* 93 */                        jb1.m5741G(byteArrayOutputStream, i3 - i2);
/* 96 */                        i++;
/* 98 */                        i2 = i3;
                            }
/* 100 */                   m7420D(byteArrayOutputStream, h80Var2);
                        }
                    } else {
/* 108 */               for (h80 h80Var3 : h80VarArr) {
/* 120 */                   m7419C(byteArrayOutputStream, h80Var3, m7431j(bArr, h80Var3.f8952a, h80Var3.f8953b));
                        }
/* 128 */               for (h80 h80Var4 : h80VarArr) {
/* 132 */                   m7421E(byteArrayOutputStream, h80Var4);
/* 135 */                   int[] iArr2 = h80Var4.f8959h;
/* 137 */                   int length3 = iArr2.length;
/* 138 */                   int i4 = 0;
/* 139 */                   int i5 = 0;
/* 140 */                   while (i4 < length3) {
/* 142 */                       int i6 = iArr2[i4];
/* 146 */                       jb1.m5741G(byteArrayOutputStream, i6 - i5);
/* 149 */                       i4++;
/* 151 */                       i5 = i6;
                            }
/* 153 */                   m7420D(byteArrayOutputStream, h80Var4);
                        }
                    }
/* 163 */           if (byteArrayOutputStream.size() == length) {
/* 165 */               return byteArrayOutputStream.toByteArray();
                    }
/* 201 */           throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
                }

                /* JADX INFO: renamed from: e */
                public static final n42 m7426e(Throwable th) {
/* 1 */             th.getClass();
/* 6 */             return new n42(th);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0031  */
                /* JADX WARN: Code duplicated, block: B:17:0x0047  */
                /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
                /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: NumberFormatException -> 0x00bb, TryCatch #2 {NumberFormatException -> 0x00bb, blocks: (B:26:0x0072, B:28:0x0078, B:32:0x0084, B:45:0x00a8, B:47:0x00ad, B:52:0x00c1, B:56:0x00ca, B:57:0x00d4, B:58:0x00d9, B:59:0x00da, B:60:0x00df), top: B:83:0x0072 }] */
                /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
                /* JADX WARN: Code duplicated, block: B:88:0x00fd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:95:0x00c1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:0x00bf A[SYNTHETIC] */
                /* JADX INFO: renamed from: f */
                public static Path m7427f(String str) {
                    String strTrim;
                    float[] fArr;
                    Path path;
/* 5 */             Path path2 = new Path();
/* 10 */            ArrayList arrayList = new ArrayList();
/* 14 */            int i = 0;
/* 15 */            int i2 = 1;
/* 20 */            while (i2 < str.length()) {
/* 30 */                while (i2 < str.length()) {
/* 32 */                    char cCharAt = str.charAt(i2);
/* 41 */                    if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
/* 48 */                        if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                                    continue;
                                } else if (cCharAt != 'e' && cCharAt != 'E') {
/* 62 */                            strTrim = str.substring(i, i2).trim();
/* 70 */                            if (strTrim.isEmpty()) {
/* 78 */                                if (strTrim.charAt(0) != 'z' || strTrim.charAt(0) == 'Z') {
/* 240 */                                   fArr = new float[0];
                                        } else {
                                            try {
/* 90 */                                        int length = strTrim.length();
/* 94 */                                        float[] fArr2 = new float[length];
/* 96 */                                        int length2 = strTrim.length();
/* 100 */                                       int i3 = 0;
/* 101 */                                       int i4 = 1;
/* 102 */                                       while (i4 < length2) {
/* 104 */                                           boolean z = false;
/* 106 */                                           boolean z2 = false;
/* 108 */                                           boolean z3 = false;
/* 110 */                                           boolean z4 = false;
/* 113 */                                           path = null;
/* 119 */                                           for (int i5 = i4; i5 < strTrim.length(); i5++) {
                                                        try {
/* 121 */                                                   char cCharAt2 = strTrim.charAt(i5);
/* 127 */                                                   if (cCharAt2 == ' ') {
/* 162 */                                                       z = false;
/* 164 */                                                       z3 = true;
                                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                                switch (cCharAt2) {
                                                                    case ',':
/* 162 */                                                               z = false;
/* 164 */                                                               z3 = true;
                                                                        break;
                                                                    case '-':
/* 151 */                                                               if (i5 == i4 || z) {
/* 156 */                                                                   z = false;
                                                                        } else {
/* 144 */                                                                   z = false;
/* 146 */                                                                   z3 = true;
/* 148 */                                                                   z4 = true;
                                                                        }
                                                                        break;
                                                                    case '.':
/* 137 */                                                               if (z2) {
/* 144 */                                                                   z = false;
/* 146 */                                                                   z3 = true;
/* 148 */                                                                   z4 = true;
                                                                        } else {
/* 139 */                                                                   z = false;
/* 141 */                                                                   z2 = true;
                                                                        }
                                                                        break;
                                                                    default:
/* 156 */                                                               z = false;
                                                                        break;
                                                                }
                                                            } else {
/* 159 */                                                       z = true;
                                                            }
/* 166 */                                                   if (z3) {
/* 172 */                                                       if (i4 < i5) {
/* 184 */                                                           fArr2[i3] = Float.parseFloat(strTrim.substring(i4, i5));
/* 174 */                                                           i3++;
                                                                }
/* 194 */                                                       i4 = z4 ? i5 : i5 + 1;
                                                            }
                                                        } catch (NumberFormatException e) {
/* 188 */                                                   e = e;
/* 236 */                                                   ds0.m3198o(fm0.m3784j("error in parsing \"", strTrim, "\""), e);
/* 239 */                                                   return path;
                                                        }
                                                    }
/* 172 */                                           if (i4 < i5) {
/* 184 */                                               fArr2[i3] = Float.parseFloat(strTrim.substring(i4, i5));
/* 174 */                                               i3++;
                                                    }
/* 194 */                                           if (z4) {
                                                    }
                                                }
/* 199 */                                       if (i3 < 0) {
/* 224 */                                           throw new IllegalArgumentException();
                                                }
/* 201 */                                       if (length < 0) {
/* 218 */                                           throw new ArrayIndexOutOfBoundsException();
                                                }
/* 203 */                                       int iMin = Math.min(i3, length);
/* 207 */                                       fArr = new float[i3];
/* 209 */                                       System.arraycopy(fArr2, 0, fArr, 0, iMin);
                                            } catch (NumberFormatException e2) {
/* 225 */                                       e = e2;
/* 226 */                                       path = null;
                                            }
                                        }
/* 251 */                               arrayList.add(new qr1(strTrim.charAt(0), fArr));
                                    }
/* 256 */                           i = i2;
/* 254 */                           i2++;
                                }
                            } else if (cCharAt != 'e') {
                                continue;
                            }
/* 55 */                    i2++;
                        }
/* 62 */                strTrim = str.substring(i, i2).trim();
/* 70 */                if (strTrim.isEmpty()) {
/* 78 */                    if (strTrim.charAt(0) != 'z') {
/* 240 */                       fArr = new float[0];
                            } else {
/* 240 */                       fArr = new float[0];
                            }
/* 251 */                   arrayList.add(new qr1(strTrim.charAt(0), fArr));
                        }
/* 256 */               i = i2;
/* 254 */               i2++;
                    }
/* 264 */           if (i2 - i == 1 && i < str.length()) {
/* 283 */               arrayList.add(new qr1(str.charAt(i), new float[0]));
                    }
                    try {
/* 294 */               qr1.m8006b((qr1[]) arrayList.toArray(new qr1[0]), path2);
/* 297 */               return path2;
                    } catch (RuntimeException e3) {
/* 305 */               ds0.m3198o("Error in parsing ".concat(str), e3);
/* 260 */               return null;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static o80 m7428g() {
/* 3 */             if (o80.f14669b != null) {
/* 5 */                 return o80.f14669b;
                    }
                    synchronized (o80.class) {
                        try {
/* 13 */                    if (o80.f14669b == null) {
/* 21 */                        o80.f14669b = new o80(0);
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
/* 27 */            return o80.f14669b;
                }

                /* JADX INFO: renamed from: h */
                public static float m7429h(float f, float f2, float f3, float f4) {
/* 2 */             double d = 0.0f - f;
/* 4 */             double d2 = 0.0f - f2;
/* 11 */            float fHypot = (float) Math.hypot(d, d2);
/* 12 */            double d3 = f3 - f;
/* 18 */            float fHypot2 = (float) Math.hypot(d3, d2);
/* 19 */            double d4 = f4 - f2;
/* 25 */            float fHypot3 = (float) Math.hypot(d3, d4);
/* 30 */            float fHypot4 = (float) Math.hypot(d, d4);
/* 33 */            if (fHypot > fHypot2 && fHypot > fHypot3 && fHypot > fHypot4) {
/* 43 */                return fHypot;
                    }
/* 46 */            if (fHypot2 <= fHypot3 || fHypot2 <= fHypot4) {
                        return fHypot3 > fHypot4 ? fHypot3 : fHypot4;
                    }
/* 52 */            return fHypot2;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x005c  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: i */
                public static final Object m7430i(fk0 fk0Var, c10 c10Var) {
                    rk0 rk0Var;
                    h22 h22Var;
                    C0000a e;
                    C2186sm c2186sm;
/* 3 */             if (c10Var instanceof rk0) {
/* 6 */                 rk0Var = (rk0) c10Var;
/* 8 */                 int i = rk0Var.f16138d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    rk0Var.f16138d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    rk0Var = new rk0(c10Var);
                        }
                    } else {
/* 22 */                rk0Var = new rk0(c10Var);
                    }
/* 25 */            Object obj = rk0Var.f16137c;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = rk0Var.f16138d;
/* 32 */            if (i2 == 0) {
/* 53 */                m7417A(obj);
/* 58 */                h22 h22Var2 = new h22();
/* 64 */                C2186sm c2186sm2 = new C2186sm(h22Var2, 3);
                        try {
/* 67 */                    rk0Var.f16135a = h22Var2;
/* 69 */                    rk0Var.f16136b = c2186sm2;
/* 71 */                    rk0Var.f16138d = 1;
/* 77 */                    if (fk0Var.collect(c2186sm2, rk0Var) == obj2) {
/* 79 */                        return obj2;
                            }
/* 80 */                    h22Var = h22Var2;
                        } catch (C0000a e2) {
/* 83 */                    h22Var = h22Var2;
/* 84 */                    e = e2;
/* 85 */                    c2186sm = c2186sm2;
/* 88 */                    if (e.f0a != c2186sm) {
/* 93 */                        throw e;
                            }
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                c2186sm = rk0Var.f16136b;
/* 38 */                h22Var = rk0Var.f16135a;
                        try {
/* 40 */                    m7417A(obj);
                        } catch (C0000a e3) {
/* 44 */                    e = e3;
/* 88 */                    if (e.f0a != c2186sm) {
/* 93 */                        throw e;
                            }
                        }
                    }
/* 90 */            return h22Var.f8873a;
                }

                /* JADX INFO: renamed from: j */
                public static String m7431j(byte[] bArr, String str, String str2) {
/* 1 */             byte[] bArr2 = qj3.f15584e;
/* 3 */             byte[] bArr3 = qj3.f15585f;
/* 13 */            Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
/* 29 */            if (str.length() <= 0) {
/* 35 */                if ("!".equals(obj)) {
/* 37 */                    return str2.replace(":", "!");
                        }
/* 46 */                if (":".equals(obj)) {
/* 48 */                    return str2.replace("!", ":");
                        }
                    } else {
/* 59 */                if (str2.equals("classes.dex")) {
/* 61 */                    return str;
                        }
/* 66 */                if (str2.contains("!") || str2.contains(":")) {
/* 111 */                   if ("!".equals(obj)) {
/* 113 */                       return str2.replace(":", "!");
                            }
/* 122 */                   if (":".equals(obj)) {
/* 124 */                       return str2.replace("!", ":");
                            }
                        } else if (!str2.endsWith(".apk")) {
/* 102 */                   return fm0.m3789o(AbstractC0886en.m3512p(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
                        }
                    }
/* 129 */           return str2;
                }

                /* JADX INFO: renamed from: k */
                public static x31 m7432k(String str) throws GeneralSecurityException {
                    Map mapUnmodifiableMap;
/* 1 */             AtomicReference atomicReference = r22.f15833a;
                    synchronized (r22.class) {
/* 8 */                 mapUnmodifiableMap = Collections.unmodifiableMap(r22.f15836d);
                    }
/* 17 */            x31 x31Var = (x31) mapUnmodifiableMap.get(str);
/* 19 */            if (x31Var != null) {
/* 21 */                return x31Var;
                    }
/* 33 */            throw new GeneralSecurityException("cannot find key template: ".concat(str));
                }

                /* JADX INFO: renamed from: l */
                public static Context m7433l(Context context) {
                    int iM8227c;
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 5 */             int i = Build.VERSION.SDK_INT;
/* 9 */             if (i >= 34 && (iM8227c = AbstractC2153rq.m8227c(context)) != AbstractC2153rq.m8227c(applicationContext)) {
/* 21 */                applicationContext = AbstractC2153rq.m8225a(applicationContext, iM8227c);
                    }
/* 27 */            if (i >= 30) {
/* 29 */                String strM18b = a10.m18b(context);
/* 41 */                if (!Objects.equals(strM18b, a10.m18b(applicationContext))) {
/* 43 */                    return a10.m17a(applicationContext, strM18b);
                        }
                    }
/* 48 */            return applicationContext;
                }

                /* JADX INFO: renamed from: m */
                public static ku0 m7434m() {
/* 3 */             if (ku0.f13011c != null) {
/* 5 */                 return ku0.f13011c;
                    }
                    synchronized (ku0.class) {
                        try {
/* 13 */                    if (ku0.f13011c == null) {
/* 20 */                        ku0.f13011c = new ku0();
                            }
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
/* 26 */            return ku0.f13011c;
                }

                /* JADX INFO: renamed from: n */
                public static wz0 m7435n() {
/* 3 */             if (wz0.f18875c != null) {
/* 5 */                 return wz0.f18875c;
                    }
                    synchronized (wz0.class) {
                        try {
/* 13 */                    if (wz0.f18875c == null) {
/* 20 */                        wz0.f18875c = new wz0();
                            }
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
/* 26 */            return wz0.f18875c;
                }

                /* JADX INFO: renamed from: o */
                public static nt0 m7436o() {
/* 3 */             if (kb1.f12669a != null) {
/* 5 */                 return kb1.f12669a;
                    }
                    synchronized (kb1.class) {
                        try {
/* 13 */                    if (kb1.f12669a == null) {
/* 29 */                        kb1.f12669a = new nt0(new Handler(Looper.getMainLooper()));
                            }
                        } catch (Throwable th) {
/* 39 */                    throw th;
                        }
                    }
/* 35 */            return kb1.f12669a;
                }

                /* JADX INFO: renamed from: p */
                public static int[] m7437p(ByteArrayInputStream byteArrayInputStream, int i) {
/* 1 */             int[] iArr = new int[i];
/* 4 */             int iM5765y = 0;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                iM5765y += (int) jb1.m5765y(byteArrayInputStream, 2);
/* 14 */                iArr[i2] = iM5765y;
                    }
/* 19 */            return iArr;
                }

                /* JADX INFO: renamed from: q */
                public static h80[] m7438q(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, h80[] h80VarArr) throws IOException {
/* 1 */             byte[] bArr3 = qj3.f15586g;
/* 13 */            if (!Arrays.equals(bArr, bArr3)) {
/* 98 */                if (!Arrays.equals(bArr, qj3.f15587h)) {
/* 153 */                   f42.m3656l("Unsupported meta version");
/* 7 */                     return null;
                        }
/* 105 */               int iM5765y = (int) jb1.m5765y(fileInputStream, 2);
/* 116 */               byte[] bArrM5764x = jb1.m5764x(fileInputStream, (int) jb1.m5765y(fileInputStream, 4), (int) jb1.m5765y(fileInputStream, 4));
/* 124 */               if (fileInputStream.read() > 0) {
/* 149 */                   f42.m3656l("Content found after the end of file");
/* 7 */                     return null;
                        }
/* 128 */               ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5764x);
                        try {
/* 131 */                   h80[] h80VarArrM7440s = m7440s(byteArrayInputStream, bArr2, iM5765y, h80VarArr);
/* 135 */                   byteArrayInputStream.close();
/* 138 */                   return h80VarArrM7440s;
                        } catch (Throwable th) {
                            try {
/* 140 */                       byteArrayInputStream.close();
                            } catch (Throwable th2) {
/* 145 */                       th.addSuppressed(th2);
                            }
/* 148 */                   throw th;
                        }
                    }
/* 21 */            if (Arrays.equals(qj3.f15581b, bArr2)) {
/* 88 */                f42.m3656l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
/* 7 */                 return null;
                    }
/* 27 */            if (!Arrays.equals(bArr, bArr3)) {
/* 82 */                f42.m3656l("Unsupported meta version");
/* 7 */                 return null;
                    }
/* 34 */            int iM5765y2 = (int) jb1.m5765y(fileInputStream, 1);
/* 45 */            byte[] bArrM5764x2 = jb1.m5764x(fileInputStream, (int) jb1.m5765y(fileInputStream, 4), (int) jb1.m5765y(fileInputStream, 4));
/* 53 */            if (fileInputStream.read() > 0) {
/* 78 */                f42.m3656l("Content found after the end of file");
/* 7 */                 return null;
                    }
/* 57 */            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM5764x2);
                    try {
/* 60 */                h80[] h80VarArrM7439r = m7439r(byteArrayInputStream2, iM5765y2, h80VarArr);
/* 64 */                byteArrayInputStream2.close();
/* 67 */                return h80VarArrM7439r;
                    } catch (Throwable th3) {
                        try {
/* 69 */                    byteArrayInputStream2.close();
                        } catch (Throwable th4) {
/* 74 */                    th3.addSuppressed(th4);
                        }
/* 77 */                throw th3;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static h80[] m7439r(ByteArrayInputStream byteArrayInputStream, int i, h80[] h80VarArr) {
/* 6 */             if (byteArrayInputStream.available() == 0) {
/* 8 */                 return new h80[0];
                    }
/* 13 */            if (i != h80VarArr.length) {
/* 87 */                f42.m3656l("Mismatched number of dex files found in metadata");
/* 12 */                return null;
                    }
/* 15 */            String[] strArr = new String[i];
/* 17 */            int[] iArr = new int[i];
/* 20 */            for (int i2 = 0; i2 < i; i2++) {
/* 27 */                int iM5765y = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 33 */                iArr[i2] = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 46 */                strArr[i2] = new String(jb1.m5763w(byteArrayInputStream, iM5765y), StandardCharsets.UTF_8);
                    }
/* 51 */            for (int i3 = 0; i3 < i; i3++) {
/* 53 */                h80 h80Var = h80VarArr[i3];
/* 63 */                if (!h80Var.f8953b.equals(strArr[i3])) {
/* 80 */                    f42.m3656l("Order of dexfiles in metadata did not match baseline");
/* 12 */                    return null;
                        }
/* 65 */                int i4 = iArr[i3];
/* 67 */                h80Var.f8956e = i4;
/* 73 */                h80Var.f8959h = m7437p(byteArrayInputStream, i4);
                    }
/* 84 */            return h80VarArr;
                }

                /* JADX INFO: renamed from: s */
                public static h80[] m7440s(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, h80[] h80VarArr) {
                    h80 h80Var;
/* 6 */             if (byteArrayInputStream.available() == 0) {
/* 8 */                 return new h80[0];
                    }
/* 13 */            if (i != h80VarArr.length) {
/* 133 */               f42.m3656l("Mismatched number of dex files found in metadata");
/* 12 */                return null;
                    }
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                jb1.m5765y(byteArrayInputStream, 2);
/* 35 */                String str = new String(jb1.m5763w(byteArrayInputStream, (int) jb1.m5765y(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
/* 39 */                long jM5765y = jb1.m5765y(byteArrayInputStream, 4);
/* 47 */                int iM5765y = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 49 */                if (h80VarArr.length <= 0) {
/* 51 */                    h80Var = null;
                            break;
                        }
/* 55 */                int iIndexOf = str.indexOf("!");
/* 59 */                if (iIndexOf < 0) {
/* 63 */                    iIndexOf = str.indexOf(":");
                        }
/* 76 */                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
/* 77 */                int i3 = 0;
                        while (true) {
/* 79 */                    if (i3 >= h80VarArr.length) {
/* 51 */                        h80Var = null;
                                break;
                            }
/* 89 */                    if (h80VarArr[i3].f8953b.equals(strSubstring)) {
/* 91 */                        h80Var = h80VarArr[i3];
                                break;
                            }
/* 94 */                    i3++;
                        }
/* 97 */                if (h80Var == null) {
/* 126 */                   f42.m3656l("Missing profile key: ".concat(str));
/* 12 */                    return null;
                        }
/* 99 */                h80Var.f8955d = jM5765y;
/* 101 */               int[] iArrM7437p = m7437p(byteArrayInputStream, iM5765y);
/* 111 */               if (Arrays.equals(bArr, qj3.f15585f)) {
/* 113 */                   h80Var.f8956e = iM5765y;
/* 115 */                   h80Var.f8959h = iArrM7437p;
                        }
                    }
/* 130 */           return h80VarArr;
                }

                /* JADX INFO: renamed from: t */
                public static h80[] m7441t(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
/* 8 */             if (!Arrays.equals(bArr, qj3.f15582c)) {
/* 68 */                f42.m3656l("Unsupported version");
/* 7 */                 return null;
                    }
/* 15 */            int iM5765y = (int) jb1.m5765y(fileInputStream, 1);
/* 27 */            byte[] bArrM5764x = jb1.m5764x(fileInputStream, (int) jb1.m5765y(fileInputStream, 4), (int) jb1.m5765y(fileInputStream, 4));
/* 35 */            if (fileInputStream.read() > 0) {
/* 62 */                f42.m3656l("Content found after the end of file");
/* 7 */                 return null;
                    }
/* 39 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5764x);
                    try {
/* 42 */                h80[] h80VarArrM7442u = m7442u(byteArrayInputStream, str, iM5765y);
/* 46 */                byteArrayInputStream.close();
/* 49 */                return h80VarArrM7442u;
                    } catch (Throwable th) {
                        try {
/* 51 */                    byteArrayInputStream.close();
                        } catch (Throwable th2) {
/* 56 */                    th.addSuppressed(th2);
                        }
/* 59 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: u */
                public static h80[] m7442u(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
/* 9 */             int i2 = 0;
/* 10 */            if (byteArrayInputStream.available() == 0) {
/* 12 */                return new h80[0];
                    }
/* 15 */            h80[] h80VarArr = new h80[i];
/* 19 */            for (int i3 = 0; i3 < i; i3++) {
/* 25 */                int iM5765y = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 30 */                int iM5765y2 = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 76 */                h80VarArr[i3] = new h80(str, new String(jb1.m5763w(byteArrayInputStream, iM5765y), StandardCharsets.UTF_8), jb1.m5765y(byteArrayInputStream, 4), iM5765y2, (int) jb1.m5765y(byteArrayInputStream, 4), (int) jb1.m5765y(byteArrayInputStream, 4), new int[iM5765y2], new TreeMap());
                    }
/* 81 */            int i4 = 0;
/* 82 */            while (i4 < i) {
/* 84 */                h80 h80Var = h80VarArr[i4];
/* 86 */                int iAvailable = byteArrayInputStream.available();
/* 90 */                int i5 = h80Var.f8957f;
/* 92 */                int i6 = h80Var.f8958g;
/* 94 */                TreeMap treeMap = h80Var.f8960i;
/* 96 */                int i7 = iAvailable - i5;
/* 97 */                int iM5765y3 = i2;
/* 103 */               while (byteArrayInputStream.available() > i7) {
/* 110 */                   iM5765y3 += (int) jb1.m5765y(byteArrayInputStream, 2);
/* 120 */                   treeMap.put(Integer.valueOf(iM5765y3), 1);
/* 127 */                   int iM5765y4 = (int) jb1.m5765y(byteArrayInputStream, 2);
/* 128 */                   while (iM5765y4 > 0) {
/* 130 */                       jb1.m5765y(byteArrayInputStream, 2);
/* 137 */                       int iM5765y5 = (int) jb1.m5765y(byteArrayInputStream, 1);
/* 139 */                       if (iM5765y5 != 6 && iM5765y5 != 7) {
/* 148 */                           while (iM5765y5 > 0) {
/* 150 */                               jb1.m5765y(byteArrayInputStream, 1);
/* 153 */                               int i8 = i2;
/* 154 */                               int i9 = i4;
/* 161 */                               for (int iM5765y6 = (int) jb1.m5765y(byteArrayInputStream, 1); iM5765y6 > 0; iM5765y6--) {
/* 163 */                                   jb1.m5765y(byteArrayInputStream, 2);
                                        }
/* 169 */                               iM5765y5--;
/* 171 */                               i2 = i8;
/* 172 */                               i4 = i9;
                                    }
                                }
/* 175 */                       iM5765y4--;
/* 177 */                       i2 = i2;
/* 178 */                       i4 = i4;
                            }
                        }
/* 181 */               int i10 = i2;
/* 182 */               int i11 = i4;
/* 188 */               if (byteArrayInputStream.available() != i7) {
/* 279 */                   f42.m3656l("Read too much data during profile line parse");
/* 282 */                   return null;
                        }
/* 196 */               h80Var.f8959h = m7437p(byteArrayInputStream, h80Var.f8956e);
/* 209 */               BitSet bitSetValueOf = BitSet.valueOf(jb1.m5763w(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
/* 214 */               for (int i12 = i10; i12 < i6; i12++) {
/* 224 */                   int i13 = bitSetValueOf.get(i12) ? 2 : i10;
/* 231 */                   if (bitSetValueOf.get(i12 + i6)) {
/* 233 */                       i13 |= 4;
                            }
/* 235 */                   if (i13 != 0) {
/* 245 */                       Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
/* 247 */                       if (numValueOf == null) {
/* 249 */                           numValueOf = Integer.valueOf(i10);
                                }
/* 266 */                       treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                            }
                        }
/* 272 */               i4 = i11 + 1;
/* 274 */               i2 = i10;
                    }
/* 284 */           return h80VarArr;
                }

                /* JADX INFO: renamed from: w */
                public static void m7443w(Runnable runnable) {
/* 13 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 15 */                runnable.run();
                    } else {
/* 34 */                de3.m3028j("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
                    }
                }

                /* JADX INFO: renamed from: z */
                public static int m7444z(int i) {
/* 18 */            return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
                }

                /* JADX INFO: renamed from: b */
                public abstract Object mo7445b();

                /* JADX INFO: renamed from: v */
                public abstract pg3 mo7446v(String str, Function1 function1);

                /* JADX INFO: renamed from: x */
                public void mo7113x(boolean z) {
                }

                /* JADX INFO: renamed from: y */
                public abstract void mo6948y(boolean z);
            }
