            package com.google.android.gms.drive.metadata.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements ReflectedParcelable, Iterable<zzc> {
                public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new tc3(0);

                /* JADX INFO: renamed from: b */
                public static final AppVisibleCustomProperties f3680b = new AppVisibleCustomProperties(new HashMap().values());

                /* JADX INFO: renamed from: a */
                public final ArrayList f3681a;

                public AppVisibleCustomProperties(Collection collection) {
/* 4 */             kb1.m6061n(collection);
/* 12 */            this.f3681a = new ArrayList(collection);
                }

                /* JADX INFO: renamed from: D1 */
                public final Map m2032D1() {
/* 3 */             ArrayList<zzc> arrayList = this.f3681a;
/* 9 */             HashMap map = new HashMap(arrayList.size());
/* 20 */            for (zzc zzcVar : arrayList) {
/* 32 */                map.put(zzcVar.f3685a, zzcVar.f3686b);
                    }
/* 36 */            return Collections.unmodifiableMap(map);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || obj.getClass() != AppVisibleCustomProperties.class) {
/* 31 */                return false;
                    }
/* 26 */            return m2032D1().equals(((AppVisibleCustomProperties) obj).m2032D1());
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3681a});
                }

                @Override // java.lang.Iterable
                public final Iterator<zzc> iterator() {
/* 3 */             return this.f3681a.iterator();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 2, this.f3681a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
