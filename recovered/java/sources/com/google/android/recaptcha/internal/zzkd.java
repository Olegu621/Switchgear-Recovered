            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Objects;
            import kotlin.collections.CollectionsKt;
            import kotlin.ranges.IntRange;
            import kotlin.text.Charsets;
            import p000.C2122qw;
            import p000.r02;
            import p000.wy0;
            import p000.yy0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkd implements zzjt {
                public static final zzkd zza = new zzkd();

                private zzkd() {
                }

                private final Object zzb(Object obj, Object obj2) throws zzdm, ArithmeticException {
/* 1 */             boolean z = obj instanceof Byte;
/* 3 */             if (z && (obj2 instanceof Byte)) {
/* 22 */                return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
                    }
/* 27 */            boolean z2 = obj instanceof Short;
/* 29 */            if (z2 && (obj2 instanceof Short)) {
/* 48 */                return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
                    }
/* 53 */            boolean z3 = obj instanceof Integer;
/* 55 */            if (z3 && (obj2 instanceof Integer)) {
/* 74 */                return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
                    }
/* 79 */            boolean z4 = obj instanceof Long;
/* 81 */            if (z4 && (obj2 instanceof Long)) {
/* 100 */               return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
                    }
/* 105 */           boolean z5 = obj instanceof Float;
/* 107 */           if (z5 && (obj2 instanceof Float)) {
/* 126 */               return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
                    }
/* 131 */           boolean z6 = obj instanceof Double;
/* 133 */           if (z6 && (obj2 instanceof Double)) {
/* 152 */               return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
                    }
/* 159 */           int i = 0;
/* 160 */           if (obj instanceof String) {
/* 164 */               if (obj2 instanceof Byte) {
/* 170 */                   byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
/* 176 */                   int length = bytes.length;
/* 177 */                   ArrayList arrayList = new ArrayList(length);
/* 180 */                   while (i < length) {
/* 197 */                       arrayList.add(Byte.valueOf((byte) (bytes[i] % ((Number) obj2).intValue())));
/* 200 */                       i++;
                            }
/* 211 */                   return new String(CollectionsKt.m6189H(arrayList), Charsets.UTF_8);
                        }
/* 217 */               if (obj2 instanceof Integer) {
/* 221 */                   char[] charArray = ((String) obj).toCharArray();
/* 227 */                   int length2 = charArray.length;
/* 228 */                   ArrayList arrayList2 = new ArrayList(length2);
/* 231 */                   while (i < length2) {
/* 247 */                       arrayList2.add(Integer.valueOf(charArray[i] % ((Number) obj2).intValue()));
/* 250 */                       i++;
                            }
/* 253 */                   return CollectionsKt.m6191J(arrayList2);
                        }
                    }
/* 258 */           if (z && (obj2 instanceof byte[])) {
/* 264 */               byte[] bArr = (byte[]) obj2;
/* 269 */               ArrayList arrayList3 = new ArrayList(bArr.length);
/* 273 */               for (byte b : bArr) {
/* 289 */                   arrayList3.add(Integer.valueOf(b % ((Number) obj).intValue()));
                        }
/* 297 */               return arrayList3.toArray(new Integer[0]);
                    }
/* 302 */           if (z2 && (obj2 instanceof short[])) {
/* 308 */               short[] sArr = (short[]) obj2;
/* 313 */               ArrayList arrayList4 = new ArrayList(sArr.length);
/* 317 */               for (short s : sArr) {
/* 333 */                   arrayList4.add(Integer.valueOf(s % ((Number) obj).intValue()));
                        }
/* 341 */               return arrayList4.toArray(new Integer[0]);
                    }
/* 346 */           if (z3 && (obj2 instanceof int[])) {
/* 352 */               int[] iArr = (int[]) obj2;
/* 357 */               ArrayList arrayList5 = new ArrayList(iArr.length);
/* 361 */               for (int i2 : iArr) {
/* 377 */                   arrayList5.add(Integer.valueOf(i2 % ((Number) obj).intValue()));
                        }
/* 385 */               return arrayList5.toArray(new Integer[0]);
                    }
/* 390 */           if (z4 && (obj2 instanceof long[])) {
/* 396 */               long[] jArr = (long[]) obj2;
/* 401 */               ArrayList arrayList6 = new ArrayList(jArr.length);
/* 405 */               for (long j : jArr) {
/* 421 */                   arrayList6.add(Long.valueOf(j % ((Number) obj).longValue()));
                        }
/* 429 */               return arrayList6.toArray(new Long[0]);
                    }
/* 434 */           if (z5 && (obj2 instanceof float[])) {
/* 440 */               float[] fArr = (float[]) obj2;
/* 445 */               ArrayList arrayList7 = new ArrayList(fArr.length);
/* 449 */               for (float f : fArr) {
/* 465 */                   arrayList7.add(Float.valueOf(f % ((Number) obj).floatValue()));
                        }
/* 473 */               return arrayList7.toArray(new Float[0]);
                    }
/* 478 */           if (z6 && (obj2 instanceof double[])) {
/* 484 */               double[] dArr = (double[]) obj2;
/* 489 */               ArrayList arrayList8 = new ArrayList(dArr.length);
/* 493 */               for (double d : dArr) {
/* 509 */                   arrayList8.add(Double.valueOf(d % ((Number) obj).doubleValue()));
                        }
/* 517 */               return arrayList8.toArray(new Double[0]);
                    }
/* 522 */           boolean z7 = obj instanceof byte[];
/* 524 */           if (z7 && (obj2 instanceof Byte)) {
/* 530 */               byte[] bArr2 = (byte[]) obj;
/* 535 */               ArrayList arrayList9 = new ArrayList(bArr2.length);
/* 539 */               for (byte b2 : bArr2) {
/* 555 */                   arrayList9.add(Integer.valueOf(b2 % ((Number) obj2).intValue()));
                        }
/* 563 */               return arrayList9.toArray(new Integer[0]);
                    }
/* 568 */           boolean z8 = obj instanceof short[];
/* 570 */           if (z8 && (obj2 instanceof Short)) {
/* 576 */               short[] sArr2 = (short[]) obj;
/* 581 */               ArrayList arrayList10 = new ArrayList(sArr2.length);
/* 585 */               for (short s2 : sArr2) {
/* 601 */                   arrayList10.add(Integer.valueOf(s2 % ((Number) obj2).intValue()));
                        }
/* 609 */               return arrayList10.toArray(new Integer[0]);
                    }
/* 614 */           boolean z9 = obj instanceof int[];
/* 616 */           if (z9 && (obj2 instanceof Integer)) {
/* 622 */               int[] iArr2 = (int[]) obj;
/* 624 */               int length3 = iArr2.length;
/* 627 */               ArrayList arrayList11 = new ArrayList(length3);
/* 630 */               while (i < length3) {
/* 646 */                   arrayList11.add(Integer.valueOf(iArr2[i] % ((Number) obj2).intValue()));
/* 649 */                   i++;
                        }
/* 652 */               return CollectionsKt.m6191J(arrayList11);
                    }
/* 657 */           boolean z10 = obj instanceof long[];
/* 659 */           if (z10 && (obj2 instanceof Long)) {
/* 665 */               long[] jArr2 = (long[]) obj;
/* 670 */               ArrayList arrayList12 = new ArrayList(jArr2.length);
/* 674 */               for (long j2 : jArr2) {
/* 690 */                   arrayList12.add(Long.valueOf(j2 % ((Number) obj2).longValue()));
                        }
/* 698 */               return arrayList12.toArray(new Long[0]);
                    }
/* 703 */           boolean z11 = obj instanceof float[];
/* 705 */           if (z11 && (obj2 instanceof Float)) {
/* 711 */               float[] fArr2 = (float[]) obj;
/* 716 */               ArrayList arrayList13 = new ArrayList(fArr2.length);
/* 720 */               for (float f2 : fArr2) {
/* 736 */                   arrayList13.add(Float.valueOf(f2 % ((Number) obj2).floatValue()));
                        }
/* 744 */               return arrayList13.toArray(new Float[0]);
                    }
/* 749 */           boolean z12 = obj instanceof double[];
/* 751 */           if (z12 && (obj2 instanceof Double)) {
/* 757 */               double[] dArr2 = (double[]) obj;
/* 762 */               ArrayList arrayList14 = new ArrayList(dArr2.length);
/* 766 */               for (double d2 : dArr2) {
/* 782 */                   arrayList14.add(Double.valueOf(d2 % ((Number) obj2).doubleValue()));
                        }
/* 790 */               return arrayList14.toArray(new Double[0]);
                    }
/* 797 */           if (z7 && (obj2 instanceof byte[])) {
/* 803 */               byte[] bArr3 = (byte[]) obj;
/* 805 */               int length4 = bArr3.length;
/* 806 */               byte[] bArr4 = (byte[]) obj2;
/* 809 */               zzjs.zza(this, length4, bArr4.length);
/* 812 */               IntRange intRangeM8048e = r02.m8048e(0, length4);
/* 822 */               ArrayList arrayList15 = new ArrayList(C2122qw.m8020h(intRangeM8048e, 10));
/* 825 */               Iterator it = intRangeM8048e.iterator();
/* 834 */               while (((yy0) it).f19856c) {
/* 839 */                   int iNextInt = ((wy0) it).nextInt();
/* 852 */                   arrayList15.add(Integer.valueOf(bArr3[iNextInt] % bArr4[iNextInt]));
                        }
/* 858 */               return arrayList15.toArray(new Integer[0]);
                    }
/* 863 */           if (z8 && (obj2 instanceof short[])) {
/* 869 */               short[] sArr3 = (short[]) obj;
/* 871 */               int length5 = sArr3.length;
/* 872 */               short[] sArr4 = (short[]) obj2;
/* 875 */               zzjs.zza(this, length5, sArr4.length);
/* 878 */               IntRange intRangeM8048e2 = r02.m8048e(0, length5);
/* 888 */               ArrayList arrayList16 = new ArrayList(C2122qw.m8020h(intRangeM8048e2, 10));
/* 891 */               Iterator it2 = intRangeM8048e2.iterator();
/* 900 */               while (((yy0) it2).f19856c) {
/* 905 */                   int iNextInt2 = ((wy0) it2).nextInt();
/* 918 */                   arrayList16.add(Integer.valueOf(sArr3[iNextInt2] % sArr4[iNextInt2]));
                        }
/* 924 */               return arrayList16.toArray(new Integer[0]);
                    }
/* 929 */           if (z9 && (obj2 instanceof int[])) {
/* 935 */               int[] iArr3 = (int[]) obj;
/* 937 */               int length6 = iArr3.length;
/* 938 */               int[] iArr4 = (int[]) obj2;
/* 941 */               zzjs.zza(this, length6, iArr4.length);
/* 944 */               IntRange intRangeM8048e3 = r02.m8048e(0, length6);
/* 954 */               ArrayList arrayList17 = new ArrayList(C2122qw.m8020h(intRangeM8048e3, 10));
/* 957 */               Iterator it3 = intRangeM8048e3.iterator();
/* 966 */               while (((yy0) it3).f19856c) {
/* 971 */                   int iNextInt3 = ((wy0) it3).nextInt();
/* 984 */                   arrayList17.add(Integer.valueOf(iArr3[iNextInt3] % iArr4[iNextInt3]));
                        }
/* 990 */               return arrayList17.toArray(new Integer[0]);
                    }
/* 995 */           if (z10 && (obj2 instanceof long[])) {
/* 1001 */              long[] jArr3 = (long[]) obj;
/* 1003 */              int length7 = jArr3.length;
/* 1004 */              long[] jArr4 = (long[]) obj2;
/* 1007 */              zzjs.zza(this, length7, jArr4.length);
/* 1010 */              IntRange intRangeM8048e4 = r02.m8048e(0, length7);
/* 1020 */              ArrayList arrayList18 = new ArrayList(C2122qw.m8020h(intRangeM8048e4, 10));
/* 1023 */              Iterator it4 = intRangeM8048e4.iterator();
/* 1032 */              while (((yy0) it4).f19856c) {
/* 1037 */                  int iNextInt4 = ((wy0) it4).nextInt();
/* 1050 */                  arrayList18.add(Long.valueOf(jArr3[iNextInt4] % jArr4[iNextInt4]));
                        }
/* 1056 */              return arrayList18.toArray(new Long[0]);
                    }
/* 1061 */          if (z11 && (obj2 instanceof float[])) {
/* 1067 */              float[] fArr3 = (float[]) obj;
/* 1069 */              int length8 = fArr3.length;
/* 1070 */              float[] fArr4 = (float[]) obj2;
/* 1073 */              zzjs.zza(this, length8, fArr4.length);
/* 1076 */              IntRange intRangeM8048e5 = r02.m8048e(0, length8);
/* 1086 */              ArrayList arrayList19 = new ArrayList(C2122qw.m8020h(intRangeM8048e5, 10));
/* 1089 */              Iterator it5 = intRangeM8048e5.iterator();
/* 1098 */              while (((yy0) it5).f19856c) {
/* 1103 */                  int iNextInt5 = ((wy0) it5).nextInt();
/* 1116 */                  arrayList19.add(Float.valueOf(fArr3[iNextInt5] % fArr4[iNextInt5]));
                        }
/* 1122 */              return arrayList19.toArray(new Float[0]);
                    }
/* 1127 */          if (!z12 || !(obj2 instanceof double[])) {
/* 1196 */              C1697u2.m5433i(4, 5, null);
/* 1195 */              return null;
                    }
/* 1133 */          double[] dArr3 = (double[]) obj;
/* 1135 */          int length9 = dArr3.length;
/* 1136 */          double[] dArr4 = (double[]) obj2;
/* 1139 */          zzjs.zza(this, length9, dArr4.length);
/* 1142 */          IntRange intRangeM8048e6 = r02.m8048e(0, length9);
/* 1152 */          ArrayList arrayList20 = new ArrayList(C2122qw.m8020h(intRangeM8048e6, 10));
/* 1155 */          Iterator it6 = intRangeM8048e6.iterator();
/* 1164 */          while (((yy0) it6).f19856c) {
/* 1169 */              int iNextInt6 = ((wy0) it6).nextInt();
/* 1182 */              arrayList20.add(Double.valueOf(dArr3[iNextInt6] % dArr4[iNextInt6]));
                    }
/* 1188 */          return arrayList20.toArray(new Double[0]);
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 75 */                C1697u2.m5433i(4, 3, null);
/* 78 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 70 */                C1697u2.m5433i(4, 5, null);
/* 73 */                return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 43 */            if (true != Objects.nonNull(objZza2)) {
/* 45 */                objZza2 = null;
                    }
/* 46 */            if (objZza2 == null) {
/* 66 */                C1697u2.m5433i(4, 5, null);
/* 69 */                return;
                    }
                    try {
/* 56 */                zzizVar.zzc().zze(i, zzb(objZza, objZza2));
                    } catch (ArithmeticException e) {
/* 62 */                C1697u2.m5433i(4, 6, e);
                    }
                }
            }
