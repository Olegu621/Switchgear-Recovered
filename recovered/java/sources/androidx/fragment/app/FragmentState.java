            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 117 */   final class FragmentState implements Parcelable {
                public static final Parcelable.Creator<FragmentState> CREATOR = new C0088b(4);

                /* JADX INFO: renamed from: U */
                public final boolean f1367U;

                /* JADX INFO: renamed from: V */
                public final int f1368V;

                /* JADX INFO: renamed from: W */
                public final String f1369W;

                /* JADX INFO: renamed from: X */
                public final int f1370X;

                /* JADX INFO: renamed from: Y */
                public final boolean f1371Y;

                /* JADX INFO: renamed from: a */
                public final String f1372a;

                /* JADX INFO: renamed from: b */
                public final String f1373b;

                /* JADX INFO: renamed from: c */
                public final boolean f1374c;

                /* JADX INFO: renamed from: d */
                public final int f1375d;

                /* JADX INFO: renamed from: e */
                public final int f1376e;

                /* JADX INFO: renamed from: f */
                public final String f1377f;

                /* JADX INFO: renamed from: i */
                public final boolean f1378i;

                /* JADX INFO: renamed from: v */
                public final boolean f1379v;

                /* JADX INFO: renamed from: w */
                public final boolean f1380w;

                public FragmentState(Parcel parcel) {
/* 8 */             this.f1372a = parcel.readString();
/* 14 */            this.f1373b = parcel.readString();
/* 27 */            this.f1374c = parcel.readInt() != 0;
/* 33 */            this.f1375d = parcel.readInt();
/* 39 */            this.f1376e = parcel.readInt();
/* 45 */            this.f1377f = parcel.readString();
/* 56 */            this.f1378i = parcel.readInt() != 0;
/* 67 */            this.f1379v = parcel.readInt() != 0;
/* 78 */            this.f1380w = parcel.readInt() != 0;
/* 89 */            this.f1367U = parcel.readInt() != 0;
/* 95 */            this.f1368V = parcel.readInt();
/* 101 */           this.f1369W = parcel.readString();
/* 107 */           this.f1370X = parcel.readInt();
/* 116 */           this.f1371Y = parcel.readInt() != 0;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(128);
/* 10 */            sb.append("FragmentState{");
/* 15 */            sb.append(this.f1372a);
/* 20 */            sb.append(" (");
/* 25 */            sb.append(this.f1373b);
/* 30 */            sb.append(")}:");
/* 35 */            if (this.f1374c) {
/* 39 */                sb.append(" fromLayout");
                    }
/* 42 */            int i = this.f1376e;
/* 44 */            if (i != 0) {
/* 48 */                sb.append(" id=0x");
/* 55 */                sb.append(Integer.toHexString(i));
                    }
/* 58 */            String str = this.f1377f;
/* 60 */            if (str != null && !str.isEmpty()) {
/* 70 */                sb.append(" tag=");
/* 73 */                sb.append(str);
                    }
/* 78 */            if (this.f1378i) {
/* 82 */                sb.append(" retainInstance");
                    }
/* 87 */            if (this.f1379v) {
/* 91 */                sb.append(" removing");
                    }
/* 96 */            if (this.f1380w) {
/* 100 */               sb.append(" detached");
                    }
/* 105 */           if (this.f1367U) {
/* 109 */               sb.append(" hidden");
                    }
/* 112 */           String str2 = this.f1369W;
/* 114 */           if (str2 != null) {
/* 118 */               sb.append(" targetWho=");
/* 121 */               sb.append(str2);
/* 126 */               sb.append(" targetRequestCode=");
/* 131 */               sb.append(this.f1370X);
                    }
/* 136 */           if (this.f1371Y) {
/* 140 */               sb.append(" userVisibleHint");
                    }
/* 143 */           return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f1372a);
/* 8 */             parcel.writeString(this.f1373b);
/* 13 */            parcel.writeInt(this.f1374c ? 1 : 0);
/* 18 */            parcel.writeInt(this.f1375d);
/* 23 */            parcel.writeInt(this.f1376e);
/* 28 */            parcel.writeString(this.f1377f);
/* 33 */            parcel.writeInt(this.f1378i ? 1 : 0);
/* 38 */            parcel.writeInt(this.f1379v ? 1 : 0);
/* 43 */            parcel.writeInt(this.f1380w ? 1 : 0);
/* 48 */            parcel.writeInt(this.f1367U ? 1 : 0);
/* 53 */            parcel.writeInt(this.f1368V);
/* 58 */            parcel.writeString(this.f1369W);
/* 63 */            parcel.writeInt(this.f1370X);
/* 68 */            parcel.writeInt(this.f1371Y ? 1 : 0);
                }

/* 118 */       public FragmentState(Fragment fragment) {
/* 120 */           this.f1372a = fragment.getClass().getName();
/* 121 */           this.f1373b = fragment.mWho;
/* 122 */           this.f1374c = fragment.mFromLayout;
/* 123 */           this.f1375d = fragment.mFragmentId;
/* 124 */           this.f1376e = fragment.mContainerId;
/* 125 */           this.f1377f = fragment.mTag;
/* 126 */           this.f1378i = fragment.mRetainInstance;
/* 127 */           this.f1379v = fragment.mRemoving;
/* 128 */           this.f1380w = fragment.mDetached;
/* 129 */           this.f1367U = fragment.mHidden;
/* 130 */           this.f1368V = fragment.mMaxState.ordinal();
/* 131 */           this.f1369W = fragment.mTargetWho;
/* 132 */           this.f1370X = fragment.mTargetRequestCode;
/* 133 */           this.f1371Y = fragment.mUserVisibleHint;
                }
            }
