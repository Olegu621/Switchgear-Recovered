            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import kotlin.collections.C1839a;
            import p000.C2103qd;
            import p000.C2122qw;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzju implements zzjt {
                public static final zzju zza = new zzju();

                private zzju() {
                }

                private static final List zzc(Object obj) {
/* 4 */             int i = 0;
/* 5 */             if (obj instanceof byte[]) {
/* 7 */                 byte[] bArr = (byte[]) obj;
/* 9 */                 int length = bArr.length;
/* 10 */                if (length == 0) {
/* 47 */                    return nd0.f14189a;
                        }
/* 12 */                if (length == 1) {
/* 42 */                    return C1839a.m6210b(Byte.valueOf(bArr[0]));
                        }
/* 17 */                ArrayList arrayList = new ArrayList(bArr.length);
/* 20 */                int length2 = bArr.length;
/* 21 */                while (i < length2) {
/* 29 */                    arrayList.add(Byte.valueOf(bArr[i]));
/* 32 */                    i++;
                        }
/* 35 */                return arrayList;
                    }
/* 52 */            if (obj instanceof short[]) {
/* 54 */                short[] sArr = (short[]) obj;
/* 56 */                int length3 = sArr.length;
/* 57 */                if (length3 == 0) {
/* 94 */                    return nd0.f14189a;
                        }
/* 59 */                if (length3 == 1) {
/* 89 */                    return C1839a.m6210b(Short.valueOf(sArr[0]));
                        }
/* 64 */                ArrayList arrayList2 = new ArrayList(sArr.length);
/* 67 */                int length4 = sArr.length;
/* 68 */                while (i < length4) {
/* 76 */                    arrayList2.add(Short.valueOf(sArr[i]));
/* 79 */                    i++;
                        }
/* 82 */                return arrayList2;
                    }
/* 99 */            if (obj instanceof int[]) {
/* 101 */               int[] iArr = (int[]) obj;
/* 103 */               int length5 = iArr.length;
/* 104 */               if (length5 == 0) {
/* 141 */                   return nd0.f14189a;
                        }
/* 106 */               if (length5 == 1) {
/* 136 */                   return C1839a.m6210b(Integer.valueOf(iArr[0]));
                        }
/* 111 */               ArrayList arrayList3 = new ArrayList(iArr.length);
/* 114 */               int length6 = iArr.length;
/* 115 */               while (i < length6) {
/* 123 */                   arrayList3.add(Integer.valueOf(iArr[i]));
/* 126 */                   i++;
                        }
/* 129 */               return arrayList3;
                    }
/* 146 */           if (obj instanceof long[]) {
/* 150 */               return C2103qd.m7778m((long[]) obj);
                    }
/* 157 */           if (obj instanceof float[]) {
/* 159 */               float[] fArr = (float[]) obj;
/* 161 */               int length7 = fArr.length;
/* 162 */               if (length7 == 0) {
/* 199 */                   return nd0.f14189a;
                        }
/* 164 */               if (length7 == 1) {
/* 194 */                   return C1839a.m6210b(Float.valueOf(fArr[0]));
                        }
/* 169 */               ArrayList arrayList4 = new ArrayList(fArr.length);
/* 172 */               int length8 = fArr.length;
/* 173 */               while (i < length8) {
/* 181 */                   arrayList4.add(Float.valueOf(fArr[i]));
/* 184 */                   i++;
                        }
/* 187 */               return arrayList4;
                    }
/* 204 */           if (!(obj instanceof double[])) {
/* 206 */               return null;
                    }
/* 208 */           double[] dArr = (double[]) obj;
/* 210 */           int length9 = dArr.length;
/* 211 */           if (length9 == 0) {
/* 248 */               return nd0.f14189a;
                    }
/* 213 */           if (length9 == 1) {
/* 243 */               return C1839a.m6210b(Double.valueOf(dArr[0]));
                    }
/* 218 */           ArrayList arrayList5 = new ArrayList(dArr.length);
/* 221 */           int length10 = dArr.length;
/* 222 */           while (i < length10) {
/* 230 */               arrayList5.add(Double.valueOf(dArr[i]));
/* 233 */               i++;
                    }
/* 236 */           return arrayList5;
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
/* 1 */             List listZzc = zzc(obj);
/* 5 */             List listZzc2 = zzc(obj2);
/* 14 */            if (obj instanceof Number) {
/* 18 */                if (obj2 instanceof Number) {
/* 36 */                    return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
                        }
/* 41 */                if (listZzc2 != null) {
/* 49 */                    ArrayList arrayList = new ArrayList(C2122qw.m8020h(listZzc2, 10));
/* 52 */                    Iterator it = listZzc2.iterator();
/* 60 */                    while (it.hasNext()) {
/* 87 */                        arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                            }
/* 93 */                    return arrayList.toArray(new Double[0]);
                        }
                    }
/* 98 */            if (listZzc != null && (obj2 instanceof Number)) {
/* 110 */               ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(listZzc, 10));
/* 113 */               Iterator it2 = listZzc.iterator();
/* 121 */               while (it2.hasNext()) {
/* 148 */                   arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
                        }
/* 154 */               return arrayList2.toArray(new Double[0]);
                    }
/* 159 */           if (listZzc == null || listZzc2 == null) {
/* 219 */               C1697u2.m5433i(4, 5, null);
/* 218 */               return null;
                    }
/* 171 */           zzjs.zza(this, listZzc.size(), listZzc2.size());
/* 174 */           int size = listZzc.size();
/* 178 */           Double[] dArr = new Double[size];
/* 180 */           for (int i = 0; i < size; i++) {
/* 210 */               dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
                    }
/* 215 */           return dArr;
                }
            }
