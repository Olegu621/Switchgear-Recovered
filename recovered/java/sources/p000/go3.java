            package p000;

            import android.os.Bundle;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
            import com.google.android.gms.drive.metadata.internal.zzq;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 248 */   public final class go3 extends ll3 {

                /* JADX INFO: renamed from: a */
                public static final hp3 f8755a = new hp3();

                @Override // p000.sc3
                public final Object zzc(DataHolder dataHolder, int i, int i2) {
/* 3 */             Bundle bundle = dataHolder.f3468f;
/* 7 */             ArrayList parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
/* 11 */            if (parcelableArrayList == null) {
/* 19 */                if (bundle.getParcelable("parentsExtraHolder") != null) {
                            synchronized (dataHolder) {
/* 30 */                        DataHolder dataHolder2 = (DataHolder) dataHolder.f3468f.getParcelable("parentsExtraHolder");
/* 32 */                        if (dataHolder2 != null) {
                                    try {
/* 40 */                                int i3 = dataHolder.f3470v;
/* 44 */                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i3);
/* 49 */                                HashMap map = new HashMap(i3);
/* 54 */                                for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                                    int iM2016H1 = dataHolder.m2016H1(i4);
/* 67 */                                    ParentDriveIdSet parentDriveIdSet = new ParentDriveIdSet(new ArrayList());
/* 70 */                                    arrayList.add(parentDriveIdSet);
/* 83 */                                    map.put(Long.valueOf(dataHolder.m2014F1(i4, iM2016H1, "sqlId")), parentDriveIdSet);
                                        }
/* 91 */                                Bundle bundle2 = dataHolder2.f3468f;
/* 95 */                                String string = bundle2.getString("childSqlIdColumn");
/* 101 */                               String string2 = bundle2.getString("parentSqlIdColumn");
/* 107 */                               String string3 = bundle2.getString("parentResIdColumn");
/* 111 */                               int i5 = dataHolder2.f3470v;
/* 113 */                               for (int i6 = 0; i6 < i5; i6++) {
/* 115 */                                   int iM2016H2 = dataHolder2.m2016H1(i6);
/* 149 */                                   ((ParentDriveIdSet) map.get(Long.valueOf(dataHolder2.m2014F1(i6, iM2016H2, string)))).f3684a.add(new zzq(dataHolder2.m2015G1(i6, iM2016H2, string3), dataHolder2.m2014F1(i6, iM2016H2, string2), 1));
                                        }
/* 159 */                               dataHolder.f3468f.putParcelableArrayList("parentsExtra", arrayList);
/* 162 */                               dataHolder2.close();
/* 169 */                               dataHolder.f3468f.remove("parentsExtraHolder");
                                    } catch (Throwable th) {
/* 180 */                               dataHolder2.close();
/* 187 */                               dataHolder.f3468f.remove("parentsExtraHolder");
/* 190 */                               throw th;
                                    }
                                }
                            }
/* 175 */                   parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
                        }
/* 193 */               if (parcelableArrayList == null) {
/* 195 */                   return null;
                        }
                    }
/* 199 */           long j = bundle.getLong("dbInstanceId");
/* 209 */           ParentDriveIdSet parentDriveIdSet2 = (ParentDriveIdSet) parcelableArrayList.get(i);
/* 213 */           HashSet hashSet = new HashSet();
/* 226 */           for (zzq zzqVar : parentDriveIdSet2.f3684a) {
/* 245 */               hashSet.add(new DriveId(zzqVar.f3687a, zzqVar.f3688b, j, zzqVar.f3689c));
                    }
/* 249 */           return hashSet;
                }

                @Override // p000.ll3, p000.sc3
                /* JADX INFO: renamed from: zzc */
/* 249 */       public final Collection zzb(Bundle bundle) {
/* 250 */           Collection<Parcelable> collectionZzb = super.zzb(bundle);
                    if (collectionZzb == null) {
                        return null;
                    }
/* 251 */           return new HashSet(collectionZzb);
                }
            }
