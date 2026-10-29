            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class FragmentManagerState implements Parcelable {
                public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0088b(3);

                /* JADX INFO: renamed from: a */
                public ArrayList f1359a;

                /* JADX INFO: renamed from: b */
                public ArrayList f1360b;

                /* JADX INFO: renamed from: c */
                public BackStackRecordState[] f1361c;

                /* JADX INFO: renamed from: d */
                public int f1362d;

                /* JADX INFO: renamed from: e */
                public String f1363e;

                /* JADX INFO: renamed from: f */
                public ArrayList f1364f;

                /* JADX INFO: renamed from: i */
                public ArrayList f1365i;

                /* JADX INFO: renamed from: v */
                public ArrayList f1366v;

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeStringList(this.f1359a);
/* 8 */             parcel.writeStringList(this.f1360b);
/* 13 */            parcel.writeTypedArray(this.f1361c, i);
/* 18 */            parcel.writeInt(this.f1362d);
/* 23 */            parcel.writeString(this.f1363e);
/* 28 */            parcel.writeStringList(this.f1364f);
/* 33 */            parcel.writeTypedList(this.f1365i);
/* 38 */            parcel.writeTypedList(this.f1366v);
                }
            }
