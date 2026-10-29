            package com.quago.mobile.sdk;

            import android.os.Build;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.d0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0722d0 {

                /* JADX INFO: renamed from: w */
                public static final transient C0740j0 f5373w;

                /* JADX INFO: renamed from: a */
                public final String f5374a;

                /* JADX INFO: renamed from: b */
                public final String f5375b;

                /* JADX INFO: renamed from: c */
                public final String f5376c;

                /* JADX INFO: renamed from: d */
                public final String f5377d;

                /* JADX INFO: renamed from: e */
                public final String f5378e;

                /* JADX INFO: renamed from: f */
                public final String f5379f;

                /* JADX INFO: renamed from: g */
                public final String f5380g;

                /* JADX INFO: renamed from: h */
                public final String f5381h;

                /* JADX INFO: renamed from: i */
                public final String f5382i;

                /* JADX INFO: renamed from: j */
                public final String f5383j;

                /* JADX INFO: renamed from: k */
                public final String f5384k;

                /* JADX INFO: renamed from: l */
                public final String f5385l;

                /* JADX INFO: renamed from: m */
                public final String f5386m;

                /* JADX INFO: renamed from: n */
                public final String f5387n;

                /* JADX INFO: renamed from: o */
                public final String f5388o;

                /* JADX INFO: renamed from: p */
                public final String f5389p;

                /* JADX INFO: renamed from: q */
                public final String f5390q;

                /* JADX INFO: renamed from: r */
                public final String f5391r;

                /* JADX INFO: renamed from: s */
                public final ArrayList f5392s;

                /* JADX INFO: renamed from: t */
                public final ArrayList f5393t;

                /* JADX INFO: renamed from: u */
                public final ArrayList f5394u;

                /* JADX INFO: renamed from: v */
                public final long f5395v;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5373w = new C0740j0("QuagoBuild");
                }

                public C0722d0() {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    String str12;
                    String str13;
                    String str14;
                    String radioVersion;
                    String str15;
                    long j;
                    String str16;
/* 6 */             String str17 = null;
                    try {
/* 7 */                 str = Build.BOARD;
                    } catch (Exception e) {
/* 13 */                f5373w.m2612a("Build", e);
/* 16 */                str = null;
                    }
/* 17 */            this.f5374a = str;
                    try {
/* 19 */                str2 = Build.BOOTLOADER;
                    } catch (Exception e2) {
/* 25 */                f5373w.m2612a("Build", e2);
/* 28 */                str2 = null;
                    }
/* 29 */            this.f5375b = str2;
                    try {
/* 31 */                str3 = Build.BRAND;
                    } catch (Exception e3) {
/* 37 */                f5373w.m2612a("Build", e3);
/* 40 */                str3 = null;
                    }
/* 41 */            this.f5376c = str3;
                    try {
/* 43 */                str4 = Build.CPU_ABI;
                    } catch (Exception e4) {
/* 49 */                f5373w.m2612a("Build", e4);
/* 52 */                str4 = null;
                    }
/* 53 */            this.f5377d = str4;
                    try {
/* 55 */                str5 = Build.CPU_ABI2;
                    } catch (Exception e5) {
/* 61 */                f5373w.m2612a("Build", e5);
/* 64 */                str5 = null;
                    }
/* 65 */            this.f5378e = str5;
                    try {
/* 67 */                str6 = Build.DEVICE;
                    } catch (Exception e6) {
/* 73 */                f5373w.m2612a("Build", e6);
/* 76 */                str6 = null;
                    }
/* 77 */            this.f5379f = str6;
                    try {
/* 79 */                str7 = Build.DISPLAY;
                    } catch (Exception e7) {
/* 85 */                f5373w.m2612a("Build", e7);
/* 88 */                str7 = null;
                    }
/* 89 */            this.f5380g = str7;
                    try {
/* 91 */                str8 = Build.FINGERPRINT;
                    } catch (Exception e8) {
/* 97 */                f5373w.m2612a("Build", e8);
/* 100 */               str8 = null;
                    }
/* 101 */           this.f5381h = str8;
                    try {
/* 103 */               str9 = Build.HARDWARE;
                    } catch (Exception e9) {
/* 109 */               f5373w.m2612a("Build", e9);
/* 112 */               str9 = null;
                    }
/* 113 */           this.f5382i = str9;
                    try {
/* 115 */               str10 = Build.HOST;
                    } catch (Exception e10) {
/* 121 */               f5373w.m2612a("Build", e10);
/* 124 */               str10 = null;
                    }
/* 125 */           this.f5383j = str10;
                    try {
/* 127 */               str11 = Build.ID;
                    } catch (Exception e11) {
/* 133 */               f5373w.m2612a("Build", e11);
/* 136 */               str11 = null;
                    }
/* 137 */           this.f5384k = str11;
                    try {
/* 139 */               str12 = Build.MANUFACTURER;
                    } catch (Exception e12) {
/* 145 */               f5373w.m2612a("Build", e12);
/* 148 */               str12 = null;
                    }
/* 149 */           this.f5385l = str12;
                    try {
/* 151 */               str13 = Build.MODEL;
                    } catch (Exception e13) {
/* 157 */               f5373w.m2612a("Build", e13);
/* 160 */               str13 = null;
                    }
/* 161 */           this.f5386m = str13;
                    try {
/* 163 */               str14 = Build.PRODUCT;
                    } catch (Exception e14) {
/* 169 */               f5373w.m2612a("Build", e14);
/* 172 */               str14 = null;
                    }
/* 173 */           this.f5387n = str14;
                    try {
/* 175 */               radioVersion = Build.getRadioVersion();
                    } catch (Exception e15) {
/* 183 */               f5373w.m2612a("Build", e15);
/* 186 */               radioVersion = null;
                    }
/* 187 */           this.f5388o = radioVersion;
/* 191 */           ArrayList arrayList = new ArrayList();
/* 196 */           ArrayList arrayList2 = new ArrayList();
/* 201 */           ArrayList arrayList3 = new ArrayList();
                    try {
/* 210 */               arrayList.addAll(Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
                    } catch (Exception e16) {
/* 217 */               f5373w.m2612a("Build", e16);
                    }
                    try {
/* 226 */               arrayList2.addAll(Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
                    } catch (Exception e17) {
/* 233 */               f5373w.m2612a("Build", e17);
                    }
                    try {
/* 242 */               arrayList3.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
                    } catch (Exception e18) {
/* 249 */               f5373w.m2612a("Build", e18);
                    }
/* 252 */           this.f5392s = arrayList;
/* 254 */           this.f5393t = arrayList2;
/* 256 */           this.f5394u = arrayList3;
                    try {
/* 258 */               str15 = Build.TAGS;
                    } catch (Exception e19) {
/* 264 */               f5373w.m2612a("Build", e19);
/* 267 */               str15 = null;
                    }
/* 268 */           this.f5389p = str15;
                    try {
/* 270 */               j = Build.TIME;
                    } catch (Exception e20) {
/* 276 */               f5373w.m2612a("Build", e20);
/* 279 */               j = 0;
                    }
/* 281 */           this.f5395v = j;
                    try {
/* 283 */               str16 = Build.TYPE;
                    } catch (Exception e21) {
/* 289 */               f5373w.m2612a("Build", e21);
/* 292 */               str16 = null;
                    }
/* 293 */           this.f5390q = str16;
                    try {
/* 295 */               str17 = Build.USER;
                    } catch (Exception e22) {
/* 301 */               f5373w.m2612a("Build", e22);
                    }
/* 304 */           this.f5391r = str17;
                }

                public final String toString() {
/* 252 */           return "QuagoBuild{board='" + this.f5374a + "', bootloader='" + this.f5375b + "', brand='" + this.f5376c + "', cpu_abi='" + this.f5377d + "', cpu_abi2='" + this.f5378e + "', device='" + this.f5379f + "', display='" + this.f5380g + "', fingerprint='" + this.f5381h + "', hardware='" + this.f5382i + "', host='" + this.f5383j + "', id='" + this.f5384k + "', manufacturer='" + this.f5385l + "', model='" + this.f5386m + "', product='" + this.f5387n + "', radio='" + this.f5388o + "', tags='" + this.f5389p + "', type='" + this.f5390q + "', user='" + this.f5391r + "', supported_32_bit_abis=" + Arrays.toString(this.f5392s.toArray()) + ", supported_64_bit_abis=" + Arrays.toString(this.f5393t.toArray()) + ", supported_abis=" + Arrays.toString(this.f5394u.toArray()) + ", time=" + this.f5395v + '}';
                }
            }
