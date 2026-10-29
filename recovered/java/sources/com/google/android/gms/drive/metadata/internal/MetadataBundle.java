            package com.google.android.gms.drive.metadata.internal;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.BitmapTeleporter;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.drive.zzhs;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Set;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.de3;
            import p000.hg3;
            import p000.ii1;
            import p000.kb1;
            import p000.mr0;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class MetadataBundle extends AbstractSafeParcelable implements ReflectedParcelable {

                /* JADX INFO: renamed from: a */
                public final Bundle f3683a;

                /* JADX INFO: renamed from: b */
                public static final mr0 f3682b = new mr0("MetadataBundle", HttpUrl.FRAGMENT_ENCODE_SET);
                public static final Parcelable.Creator<MetadataBundle> CREATOR = new tf3(25);

                public MetadataBundle(Bundle bundle) {
/* 4 */             kb1.m6061n(bundle);
/* 7 */             this.f3683a = bundle;
/* 15 */            bundle.setClassLoader(MetadataBundle.class.getClassLoader());
/* 20 */            ArrayList arrayList = new ArrayList();
/* 35 */            for (String str : bundle.keySet()) {
/* 51 */                if (((ii1) hg3.f9074a.get(str)) == null) {
/* 53 */                    arrayList.add(str);
/* 64 */                    f3682b.m6795b("Ignored unknown metadata field in bundle: %s", str);
                        }
                    }
/* 68 */            int size = arrayList.size();
/* 72 */            int i = 0;
/* 73 */            while (i < size) {
/* 75 */                Object obj = arrayList.get(i);
/* 79 */                i++;
/* 85 */                this.f3683a.remove((String) obj);
                    }
                }

                /* JADX INFO: renamed from: D1 */
                public final void m2033D1(Context context) {
/* 11 */            if (((BitmapTeleporter) zzhs.zzkq.zza(this.f3683a)) == null || context.getCacheDir() != null) {
/* 25 */                return;
                    }
/* 22 */            C1951n4.m6868s("Cannot set null temp directory");
                }

                /* JADX INFO: renamed from: E1 */
                public final void m2034E1(ii1 ii1Var, Object obj) {
/* 13 */            if (((ii1) hg3.f9074a.get(ii1Var.getName())) == null) {
/* 21 */                String strValueOf = String.valueOf(ii1Var.getName());
/* 46 */                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unregistered field: ".concat(strValueOf) : new String("Unregistered field: "));
                    }
/* 49 */            ii1Var.zza(obj, this.f3683a);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || obj.getClass() != MetadataBundle.class) {
/* 5 */                 return false;
                    }
/* 19 */            Bundle bundle = ((MetadataBundle) obj).f3683a;
/* 21 */            Bundle bundle2 = this.f3683a;
/* 23 */            Set<String> setKeySet = bundle2.keySet();
/* 35 */            if (!setKeySet.equals(bundle.keySet())) {
/* 5 */                 return false;
                    }
/* 46 */            for (String str : setKeySet) {
/* 66 */                if (!de3.m3029k(bundle2.get(str), bundle.get(str))) {
/* 5 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 1 */             Bundle bundle = this.f3683a;
/* 7 */             Iterator<String> it = bundle.keySet().iterator();
/* 11 */            int iHashCode = 1;
/* 16 */            while (it.hasNext()) {
/* 34 */                iHashCode = (iHashCode * 31) + bundle.get(it.next()).hashCode();
                    }
/* 36 */            return iHashCode;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9402L(parcel, 2, this.f3683a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
