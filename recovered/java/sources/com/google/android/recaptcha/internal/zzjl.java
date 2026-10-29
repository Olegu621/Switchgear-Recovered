            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Collection;
            import java.util.Objects;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Charsets;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjl implements zzjt {
                public static final zzjl zza = new zzjl();

                private zzjl() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
                    String strM6203x;
                    String str;
/* 5 */             if (zzztVarArr.length != 1) {
/* 336 */               C1697u2.m5433i(4, 3, null);
/* 339 */               return;
                    }
/* 11 */            int i2 = 0;
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 22 */            if (true != Objects.nonNull(objZza)) {
/* 24 */                objZza = null;
                    }
/* 26 */            if (objZza == null) {
/* 331 */               C1697u2.m5433i(4, 5, null);
/* 334 */               return;
                    }
/* 36 */            if (objZza instanceof int[]) {
/* 38 */                int[] iArr = (int[]) objZza;
/* 42 */                StringBuilder sb = new StringBuilder();
/* 45 */                sb.append((CharSequence) "[");
/* 48 */                int length = iArr.length;
/* 49 */                int i3 = 0;
/* 50 */                while (i2 < length) {
/* 52 */                    int i4 = iArr[i2];
/* 54 */                    i3++;
/* 55 */                    if (i3 > 1) {
/* 57 */                        sb.append((CharSequence) ",");
                            }
/* 64 */                    sb.append((CharSequence) String.valueOf(i4));
/* 67 */                    i2++;
                        }
/* 70 */                sb.append((CharSequence) "]");
/* 73 */                strM6203x = sb.toString();
                    } else {
/* 81 */                if (objZza instanceof byte[]) {
/* 89 */                    str = new String((byte[]) objZza, Charsets.UTF_8);
                        } else if (objZza instanceof long[]) {
/* 99 */                    long[] jArr = (long[]) objZza;
/* 103 */                   StringBuilder sb2 = new StringBuilder();
/* 106 */                   sb2.append((CharSequence) "[");
/* 109 */                   int length2 = jArr.length;
/* 110 */                   int i5 = 0;
/* 111 */                   while (i2 < length2) {
/* 113 */                       long j = jArr[i2];
/* 115 */                       i5++;
/* 116 */                       if (i5 > 1) {
/* 118 */                           sb2.append((CharSequence) ",");
                                }
/* 125 */                       sb2.append((CharSequence) String.valueOf(j));
/* 128 */                       i2++;
                            }
/* 131 */                   sb2.append((CharSequence) "]");
/* 134 */                   strM6203x = sb2.toString();
                        } else if (objZza instanceof short[]) {
/* 144 */                   short[] sArr = (short[]) objZza;
/* 148 */                   StringBuilder sb3 = new StringBuilder();
/* 151 */                   sb3.append((CharSequence) "[");
/* 154 */                   int length3 = sArr.length;
/* 155 */                   int i6 = 0;
/* 156 */                   while (i2 < length3) {
/* 158 */                       short s = sArr[i2];
/* 160 */                       i6++;
/* 161 */                       if (i6 > 1) {
/* 163 */                           sb3.append((CharSequence) ",");
                                }
/* 170 */                       sb3.append((CharSequence) String.valueOf((int) s));
/* 173 */                       i2++;
                            }
/* 176 */                   sb3.append((CharSequence) "]");
/* 179 */                   strM6203x = sb3.toString();
                        } else if (objZza instanceof float[]) {
/* 189 */                   float[] fArr = (float[]) objZza;
/* 193 */                   StringBuilder sb4 = new StringBuilder();
/* 196 */                   sb4.append((CharSequence) "[");
/* 199 */                   int length4 = fArr.length;
/* 200 */                   int i7 = 0;
/* 201 */                   while (i2 < length4) {
/* 203 */                       float f = fArr[i2];
/* 205 */                       i7++;
/* 206 */                       if (i7 > 1) {
/* 208 */                           sb4.append((CharSequence) ",");
                                }
/* 215 */                       sb4.append((CharSequence) String.valueOf(f));
/* 218 */                       i2++;
                            }
/* 221 */                   sb4.append((CharSequence) "]");
/* 224 */                   strM6203x = sb4.toString();
                        } else if (objZza instanceof double[]) {
/* 233 */                   double[] dArr = (double[]) objZza;
/* 237 */                   StringBuilder sb5 = new StringBuilder();
/* 240 */                   sb5.append((CharSequence) "[");
/* 243 */                   int length5 = dArr.length;
/* 244 */                   int i8 = 0;
/* 245 */                   while (i2 < length5) {
/* 247 */                       double d = dArr[i2];
/* 249 */                       i8++;
/* 250 */                       if (i8 > 1) {
/* 252 */                           sb5.append((CharSequence) ",");
                                }
/* 259 */                       sb5.append((CharSequence) String.valueOf(d));
/* 262 */                       i2++;
                            }
/* 265 */                   sb5.append((CharSequence) "]");
/* 268 */                   strM6203x = sb5.toString();
                        } else if (objZza instanceof char[]) {
/* 281 */                   str = new String((char[]) objZza);
                        } else if (objZza instanceof Object[]) {
/* 294 */                   strM6203x = C2103qd.m7775j(",", 56, (Object[]) objZza);
                        } else {
/* 301 */                   if (!(objZza instanceof Collection)) {
/* 327 */                       C1697u2.m5433i(4, 5, null);
/* 330 */                       return;
                            }
/* 315 */                   strM6203x = CollectionsKt.m6203x((Iterable) objZza, ",", "[", "]", null, 56);
                        }
/* 92 */                strM6203x = str;
                    }
/* 323 */           zzizVar.zzc().zze(i, strM6203x);
                }
            }
