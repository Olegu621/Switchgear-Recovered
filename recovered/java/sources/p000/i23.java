            package p000;

            import android.os.Parcel;
            import android.util.SparseIntArray;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class i23 extends h23 {

                /* JADX INFO: renamed from: d */
                public final SparseIntArray f9422d;

                /* JADX INFO: renamed from: e */
                public final Parcel f9423e;

                /* JADX INFO: renamed from: f */
                public final int f9424f;

                /* JADX INFO: renamed from: g */
                public final int f9425g;

                /* JADX INFO: renamed from: h */
                public final String f9426h;

                /* JADX INFO: renamed from: i */
                public int f9427i;

                /* JADX INFO: renamed from: j */
                public int f9428j;

                /* JADX INFO: renamed from: k */
                public int f9429k;

                public i23(Parcel parcel) {
/* 28 */            this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new C1024id(), new C1024id(), new C1024id());
                }

                @Override // p000.h23
                /* JADX INFO: renamed from: a */
                public final i23 mo4087a() {
/* 3 */             Parcel parcel = this.f9423e;
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             int i = this.f9428j;
/* 13 */            if (i == this.f9424f) {
/* 15 */                i = this.f9425g;
                    }
/* 36 */            return new i23(parcel, iDataPosition, i, fm0.m3789o(new StringBuilder(), this.f9426h, "  "), this.f8874a, this.f8875b, this.f8876c);
                }

                @Override // p000.h23
                /* JADX INFO: renamed from: e */
                public final boolean mo4091e(int i) {
                    while (true) {
/* 1 */                 int i2 = this.f9428j;
/* 3 */                 int i3 = this.f9429k;
/* 7 */                 if (i2 >= this.f9425g) {
                            return i3 == i;
                        }
/* 9 */                 if (i3 == i) {
/* 52 */                    return true;
                        }
/* 24 */                if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
/* 54 */                    return false;
                        }
/* 27 */                int i4 = this.f9428j;
/* 29 */                Parcel parcel = this.f9423e;
/* 31 */                parcel.setDataPosition(i4);
/* 34 */                int i5 = parcel.readInt();
/* 42 */                this.f9429k = parcel.readInt();
/* 47 */                this.f9428j += i5;
                    }
                }

                @Override // p000.h23
                /* JADX INFO: renamed from: i */
                public final void mo4095i(int i) {
/* 1 */             int i2 = this.f9427i;
/* 3 */             SparseIntArray sparseIntArray = this.f9422d;
/* 5 */             Parcel parcel = this.f9423e;
/* 7 */             if (i2 >= 0) {
/* 9 */                 int i3 = sparseIntArray.get(i2);
/* 13 */                int iDataPosition = parcel.dataPosition();
/* 19 */                parcel.setDataPosition(i3);
/* 22 */                parcel.writeInt(iDataPosition - i3);
/* 25 */                parcel.setDataPosition(iDataPosition);
                    }
/* 28 */            this.f9427i = i;
/* 34 */            sparseIntArray.put(i, parcel.dataPosition());
/* 38 */            parcel.writeInt(0);
/* 41 */            parcel.writeInt(i);
                }

/* 31 */        public i23(Parcel parcel, int i, int i2, String str, C1024id c1024id, C1024id c1024id2, C1024id c1024id3) {
/* 32 */            super(c1024id, c1024id2, c1024id3);
/* 33 */            this.f9422d = new SparseIntArray();
/* 34 */            this.f9427i = -1;
/* 35 */            this.f9429k = -1;
/* 36 */            this.f9423e = parcel;
/* 37 */            this.f9424f = i;
/* 38 */            this.f9425g = i2;
/* 39 */            this.f9428j = i;
/* 40 */            this.f9426h = str;
                }
            }
