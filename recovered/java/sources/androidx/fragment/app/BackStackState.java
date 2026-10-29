            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class BackStackState implements Parcelable {
                public static final Parcelable.Creator<BackStackState> CREATOR = new C0088b(1);

                /* JADX INFO: renamed from: a */
                public final ArrayList f1350a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f1351b;

                public BackStackState(Parcel parcel) {
/* 8 */             this.f1350a = parcel.createStringArrayList();
/* 16 */            this.f1351b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeStringList(this.f1350a);
/* 8 */             parcel.writeTypedList(this.f1351b);
                }
            }
