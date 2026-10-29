            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdp extends zzcr {
                static final zzcr zza = new zzdp(null, new Object[0], 0);
                final transient Object[] zzb;
                private final transient Object zzc;
                private final transient int zzd;

                private zzdp(Object obj, Object[] objArr, int i) {
/* 4 */             this.zzc = obj;
/* 6 */             this.zzb = objArr;
/* 8 */             this.zzd = i;
                }

                /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
                /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
                /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v14 */
                /* JADX WARN: Type inference failed for: r3v18 */
                /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v22 */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v26 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v31 */
                /* JADX WARN: Type inference failed for: r3v32 */
                /* JADX WARN: Type inference failed for: r3v8 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                public static zzdp zzg(int i, Object[] objArr, zzcq zzcqVar) {
                    boolean z;
                    int i2;
                    char c;
                    ?? r3;
                    char c2;
                    short[] sArr;
                    boolean z2;
                    int i3;
                    ?? r16;
                    boolean z3;
                    ?? r4;
                    Object[] objArr2;
                    zzcp zzcpVar;
                    boolean z4;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 11 */                return (zzdp) zza;
                    }
/* 14 */            zzcp zzcpVar2 = null;
/* 14 */            ?? r5 = 0;
/* 14 */            zzcp zzcpVar3 = null;
/* 14 */            zzcp zzcpVar4 = null;
/* 15 */            boolean z5 = false;
/* 16 */            int i5 = 1;
/* 17 */            if (i4 == 1) {
/* 19 */                Object obj = objArrCopyOf[0];
/* 21 */                Objects.requireNonNull(obj);
/* 24 */                Object obj2 = objArrCopyOf[1];
/* 26 */                Objects.requireNonNull(obj2);
/* 29 */                zzbw.zzb(obj, obj2);
/* 34 */                return new zzdp(null, objArrCopyOf, 1);
                    }
