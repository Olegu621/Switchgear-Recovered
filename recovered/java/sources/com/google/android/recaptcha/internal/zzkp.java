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
            public final class zzkp implements zzjt {
                public static final zzkp zza = new zzkp();

                private zzkp() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 69 */                C1697u2.m5433i(4, 3, null);
/* 72 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 64 */                C1697u2.m5433i(4, 5, null);
/* 67 */                return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 43 */            if (true != Objects.nonNull(objZza2)) {
/* 45 */                objZza2 = null;
                    }
/* 46 */            if (objZza2 != null) {
/* 56 */                zzizVar.zzc().zze(i, zzb(objZza, objZza2));
                    } else {
/* 60 */                C1697u2.m5433i(4, 5, null);
                    }
                }

                public final Object zzb(Object obj, Object obj2) throws zzdm {
/* 1 */             boolean z = obj instanceof Byte;
/* 3 */             if (z && (obj2 instanceof Byte)) {
/* 23 */                return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
                    }
/* 28 */            boolean z2 = obj instanceof Short;
/* 30 */            if (z2 && (obj2 instanceof Short)) {
/* 50 */                return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
                    }
/* 55 */            boolean z3 = obj instanceof Integer;
/* 57 */            if (z3 && (obj2 instanceof Integer)) {
/* 76 */                return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
                    }
/* 81 */            boolean z4 = obj instanceof Long;
/* 83 */            if (z4 && (obj2 instanceof Long)) {
/* 102 */               return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
                    }
/* 109 */           int i = 0;
/* 110 */           if (obj instanceof String) {
/* 114 */               if (obj2 instanceof Byte) {
/* 120 */                   byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
/* 126 */                   int length = bytes.length;
/* 127 */                   ArrayList arrayList = new ArrayList(length);
/* 130 */                   while (i < length) {
/* 147 */                       arrayList.add(Byte.valueOf((byte) (bytes[i] ^ ((Number) obj2).byteValue())));
/* 150 */                       i++;
                            }
/* 153 */                   return CollectionsKt.m6189H(arrayList);
                        }
/* 160 */               if (obj2 instanceof Integer) {
/* 164 */                   char[] charArray = ((String) obj).toCharArray();
/* 170 */                   int length2 = charArray.length;
/* 171 */                   ArrayList arrayList2 = new ArrayList(length2);
/* 174 */                   while (i < length2) {
/* 190 */                       arrayList2.add(Integer.valueOf(charArray[i] ^ ((Number) obj2).intValue()));
/* 193 */                       i++;
                            }
/* 196 */                   return CollectionsKt.m6191J(arrayList2);
                        }
                    }
/* 201 */           if (z && (obj2 instanceof byte[])) {
/* 207 */               byte[] bArr = (byte[]) obj2;
/* 212 */               ArrayList arrayList3 = new ArrayList(bArr.length);
/* 216 */               for (byte b : bArr) {
/* 233 */                   arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
                        }
/* 241 */               return arrayList3.toArray(new Byte[0]);
                    }
/* 246 */           if (z2 && (obj2 instanceof short[])) {
/* 252 */               short[] sArr = (short[]) obj2;
/* 257 */               ArrayList arrayList4 = new ArrayList(sArr.length);
/* 261 */               for (short s : sArr) {
/* 278 */                   arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
                        }
/* 286 */               return arrayList4.toArray(new Short[0]);
                    }
/* 291 */           if (z3 && (obj2 instanceof int[])) {
/* 297 */               int[] iArr = (int[]) obj2;
/* 302 */               ArrayList arrayList5 = new ArrayList(iArr.length);
/* 306 */               for (int i2 : iArr) {
/* 322 */                   arrayList5.add(Integer.valueOf(i2 ^ ((Number) obj).intValue()));
                        }
/* 330 */               return arrayList5.toArray(new Integer[0]);
                    }
/* 335 */           if (z4 && (obj2 instanceof long[])) {
/* 341 */               long[] jArr = (long[]) obj2;
/* 346 */               ArrayList arrayList6 = new ArrayList(jArr.length);
/* 350 */               for (long j : jArr) {
/* 366 */                   arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
                        }
/* 374 */               return arrayList6.toArray(new Long[0]);
                    }
/* 379 */           boolean z5 = obj instanceof byte[];
/* 381 */           if (z5 && (obj2 instanceof Byte)) {
/* 387 */               byte[] bArr2 = (byte[]) obj;
/* 392 */               ArrayList arrayList7 = new ArrayList(bArr2.length);
/* 396 */               for (byte b2 : bArr2) {
/* 413 */                   arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
                        }
/* 421 */               return arrayList7.toArray(new Byte[0]);
                    }
/* 426 */           boolean z6 = obj instanceof short[];
/* 428 */           if (z6 && (obj2 instanceof Short)) {
/* 434 */               short[] sArr2 = (short[]) obj;
/* 439 */               ArrayList arrayList8 = new ArrayList(sArr2.length);
/* 443 */               for (short s2 : sArr2) {
/* 460 */                   arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
                        }
/* 468 */               return arrayList8.toArray(new Short[0]);
                    }
/* 473 */           boolean z7 = obj instanceof int[];
/* 475 */           if (z7 && (obj2 instanceof Integer)) {
/* 481 */               int[] iArr2 = (int[]) obj;
/* 486 */               ArrayList arrayList9 = new ArrayList(iArr2.length);
/* 490 */               for (int i3 : iArr2) {
/* 506 */                   arrayList9.add(Integer.valueOf(i3 ^ ((Number) obj2).intValue()));
                        }
/* 514 */               return arrayList9.toArray(new Integer[0]);
                    }
/* 519 */           boolean z8 = obj instanceof long[];
/* 521 */           if (z8 && (obj2 instanceof Long)) {
/* 527 */               long[] jArr2 = (long[]) obj;
/* 532 */               ArrayList arrayList10 = new ArrayList(jArr2.length);
/* 536 */               for (long j2 : jArr2) {
/* 552 */                   arrayList10.add(Long.valueOf(j2 ^ ((Number) obj2).longValue()));
                        }
/* 560 */               return arrayList10.toArray(new Long[0]);
                    }
/* 567 */           if (z5 && (obj2 instanceof byte[])) {
/* 573 */               byte[] bArr3 = (byte[]) obj;
/* 575 */               int length3 = bArr3.length;
/* 576 */               byte[] bArr4 = (byte[]) obj2;
/* 579 */               zzjs.zza(this, length3, bArr4.length);
/* 582 */               IntRange intRangeM8048e = r02.m8048e(0, length3);
/* 592 */               ArrayList arrayList11 = new ArrayList(C2122qw.m8020h(intRangeM8048e, 10));
/* 595 */               Iterator it = intRangeM8048e.iterator();
/* 604 */               while (((yy0) it).f19856c) {
/* 609 */                   int iNextInt = ((wy0) it).nextInt();
/* 623 */                   arrayList11.add(Byte.valueOf((byte) (bArr4[iNextInt] ^ bArr3[iNextInt])));
                        }
/* 629 */               return arrayList11.toArray(new Byte[0]);
                    }
/* 634 */           if (z6 && (obj2 instanceof short[])) {
/* 640 */               short[] sArr3 = (short[]) obj;
/* 642 */               int length4 = sArr3.length;
/* 643 */               short[] sArr4 = (short[]) obj2;
/* 646 */               zzjs.zza(this, length4, sArr4.length);
/* 649 */               IntRange intRangeM8048e2 = r02.m8048e(0, length4);
/* 659 */               ArrayList arrayList12 = new ArrayList(C2122qw.m8020h(intRangeM8048e2, 10));
/* 662 */               Iterator it2 = intRangeM8048e2.iterator();
/* 671 */               while (((yy0) it2).f19856c) {
/* 676 */                   int iNextInt2 = ((wy0) it2).nextInt();
/* 690 */                   arrayList12.add(Short.valueOf((short) (sArr4[iNextInt2] ^ sArr3[iNextInt2])));
                        }
/* 696 */               return arrayList12.toArray(new Short[0]);
                    }
/* 701 */           if (z7 && (obj2 instanceof int[])) {
/* 707 */               int[] iArr3 = (int[]) obj;
/* 709 */               int length5 = iArr3.length;
/* 710 */               int[] iArr4 = (int[]) obj2;
/* 713 */               zzjs.zza(this, length5, iArr4.length);
/* 716 */               IntRange intRangeM8048e3 = r02.m8048e(0, length5);
/* 726 */               ArrayList arrayList13 = new ArrayList(C2122qw.m8020h(intRangeM8048e3, 10));
/* 729 */               Iterator it3 = intRangeM8048e3.iterator();
/* 738 */               while (((yy0) it3).f19856c) {
/* 743 */                   int iNextInt3 = ((wy0) it3).nextInt();
/* 756 */                   arrayList13.add(Integer.valueOf(iArr4[iNextInt3] ^ iArr3[iNextInt3]));
                        }
/* 762 */               return arrayList13.toArray(new Integer[0]);
                    }
/* 767 */           if (!z8 || !(obj2 instanceof long[])) {
/* 837 */               C1697u2.m5433i(4, 5, null);
/* 836 */               return null;
                    }
/* 773 */           long[] jArr3 = (long[]) obj;
/* 775 */           int length6 = jArr3.length;
/* 776 */           long[] jArr4 = (long[]) obj2;
/* 779 */           zzjs.zza(this, length6, jArr4.length);
/* 782 */           IntRange intRangeM8048e4 = r02.m8048e(0, length6);
/* 792 */           ArrayList arrayList14 = new ArrayList(C2122qw.m8020h(intRangeM8048e4, 10));
/* 795 */           Iterator it4 = intRangeM8048e4.iterator();
/* 804 */           while (((yy0) it4).f19856c) {
/* 809 */               int iNextInt4 = ((wy0) it4).nextInt();
/* 823 */               arrayList14.add(Long.valueOf(jArr3[iNextInt4] ^ jArr4[iNextInt4]));
                    }
/* 829 */           return arrayList14.toArray(new Long[0]);
                }
            }
