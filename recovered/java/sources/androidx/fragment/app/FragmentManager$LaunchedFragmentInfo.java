            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class FragmentManager$LaunchedFragmentInfo implements Parcelable {
                public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C0088b(2);

                /* JADX INFO: renamed from: a */
                public String f1357a;

                /* JADX INFO: renamed from: b */
                public int f1358b;

                public FragmentManager$LaunchedFragmentInfo(String str, int i) {
/* 4 */             this.f1357a = str;
/* 6 */             this.f1358b = i;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f1357a);
/* 8 */             parcel.writeInt(this.f1358b);
                }
            }