/* 42 */            zzbe.zzb(i4, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
/* 45 */            int iZzh = zzcv.zzh(i4);
/* 49 */            char c3 = 2;
/* 50 */            if (i4 != 1) {
/* 74 */                int i6 = iZzh - 1;
/* 80 */                if (iZzh <= 128) {
/* 82 */                    byte[] bArr = new byte[iZzh];
/* 84 */                    Arrays.fill(bArr, (byte) -1);
/* 87 */                    int i7 = 0;
/* 88 */                    int i8 = 0;
/* 89 */                    while (i7 < i4) {
/* 91 */                        int i9 = i8 + i8;
/* 93 */                        int i10 = i7 + i7;
/* 95 */                        Object obj3 = objArrCopyOf[i10];
/* 97 */                        Objects.requireNonNull(obj3);
/* 101 */                       Object obj4 = objArrCopyOf[i10 ^ i5];
/* 103 */                       Objects.requireNonNull(obj4);
/* 106 */                       zzbw.zzb(obj3, obj4);
/* 113 */                       int iZza = zzcg.zza(obj3.hashCode());
                                while (true) {
/* 117 */                           int i11 = iZza & i6;
/* 118 */                           z2 = z5;
/* 122 */                           i3 = i5;
/* 126 */                           int i12 = bArr[i11] & 255;
/* 127 */                           if (i12 == 255) {
/* 130 */                               bArr[i11] = (byte) i9;
/* 132 */                               if (i8 < i7) {
/* 134 */                                   objArrCopyOf[i9] = obj3;
/* 138 */                                   objArrCopyOf[i9 ^ 1] = obj4;
                                        }
/* 140 */                               i8++;
                                        break;
                                    }
/* 149 */                           if (obj3.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
/* 151 */                               int i13 = ~i12;
/* 155 */                               Object obj5 = objArrCopyOf[i13 == true ? 1 : 0];
/* 157 */                               Objects.requireNonNull(obj5);
/* 160 */                               zzcp zzcpVar5 = new zzcp(obj3, obj4, obj5);
/* 163 */                               objArrCopyOf[i13 == true ? 1 : 0] = obj4;
/* 165 */                               zzcpVar3 = zzcpVar5;
                                        break;
                                    }
/* 173 */                           iZza = i11 + 1;
/* 175 */                           z5 = z2;
/* 177 */                           i5 = i3;
                                }
/* 166 */                       i7++;
/* 168 */                       z5 = z2;
/* 170 */                       i5 = i3;
                            }
/* 180 */                   z = z5;
/* 182 */                   i2 = i5;
/* 184 */                   if (i8 == i4) {
/* 186 */                       r5 = bArr;
                                z4 = z;
                            } else {
/* 188 */                       sArr = new Object[3];
/* 190 */                       sArr[z ? 1 : 0] = bArr;
/* 196 */                       sArr[i2] = Integer.valueOf(i8);
/* 198 */                       sArr[2] = zzcpVar3;
/* 200 */                       r5 = sArr;
                                z4 = z;
                            }
                        } else {
/* 203 */                   z = false;
/* 205 */                   i2 = 1;
/* 210 */                   if (iZzh <= 32768) {
/* 212 */                       sArr = new short[iZzh];
/* 214 */                       Arrays.fill(sArr, (short) -1);
/* 219 */                       int i14 = 0;
/* 220 */                       for (int i15 = 0; i15 < i4; i15++) {
/* 222 */                           int i16 = i14 + i14;
/* 224 */                           int i17 = i15 + i15;
/* 226 */                           Object obj6 = objArrCopyOf[i17];
/* 228 */                           Objects.requireNonNull(obj6);
/* 233 */                           Object obj7 = objArrCopyOf[i17 ^ 1];
/* 235 */                           Objects.requireNonNull(obj7);
/* 238 */                           zzbw.zzb(obj6, obj7);
/* 245 */                           int iZza2 = zzcg.zza(obj6.hashCode());
                                    while (true) {
/* 249 */                               int i18 = iZza2 & i6;
/* 252 */                               char c4 = (char) sArr[i18];
/* 256 */                               if (c4 == 65535) {
/* 259 */                                   sArr[i18] = (short) i16;
/* 261 */                                   if (i14 < i15) {
/* 263 */                                       objArrCopyOf[i16] = obj6;
/* 267 */                                       objArrCopyOf[i16 ^ 1] = obj7;
                                            }
/* 269 */                                   i14++;
                                            break;
                                        }
/* 278 */                               if (obj6.equals(objArrCopyOf[c4])) {
/* 280 */                                   int i19 = c4 ^ 1;
/* 284 */                                   Object obj8 = objArrCopyOf[i19 == true ? 1 : 0];
/* 286 */                                   Objects.requireNonNull(obj8);
/* 289 */                                   zzcp zzcpVar6 = new zzcp(obj6, obj7, obj8);
/* 292 */                                   objArrCopyOf[i19 == true ? 1 : 0] = obj7;
/* 294 */                                   zzcpVar4 = zzcpVar6;
                                            break;
                                        }
/* 298 */                               iZza2 = i18 + 1;
                                    }
                                }
/* 301 */                       if (i14 == i4) {
/* 200 */                           r5 = sArr;
                                    z4 = z;
                                } else {
/* 304 */                           r5 = new Object[]{sArr, Integer.valueOf(i14), zzcpVar4};
                                    z4 = z;
                                }
                            } else {
/* 319 */                       int[] iArr = new int[iZzh];
/* 321 */                       Arrays.fill(iArr, -1);
/* 324 */                       int i20 = 0;
/* 326 */                       int i21 = 0;
/* 327 */                       while (i20 < i4) {
/* 329 */                           int i22 = i21 + i21;
/* 331 */                           int i23 = i20 + i20;
/* 333 */                           Object obj9 = objArrCopyOf[i23];
/* 335 */                           Objects.requireNonNull(obj9);
/* 340 */                           Object obj10 = objArrCopyOf[i23 ^ 1];
/* 342 */                           Objects.requireNonNull(obj10);
/* 345 */                           zzbw.zzb(obj9, obj10);
/* 352 */                           int iZza3 = zzcg.zza(obj9.hashCode());
                                    while (true) {
/* 356 */                               int i24 = iZza3 & i6;
/* 357 */                               int i25 = iArr[i24];
/* 359 */                               if (i25 == -1) {
/* 361 */                                   iArr[i24] = i22;
/* 363 */                                   if (i21 < i20) {
/* 365 */                                       objArrCopyOf[i22] = obj9;
/* 369 */                                       objArrCopyOf[i22 ^ 1] = obj10;
                                            }
/* 371 */                                   i21++;
/* 373 */                                   c2 = c3;
                                            break;
                                        }
/* 376 */                               c2 = c3;
/* 384 */                               if (obj9.equals(objArrCopyOf[i25])) {
/* 386 */                                   int i26 = i25 ^ 1;
/* 390 */                                   Object obj11 = objArrCopyOf[i26];
/* 392 */                                   Objects.requireNonNull(obj11);
/* 395 */                                   zzcp zzcpVar7 = new zzcp(obj9, obj10, obj11);
/* 398 */                                   objArrCopyOf[i26] = obj10;
/* 400 */                                   zzcpVar2 = zzcpVar7;
                                            break;
                                        }
/* 406 */                               iZza3 = i24 + 1;
/* 408 */                               c3 = c2;
                                    }
/* 401 */                           i20++;
/* 403 */                           c3 = c2;
                                }
/* 411 */                       c = c3;
/* 413 */                       if (i21 == i4) {
/* 415 */                           r3 = iArr;
                                    r16 = z;
                                } else {
/* 417 */                           Object[] objArr3 = new Object[3];
/* 419 */                           objArr3[0] = iArr;
/* 425 */                           objArr3[1] = Integer.valueOf(i21);
/* 427 */                           objArr3[c] = zzcpVar2;
/* 429 */                           r3 = objArr3;
                                    r16 = z;
                                }
                            }
                        }
/* 430 */               z3 = r3 instanceof Object[];
                        r4 = r3;
/* 432 */               if (z3) {
/* 434 */                   objArr2 = (Object[]) r3;
/* 438 */                   zzcpVar = (zzcp) objArr2[c];
/* 440 */                   if (zzcqVar != null) {
/* 467 */                       throw zzcpVar.zza();
                            }
/* 442 */                   zzcqVar.zzc = zzcpVar;
/* 444 */                   Object obj12 = objArr2[r16];
/* 450 */                   int iIntValue = ((Integer) objArr2[i2]).intValue();
/* 456 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 460 */                   r4 = obj12;
/* 461 */                   i4 = iIntValue;
                        }
/* 470 */               return new zzdp(r4, objArrCopyOf, i4);
                    }
/* 52 */            Object obj13 = objArrCopyOf[0];
/* 54 */            Objects.requireNonNull(obj13);
/* 57 */            Object obj14 = objArrCopyOf[1];
/* 59 */            Objects.requireNonNull(obj14);
/* 62 */            zzbw.zzb(obj13, obj14);
/* 65 */            z4 = false;
/* 67 */            i4 = 1;
/* 68 */            i2 = 1;
/* 70 */            c = 2;
                    r3 = r5;
                    r16 = z4;
/* 430 */           z3 = r3 instanceof Object[];
                    r4 = r3;
/* 432 */           if (z3) {
/* 434 */               objArr2 = (Object[]) r3;
/* 438 */               zzcpVar = (zzcp) objArr2[c];
/* 440 */               if (zzcqVar != null) {
/* 467 */                   throw zzcpVar.zza();
                        }
/* 442 */               zzcqVar.zzc = zzcpVar;
/* 444 */               Object obj15 = objArr2[r16];
/* 450 */               int iIntValue2 = ((Integer) objArr2[i2]).intValue();
/* 456 */               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
/* 460 */               r4 = obj15;
/* 461 */               i4 = iIntValue2;
                    }
/* 470 */           return new zzdp(r4, objArrCopyOf, i4);
                }

                /* JADX WARN: Code duplicated, block: B:4:0x0003  */
                @Override // com.google.android.gms.internal.play_billing.zzcr, java.util.Map
                public final Object get(Object obj) {
                    Object obj2;
/* 2 */             if (obj == null) {
/* 4 */                 obj2 = null;
                    } else {
/* 7 */                 int i = this.zzd;
/* 9 */                 Object[] objArr = this.zzb;
/* 12 */                if (i == 1) {
/* 15 */                    Object obj3 = objArr[0];
/* 17 */                    Objects.requireNonNull(obj3);
/* 24 */                    if (obj3.equals(obj)) {
/* 26 */                        obj2 = objArr[1];
/* 28 */                        Objects.requireNonNull(obj2);
                            } else {
/* 4 */                         obj2 = null;
                            }
                        } else {
/* 33 */                    Object obj4 = this.zzc;
/* 35 */                    if (obj4 == null) {
/* 4 */                         obj2 = null;
                            } else if (obj4 instanceof byte[]) {
/* 44 */                        byte[] bArr = (byte[]) obj4;
/* 47 */                        int length = bArr.length - 1;
/* 53 */                        int iZza = zzcg.zza(obj.hashCode());
                                while (true) {
/* 57 */                            int i2 = iZza & length;
/* 62 */                            int i3 = bArr[i2] & 255;
/* 63 */                            if (i3 == 255) {
                                        break;
                                    }
/* 72 */                            if (obj.equals(objArr[i3])) {
/* 76 */                                obj2 = objArr[i3 ^ 1];
                                    } else {
/* 79 */                                iZza = i2 + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            } else if (obj4 instanceof short[]) {
/* 87 */                        short[] sArr = (short[]) obj4;
/* 90 */                        int length2 = sArr.length - 1;
/* 96 */                        int iZza2 = zzcg.zza(obj.hashCode());
                                while (true) {
/* 100 */                           int i4 = iZza2 & length2;
/* 103 */                           char c = (char) sArr[i4];
/* 107 */                           if (c == 65535) {
                                        break;
                                    }
/* 116 */                           if (obj.equals(objArr[c])) {
/* 120 */                               obj2 = objArr[c ^ 1];
                                    } else {
/* 123 */                               iZza2 = i4 + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            } else {
/* 126 */                       int[] iArr = (int[]) obj4;
/* 129 */                       int length3 = iArr.length - 1;
/* 134 */                       int iZza3 = zzcg.zza(obj.hashCode());
                                while (true) {
/* 138 */                           int i5 = iZza3 & length3;
/* 139 */                           int i6 = iArr[i5];
/* 141 */                           if (i6 == -1) {
                                        break;
                                    }
/* 151 */                           if (obj.equals(objArr[i6])) {
/* 155 */                               obj2 = objArr[i6 ^ 1];
                                    } else {
/* 161 */                               iZza3 = i5 + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            }
                        }
                    }
/* 157 */           if (obj2 == null) {
/* 1 */                 return null;
                    }
/* 160 */           return obj2;
                }

                @Override // java.util.Map
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcr
                public final zzcj zza() {
/* 8 */             return new zzdo(this.zzb, 1, this.zzd);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcr
                public final zzcv zzd() {
/* 8 */             return new zzdm(this, this.zzb, 0, this.zzd);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcr
                public final zzcv zze() {
/* 13 */            return new zzdn(this, new zzdo(this.zzb, 0, this.zzd));
                }
            }
