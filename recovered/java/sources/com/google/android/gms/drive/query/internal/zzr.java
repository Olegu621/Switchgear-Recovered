            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.query.Filter;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.dr3;
            import p000.lf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public final class zzr extends zza {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(4);

                /* JADX INFO: renamed from: a */
                public final zzx f3721a;

                /* JADX INFO: renamed from: b */
                public final List f3722b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f3723c;

                public zzr(ArrayList arrayList) {
/* 6 */             this.f3721a = zzx.f3725b;
/* 13 */            this.f3723c = new ArrayList();
/* 20 */            this.f3722b = new ArrayList();
/* 22 */            Iterator it = arrayList.iterator();
/* 30 */            while (it.hasNext()) {
/* 36 */                Filter filter = (Filter) it.next();
/* 40 */                this.f3723c.add(filter);
/* 50 */                this.f3722b.add(new FilterHolder(filter));
                    }
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 3 */             ArrayList<String> arrayList = new ArrayList();
/* 8 */             Iterator it = this.f3722b.iterator();
/* 16 */            while (it.hasNext()) {
/* 30 */                arrayList.add(((FilterHolder) it.next()).f3699U.mo2035a0(lf3Var));
                    }
/* 50 */            StringBuilder sb = new StringBuilder(String.valueOf(this.f3721a.f3726a).concat("("));
/* 57 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 63 */            for (String str2 : arrayList) {
/* 71 */                sb.append(str);
/* 74 */                sb.append(str2);
/* 77 */                str = ",";
                    }
/* 82 */            sb.append(")");
/* 85 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3721a, i, false);
/* 17 */            w11.m9414X(parcel, 2, this.f3722b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 54 */        public zzr(zzx zzxVar, ArrayList arrayList) {
/* 56 */            this.f3721a = zzxVar;
/* 57 */            this.f3722b = arrayList;
                }
            }
