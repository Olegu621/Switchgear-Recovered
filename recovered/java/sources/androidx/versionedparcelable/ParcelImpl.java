            package androidx.versionedparcelable;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.i23;
            import p000.j23;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ParcelImpl implements Parcelable {
                public static final Parcelable.Creator<ParcelImpl> CREATOR = new qd3(7);

                /* JADX INFO: renamed from: a */
                public final j23 f1915a;

                public ParcelImpl(Parcel parcel) {
/* 13 */            this.f1915a = new i23(parcel).m4094h();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 8 */             new i23(parcel).m4097k(this.f1915a);
                }
            }
