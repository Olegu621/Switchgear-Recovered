            package androidx.recyclerview.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
                public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new C0138p();

                /* JADX INFO: renamed from: a */
                public int f1709a;

                /* JADX INFO: renamed from: b */
                public int f1710b;

                /* JADX INFO: renamed from: c */
                public int[] f1711c;

                /* JADX INFO: renamed from: d */
                public boolean f1712d;

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 52 */            return "FullSpanItem{mPosition=" + this.f1709a + ", mGapDir=" + this.f1710b + ", mHasUnwantedGapAfter=" + this.f1712d + ", mGapPerSpan=" + Arrays.toString(this.f1711c) + '}';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f1709a);
/* 8 */             parcel.writeInt(this.f1710b);
/* 13 */            parcel.writeInt(this.f1712d ? 1 : 0);
/* 16 */            int[] iArr = this.f1711c;
/* 18 */            if (iArr == null || iArr.length <= 0) {
/* 34 */                parcel.writeInt(0);
                    } else {
/* 24 */                parcel.writeInt(iArr.length);
/* 29 */                parcel.writeIntArray(this.f1711c);
                    }
                }
            }
