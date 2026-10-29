            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import java.util.ArrayList;
            import p000.dn0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 169 */   final class BackStackRecordState implements Parcelable {
                public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0088b(0);

                /* JADX INFO: renamed from: U */
                public final int f1336U;

                /* JADX INFO: renamed from: V */
                public final CharSequence f1337V;

                /* JADX INFO: renamed from: W */
                public final ArrayList f1338W;

                /* JADX INFO: renamed from: X */
                public final ArrayList f1339X;

                /* JADX INFO: renamed from: Y */
                public final boolean f1340Y;

                /* JADX INFO: renamed from: a */
                public final int[] f1341a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f1342b;

                /* JADX INFO: renamed from: c */
                public final int[] f1343c;

                /* JADX INFO: renamed from: d */
                public final int[] f1344d;

                /* JADX INFO: renamed from: e */
                public final int f1345e;

                /* JADX INFO: renamed from: f */
                public final String f1346f;

                /* JADX INFO: renamed from: i */
                public final int f1347i;

                /* JADX INFO: renamed from: v */
                public final int f1348v;

                /* JADX INFO: renamed from: w */
                public final CharSequence f1349w;

                public BackStackRecordState(C0086a c0086a) {
/* 6 */             int size = c0086a.f1385a.size();
/* 14 */            this.f1341a = new int[size * 6];
/* 19 */            if (!c0086a.f1391g) {
/* 167 */               f42.m3656l("Not on back stack");
/* 170 */               throw null;
                    }
/* 26 */            this.f1342b = new ArrayList(size);
/* 30 */            this.f1343c = new int[size];
/* 34 */            this.f1344d = new int[size];
/* 37 */            int i = 0;
/* 38 */            for (int i2 = 0; i2 < size; i2++) {
/* 46 */                dn0 dn0Var = (dn0) c0086a.f1385a.get(i2);
/* 50 */                int i3 = i + 1;
/* 54 */                this.f1341a[i] = dn0Var.f7325a;
/* 56 */                ArrayList arrayList = this.f1342b;
/* 58 */                Fragment fragment = dn0Var.f7326b;
/* 66 */                arrayList.add(fragment != null ? fragment.mWho : null);
/* 69 */                int[] iArr = this.f1341a;
/* 75 */                iArr[i3] = dn0Var.f7327c ? 1 : 0;
/* 81 */                iArr[i + 2] = dn0Var.f7328d;
/* 87 */                iArr[i + 3] = dn0Var.f7329e;
/* 89 */                int i4 = i + 5;
/* 93 */                iArr[i + 4] = dn0Var.f7330f;
/* 95 */                i += 6;
/* 99 */                iArr[i4] = dn0Var.f7331g;
/* 109 */               this.f1343c[i2] = dn0Var.f7332h.ordinal();
/* 119 */               this.f1344d[i2] = dn0Var.f7333i.ordinal();
                    }
/* 126 */           this.f1345e = c0086a.f1390f;
/* 130 */           this.f1346f = c0086a.f1393i;
/* 134 */           this.f1347i = c0086a.f1403s;
/* 138 */           this.f1348v = c0086a.f1394j;
/* 142 */           this.f1349w = c0086a.f1395k;
/* 146 */           this.f1336U = c0086a.f1396l;
/* 150 */           this.f1337V = c0086a.f1397m;
/* 154 */           this.f1338W = c0086a.f1398n;
/* 158 */           this.f1339X = c0086a.f1399o;
/* 162 */           this.f1340Y = c0086a.f1400p;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeIntArray(this.f1341a);
/* 8 */             parcel.writeStringList(this.f1342b);
/* 13 */            parcel.writeIntArray(this.f1343c);
/* 18 */            parcel.writeIntArray(this.f1344d);
/* 23 */            parcel.writeInt(this.f1345e);
/* 28 */            parcel.writeString(this.f1346f);
/* 33 */            parcel.writeInt(this.f1347i);
/* 38 */            parcel.writeInt(this.f1348v);
/* 44 */            TextUtils.writeToParcel(this.f1349w, parcel, 0);
/* 49 */            parcel.writeInt(this.f1336U);
/* 54 */            TextUtils.writeToParcel(this.f1337V, parcel, 0);
/* 59 */            parcel.writeStringList(this.f1338W);
/* 64 */            parcel.writeStringList(this.f1339X);
/* 69 */            parcel.writeInt(this.f1340Y ? 1 : 0);
                }

/* 170 */       public BackStackRecordState(Parcel parcel) {
/* 172 */           this.f1341a = parcel.createIntArray();
/* 173 */           this.f1342b = parcel.createStringArrayList();
/* 174 */           this.f1343c = parcel.createIntArray();
/* 175 */           this.f1344d = parcel.createIntArray();
/* 176 */           this.f1345e = parcel.readInt();
/* 177 */           this.f1346f = parcel.readString();
/* 178 */           this.f1347i = parcel.readInt();
/* 179 */           this.f1348v = parcel.readInt();
/* 180 */           Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                    this.f1349w = (CharSequence) creator.createFromParcel(parcel);
/* 181 */           this.f1336U = parcel.readInt();
/* 182 */           this.f1337V = (CharSequence) creator.createFromParcel(parcel);
/* 183 */           this.f1338W = parcel.createStringArrayList();
/* 184 */           this.f1339X = parcel.createStringArrayList();
/* 185 */           this.f1340Y = parcel.readInt() != 0;
                }
            }
