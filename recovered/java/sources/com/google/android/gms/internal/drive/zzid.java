            package com.google.android.gms.internal.drive;

            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.metadata.CustomPropertyKey;
            import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
            import java.util.Arrays;
            import p000.C1959nc;
            import p000.jm3;
            import p000.ta1;
            import p000.zg3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public class zzid extends jm3 {
                public static final zg3 zzlc = new zzie();

                public zzid(int i) {
/* 30 */            super("customProperties", Arrays.asList("hasCustomProperties", "sqlId"), Arrays.asList("customPropertiesExtra", "customPropertiesExtraHolder"), 5000000);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzc(DataHolder dataHolder) {
/* 1 */             Bundle bundle = dataHolder.f3468f;
/* 3 */             if (bundle == null) {
/* 5 */                 return;
                    }
                    synchronized (dataHolder) {
                        try {
/* 13 */                    DataHolder dataHolder2 = (DataHolder) bundle.getParcelable("customPropertiesExtraHolder");
/* 15 */                    if (dataHolder2 != null) {
/* 17 */                        dataHolder2.close();
/* 22 */                        bundle.remove("customPropertiesExtraHolder");
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
                }

                private static AppVisibleCustomProperties zzf(DataHolder dataHolder, int i, int i2) {
/* 3 */             Bundle bundle = dataHolder.f3468f;
/* 7 */             SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
/* 11 */            if (sparseParcelableArray == null) {
/* 19 */                if (bundle.getParcelable("customPropertiesExtraHolder") != null) {
                            synchronized (dataHolder) {
/* 30 */                        DataHolder dataHolder2 = (DataHolder) dataHolder.f3468f.getParcelable("customPropertiesExtraHolder");
/* 32 */                        if (dataHolder2 != null) {
                                    try {
/* 40 */                                Bundle bundle2 = dataHolder2.f3468f;
/* 44 */                                String string = bundle2.getString("entryIdColumn");
/* 50 */                                String string2 = bundle2.getString("keyColumn");
/* 56 */                                String string3 = bundle2.getString("visibilityColumn");
/* 62 */                                String string4 = bundle2.getString("valueColumn");
/* 68 */                                ta1 ta1Var = new ta1();
/* 74 */                                for (int i3 = 0; i3 < dataHolder2.f3470v; i3++) {
/* 76 */                                    int iM2016H1 = dataHolder2.m2016H1(i3);
/* 80 */                                    long jM2014F1 = dataHolder2.m2014F1(i3, iM2016H1, string);
/* 84 */                                    String strM2015G1 = dataHolder2.m2015G1(i3, iM2016H1, string2);
/* 88 */                                    int iM2013E1 = dataHolder2.m2013E1(i3, iM2016H1, string3);
/* 103 */                                   com.google.android.gms.drive.metadata.internal.zzc zzcVar = new com.google.android.gms.drive.metadata.internal.zzc(new CustomPropertyKey(strM2015G1, iM2013E1), dataHolder2.m2015G1(i3, iM2016H1, string4));
/* 110 */                                   C1959nc c1959nc = (C1959nc) ta1Var.m8754c(jM2014F1);
/* 112 */                                   if (c1959nc == null) {
/* 116 */                                       c1959nc = new C1959nc();
/* 119 */                                       ta1Var.m8755d(c1959nc, jM2014F1);
                                            }
/* 129 */                                   c1959nc.f14179a.put(zzcVar.f3685a, zzcVar);
                                        }
/* 137 */                               SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
/* 143 */                               for (int i4 = 0; i4 < dataHolder.f3470v; i4++) {
/* 159 */                                   C1959nc c1959nc2 = (C1959nc) ta1Var.m8754c(dataHolder.m2014F1(i4, dataHolder.m2016H1(i4), "sqlId"));
/* 161 */                                   if (c1959nc2 != null) {
/* 174 */                                       sparseArray.append(i4, new AppVisibleCustomProperties(c1959nc2.f14179a.values()));
                                            }
                                        }
/* 184 */                               dataHolder.f3468f.putSparseParcelableArray("customPropertiesExtra", sparseArray);
/* 187 */                               dataHolder2.close();
/* 194 */                               dataHolder.f3468f.remove("customPropertiesExtraHolder");
                                    } catch (Throwable th) {
/* 205 */                               dataHolder2.close();
/* 212 */                               dataHolder.f3468f.remove("customPropertiesExtraHolder");
/* 215 */                               throw th;
                                    }
                                }
                            }
/* 200 */                   sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
                        }
/* 218 */               if (sparseParcelableArray == null) {
/* 220 */                   return AppVisibleCustomProperties.f3680b;
                        }
                    }
/* 231 */           return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.f3680b);
                }

                @Override // p000.sc3
/* 31 */        public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
/* 32 */            return zzf(dataHolder, i, i2);
                }
            }
